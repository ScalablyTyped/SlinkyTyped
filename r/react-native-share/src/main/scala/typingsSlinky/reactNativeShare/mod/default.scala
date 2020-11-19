package typingsSlinky.reactNativeShare.mod

import typingsSlinky.reactNativeShare.anon.OptionssocialSocial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-share", JSImport.Default)
@js.native
object default extends js.Object {
  
  def isPackageInstalled(packageName: String): js.Promise[ShareSingleReturn] = js.native
  
  def open(options: MultipleOptions): js.Promise[OpenReturn] = js.native
  def open(options: Options): js.Promise[OpenReturn] = js.native
  
  def shareSingle(options: OptionssocialSocial): js.Promise[ShareSingleReturn] = js.native
  
  @js.native
  object InstagramStories extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactNativeShare.mod.Share.InstagramStories with String] = js.native
    
    /* "shareBackgroundAndStickerImage" */ val SHARE_BACKGROUND_AND_STICKER_IMAGE: typingsSlinky.reactNativeShare.mod.Share.InstagramStories.SHARE_BACKGROUND_AND_STICKER_IMAGE with String = js.native
    
    /* "shareBackgroundImage" */ val SHARE_BACKGROUND_IMAGE: typingsSlinky.reactNativeShare.mod.Share.InstagramStories.SHARE_BACKGROUND_IMAGE with String = js.native
    
    /* "shareStickerImage" */ val SHARE_STICKER_IMAGE: typingsSlinky.reactNativeShare.mod.Share.InstagramStories.SHARE_STICKER_IMAGE with String = js.native
  }
  
  @js.native
  object Social extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactNativeShare.mod.Share.Social with String] = js.native
    
    /* "email" */ val EMAIL: typingsSlinky.reactNativeShare.mod.Share.Social.EMAIL with String = js.native
    
    /* "facebook" */ val FACEBOOK: typingsSlinky.reactNativeShare.mod.Share.Social.FACEBOOK with String = js.native
    
    /* "googleplus" */ val GOOGLEPLUS: typingsSlinky.reactNativeShare.mod.Share.Social.GOOGLEPLUS with String = js.native
    
    /* "instagram" */ val INSTAGRAM: typingsSlinky.reactNativeShare.mod.Share.Social.INSTAGRAM with String = js.native
    
    /* "instagram-stories" */ val INSTAGRAM_STORIES: typingsSlinky.reactNativeShare.mod.Share.Social.INSTAGRAM_STORIES with String = js.native
    
    /* "linkedin" */ val LINKEDIN: typingsSlinky.reactNativeShare.mod.Share.Social.LINKEDIN with String = js.native
    
    /* "pagesmanager" */ val PAGESMANAGER: typingsSlinky.reactNativeShare.mod.Share.Social.PAGESMANAGER with String = js.native
    
    /* "pinterest" */ val PINTEREST: typingsSlinky.reactNativeShare.mod.Share.Social.PINTEREST with String = js.native
    
    /* "twitter" */ val TWITTER: typingsSlinky.reactNativeShare.mod.Share.Social.TWITTER with String = js.native
    
    /* "whatsapp" */ val WHATSAPP: typingsSlinky.reactNativeShare.mod.Share.Social.WHATSAPP with String = js.native
  }
}
