package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoAbuseReportReasonSnippet extends StObject {
  
  /** The localized label belonging to this abuse report reason. */
  var label: js.UndefOr[String] = js.native
  
  /** The secondary reasons associated with this reason, if any are available. (There might be 0 or more.) */
  var secondaryReasons: js.UndefOr[js.Array[VideoAbuseReportSecondaryReason]] = js.native
}
object VideoAbuseReportReasonSnippet {
  
  @scala.inline
  def apply(): VideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAbuseReportReasonSnippet]
  }
  
  @scala.inline
  implicit class VideoAbuseReportReasonSnippetMutableBuilder[Self <: VideoAbuseReportReasonSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSecondaryReasons(value: js.Array[VideoAbuseReportSecondaryReason]): Self = StObject.set(x, "secondaryReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryReasonsUndefined: Self = StObject.set(x, "secondaryReasons", js.undefined)
    
    @scala.inline
    def setSecondaryReasonsVarargs(value: VideoAbuseReportSecondaryReason*): Self = StObject.set(x, "secondaryReasons", js.Array(value :_*))
  }
}
