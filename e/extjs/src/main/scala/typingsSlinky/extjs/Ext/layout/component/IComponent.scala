package typingsSlinky.extjs.Ext.layout.component

import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.layout.ILayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponent extends ILayout {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		* @param firstCycle Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IComponent: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
  		* @param ownerContext Object
  		*/
  @JSName("finishedLayout")
  var finishedLayout_IComponent: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the element into which rendering must take place
  		* @returns Ext.Element
  		*/
  var getRenderTarget: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Returns the owner component s resize element
  		* @returns Ext.Element
  		*/
  var getTarget: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] This method if implemented is called after all layouts are finished and all have a lastComponentSize cached
  		* @param ownerContext Object
  		*/
  @JSName("notifyOwner")
  var notifyOwner_IComponent: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
}

object IComponent {
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  @scala.inline
  implicit class IComponentOps[Self <: IComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginLayoutCycle(value: (/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeginLayoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishedLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFinishedLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRenderTarget(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRenderTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTarget(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyOwner(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOwner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotifyOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOwner")(js.undefined)
        ret
    }
  }
  
}

