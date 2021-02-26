package typingsSlinky.amazonProductApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amazon-product-api", "createClient")
  @js.native
  def createClient(credentials: ICredentials): IAmazonProductClient = js.native
  
  @js.native
  trait IAmazonProductClient extends StObject {
    
    def browseNodeLookup(query: IBrowseNodeLookupOptions): js.Promise[js.Array[js.Object]] = js.native
    def browseNodeLookup(query: IBrowseNodeLookupOptions, callback: IAmazonProductQueryCallback): js.Promise[js.Array[js.Object]] = js.native
    
    def itemLookup(query: IItemLookupOptions): js.Promise[js.Array[js.Object]] = js.native
    def itemLookup(query: IItemLookupOptions, callback: IAmazonProductQueryCallback): js.Promise[js.Array[js.Object]] = js.native
    
    def itemSearch(query: IItemSearchOptions): js.Promise[js.Array[js.Object]] = js.native
    def itemSearch(query: IItemSearchOptions, callback: IAmazonProductQueryCallback): js.Promise[js.Array[js.Object]] = js.native
  }
  
  type IAmazonProductQueryCallback = js.Function2[/* err */ String, /* results */ js.Array[js.Object], Unit]
  
  @js.native
  trait IBrowseNodeLookupOptions extends StObject {
    
    var browseNodeId: js.UndefOr[String] = js.native
    
    var responseGroup: js.UndefOr[String] = js.native
  }
  object IBrowseNodeLookupOptions {
    
    @scala.inline
    def apply(): IBrowseNodeLookupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBrowseNodeLookupOptions]
    }
    
    @scala.inline
    implicit class IBrowseNodeLookupOptionsMutableBuilder[Self <: IBrowseNodeLookupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowseNodeId(value: String): Self = StObject.set(x, "browseNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowseNodeIdUndefined: Self = StObject.set(x, "browseNodeId", js.undefined)
      
      @scala.inline
      def setResponseGroup(value: String): Self = StObject.set(x, "responseGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseGroupUndefined: Self = StObject.set(x, "responseGroup", js.undefined)
    }
  }
  
  @js.native
  trait ICredentials extends StObject {
    
    var awsId: String = js.native
    
    var awsSecret: String = js.native
    
    var awsTag: String = js.native
  }
  object ICredentials {
    
    @scala.inline
    def apply(awsId: String, awsSecret: String, awsTag: String): ICredentials = {
      val __obj = js.Dynamic.literal(awsId = awsId.asInstanceOf[js.Any], awsSecret = awsSecret.asInstanceOf[js.Any], awsTag = awsTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICredentials]
    }
    
    @scala.inline
    implicit class ICredentialsMutableBuilder[Self <: ICredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsId(value: String): Self = StObject.set(x, "awsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsSecret(value: String): Self = StObject.set(x, "awsSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsTag(value: String): Self = StObject.set(x, "awsTag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IItemLookupOptions extends StObject {
    
    var condition: js.UndefOr[String] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var idType: js.UndefOr[String] = js.native
    
    var includeReviewsSummary: js.UndefOr[Boolean] = js.native
    
    var itemId: js.UndefOr[String | js.Array[String]] = js.native
    
    var request: js.UndefOr[js.Function] = js.native
    
    var responseGroup: js.UndefOr[String] = js.native
    
    var searchIndex: js.UndefOr[String] = js.native
    
    var truncateReviewsAt: js.UndefOr[Double] = js.native
    
    var variationPage: js.UndefOr[String] = js.native
  }
  object IItemLookupOptions {
    
    @scala.inline
    def apply(): IItemLookupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItemLookupOptions]
    }
    
    @scala.inline
    implicit class IItemLookupOptionsMutableBuilder[Self <: IItemLookupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setIdType(value: String): Self = StObject.set(x, "idType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdTypeUndefined: Self = StObject.set(x, "idType", js.undefined)
      
      @scala.inline
      def setIncludeReviewsSummary(value: Boolean): Self = StObject.set(x, "includeReviewsSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeReviewsSummaryUndefined: Self = StObject.set(x, "includeReviewsSummary", js.undefined)
      
      @scala.inline
      def setItemId(value: String | js.Array[String]): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setItemIdVarargs(value: String*): Self = StObject.set(x, "itemId", js.Array(value :_*))
      
      @scala.inline
      def setRequest(value: js.Function): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setResponseGroup(value: String): Self = StObject.set(x, "responseGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseGroupUndefined: Self = StObject.set(x, "responseGroup", js.undefined)
      
      @scala.inline
      def setSearchIndex(value: String): Self = StObject.set(x, "searchIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchIndexUndefined: Self = StObject.set(x, "searchIndex", js.undefined)
      
      @scala.inline
      def setTruncateReviewsAt(value: Double): Self = StObject.set(x, "truncateReviewsAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateReviewsAtUndefined: Self = StObject.set(x, "truncateReviewsAt", js.undefined)
      
      @scala.inline
      def setVariationPage(value: String): Self = StObject.set(x, "variationPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariationPageUndefined: Self = StObject.set(x, "variationPage", js.undefined)
    }
  }
  
  @js.native
  trait IItemSearchOptions extends StObject {
    
    var condition: js.UndefOr[String] = js.native
    
    var itemPage: js.UndefOr[Double] = js.native
    
    var keywords: js.UndefOr[String] = js.native
    
    var responseGroup: js.UndefOr[String] = js.native
    
    var searchIndex: js.UndefOr[String] = js.native
    
    var sort: js.UndefOr[String] = js.native
  }
  object IItemSearchOptions {
    
    @scala.inline
    def apply(): IItemSearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItemSearchOptions]
    }
    
    @scala.inline
    implicit class IItemSearchOptionsMutableBuilder[Self <: IItemSearchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setItemPage(value: Double): Self = StObject.set(x, "itemPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPageUndefined: Self = StObject.set(x, "itemPage", js.undefined)
      
      @scala.inline
      def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setResponseGroup(value: String): Self = StObject.set(x, "responseGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseGroupUndefined: Self = StObject.set(x, "responseGroup", js.undefined)
      
      @scala.inline
      def setSearchIndex(value: String): Self = StObject.set(x, "searchIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchIndexUndefined: Self = StObject.set(x, "searchIndex", js.undefined)
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
