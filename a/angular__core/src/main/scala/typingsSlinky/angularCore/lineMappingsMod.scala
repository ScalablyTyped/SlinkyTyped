package typingsSlinky.angularCore

import typingsSlinky.angularCore.anon.Character
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/utils/line_mappings", JSImport.Namespace)
@js.native
object lineMappingsMod extends js.Object {
  
  def computeLineStartsMap(text: String): js.Array[Double] = js.native
  
  def getLineAndCharacterFromPosition(lineStartsMap: js.Array[Double], position: Double): Character = js.native
}
