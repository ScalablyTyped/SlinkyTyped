package typingsSlinky.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptionsWithThreshold extends LabelOptions {
  
  var ratio: js.UndefOr[js.Any] = js.native
  
  /**
    * Set threshold to show/hide labels.
    * Defaults to `0.05`.
    */
  var threshold: js.UndefOr[Double] = js.native
}
object LabelOptionsWithThreshold {
  
  @scala.inline
  def apply(): LabelOptionsWithThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptionsWithThreshold]
  }
  
  @scala.inline
  implicit class LabelOptionsWithThresholdOps[Self <: LabelOptionsWithThreshold] (val x: Self) extends AnyVal {
    
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
    def setRatio(value: js.Any): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
