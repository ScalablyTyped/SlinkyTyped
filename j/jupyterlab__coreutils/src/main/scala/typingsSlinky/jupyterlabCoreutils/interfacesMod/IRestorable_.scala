package typingsSlinky.jupyterlabCoreutils.interfacesMod

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IRestorable.IOptions
import typingsSlinky.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRestorable_[T /* <: IObservableDisposable */, U] extends js.Object {
  /**
    * A promise that settles when the collection has been restored.
    */
  val restored: js.Promise[U] = js.native
  /**
    * Restore the objects in this restorable collection.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  def restore(options: IOptions[T]): js.Promise[U] = js.native
}

object IRestorable_ {
  @scala.inline
  def apply[T, U](restore: IOptions[T] => js.Promise[U], restored: js.Promise[U]): IRestorable_[T, U] = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction1(restore), restored = restored.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestorable_[T, U]]
  }
  @scala.inline
  implicit class IRestorable_Ops[Self[t, u] <: IRestorable_[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withRestore(value: IOptions[T] => js.Promise[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestored(value: js.Promise[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

