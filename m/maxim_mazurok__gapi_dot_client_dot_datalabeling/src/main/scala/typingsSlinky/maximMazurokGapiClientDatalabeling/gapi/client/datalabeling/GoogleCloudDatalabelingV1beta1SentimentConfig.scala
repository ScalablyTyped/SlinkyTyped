package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1SentimentConfig extends StObject {
  
  /** If set to true, contributors will have the option to select sentiment of the label they selected, to mark it as negative or positive label. Default is false. */
  var enableLabelSentimentSelection: js.UndefOr[Boolean] = js.native
}
object GoogleCloudDatalabelingV1beta1SentimentConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1SentimentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SentimentConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1SentimentConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1SentimentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableLabelSentimentSelection(value: Boolean): Self = StObject.set(x, "enableLabelSentimentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLabelSentimentSelectionUndefined: Self = StObject.set(x, "enableLabelSentimentSelection", js.undefined)
  }
}
