package typingsSlinky.reactJsonView.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactJsonView.mod.CollapsedFieldProps
import typingsSlinky.reactJsonView.mod.InteractionProps
import typingsSlinky.reactJsonView.mod.OnCopyProps
import typingsSlinky.reactJsonView.mod.OnSelectProps
import typingsSlinky.reactJsonView.mod.ReactJsonViewProps
import typingsSlinky.reactJsonView.mod.ThemeKeys
import typingsSlinky.reactJsonView.mod.ThemeObject
import typingsSlinky.reactJsonView.mod.TypeDefaultValue
import typingsSlinky.reactJsonView.mod.default
import typingsSlinky.reactJsonView.reactJsonViewBooleans.`false`
import typingsSlinky.reactJsonView.reactJsonViewStrings.circle
import typingsSlinky.reactJsonView.reactJsonViewStrings.square
import typingsSlinky.reactJsonView.reactJsonViewStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJsonView {
  @JSImport("react-json-view", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def collapseStringsAfterLength(value: Double | `false`): this.type = set("collapseStringsAfterLength", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsed(value: Boolean | Double): this.type = set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: TypeDefaultValue | js.Array[TypeDefaultValue]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValueNull: this.type = set("defaultValue", null)
    @scala.inline
    def displayDataTypes(value: Boolean): this.type = set("displayDataTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def displayObjectSize(value: Boolean): this.type = set("displayObjectSize", value.asInstanceOf[js.Any])
    @scala.inline
    def enableClipboardFunction1(value: /* copy */ OnCopyProps => Unit): this.type = set("enableClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def enableClipboard(value: Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])): this.type = set("enableClipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def groupArraysAfterLength(value: Double): this.type = set("groupArraysAfterLength", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyle(value: circle | triangle | square): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String | `false`): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def nameNull: this.type = set("name", null)
    @scala.inline
    def onAddFunction1(value: /* add */ InteractionProps => `false` | _): this.type = set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def onAdd(value: (js.Function1[/* add */ InteractionProps, `false` | _]) | `false`): this.type = set("onAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def onDeleteFunction1(value: /* del */ InteractionProps => `false` | _): this.type = set("onDelete", js.Any.fromFunction1(value))
    @scala.inline
    def onDelete(value: (js.Function1[/* del */ InteractionProps, `false` | _]) | `false`): this.type = set("onDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def onEditFunction1(value: /* edit */ InteractionProps => `false` | _): this.type = set("onEdit", js.Any.fromFunction1(value))
    @scala.inline
    def onEdit(value: (js.Function1[/* edit */ InteractionProps, `false` | _]) | `false`): this.type = set("onEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelectFunction1(value: /* select */ OnSelectProps => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: (js.Function1[/* select */ OnSelectProps, Unit]) | `false`): this.type = set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldCollapseFunction1(value: /* field */ CollapsedFieldProps => Boolean): this.type = set("shouldCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def shouldCollapse(value: `false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])): this.type = set("shouldCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def sortKeys(value: Boolean): this.type = set("sortKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ThemeKeys | ThemeObject): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def validationMessage(value: String): this.type = set("validationMessage", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactJsonViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(src: js.Object): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactJsonViewProps]))
  }
}

