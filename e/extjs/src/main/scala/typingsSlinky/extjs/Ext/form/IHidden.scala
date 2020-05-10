package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.form.field.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHidden extends IBase {
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag  */
  @JSName("markInvalid")
  var markInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the height of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setHeight")
  var setHeight_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the page XY position of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setPagePosition")
  var setPagePosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the left and top of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setPosition")
  var setPosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the width and height of this Component
  		* @returns Ext.Component this
  		*/
  @JSName("setSize")
  var setSize_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the width of the component
  		* @returns Ext.Component this
  		*/
  @JSName("setWidth")
  var setWidth_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
}

object IHidden {
  @scala.inline
  def apply(): IHidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHidden]
  }
  @scala.inline
  implicit class IHiddenOps[Self <: IHidden] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkInvalid(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markInvalid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMarkInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPagePosition(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPagePosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetPagePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPagePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPosition(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
  }
  
}

