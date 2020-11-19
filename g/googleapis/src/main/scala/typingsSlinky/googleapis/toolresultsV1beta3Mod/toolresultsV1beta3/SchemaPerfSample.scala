package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource representing a single performance measure or data point
  */
@js.native
trait SchemaPerfSample extends js.Object {
  
  /**
    * Timestamp of collection
    */
  var sampleTime: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * Value observed
    */
  var value: js.UndefOr[Double] = js.native
}
object SchemaPerfSample {
  
  @scala.inline
  def apply(): SchemaPerfSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfSample]
  }
  
  @scala.inline
  implicit class SchemaPerfSampleOps[Self <: SchemaPerfSample] (val x: Self) extends AnyVal {
    
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
    def setSampleTime(value: SchemaTimestamp): Self = this.set("sampleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleTime: Self = this.set("sampleTime", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
