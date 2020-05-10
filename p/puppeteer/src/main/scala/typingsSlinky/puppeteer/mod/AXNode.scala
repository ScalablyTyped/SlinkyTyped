package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.puppeteerStrings.mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AXNode extends js.Object {
  /**
    * What kind of autocomplete is supported by a control.
    */
  var autocomplete: String = js.native
  /**
    * Whether the checkbox is checked, or "mixed".
    */
  var checked: Boolean | mixed = js.native
  /**
    * Child nodes of this node, if any.
    */
  var children: js.Array[AXNode] = js.native
  /**
    * An additional human readable description of the node.
    */
  var description: String = js.native
  /**
    * Whether the node is disabled.
    */
  var disabled: Boolean = js.native
  /**
    * Whether the node is expanded or collapsed.
    */
  var expanded: Boolean = js.native
  /**
    * Whether the node is focused.
    */
  var focused: Boolean = js.native
  /**
    * What kind of popup is currently being shown for a node.
    */
  var haspopup: String = js.native
  /**
    * Whether and in what way this node's value is invalid.
    */
  var invalid: String = js.native
  /**
    * Keyboard shortcuts associated with this node.
    */
  var keyshortcuts: String = js.native
  /**
    * The level of a heading.
    */
  var level: Double = js.native
  /**
    * Whether the node is modal.
    */
  var modal: Boolean = js.native
  /**
    * Whether the node text input supports multiline.
    */
  var multiline: Boolean = js.native
  /**
    * Whether more than one child can be selected.
    */
  var multiselectable: Boolean = js.native
  /**
    * A human readable name for the node.
    */
  var name: String = js.native
  /**
    * Whether the node is oriented horizontally or vertically.
    */
  var orientation: String = js.native
  /**
    * Whether the toggle button is checked, or "mixed".
    */
  var pressed: Boolean | mixed = js.native
  /**
    * Whether the node is read only.
    */
  var readonly: Boolean = js.native
  /**
    * Whether the node is required.
    */
  var required: Boolean = js.native
  /**
    * The role.
    */
  var role: String = js.native
  /**
    * A human readable alternative to the role.
    */
  var roledescription: String = js.native
  /**
    * Whether the node is selected in its parent node.
    */
  var selected: Boolean = js.native
  /**
    * The current value of the node.
    */
  var value: String | Double = js.native
  /**
    * The maximum value in a node.
    */
  var valuemax: Double = js.native
  /**
    * The minimum value in a node.
    */
  var valuemin: Double = js.native
  /**
    * A description of the current value.
    */
  var valuetext: String = js.native
}

object AXNode {
  @scala.inline
  def apply(
    autocomplete: String,
    checked: Boolean | mixed,
    children: js.Array[AXNode],
    description: String,
    disabled: Boolean,
    expanded: Boolean,
    focused: Boolean,
    haspopup: String,
    invalid: String,
    keyshortcuts: String,
    level: Double,
    modal: Boolean,
    multiline: Boolean,
    multiselectable: Boolean,
    name: String,
    orientation: String,
    pressed: Boolean | mixed,
    readonly: Boolean,
    required: Boolean,
    role: String,
    roledescription: String,
    selected: Boolean,
    value: String | Double,
    valuemax: Double,
    valuemin: Double,
    valuetext: String
  ): AXNode = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], haspopup = haspopup.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keyshortcuts = keyshortcuts.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], multiselectable = multiselectable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], roledescription = roledescription.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valuemax = valuemax.asInstanceOf[js.Any], valuemin = valuemin.asInstanceOf[js.Any], valuetext = valuetext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXNode]
  }
  @scala.inline
  implicit class AXNodeOps[Self <: AXNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocomplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecked(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[AXNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHaspopup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haspopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyshortcuts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyshortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiselectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressed(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoledescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roledescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuemax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuemax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuemin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuemin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuetext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuetext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

