package typingsSlinky.jupyterlabCoreutils.interfacesMod

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IRestorable.IOptions
import typingsSlinky.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRestorer_[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V] extends js.Object {
  /**
    * A promise that settles when the collection has been restored.
    */
  val restored: js.Promise[V] = js.native
  /**
    * Restore the objects in a given restorable collection.
    *
    * @param restorable - The restorable collection being restored.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  def restore(restorable: T, options: IOptions[U]): js.Promise[V] = js.native
}

object IRestorer_ {
  @scala.inline
  def apply[T, U, V](restore: (T, IOptions[U]) => js.Promise[V], restored: js.Promise[V]): IRestorer_[T, U, V] = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), restored = restored.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestorer_[T, U, V]]
  }
  @scala.inline
  implicit class IRestorer_Ops[Self[t, u, v] <: IRestorer_[t, u, v], T, U, V] (val x: Self[T, U, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U, V]) with Other]
    @scala.inline
    def withRestore(value: (T, IOptions[U]) => js.Promise[V]): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRestored(value: js.Promise[V]): Self[T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

