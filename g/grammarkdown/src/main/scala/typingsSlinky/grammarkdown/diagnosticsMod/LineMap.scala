package typingsSlinky.grammarkdown.diagnosticsMod

import typingsSlinky.grammarkdown.typesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/diagnostics", "LineMap")
@js.native
class LineMap protected () extends js.Object {
  def this(text: String) = this()
  
  var computeLineStarts: js.Any = js.native
  
  def formatOffset(pos: Double): String = js.native
  
  def lineCount: Double = js.native
  
  var lineStarts: js.Any = js.native
  
  def offsetAt(position: Position): Double = js.native
  
  def positionAt(offset: Double): Position = js.native
  
  var text: js.Any = js.native
}
