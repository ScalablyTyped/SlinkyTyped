package typingsSlinky.ionic

import typingsSlinky.ionic.commandMod.Command
import typingsSlinky.ionic.definitionsMod.APIResponseSuccess
import typingsSlinky.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncmapsMod {
  
  @JSImport("ionic/commands/monitoring/syncmaps", "MonitoringSyncSourcemapsCommand")
  @js.native
  class MonitoringSyncSourcemapsCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def syncSourcemap(
      file: String,
      snapshotId: String,
      appVersion: String,
      commitHash: String,
      appflowId: String,
      token: String
    ): js.Promise[Unit] = js.native
    
    def uploadSourcemap(sourcemap: APIResponseSuccess, file: String): js.Promise[Unit] = js.native
  }
}
