package typingsSlinky.officeUiFabricReact.dropdownTypesMod

import typingsSlinky.officeUiFabricReact.checkboxTypesMod.ICheckboxStyleProps
import typingsSlinky.officeUiFabricReact.checkboxTypesMod.ICheckboxStyles
import typingsSlinky.officeUiFabricReact.labelTypesMod.ILabelStyleProps
import typingsSlinky.officeUiFabricReact.labelTypesMod.ILabelStyles
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelStyleProps
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownSubComponentStyles extends js.Object {
  /** Refers to the primary label for the Dropdown. */
  var label: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles] = js.native
  /** Refers to the individual dropdown item when the multiSelect prop is true. */
  var multiSelectItem: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles] = js.native
  /** Refers to the panel that hosts the Dropdown options in small viewports. */
  var panel: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles] = js.native
}

object IDropdownSubComponentStyles {
  @scala.inline
  def apply(
    label: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles],
    multiSelectItem: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles],
    panel: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]
  ): IDropdownSubComponentStyles = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], multiSelectItem = multiSelectItem.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownSubComponentStyles]
  }
  @scala.inline
  implicit class IDropdownSubComponentStylesOps[Self <: IDropdownSubComponentStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelFunction1(value: ILabelStyleProps => Partial[ILabelStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSelectItemFunction1(value: ICheckboxStyleProps => Partial[ICheckboxStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMultiSelectItem(value: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanelFunction1(value: IPanelStyleProps => Partial[IPanelStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPanel(value: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

