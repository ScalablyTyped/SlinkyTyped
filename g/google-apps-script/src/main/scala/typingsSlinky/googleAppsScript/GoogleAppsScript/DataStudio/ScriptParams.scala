package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptParams extends StObject {
  
  /** A timestamp that marks the most recent request for a refresh of data. */
  var lastRefresh: String = js.native
  
  /** If true, the getData() request is for automatic semantic type detection. */
  var sampleExtraction: js.UndefOr[Boolean] = js.native
}
object ScriptParams {
  
  @scala.inline
  def apply(lastRefresh: String): ScriptParams = {
    val __obj = js.Dynamic.literal(lastRefresh = lastRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptParams]
  }
  
  @scala.inline
  implicit class ScriptParamsMutableBuilder[Self <: ScriptParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastRefresh(value: String): Self = StObject.set(x, "lastRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleExtraction(value: Boolean): Self = StObject.set(x, "sampleExtraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleExtractionUndefined: Self = StObject.set(x, "sampleExtraction", js.undefined)
  }
}
