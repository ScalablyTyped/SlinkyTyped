package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHeaderRequest extends StObject {
  
  /**
    * The location of the SectionBreak which begins the section this header should belong to. If `section_break_location' is unset or if it refers to the first section break in the
    * document body, the header applies to the DocumentStyle
    */
  var sectionBreakLocation: js.UndefOr[Location] = js.native
  
  /** The type of header to create. */
  var `type`: js.UndefOr[String] = js.native
}
object CreateHeaderRequest {
  
  @scala.inline
  def apply(): CreateHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHeaderRequest]
  }
  
  @scala.inline
  implicit class CreateHeaderRequestMutableBuilder[Self <: CreateHeaderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSectionBreakLocation(value: Location): Self = StObject.set(x, "sectionBreakLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionBreakLocationUndefined: Self = StObject.set(x, "sectionBreakLocation", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
