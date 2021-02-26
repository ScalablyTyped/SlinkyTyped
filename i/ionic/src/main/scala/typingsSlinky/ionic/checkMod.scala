package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.IAilment
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.doctorBaseMod.DoctorCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMod {
  
  @JSImport("ionic/commands/doctor/check", "DoctorCheckCommand")
  @js.native
  class DoctorCheckCommand protected () extends DoctorCommand {
    def this(namespace: INamespace) = this()
    
    def checkAilment(ailment: IAilment): js.Promise[Unit] = js.native
    
    def checkAilments(ailments: js.Array[IAilment]): js.Promise[Unit] = js.native
  }
}
