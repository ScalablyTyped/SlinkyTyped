package typingsSlinky.reactRouter.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.reactRouter.mod.RouteComponentProps
import typingsSlinky.reactRouter.mod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  @JSImport("react-router", "__RouterContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[RouteComponentProps[js.Object, StaticContext, LocationState]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: RouteComponentProps[js.Object, StaticContext, LocationState] => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[RouteComponentProps[js.Object, StaticContext, LocationState]]]))
  }
}

