package typingsSlinky.gapiClientConsumersurveys

import typingsSlinky.gapiClientConsumersurveys.gapi.client.consumersurveys.MobileapppanelsResource
import typingsSlinky.gapiClientConsumersurveys.gapi.client.consumersurveys.ResultsResource
import typingsSlinky.gapiClientConsumersurveys.gapi.client.consumersurveys.SurveysResource
import typingsSlinky.gapiClientConsumersurveys.gapiClientConsumersurveysStrings.consumersurveys
import typingsSlinky.gapiClientConsumersurveys.gapiClientConsumersurveysStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Consumer Surveys API v2 */
      def load(name: consumersurveys, version: v2): js.Thenable[Unit] = js.native
      def load(name: consumersurveys, version: v2, callback: js.Function0[_]): Unit = js.native
      
      val mobileapppanels: MobileapppanelsResource = js.native
      
      val results: ResultsResource = js.native
      
      val surveys: SurveysResource = js.native
    }
  }
}
