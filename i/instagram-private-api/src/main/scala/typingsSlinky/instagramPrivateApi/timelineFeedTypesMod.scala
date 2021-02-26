package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineFeedTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pagination
    - typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
    - typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch
    - typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch
  */
  trait TimelineFeedReason extends StObject
  object TimelineFeedReason {
    
    @scala.inline
    def cold_start_fetch: typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch = "cold_start_fetch".asInstanceOf[typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch]
    
    @scala.inline
    def pagination: typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pagination = "pagination".asInstanceOf[typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pagination]
    
    @scala.inline
    def pull_to_refresh: typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh = "pull_to_refresh".asInstanceOf[typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh]
    
    @scala.inline
    def warm_start_fetch: typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch = "warm_start_fetch".asInstanceOf[typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch]
  }
  
  @js.native
  trait TimelineFeedsOptions extends StObject {
    
    var latestStoryPk: js.UndefOr[String | Double] = js.native
    
    var pushDisabled: js.UndefOr[Boolean] = js.native
    
    var reason: js.UndefOr[TimelineFeedReason] = js.native
    
    var recoveredFromCrash: js.UndefOr[String] = js.native
  }
  object TimelineFeedsOptions {
    
    @scala.inline
    def apply(): TimelineFeedsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineFeedsOptions]
    }
    
    @scala.inline
    implicit class TimelineFeedsOptionsMutableBuilder[Self <: TimelineFeedsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatestStoryPk(value: String | Double): Self = StObject.set(x, "latestStoryPk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestStoryPkUndefined: Self = StObject.set(x, "latestStoryPk", js.undefined)
      
      @scala.inline
      def setPushDisabled(value: Boolean): Self = StObject.set(x, "pushDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushDisabledUndefined: Self = StObject.set(x, "pushDisabled", js.undefined)
      
      @scala.inline
      def setReason(value: TimelineFeedReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setRecoveredFromCrash(value: String): Self = StObject.set(x, "recoveredFromCrash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoveredFromCrashUndefined: Self = StObject.set(x, "recoveredFromCrash", js.undefined)
    }
  }
}
