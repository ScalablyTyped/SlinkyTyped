package typingsSlinky.atReachRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachRouter.atReachRouterMod.MatchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Match
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Match[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atReachRouter.atReachRouterMod.Match[js.Any]].asInstanceOf[String | js.Object]
  def apply[TParams](path: String, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Match[js.Any]] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atReachRouter.atReachRouterMod.Match[js.Any]]]
  }
  type Props = MatchProps[js.Any]
}

