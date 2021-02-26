package typingsSlinky.ipp.anon

import typingsSlinky.ipp.mod.CharacterSet
import typingsSlinky.ipp.mod.JobHoldUntil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jobholduntil extends StObject {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  
  var `job-hold-until`: js.UndefOr[JobHoldUntil] = js.native
  
  var `job-id`: js.UndefOr[Double] = js.native
  
  var `job-uri`: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var `printer-uri`: js.UndefOr[String] = js.native
  
  var `requesting-user-name`: String = js.native
}
object Jobholduntil {
  
  @scala.inline
  def apply(`requesting-user-name`: String): Jobholduntil = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobholduntil]
  }
  
  @scala.inline
  implicit class JobholduntilMutableBuilder[Self <: Jobholduntil] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    @scala.inline
    def `setJob-hold-until`(value: JobHoldUntil): Self = StObject.set(x, "job-hold-until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-hold-untilUndefined`: Self = StObject.set(x, "job-hold-until", js.undefined)
    
    @scala.inline
    def `setJob-id`(value: Double): Self = StObject.set(x, "job-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-idUndefined`: Self = StObject.set(x, "job-id", js.undefined)
    
    @scala.inline
    def `setJob-uri`(value: String): Self = StObject.set(x, "job-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-uriUndefined`: Self = StObject.set(x, "job-uri", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def `setPrinter-uri`(value: String): Self = StObject.set(x, "printer-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrinter-uriUndefined`: Self = StObject.set(x, "printer-uri", js.undefined)
    
    @scala.inline
    def `setRequesting-user-name`(value: String): Self = StObject.set(x, "requesting-user-name", value.asInstanceOf[js.Any])
  }
}
