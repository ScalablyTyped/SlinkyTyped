package typingsSlinky.reactIntl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactIntl.anon.DisplayNamesOptionsvalues
import typingsSlinky.reactIntl.reactIntlStrings.`best fit`
import typingsSlinky.reactIntl.reactIntlStrings.code
import typingsSlinky.reactIntl.reactIntlStrings.currency
import typingsSlinky.reactIntl.reactIntlStrings.language
import typingsSlinky.reactIntl.reactIntlStrings.long
import typingsSlinky.reactIntl.reactIntlStrings.lookup
import typingsSlinky.reactIntl.reactIntlStrings.narrow
import typingsSlinky.reactIntl.reactIntlStrings.none
import typingsSlinky.reactIntl.reactIntlStrings.region
import typingsSlinky.reactIntl.reactIntlStrings.script
import typingsSlinky.reactIntl.reactIntlStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedDisplayName {
  
  @JSImport("react-intl", "FormattedDisplayName")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def fallback(value: code | none): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def localeMatcher(value: lookup | (`best fit`)): this.type = set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: narrow | short | long): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DisplayNamesOptionsvalues): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(`type`: language | region | script | currency, value: String | Double | js.Object): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DisplayNamesOptionsvalues]))
  }
}
