package typingsSlinky.ipp.anon

import typingsSlinky.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Joburi extends js.Object {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  
  var `job-id`: js.UndefOr[Double] = js.native
  
  var `job-uri`: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var `printer-uri`: js.UndefOr[String] = js.native
  
  var `requesting-user-name`: String = js.native
}
object Joburi {
  
  @scala.inline
  def apply(`requesting-user-name`: String): Joburi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Joburi]
  }
  
  @scala.inline
  implicit class JoburiOps[Self <: Joburi] (val x: Self) extends AnyVal {
    
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
    def `setRequesting-user-name`(value: String): Self = this.set("requesting-user-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-charset`(value: CharacterSet): Self = this.set("attributes-charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAttributes-charset`: Self = this.set("attributes-charset", js.undefined)
    
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = this.set("attributes-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAttributes-natural-language`: Self = this.set("attributes-natural-language", js.undefined)
    
    @scala.inline
    def `setJob-id`(value: Double): Self = this.set("job-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJob-id`: Self = this.set("job-id", js.undefined)
    
    @scala.inline
    def `setJob-uri`(value: String): Self = this.set("job-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJob-uri`: Self = this.set("job-uri", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def `setPrinter-uri`(value: String): Self = this.set("printer-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePrinter-uri`: Self = this.set("printer-uri", js.undefined)
  }
}
