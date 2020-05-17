package typingsSlinky.gapiClientDlp

import typingsSlinky.gapiClientDlp.gapi.client.dlp.ContentResource
import typingsSlinky.gapiClientDlp.gapi.client.dlp.DataSourceResource
import typingsSlinky.gapiClientDlp.gapi.client.dlp.InspectResource
import typingsSlinky.gapiClientDlp.gapi.client.dlp.RiskAnalysisResource
import typingsSlinky.gapiClientDlp.gapi.client.dlp.RootCategoriesResource
import typingsSlinky.gapiClientDlp.gapiClientDlpStrings.dlp
import typingsSlinky.gapiClientDlp.gapiClientDlpStrings.v2beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val content: ContentResource = js.native
      val dataSource: DataSourceResource = js.native
      val inspect: InspectResource = js.native
      val riskAnalysis: RiskAnalysisResource = js.native
      val rootCategories: RootCategoriesResource = js.native
      /** Load DLP API v2beta1 */
      def load(name: dlp, version: v2beta1): js.Thenable[Unit] = js.native
      def load(name: dlp, version: v2beta1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

