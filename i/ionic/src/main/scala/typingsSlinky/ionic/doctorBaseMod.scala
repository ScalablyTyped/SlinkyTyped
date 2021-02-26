package typingsSlinky.ionic

import typingsSlinky.ionic.commandMod.Command
import typingsSlinky.ionic.definitionsMod.IAilment
import typingsSlinky.ionic.definitionsMod.IAilmentRegistry
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.definitionsMod.TreatableAilment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doctorBaseMod {
  
  @JSImport("ionic/commands/doctor/base", "DoctorCommand")
  @js.native
  abstract class DoctorCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def detectAilments(): js.Promise[js.Array[IAilment]] = js.native
    
    def detectTreatableAilments(): js.Promise[js.Array[TreatableAilment]] = js.native
    
    def getRegistry(): js.Promise[IAilmentRegistry] = js.native
  }
}
