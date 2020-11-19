package typingsSlinky.ionic.libTelemetryMod

import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.ITelemetry
import typingsSlinky.ionic.definitionsMod.InfoItem
import typingsSlinky.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/telemetry", "Telemetry")
@js.native
class Telemetry protected () extends ITelemetry {
  def this(hasConfigClientGetInfoCtxProjectSession: TelemetryDeps) = this()
  
  val client: IClient = js.native
  
  val config: IConfig = js.native
  
  val ctx: IonicContext = js.native
  
  /* protected */ def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  
  val project: js.UndefOr[IProject] = js.native
  
  val session: ISession = js.native
}
