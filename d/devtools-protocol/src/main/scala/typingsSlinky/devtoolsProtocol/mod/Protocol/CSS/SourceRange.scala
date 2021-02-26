package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRange extends StObject {
  
  /**
    * End column of range (exclusive).
    */
  var endColumn: integer = js.native
  
  /**
    * End line of range
    */
  var endLine: integer = js.native
  
  /**
    * Start column of range (inclusive).
    */
  var startColumn: integer = js.native
  
  /**
    * Start line of range.
    */
  var startLine: integer = js.native
}
object SourceRange {
  
  @scala.inline
  def apply(endColumn: integer, endLine: integer, startColumn: integer, startLine: integer): SourceRange = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRange]
  }
  
  @scala.inline
  implicit class SourceRangeMutableBuilder[Self <: SourceRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: integer): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLine(value: integer): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: integer): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: integer): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
  }
}
