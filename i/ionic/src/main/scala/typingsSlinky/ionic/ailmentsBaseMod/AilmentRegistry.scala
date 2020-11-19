package typingsSlinky.ionic.ailmentsBaseMod

import typingsSlinky.ionic.definitionsMod.IAilment
import typingsSlinky.ionic.definitionsMod.IAilmentRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/doctor/ailments/base", "AilmentRegistry")
@js.native
class AilmentRegistry () extends IAilmentRegistry {
  
  var _ailments: js.Array[IAilment] = js.native
  
  @JSName("ailments")
  def ailments_MAilmentRegistry: js.Array[IAilment] = js.native
}
