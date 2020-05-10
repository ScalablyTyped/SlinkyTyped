package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.layout.container.IFit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardLayout extends IFit {
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[Boolean] = js.native
  /** [Method] Return the active visible component in the layout
  		* @returns Ext.Component
  		*/
  var getActiveItem: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Return the active visible component in the layout to the next card
  		* @returns Ext.Component The next component or false.
  		*/
  var getNext: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Return the active visible component in the layout to the previous card
  		* @returns Ext.Component The previous component or false.
  		*/
  var getPrev: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the active visible component in the layout to the next card
  		* @returns Ext.Component the activated component or false when nothing activated.
  		*/
  var next: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the active visible component in the layout to the previous card
  		* @returns Ext.Component the activated component or false when nothing activated.
  		*/
  var prev: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Makes the given card active
  		* @param newCard Ext.Component/Number/String The component, component id, itemId, or index of component.
  		* @returns Ext.Component the activated component or false when nothing activated. False is returned also when trying to activate an already active card.
  		*/
  var setActiveItem: js.UndefOr[js.Function1[/* newCard */ js.UndefOr[js.Any], IComponent]] = js.native
}

object ICardLayout {
  @scala.inline
  def apply(): ICardLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardLayout]
  }
  @scala.inline
  implicit class ICardLayoutOps[Self <: ICardLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferredRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredRender")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveItem(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNext(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPrev(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActiveItem(value: /* newCard */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveItem")(js.undefined)
        ret
    }
  }
  
}

