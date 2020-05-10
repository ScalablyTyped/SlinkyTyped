package typingsSlinky.agGrid.frameworkComponentWrapperMod

import typingsSlinky.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapableInterface extends js.Object {
  def addMethod(name: String, callback: js.Function): Unit = js.native
  def callMethod(name: String, args: IArguments): Unit = js.native
  def hasMethod(name: String): Boolean = js.native
}

object WrapableInterface {
  @scala.inline
  def apply(
    addMethod: (String, js.Function) => Unit,
    callMethod: (String, IArguments) => Unit,
    hasMethod: String => Boolean
  ): WrapableInterface = {
    val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction2(addMethod), callMethod = js.Any.fromFunction2(callMethod), hasMethod = js.Any.fromFunction1(hasMethod))
    __obj.asInstanceOf[WrapableInterface]
  }
  @scala.inline
  implicit class WrapableInterfaceOps[Self <: WrapableInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMethod(value: (String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCallMethod(value: (String, IArguments) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasMethod(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMethod")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

