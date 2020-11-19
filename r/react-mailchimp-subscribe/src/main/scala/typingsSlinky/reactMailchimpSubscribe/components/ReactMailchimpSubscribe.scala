package typingsSlinky.reactMailchimpSubscribe.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMailchimpSubscribe.mod.FormHooks
import typingsSlinky.reactMailchimpSubscribe.mod.Props
import typingsSlinky.reactMailchimpSubscribe.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMailchimpSubscribe {
  
  @JSImport("react-mailchimp-subscribe", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[FormFields] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[FormFields]] {
    
    @scala.inline
    def render(value: /* hooks */ FormHooks[FormFields] => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps[FormFields](p: Props[FormFields]): Builder[FormFields] = new Builder[FormFields](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[FormFields](url: String): Builder[FormFields] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new Builder[FormFields](js.Array(this.component, __props.asInstanceOf[Props[FormFields]]))
  }
}
