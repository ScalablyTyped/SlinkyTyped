package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Regex extends StObject {
  
  /** The index of the submatch to extract as findings. When not specified, the entire match is returned. No more than 3 may be included. */
  var groupIndexes: js.UndefOr[js.Array[Double]] = js.native
  
  /** Pattern defining the regular expression. Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub. */
  var pattern: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2Regex {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Regex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Regex]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RegexMutableBuilder[Self <: GooglePrivacyDlpV2Regex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupIndexes(value: js.Array[Double]): Self = StObject.set(x, "groupIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIndexesUndefined: Self = StObject.set(x, "groupIndexes", js.undefined)
    
    @scala.inline
    def setGroupIndexesVarargs(value: Double*): Self = StObject.set(x, "groupIndexes", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
