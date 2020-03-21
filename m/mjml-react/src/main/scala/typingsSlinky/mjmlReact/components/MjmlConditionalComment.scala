package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlReact.AnonCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlConditionalComment
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment] {
  @JSImport("mjml-react/extensions", "MjmlConditionalComment")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(condition: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlConditionalComment] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonCondition
}

