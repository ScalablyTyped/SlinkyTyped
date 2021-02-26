package typingsSlinky.gatsbyCli.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gatsbyCli.constantsMod.ActivityLogLevels
import typingsSlinky.gatsbyCli.constantsMod.LogLevels
import typingsSlinky.gatsbyCli.messagesMod.IMessageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Message {
  
  @scala.inline
  def apply(level: ActivityLogLevels | LogLevels, text: String): Builder = {
    val __props = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IMessageProps]))
  }
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/messages", "Message")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def statusText(value: String): this.type = set("statusText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IMessageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
