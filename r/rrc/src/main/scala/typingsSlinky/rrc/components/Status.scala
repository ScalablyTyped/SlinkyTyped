package typingsSlinky.rrc.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rrc.rrcMod.StatusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Status
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rrc.rrcMod.Status] {
  @JSImport("rrc", "Status")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(code: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.rrc.rrcMod.Status] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StatusProps
}

