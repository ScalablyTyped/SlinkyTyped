package typingsSlinky.mjmlDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlDashReact.Anon_ChildrenKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlAll
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlAll] {
  @JSImport("mjml-react", "MjmlAll")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlAll] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = Anon_ChildrenKey
}

