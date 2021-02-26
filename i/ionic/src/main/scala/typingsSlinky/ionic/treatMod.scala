package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.definitionsMod.TreatableAilment
import typingsSlinky.ionic.doctorBaseMod.DoctorCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treatMod {
  
  @JSImport("ionic/commands/doctor/treat", "DoctorTreatCommand")
  @js.native
  class DoctorTreatCommand protected () extends DoctorCommand {
    def this(namespace: INamespace) = this()
    
    def handleError(e: js.Any): Unit = js.native
    
    def treatAilment(ailment: TreatableAilment): js.Promise[Boolean] = js.native
    
    def treatAilments(ailments: js.Array[TreatableAilment]): js.Promise[Unit] = js.native
  }
}
