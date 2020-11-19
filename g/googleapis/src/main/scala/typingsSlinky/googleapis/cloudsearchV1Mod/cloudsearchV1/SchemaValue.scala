package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of a single value with generic type.
  */
@js.native
trait SchemaValue extends js.Object {
  
  var booleanValue: js.UndefOr[Boolean] = js.native
  
  var dateValue: js.UndefOr[SchemaDate] = js.native
  
  var doubleValue: js.UndefOr[Double] = js.native
  
  var integerValue: js.UndefOr[String] = js.native
  
  var stringValue: js.UndefOr[String] = js.native
  
  var timestampValue: js.UndefOr[String] = js.native
}
object SchemaValue {
  
  @scala.inline
  def apply(): SchemaValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValue]
  }
  
  @scala.inline
  implicit class SchemaValueOps[Self <: SchemaValue] (val x: Self) extends AnyVal {
    
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
    def setBooleanValue(value: Boolean): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanValue: Self = this.set("booleanValue", js.undefined)
    
    @scala.inline
    def setDateValue(value: SchemaDate): Self = this.set("dateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateValue: Self = this.set("dateValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = this.set("timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampValue: Self = this.set("timestampValue", js.undefined)
  }
}
