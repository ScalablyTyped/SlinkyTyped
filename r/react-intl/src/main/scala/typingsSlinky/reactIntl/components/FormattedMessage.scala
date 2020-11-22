package typingsSlinky.reactIntl.components

import typingsSlinky.reactIntl.componentsMessageMod.Props
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedMessage {
  
  @JSImport("react-intl", "FormattedMessage")
  @js.native
  object component extends js.Object
  
  def withProps[V /* <: Record[String, js.Any] */](p: Props[V]): SharedBuilder_Props_589732436[typingsSlinky.reactIntl.mod.FormattedMessage[V], V] = new SharedBuilder_Props_589732436[typingsSlinky.reactIntl.mod.FormattedMessage[V], V](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[V /* <: Record[String, js.Any] */](): SharedBuilder_Props_589732436[typingsSlinky.reactIntl.mod.FormattedMessage[V], V] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_Props_589732436[typingsSlinky.reactIntl.mod.FormattedMessage[V], V](js.Array(this.component, __props.asInstanceOf[Props[V]]))
  }
  
  implicit def make[V /* <: Record[String, js.Any] */](companion: FormattedMessage.type): SharedBuilder_Props_589732436[typingsSlinky.reactIntl.mod.FormattedMessage[V], V] = new SharedBuilder_Props_589732436[typingsSlinky.reactIntl.mod.FormattedMessage[V], V](js.Array(this.component, js.Dictionary.empty))()
}
