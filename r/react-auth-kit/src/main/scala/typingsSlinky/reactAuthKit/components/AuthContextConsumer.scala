package typingsSlinky.reactAuthKit.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.reactAuthKit.typesMod.AuthContextInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthContextConsumer {
  
  @scala.inline
  def apply(children: AuthContextInterface => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[AuthContextInterface]]))
  }
  
  @JSImport("react-auth-kit/AuthProvider", "AuthContextConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[AuthContextInterface]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
