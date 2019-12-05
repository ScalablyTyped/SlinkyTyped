package typingsSlinky.ionic

import typingsSlinky.ionic.commandsDoctorBaseMod.DoctorCommand
import typingsSlinky.ionic.definitionsMod.IAilment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/doctor/check", JSImport.Namespace)
@js.native
object commandsDoctorCheckMod extends js.Object {
  @js.native
  class DoctorCheckCommand () extends DoctorCommand {
    def checkAilment(ailment: IAilment): js.Promise[Unit] = js.native
    def checkAilments(ailments: js.Array[IAilment]): js.Promise[Unit] = js.native
  }
  
}

