package typingsSlinky.jestSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot/build/print", JSImport.Namespace)
@js.native
object printMod extends js.Object {
  
  def printDiffOrStringified(
    expectedSerializedTrimmed: String,
    receivedSerializedTrimmed: String,
    received: js.Any,
    expectedLabel: String,
    receivedLabel: String,
    expand: Boolean
  ): String = js.native
}
