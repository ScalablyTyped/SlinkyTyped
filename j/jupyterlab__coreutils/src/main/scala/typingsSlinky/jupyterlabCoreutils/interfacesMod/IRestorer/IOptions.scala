package typingsSlinky.jupyterlabCoreutils.interfacesMod.IRestorer

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsSlinky.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
@js.native
trait IOptions[T /* <: IObservableDisposable */] extends js.Object {
  /**
    * A function that returns the args needed to restore an instance.
    */
  var args: js.UndefOr[js.Function1[/* obj */ T, ReadonlyJSONObject]] = js.native
  /**
    * The command to execute when restoring instances.
    */
  var command: String = js.native
  /**
    * The point after which it is safe to restore state.
    */
  var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.native
  /**
    * A function that returns a unique persistent name for this instance.
    */
  def name(obj: T): String = js.native
}

object IOptions {
  @scala.inline
  def apply[T](command: String, name: T => String): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCommand(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArgs(value: /* obj */ T => ReadonlyJSONObject): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutArgs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withWhen(value: js.Promise[_] | js.Array[js.Promise[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.undefined)
        ret
    }
  }
  
}

