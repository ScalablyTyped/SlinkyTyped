package typingsSlinky.extjs.Ext.container

import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContainer extends IAbstractContainer {
  /** [Config Option] (Number/Object) */
  var anchorSize: js.UndefOr[js.Any] = js.native
  /** [Method] Return the immediate child Component in which the passed element is located
  		* @param el Ext.Element/HTMLElement/String The element to test (or ID of element).
  		* @param deep Boolean If true, returns the deepest descendant Component which contains the passed element.
  		* @returns Ext.Component The child item which contains the passed element.
  		*/
  var getChildByElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean], IComponent]
  ] = js.native
}

object IContainer {
  @scala.inline
  def apply(): IContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainer]
  }
  @scala.inline
  implicit class IContainerOps[Self <: IContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChildByElement(value: (/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildByElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetChildByElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildByElement")(js.undefined)
        ret
    }
  }
  
}

