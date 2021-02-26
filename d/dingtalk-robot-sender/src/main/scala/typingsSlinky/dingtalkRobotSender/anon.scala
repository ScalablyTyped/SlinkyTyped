package typingsSlinky.dingtalkRobotSender

import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.`0`
import typingsSlinky.dingtalkRobotSender.dingtalkRobotSenderStrings.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ActionURL extends StObject {
    
    var actionURL: String = js.native
    
    var title: String = js.native
  }
  object ActionURL {
    
    @scala.inline
    def apply(actionURL: String, title: String): ActionURL = {
      val __obj = js.Dynamic.literal(actionURL = actionURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionURL]
    }
    
    @scala.inline
    implicit class ActionURLMutableBuilder[Self <: ActionURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionURL(value: String): Self = StObject.set(x, "actionURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AtMobiles extends StObject {
    
    var atMobiles: js.Array[String] = js.native
    
    var isAtAll: Boolean = js.native
  }
  object AtMobiles {
    
    @scala.inline
    def apply(atMobiles: js.Array[String], isAtAll: Boolean): AtMobiles = {
      val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any])
      __obj.asInstanceOf[AtMobiles]
    }
    
    @scala.inline
    implicit class AtMobilesMutableBuilder[Self <: AtMobiles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtMobiles(value: js.Array[String]): Self = StObject.set(x, "atMobiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtMobilesVarargs(value: String*): Self = StObject.set(x, "atMobiles", js.Array(value :_*))
      
      @scala.inline
      def setIsAtAll(value: Boolean): Self = StObject.set(x, "isAtAll", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BtnOrientation extends StObject {
    
    var btnOrientation: `0` | `1` = js.native
    
    var btns: js.UndefOr[js.Array[ActionURL]] = js.native
    
    var hideAvatar: `0` | `1` = js.native
    
    var singleTitle: js.UndefOr[String] = js.native
    
    var singleURL: js.UndefOr[String] = js.native
    
    var text: String = js.native
    
    var title: String = js.native
  }
  object BtnOrientation {
    
    @scala.inline
    def apply(btnOrientation: `0` | `1`, hideAvatar: `0` | `1`, text: String, title: String): BtnOrientation = {
      val __obj = js.Dynamic.literal(btnOrientation = btnOrientation.asInstanceOf[js.Any], hideAvatar = hideAvatar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BtnOrientation]
    }
    
    @scala.inline
    implicit class BtnOrientationMutableBuilder[Self <: BtnOrientation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBtnOrientation(value: `0` | `1`): Self = StObject.set(x, "btnOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtns(value: js.Array[ActionURL]): Self = StObject.set(x, "btns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnsUndefined: Self = StObject.set(x, "btns", js.undefined)
      
      @scala.inline
      def setBtnsVarargs(value: ActionURL*): Self = StObject.set(x, "btns", js.Array(value :_*))
      
      @scala.inline
      def setHideAvatar(value: `0` | `1`): Self = StObject.set(x, "hideAvatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleTitle(value: String): Self = StObject.set(x, "singleTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleTitleUndefined: Self = StObject.set(x, "singleTitle", js.undefined)
      
      @scala.inline
      def setSingleURL(value: String): Self = StObject.set(x, "singleURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleURLUndefined: Self = StObject.set(x, "singleURL", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Content extends StObject {
    
    var content: String = js.native
  }
  object Content {
    
    @scala.inline
    def apply(content: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IsAtAll extends StObject {
    
    var atMobiles: js.Array[String] = js.native
    
    var isAtAll: Boolean = js.native
    
    var text: String = js.native
    
    var title: String = js.native
  }
  object IsAtAll {
    
    @scala.inline
    def apply(atMobiles: js.Array[String], isAtAll: Boolean, text: String, title: String): IsAtAll = {
      val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsAtAll]
    }
    
    @scala.inline
    implicit class IsAtAllMutableBuilder[Self <: IsAtAll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtMobiles(value: js.Array[String]): Self = StObject.set(x, "atMobiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtMobilesVarargs(value: String*): Self = StObject.set(x, "atMobiles", js.Array(value :_*))
      
      @scala.inline
      def setIsAtAll(value: Boolean): Self = StObject.set(x, "isAtAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageURL_ extends StObject {
    
    var messageURL: String = js.native
    
    var picURL: String = js.native
    
    var title: String = js.native
  }
  object MessageURL_ {
    
    @scala.inline
    def apply(messageURL: String, picURL: String, title: String): MessageURL_ = {
      val __obj = js.Dynamic.literal(messageURL = messageURL.asInstanceOf[js.Any], picURL = picURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageURL_]
    }
    
    @scala.inline
    implicit class MessageURL_MutableBuilder[Self <: MessageURL_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageURL(value: String): Self = StObject.set(x, "messageURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicURL(value: String): Self = StObject.set(x, "picURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageUrl extends StObject {
    
    var messageUrl: String = js.native
    
    var picUrl: String = js.native
    
    var text: String = js.native
    
    var title: String = js.native
  }
  object MessageUrl {
    
    @scala.inline
    def apply(messageUrl: String, picUrl: String, text: String, title: String): MessageUrl = {
      val __obj = js.Dynamic.literal(messageUrl = messageUrl.asInstanceOf[js.Any], picUrl = picUrl.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageUrl]
    }
    
    @scala.inline
    implicit class MessageUrlMutableBuilder[Self <: MessageUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageUrl(value: String): Self = StObject.set(x, "messageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicUrl(value: String): Self = StObject.set(x, "picUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
