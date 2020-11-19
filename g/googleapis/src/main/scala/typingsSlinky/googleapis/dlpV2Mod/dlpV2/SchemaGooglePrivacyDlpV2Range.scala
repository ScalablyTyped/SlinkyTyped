package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic half-open interval [start, end)
  */
@js.native
trait SchemaGooglePrivacyDlpV2Range extends js.Object {
  
  /**
    * Index of the last character of the range (exclusive).
    */
  var end: js.UndefOr[String] = js.native
  
  /**
    * Index of the first character of the range (inclusive).
    */
  var start: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2Range {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Range]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RangeOps[Self <: SchemaGooglePrivacyDlpV2Range] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
