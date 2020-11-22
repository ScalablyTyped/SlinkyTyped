package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Int64RangeMatch extends js.Object {
  
  /** The end of the range (exclusive) in signed long integer format. */
  var rangeEnd: js.UndefOr[String] = js.native
  
  /** The start of the range (inclusive) in signed long integer format. */
  var rangeStart: js.UndefOr[String] = js.native
}
object Int64RangeMatch {
  
  @scala.inline
  def apply(): Int64RangeMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Int64RangeMatch]
  }
  
  @scala.inline
  implicit class Int64RangeMatchOps[Self <: Int64RangeMatch] (val x: Self) extends AnyVal {
    
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
    def setRangeEnd(value: String): Self = this.set("rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeEnd: Self = this.set("rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: String): Self = this.set("rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeStart: Self = this.set("rangeStart", js.undefined)
  }
}
