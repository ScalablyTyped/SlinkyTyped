package typingsSlinky.mjmlDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlDashReact.Anon_ChildrenKeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlClass
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlClass] {
  @JSImport("mjml-react", "MjmlClass")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(name: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.mjmlDashReact.mjmlDashReactMod.MjmlClass] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = Anon_ChildrenKeyName
}

