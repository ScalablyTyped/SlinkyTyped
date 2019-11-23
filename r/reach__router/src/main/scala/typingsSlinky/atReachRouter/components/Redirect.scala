package typingsSlinky.atReachRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachRouter.atReachRouterMod.RedirectProps
import typingsSlinky.atReachRouter.atReachRouterMod.RouteComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(atReachRouter), Name(atReachRouterMod), Name(RouteComponentProps))) was not a @ScalaJSDefined trait */
object Redirect
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Redirect[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atReachRouter.atReachRouterMod.Redirect[js.Any]].asInstanceOf[String | js.Object]
  def apply[TState](
    props: RouteComponentProps[RedirectProps[TState]] with js.Object,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Redirect[js.Any]] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atReachRouter.atReachRouterMod.Redirect[js.Any]]]
  }
  type Props = RouteComponentProps[js.Any]
}

