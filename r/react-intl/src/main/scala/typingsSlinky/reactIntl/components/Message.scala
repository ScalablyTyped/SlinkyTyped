package typingsSlinky.reactIntl.components

import typingsSlinky.reactIntl.componentsMessageMod.Props
import typingsSlinky.reactIntl.componentsMessageMod.default
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Message {
  
  @scala.inline
  def apply[V /* <: Record[String, js.Any] */](): SharedBuilder_Props_589732436[default[V], V] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_Props_589732436[default[V], V](js.Array(this.component, __props.asInstanceOf[Props[V]]))
  }
  
  @JSImport("react-intl/src/components/message", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make[V /* <: Record[String, js.Any] */](companion: Message.type): SharedBuilder_Props_589732436[default[V], V] = new SharedBuilder_Props_589732436[default[V], V](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[V /* <: Record[String, js.Any] */](p: Props[V]): SharedBuilder_Props_589732436[default[V], V] = new SharedBuilder_Props_589732436[default[V], V](js.Array(this.component, p.asInstanceOf[js.Any]))
}
