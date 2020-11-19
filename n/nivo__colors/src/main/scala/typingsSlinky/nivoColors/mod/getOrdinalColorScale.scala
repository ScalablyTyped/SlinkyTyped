package typingsSlinky.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nivo/colors", "getOrdinalColorScale")
@js.native
object getOrdinalColorScale extends js.Object {
  
  def apply[D](instruction: OrdinalColorsInstruction[_], identity: String): OrdinalColorScale[D] = js.native
  def apply[D](instruction: OrdinalColorsInstruction[_], identity: ColorIdentityFunction[D]): OrdinalColorScale[D] = js.native
}
