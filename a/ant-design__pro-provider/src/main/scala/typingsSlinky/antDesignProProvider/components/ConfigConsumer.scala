package typingsSlinky.antDesignProProvider.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antDesignProProvider.anon.Intl
import typingsSlinky.react.mod.ConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigConsumer {
  
  @scala.inline
  def apply(children: Intl => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[Intl]]))
  }
  
  @JSImport("@ant-design/pro-provider", "ConfigConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[Intl]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
