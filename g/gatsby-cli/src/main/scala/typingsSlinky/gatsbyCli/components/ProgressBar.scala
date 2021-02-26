package typingsSlinky.gatsbyCli.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gatsbyCli.progressBarMod.IProgressbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressBar {
  
  @scala.inline
  def apply(current: Double, message: String, startTime: js.Tuple2[Double, Double], total: Double): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IProgressbarProps]))
  }
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/progress-bar", "ProgressBar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IProgressbarProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
