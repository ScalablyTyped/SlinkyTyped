package typingsSlinky.algoliasearch.anon

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-search.@algolia/client-search.UpdateApiKeyOptions & std.Pick<@algolia/transporter.@algolia/transporter.RequestOptions, std.Exclude<keyof @algolia/transporter.@algolia/transporter.RequestOptions, 'queryParameters'>> */
@js.native
trait UpdateApiKeyOptionsPickRe extends StObject {
  
  var cacheable: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[Record[String, _]] = js.native
  
  /**
    * Specify a description of the API key. Used for informative purposes only. It has impact on the functionality of the API key.
    */
  val description: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * Specify the list of targeted indices. You can target all indices starting with a prefix or ending with a suffix using the ‘*’ character.
    */
  val indexes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specify the maximum number of hits this API key can retrieve in one call.
    * This parameter can be used to protect you from attempts at retrieving your entire index contents by massively querying the index.
    */
  val maxHitsPerQuery: js.UndefOr[Double] = js.native
  
  /**
    * Specify the maximum number of API calls allowed from an IP address per hour. Each time an API call is performed with this key, a check is performed.
    */
  val maxQueriesPerIPPerHour: js.UndefOr[Double] = js.native
  
  /**
    * Specify the list of query parameters. You can force the query parameters for a query using the url string format.
    */
  val queryParameters: js.UndefOr[String] = js.native
  
  /**
    * Specify the list of referers. You can target all referers starting with a prefix, ending with a suffix using the ‘*’ character.
    */
  val referers: js.UndefOr[js.Array[String]] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * A Unix timestamp used to define the expiration date of the API key.
    */
  val validity: js.UndefOr[Double] = js.native
}
object UpdateApiKeyOptionsPickRe {
  
  @scala.inline
  def apply(): UpdateApiKeyOptionsPickRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApiKeyOptionsPickRe]
  }
  
  @scala.inline
  implicit class UpdateApiKeyOptionsPickReMutableBuilder[Self <: UpdateApiKeyOptionsPickRe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    @scala.inline
    def setData(value: Record[String, _]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIndexes(value: js.Array[String]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: String*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setMaxHitsPerQuery(value: Double): Self = StObject.set(x, "maxHitsPerQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHitsPerQueryUndefined: Self = StObject.set(x, "maxHitsPerQuery", js.undefined)
    
    @scala.inline
    def setMaxQueriesPerIPPerHour(value: Double): Self = StObject.set(x, "maxQueriesPerIPPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxQueriesPerIPPerHourUndefined: Self = StObject.set(x, "maxQueriesPerIPPerHour", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: String): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    @scala.inline
    def setReferers(value: js.Array[String]): Self = StObject.set(x, "referers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferersUndefined: Self = StObject.set(x, "referers", js.undefined)
    
    @scala.inline
    def setReferersVarargs(value: String*): Self = StObject.set(x, "referers", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setValidity(value: Double): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
  }
}
