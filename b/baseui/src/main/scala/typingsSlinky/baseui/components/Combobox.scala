package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.CloseListbox
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.comboboxMod.ComboboxOverrides
import typingsSlinky.baseui.comboboxMod.PropsT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Combobox {
  
  @scala.inline
  def apply(mapOptionToString: js.Any => String, options: js.Any, value: String): Builder = {
    val __props = js.Dynamic.literal(mapOptionToString = js.Any.fromFunction1(mapOptionToString), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsT[js.Any]]))
  }
  
  @JSImport("baseui/combobox", "Combobox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def autocomplete(value: Boolean): this.type = set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mapOptionToNode(value: /* hasIsSelectedOption */ js.Any => ReactElement): this.type = set("mapOptionToNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* event */ SyntheticFocusEvent[HTMLInputElement] => _): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: (/* value */ String, /* option */ js.Any | Null) => _): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFocus(value: /* event */ SyntheticFocusEvent[HTMLInputElement] => _): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmit(value: /* params */ CloseListbox => _): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: ComboboxOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: compact | default_ | large_ | mini): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsT[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
