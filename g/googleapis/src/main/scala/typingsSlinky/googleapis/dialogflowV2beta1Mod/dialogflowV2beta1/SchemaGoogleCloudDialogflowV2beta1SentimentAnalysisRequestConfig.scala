package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the types of sentiment analysis to perform.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig extends js.Object {
  
  /**
    * Optional. Instructs the service to perform sentiment analysis on
    * `query_text`. If not provided, sentiment analysis is not performed on
    * `query_text`.
    */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfigOps[Self <: SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig] (val x: Self) extends AnyVal {
    
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
    def setAnalyzeQueryTextSentiment(value: Boolean): Self = this.set("analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzeQueryTextSentiment: Self = this.set("analyzeQueryTextSentiment", js.undefined)
  }
}
