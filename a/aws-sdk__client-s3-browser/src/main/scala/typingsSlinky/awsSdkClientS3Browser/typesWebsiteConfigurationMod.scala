package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.typesErrorDocumentMod.ErrorDocument
import typingsSlinky.awsSdkClientS3Browser.typesErrorDocumentMod.UnmarshalledErrorDocument
import typingsSlinky.awsSdkClientS3Browser.typesIndexDocumentMod.IndexDocument
import typingsSlinky.awsSdkClientS3Browser.typesIndexDocumentMod.UnmarshalledIndexDocument
import typingsSlinky.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
import typingsSlinky.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typingsSlinky.awsSdkClientS3Browser.typesRoutingRuleMod.RoutingRule
import typingsSlinky.awsSdkClientS3Browser.typesRoutingRuleMod.UnmarshalledRoutingRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWebsiteConfigurationMod {
  
  @js.native
  trait UnmarshalledWebsiteConfiguration extends WebsiteConfiguration {
    
    /**
      * _ErrorDocument shape
      */
    @JSName("ErrorDocument")
    var ErrorDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledErrorDocument] = js.native
    
    /**
      * _IndexDocument shape
      */
    @JSName("IndexDocument")
    var IndexDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledIndexDocument] = js.native
    
    /**
      * _RedirectAllRequestsTo shape
      */
    @JSName("RedirectAllRequestsTo")
    var RedirectAllRequestsTo_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.native
    
    /**
      * _RoutingRules shape
      */
    @JSName("RoutingRules")
    var RoutingRules_UnmarshalledWebsiteConfiguration: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.native
  }
  object UnmarshalledWebsiteConfiguration {
    
    @scala.inline
    def apply(): UnmarshalledWebsiteConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWebsiteConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledWebsiteConfigurationMutableBuilder[Self <: UnmarshalledWebsiteConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorDocument(value: UnmarshalledErrorDocument): Self = StObject.set(x, "ErrorDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDocumentUndefined: Self = StObject.set(x, "ErrorDocument", js.undefined)
      
      @scala.inline
      def setIndexDocument(value: UnmarshalledIndexDocument): Self = StObject.set(x, "IndexDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexDocumentUndefined: Self = StObject.set(x, "IndexDocument", js.undefined)
      
      @scala.inline
      def setRedirectAllRequestsTo(value: UnmarshalledRedirectAllRequestsTo): Self = StObject.set(x, "RedirectAllRequestsTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "RedirectAllRequestsTo", js.undefined)
      
      @scala.inline
      def setRoutingRules(value: js.Array[UnmarshalledRoutingRule]): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
      
      @scala.inline
      def setRoutingRulesVarargs(value: UnmarshalledRoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WebsiteConfiguration extends StObject {
    
    /**
      * _ErrorDocument shape
      */
    var ErrorDocument: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesErrorDocumentMod.ErrorDocument] = js.native
    
    /**
      * _IndexDocument shape
      */
    var IndexDocument: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesIndexDocumentMod.IndexDocument] = js.native
    
    /**
      * _RedirectAllRequestsTo shape
      */
    var RedirectAllRequestsTo: js.UndefOr[
        typingsSlinky.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
      ] = js.native
    
    /**
      * _RoutingRules shape
      */
    var RoutingRules: js.UndefOr[js.Array[RoutingRule] | js.Iterable[RoutingRule]] = js.native
  }
  object WebsiteConfiguration {
    
    @scala.inline
    def apply(): WebsiteConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebsiteConfiguration]
    }
    
    @scala.inline
    implicit class WebsiteConfigurationMutableBuilder[Self <: WebsiteConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorDocument(value: ErrorDocument): Self = StObject.set(x, "ErrorDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDocumentUndefined: Self = StObject.set(x, "ErrorDocument", js.undefined)
      
      @scala.inline
      def setIndexDocument(value: IndexDocument): Self = StObject.set(x, "IndexDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexDocumentUndefined: Self = StObject.set(x, "IndexDocument", js.undefined)
      
      @scala.inline
      def setRedirectAllRequestsTo(value: RedirectAllRequestsTo): Self = StObject.set(x, "RedirectAllRequestsTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "RedirectAllRequestsTo", js.undefined)
      
      @scala.inline
      def setRoutingRules(value: js.Array[RoutingRule] | js.Iterable[RoutingRule]): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingRulesIterable(value: js.Iterable[RoutingRule]): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
      
      @scala.inline
      def setRoutingRulesVarargs(value: RoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value :_*))
    }
  }
}
