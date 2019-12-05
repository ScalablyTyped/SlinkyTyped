package typingsSlinky.reactDashMailchimpDashSubscribe.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeMod.FormHooks
import typingsSlinky.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashMailchimpDashSubscribe
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-mailchimp-subscribe", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[FormFields](
    url: String,
    render: /* hooks */ FormHooks[FormFields] => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeMod.default[js.Any]]]
  }
  type Props = typingsSlinky.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeMod.Props[js.Any]
}

