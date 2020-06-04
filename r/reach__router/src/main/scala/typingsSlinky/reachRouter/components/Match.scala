package typingsSlinky.reachRouter.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reachRouter.mod.MatchProps
import typingsSlinky.reachRouter.mod.MatchRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Match {
  @JSImport("@reach/router", "Match")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TParams] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reachRouter.mod.Match[js.Any]]
  
  def withProps[TParams](p: MatchProps[TParams]): Builder[TParams] = new Builder[TParams](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[TParams](children: /* props */ MatchRenderProps[TParams] => TagMod[Any], path: String): Builder[TParams] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any])
    new Builder[TParams](js.Array(this.component, __props.asInstanceOf[MatchProps[TParams]]))
  }
}

