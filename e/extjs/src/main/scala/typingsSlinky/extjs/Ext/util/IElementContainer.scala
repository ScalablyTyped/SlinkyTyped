package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElementContainer extends IBase {
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
  		* @param testFn Function The test function.
  		*/
  var removeChildEls: js.UndefOr[js.Function1[/* testFn */ js.UndefOr[js.Any], Unit]] = js.native
}

object IElementContainer {
  @scala.inline
  def apply(): IElementContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementContainer]
  }
  @scala.inline
  implicit class IElementContainerOps[Self <: IElementContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddChildEls(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildEls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAddChildEls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildEls")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveChildEls(value: /* testFn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChildEls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveChildEls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChildEls")(js.undefined)
        ret
    }
  }
  
}

