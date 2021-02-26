package typingsSlinky.reactMailchimpSubscribe.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMailchimpSubscribe.mod.FormHooks
import typingsSlinky.reactMailchimpSubscribe.mod.Props
import typingsSlinky.reactMailchimpSubscribe.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMailchimpSubscribe {
  
  @scala.inline
  def apply[FormFields](url: String): Builder[FormFields] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new Builder[FormFields](js.Array(this.component, __props.asInstanceOf[Props[FormFields]]))
  }
  
  @JSImport("react-mailchimp-subscribe", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[FormFields] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[FormFields]] {
    
    @scala.inline
    def render(value: /* hooks */ FormHooks[FormFields] => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps[FormFields](p: Props[FormFields]): Builder[FormFields] = new Builder[FormFields](js.Array(this.component, p.asInstanceOf[js.Any]))
}
