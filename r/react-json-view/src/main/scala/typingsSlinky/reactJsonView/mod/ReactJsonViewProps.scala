package typingsSlinky.reactJsonView.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactJsonView.reactJsonViewBooleans.`false`
import typingsSlinky.reactJsonView.reactJsonViewStrings.circle
import typingsSlinky.reactJsonView.reactJsonViewStrings.square
import typingsSlinky.reactJsonView.reactJsonViewStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactJsonViewProps extends js.Object {
  /**
    * When an integer value is assigned, strings will be cut off at that length.
    * Collapsed strings are followed by an ellipsis.
    * String content can be expanded and collapsed by clicking on the string value.
    *
    * Default: false
    */
  var collapseStringsAfterLength: js.UndefOr[Double | `false`] = js.native
  /**
    * When set to true, all nodes will be collapsed by default.
    * Use an integer value to collapse at a particular depth.
    *
    * Default: false
    */
  var collapsed: js.UndefOr[Boolean | Double] = js.native
  /**
    * Set to a value to be used as defaultValue when adding new key to json
    *
    * Default: null
    */
  var defaultValue: js.UndefOr[TypeDefaultValue | js.Array[TypeDefaultValue] | Null] = js.native
  /**
    * When set to true, data type labels prefix values.
    *
    * Default: true
    */
  var displayDataTypes: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, objects and arrays are labeled with size.
    *
    * Default: true
    */
  var displayObjectSize: js.UndefOr[Boolean] = js.native
  /**
    * When prop is not false, the user can copy objects and arrays to clipboard by clicking on the clipboard icon.
    * Copy callbacks are supported.
    *
    * Default: true
    */
  var enableClipboard: js.UndefOr[Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])] = js.native
  /**
    * When an integer value is assigned, arrays will be displayed in groups by count of the value.
    * Groups are displayed with brakcet notation and can be expanded and collapsed by clickong on the brackets.
    *
    * Default: 100
    */
  var groupArraysAfterLength: js.UndefOr[Double] = js.native
  /**
    * Style of expand/collapse icons. Accepted values are "circle", triangle" or "square".
    *
    * Default: {}
    */
  var iconStyle: js.UndefOr[circle | triangle | square] = js.native
  /**
    * Set the indent-width for nested objects.
    *
    * Default: 4
    */
  var indentWidth: js.UndefOr[Double] = js.native
  /**
    * Contains the name of your root node. Use null or false for no name.
    *
    * Default: "root"
    */
  var name: js.UndefOr[String | Null | `false`] = js.native
  /**
    * When a callback function is passed in, add functionality is enabled.
    * The callback is invoked before additions are completed.
    * Returning false from onAdd will prevent the change from being made. see: onAdd docs
    *
    * Default: false
    */
  var onAdd: js.UndefOr[(js.Function1[/* add */ InteractionProps, `false` | _]) | `false`] = js.native
  /**
    * When a callback function is passed in, delete functionality is enabled.
    * The callback is invoked before deletions are completed.
    * Returning false from onDelete will prevent the change from being made. see: onDelete docs
    *
    * Default: false
    */
  var onDelete: js.UndefOr[(js.Function1[/* del */ InteractionProps, `false` | _]) | `false`] = js.native
  /**
    * When a callback function is passed in, edit functionality is enabled.
    * The callback is invoked before edits are completed. Returning false
    * from onEdit will prevent the change from being made. see: onEdit docs.
    *
    * Default: false
    */
  var onEdit: js.UndefOr[(js.Function1[/* edit */ InteractionProps, `false` | _]) | `false`] = js.native
  /**
    * When a function is passed in, clicking a value triggers the onSelect method to be called.
    *
    * Default: false
    */
  var onSelect: js.UndefOr[(js.Function1[/* select */ OnSelectProps, Unit]) | `false`] = js.native
  /**
    * Callback function to provide control over what objects and arrays should be collapsed by default.
    * An object is passed to the callback containing name, src, type ("array" or "object") and namespace.
    *
    * Default: false
    */
  var shouldCollapse: js.UndefOr[`false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])] = js.native
  /**
    * Set to true to sort object keys.
    *
    * Default: false
    */
  var sortKeys: js.UndefOr[Boolean] = js.native
  /**
    * This property contains your input JSON.
    *
    * Required.
    */
  var src: js.Object = js.native
  /**
    * Style attributes for react-json-view container.
    * Explicit style attributes will override attributes provided by a theme.
    *
    * Default: "rjv-default"
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * RJV supports base-16 themes. Check out the list of supported themes in the demo.
    * A custom "rjv-default" theme applies by default.
    *
    * Default: "rjv-default"
    */
  var theme: js.UndefOr[ThemeKeys | ThemeObject] = js.native
  /**
    * Custom message for validation failures to onEdit, onAdd, or onDelete callbacks.
    *
    * Default: "Validation Error"
    */
  var validationMessage: js.UndefOr[String] = js.native
}

object ReactJsonViewProps {
  @scala.inline
  def apply(src: js.Object): ReactJsonViewProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactJsonViewProps]
  }
  @scala.inline
  implicit class ReactJsonViewPropsOps[Self <: ReactJsonViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapseStringsAfterLength(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseStringsAfterLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseStringsAfterLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseStringsAfterLength")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: TypeDefaultValue | js.Array[TypeDefaultValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(null)
        ret
    }
    @scala.inline
    def withDisplayDataTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDataTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayDataTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDataTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayObjectSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayObjectSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayObjectSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayObjectSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClipboardFunction1(value: /* copy */ OnCopyProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClipboard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableClipboard(value: Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupArraysAfterLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupArraysAfterLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupArraysAfterLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupArraysAfterLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyle(value: circle | triangle | square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withOnAddFunction1(value: /* add */ InteractionProps => `false` | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAdd(value: (js.Function1[/* add */ InteractionProps, `false` | _]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeleteFunction1(value: /* del */ InteractionProps => `false` | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDelete(value: (js.Function1[/* del */ InteractionProps, `false` | _]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditFunction1(value: /* edit */ InteractionProps => `false` | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnEdit(value: (js.Function1[/* edit */ InteractionProps, `false` | _]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectFunction1(value: /* select */ OnSelectProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSelect(value: (js.Function1[/* select */ OnSelectProps, Unit]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldCollapseFunction1(value: /* field */ CollapsedFieldProps => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldCollapse(value: `false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withSortKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ThemeKeys | ThemeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(js.undefined)
        ret
    }
  }
  
}

