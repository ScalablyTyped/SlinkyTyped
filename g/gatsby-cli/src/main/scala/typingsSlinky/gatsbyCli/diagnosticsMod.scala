package typingsSlinky.gatsbyCli

import typingsSlinky.gatsbyCli.reduxMod.GatsbyCLIStore
import typingsSlinky.gatsbyCli.typesMod.ActionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticsMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/diagnostics", "createStructuredLoggingDiagnosticsMiddleware")
  @js.native
  def createStructuredLoggingDiagnosticsMiddleware(store: GatsbyCLIStore): DiagnosticsMiddleware = js.native
  
  type DiagnosticsMiddleware = js.Function1[/* action */ ActionsUnion, Unit]
}
