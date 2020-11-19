package typingsSlinky.algoliaClientAnalytics.mod

import typingsSlinky.algoliaClientAnalytics.algoliaClientAnalyticsStrings.de
import typingsSlinky.algoliaClientAnalytics.algoliaClientAnalyticsStrings.us
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsClientOptions extends js.Object {
  
  /**
    * The api key.
    */
  val apiKey: String = js.native
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  /**
    * The prefered region.
    */
  val region: js.UndefOr[de | us] = js.native
}
object AnalyticsClientOptions {
  
  @scala.inline
  def apply(apiKey: String, appId: String): AnalyticsClientOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsClientOptions]
  }
  
  @scala.inline
  implicit class AnalyticsClientOptionsOps[Self <: AnalyticsClientOptions] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: de | us): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
