package typingsSlinky.gifEncoder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighWaterMark extends js.Object {
  
  /**
    * Number, in bytes, to store in internal buffer. Defaults to 64kB.
    */
  var highWaterMark: js.UndefOr[Double] = js.native
}
object HighWaterMark {
  
  @scala.inline
  def apply(): HighWaterMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighWaterMark]
  }
  
  @scala.inline
  implicit class HighWaterMarkOps[Self <: HighWaterMark] (val x: Self) extends AnyVal {
    
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
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
  }
}
