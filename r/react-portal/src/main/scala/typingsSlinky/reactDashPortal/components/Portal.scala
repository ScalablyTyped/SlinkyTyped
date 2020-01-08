package typingsSlinky.reactDashPortal.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashPortal.reactDashPortalMod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashPortal.reactDashPortalMod.Portal] {
  @JSImport("react-portal", "Portal")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(node: org.scalajs.dom.raw.Element = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashPortal.reactDashPortalMod.Portal] = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashPortal.reactDashPortalMod.Portal] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashPortal.reactDashPortalMod.Portal](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PortalProps
}

