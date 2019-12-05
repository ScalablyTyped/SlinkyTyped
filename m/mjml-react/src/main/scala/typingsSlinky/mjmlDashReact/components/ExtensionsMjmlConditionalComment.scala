package typingsSlinky.mjmlDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlDashReact.Anon_ChildrenCondition
import typingsSlinky.mjmlDashReact.mjmlDashReactMod.extensions.MjmlConditionalComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExtensionsMjmlConditionalComment
  extends ExternalComponentWithAttributesWithRefType[tag.type, MjmlConditionalComment] {
  @JSImport("mjml-react", "extensions.MjmlConditionalComment")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(condition: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, MjmlConditionalComment] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = Anon_ChildrenCondition
}

