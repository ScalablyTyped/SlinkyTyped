package typingsSlinky.reachRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reachRouter.mod.MatchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Match
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reachRouter.mod.Match[js.Any]] {
  @JSImport("@reach/router", "Match")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[TParams](path: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reachRouter.mod.Match[js.Any]] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reachRouter.mod.Match[js.Any]]]
  }
  type Props = MatchProps[js.Any]
}

