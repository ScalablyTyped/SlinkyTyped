package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Shopping
// Targeting
@js.native
trait AdSchedule
  extends AdWordsEntity
     with canSetBidModifier
     with hasStats
     with isCampaignChild {
  
  def getCampaignType(): CampaignType = js.native
  
  def getDayOfWeek(): DayOfWeekString = js.native
  
  def getEndHour(): Double = js.native
  
  def getEndMinute(): Double = js.native
  
  def getId(): Double = js.native
  
  def getStartHour(): Double = js.native
  
  def getStartMinute(): Double = js.native
  
  def getVideoCampaign(): Campaign = js.native
  
   // TODO: VideoCampaign
  def remove(): Unit = js.native
}
