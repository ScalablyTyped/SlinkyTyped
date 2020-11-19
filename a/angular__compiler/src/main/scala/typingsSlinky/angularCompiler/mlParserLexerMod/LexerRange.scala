package typingsSlinky.angularCompiler.mlParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexerRange extends js.Object {
  
  var endPos: Double = js.native
  
  var startCol: Double = js.native
  
  var startLine: Double = js.native
  
  var startPos: Double = js.native
}
object LexerRange {
  
  @scala.inline
  def apply(endPos: Double, startCol: Double, startLine: Double, startPos: Double): LexerRange = {
    val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexerRange]
  }
  
  @scala.inline
  implicit class LexerRangeOps[Self <: LexerRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndPos(value: Double): Self = this.set("endPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCol(value: Double): Self = this.set("startCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPos(value: Double): Self = this.set("startPos", value.asInstanceOf[js.Any])
  }
}
