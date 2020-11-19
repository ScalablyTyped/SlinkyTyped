package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends js.Object {
  
  var beep: js.UndefOr[Boolean] = js.native
  
  var format: String = js.native
  
  var ifExists: js.UndefOr[String] = js.native
  
  var maxDurationSeconds: js.UndefOr[Double] = js.native
  
  var maxSilenceSeconds: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var terminateOn: js.UndefOr[String] = js.native
}
object Format {
  
  @scala.inline
  def apply(format: String, name: String): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeep(value: Boolean): Self = this.set("beep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeep: Self = this.set("beep", js.undefined)
    
    @scala.inline
    def setIfExists(value: String): Self = this.set("ifExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfExists: Self = this.set("ifExists", js.undefined)
    
    @scala.inline
    def setMaxDurationSeconds(value: Double): Self = this.set("maxDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDurationSeconds: Self = this.set("maxDurationSeconds", js.undefined)
    
    @scala.inline
    def setMaxSilenceSeconds(value: Double): Self = this.set("maxSilenceSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSilenceSeconds: Self = this.set("maxSilenceSeconds", js.undefined)
    
    @scala.inline
    def setTerminateOn(value: String): Self = this.set("terminateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminateOn: Self = this.set("terminateOn", js.undefined)
  }
}
