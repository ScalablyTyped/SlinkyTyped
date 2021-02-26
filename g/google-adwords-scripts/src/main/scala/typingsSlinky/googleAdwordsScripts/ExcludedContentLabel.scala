package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludedContentLabel
  extends AdWordsEntity
     with isCampaignChild {
  
  def getCampaignType(): CampaignType = js.native
  
  def getContentLabelType(): String = js.native
  
  // TODO: ContentLabelType
  def getId(): Double = js.native
  
  def getVideoCampaign(): Campaign = js.native
  
  // TODO: VideoCampaign
  def remove(): Unit = js.native
}
object ExcludedContentLabel {
  
  @scala.inline
  def apply(
    getCampaign: () => Campaign,
    getCampaignType: () => CampaignType,
    getContentLabelType: () => String,
    getId: () => Double,
    getVideoCampaign: () => Campaign,
    remove: () => Unit
  ): ExcludedContentLabel = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getContentLabelType = js.Any.fromFunction0(getContentLabelType), getId = js.Any.fromFunction0(getId), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedContentLabel]
  }
  
  @scala.inline
  implicit class ExcludedContentLabelMutableBuilder[Self <: ExcludedContentLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCampaignType(value: () => CampaignType): Self = StObject.set(x, "getCampaignType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContentLabelType(value: () => String): Self = StObject.set(x, "getContentLabelType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVideoCampaign(value: () => Campaign): Self = StObject.set(x, "getVideoCampaign", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
