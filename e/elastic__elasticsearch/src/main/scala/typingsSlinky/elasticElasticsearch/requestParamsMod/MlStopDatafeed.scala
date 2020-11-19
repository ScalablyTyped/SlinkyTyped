package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlStopDatafeed extends Generic {
  
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.native
  
  var datafeed_id: String = js.native
  
  var force: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object MlStopDatafeed {
  
  @scala.inline
  def apply(datafeed_id: String): MlStopDatafeed = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStopDatafeed]
  }
  
  @scala.inline
  implicit class MlStopDatafeedOps[Self <: MlStopDatafeed] (val x: Self) extends AnyVal {
    
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
    def setDatafeed_id(value: String): Self = this.set("datafeed_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_datafeeds(value: Boolean): Self = this.set("allow_no_datafeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_datafeeds: Self = this.set("allow_no_datafeeds", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
