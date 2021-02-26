package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.phoneInputMod.Country
import typingsSlinky.baseui.phoneInputMod.CountrySelectProps
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CountrySelect {
  
  @JSImport("baseui/phone-input", "CountrySelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def country(value: Country): this.type = set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    
    @scala.inline
    def inputRefRefObject(value: ReactRef[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mapIsoToLabel(value: /* iso */ String => String): this.type = set("mapIsoToLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def maxDropdownHeight(value: String): this.type = set("maxDropdownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDropdownWidth(value: String): this.type = set("maxDropdownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCountryChange(value: /* event */ OnChangeParams => _): this.type = set("onCountryChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: typingsSlinky.baseui.anon.CountrySelect): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CountrySelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CountrySelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
