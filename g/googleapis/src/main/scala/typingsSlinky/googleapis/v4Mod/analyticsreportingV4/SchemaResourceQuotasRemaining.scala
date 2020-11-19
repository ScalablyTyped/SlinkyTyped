package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The resource quota tokens remaining for the property after the request is
  * completed.
  */
@js.native
trait SchemaResourceQuotasRemaining extends js.Object {
  
  /**
    * Daily resource quota remaining remaining.
    */
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.native
  
  /**
    * Hourly resource quota tokens remaining.
    */
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.native
}
object SchemaResourceQuotasRemaining {
  
  @scala.inline
  def apply(): SchemaResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceQuotasRemaining]
  }
  
  @scala.inline
  implicit class SchemaResourceQuotasRemainingOps[Self <: SchemaResourceQuotasRemaining] (val x: Self) extends AnyVal {
    
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
    def setDailyQuotaTokensRemaining(value: Double): Self = this.set("dailyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailyQuotaTokensRemaining: Self = this.set("dailyQuotaTokensRemaining", js.undefined)
    
    @scala.inline
    def setHourlyQuotaTokensRemaining(value: Double): Self = this.set("hourlyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourlyQuotaTokensRemaining: Self = this.set("hourlyQuotaTokensRemaining", js.undefined)
  }
}
