package typingsSlinky.gatsbyCli.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gatsbyCli.cliMod.ICLIProps
import typingsSlinky.gatsbyCli.cliMod.default
import typingsSlinky.gatsbyCli.typesMod.IGatsbyCLIState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cli {
  
  @scala.inline
  def apply(logs: IGatsbyCLIState, showStatusBar: Boolean): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], showStatusBar = showStatusBar.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[ICLIProps]))
  }
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/cli", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ICLIProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
