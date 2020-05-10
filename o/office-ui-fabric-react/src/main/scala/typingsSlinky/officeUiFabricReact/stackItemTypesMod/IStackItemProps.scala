package typingsSlinky.officeUiFabricReact.stackItemTypesMod

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.auto
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.baseline
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.center
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.initial
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.stretch
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.unset
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStyleableComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackItemProps
  extends IStackItemSlots
     with IStyleableComponentProps[IStackItemProps, IStackItemTokens, IStackItemStyles] {
  /**
    * Defines how to align the StackItem along the x-axis (for vertical Stacks) or the y-axis (for horizontal Stacks).
    */
  var align: js.UndefOr[auto | stretch | baseline | start | center | end] = js.native
  /**
    * Defines whether the StackItem should be prevented from shrinking.
    * This can be used to prevent a StackItem from shrinking when it is inside of a Stack that has shrinking items.
    * @defaultvalue false
    */
  var disableShrink: js.UndefOr[Boolean] = js.native
  /**
    * Defines how much to grow the StackItem in proportion to its siblings.
    */
  var grow: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.native
  /**
    * Defines order of the StackItem.
    * @defaultvalue 0
    */
  var order: js.UndefOr[Double | String] = js.native
  /**
    * Defines at what ratio should the StackItem shrink to fit the available space.
    */
  var shrink: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.native
  /**
    * Defines whether the StackItem should take up 100% of the height of its parent.
    * @defaultvalue true
    */
  var verticalFill: js.UndefOr[Boolean] = js.native
}

object IStackItemProps {
  @scala.inline
  def apply(): IStackItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackItemProps]
  }
  @scala.inline
  implicit class IStackItemPropsOps[Self <: IStackItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: auto | stretch | baseline | start | center | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableShrink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableShrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableShrink")(js.undefined)
        ret
    }
    @scala.inline
    def withGrow(value: Boolean | Double | inherit | initial | unset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withShrink(value: Boolean | Double | inherit | initial | unset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalFill")(js.undefined)
        ret
    }
  }
  
}

