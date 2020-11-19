package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldingMarkers extends js.Object {
  
  var end: js.RegExp = js.native
  
  var start: js.RegExp = js.native
}
object FoldingMarkers {
  
  @scala.inline
  def apply(end: js.RegExp, start: js.RegExp): FoldingMarkers = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingMarkers]
  }
  
  @scala.inline
  implicit class FoldingMarkersOps[Self <: FoldingMarkers] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: js.RegExp): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.RegExp): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
