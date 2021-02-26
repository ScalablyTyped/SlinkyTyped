package typingsSlinky.reactNativeShare

import typingsSlinky.reactNativeShare.mod.ActivityItemSource
import typingsSlinky.reactNativeShare.mod.Share.Social
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react-native-share.react-native-share.Options & {  social :react-native-share.react-native-share.Share.Social} */
  @js.native
  trait OptionssocialSocial extends StObject {
    
    var activityItemSources: js.UndefOr[js.Array[ActivityItemSource]] = js.native
    
    var excludedActivityTypes: js.UndefOr[String] = js.native
    
    var failOnCancel: js.UndefOr[Boolean] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var saveToFiles: js.UndefOr[Boolean] = js.native
    
    var showAppsToView: js.UndefOr[Boolean] = js.native
    
    var social: Social = js.native
    
    var subject: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var urls: js.UndefOr[js.Array[String]] = js.native
  }
  object OptionssocialSocial {
    
    @scala.inline
    def apply(social: Social): OptionssocialSocial = {
      val __obj = js.Dynamic.literal(social = social.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionssocialSocial]
    }
    
    @scala.inline
    implicit class OptionssocialSocialMutableBuilder[Self <: OptionssocialSocial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityItemSources(value: js.Array[ActivityItemSource]): Self = StObject.set(x, "activityItemSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityItemSourcesUndefined: Self = StObject.set(x, "activityItemSources", js.undefined)
      
      @scala.inline
      def setActivityItemSourcesVarargs(value: ActivityItemSource*): Self = StObject.set(x, "activityItemSources", js.Array(value :_*))
      
      @scala.inline
      def setExcludedActivityTypes(value: String): Self = StObject.set(x, "excludedActivityTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedActivityTypesUndefined: Self = StObject.set(x, "excludedActivityTypes", js.undefined)
      
      @scala.inline
      def setFailOnCancel(value: Boolean): Self = StObject.set(x, "failOnCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnCancelUndefined: Self = StObject.set(x, "failOnCancel", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setSaveToFiles(value: Boolean): Self = StObject.set(x, "saveToFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveToFilesUndefined: Self = StObject.set(x, "saveToFiles", js.undefined)
      
      @scala.inline
      def setShowAppsToView(value: Boolean): Self = StObject.set(x, "showAppsToView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAppsToViewUndefined: Self = StObject.set(x, "showAppsToView", js.undefined)
      
      @scala.inline
      def setSocial(value: Social): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      @scala.inline
      def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    }
  }
}
