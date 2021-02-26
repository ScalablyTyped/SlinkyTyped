package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.AccountId
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.ColumnType
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.ConversionPathValue
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait McfData extends StObject {
  
  /** Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. */
  var columnHeaders: js.UndefOr[js.Array[ColumnType]] = js.native
  
  /** Determines if the Analytics data contains sampled data. */
  var containsSampledData: js.UndefOr[Boolean] = js.native
  
  /** Unique ID for this data response. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of rows the response can contain, regardless of the actual number of rows returned. Its value ranges from 1 to 10,000 with a value of 1000 by default, or
    * otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** Link to next page for this Analytics data query. */
  var nextLink: js.UndefOr[String] = js.native
  
  /** Link to previous page for this Analytics data query. */
  var previousLink: js.UndefOr[String] = js.native
  
  /** Information for the view (profile), for which the Analytics data was requested. */
  var profileInfo: js.UndefOr[AccountId] = js.native
  
  /** Analytics data request query parameters. */
  var query: js.UndefOr[Dimensions] = js.native
  
  /** Analytics data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as specified in the request. */
  var rows: js.UndefOr[js.Array[js.Array[ConversionPathValue]]] = js.native
  
  /** The number of samples used to calculate the result. */
  var sampleSize: js.UndefOr[String] = js.native
  
  /** Total size of the sample space from which the samples were selected. */
  var sampleSpace: js.UndefOr[String] = js.native
  
  /** Link to this page. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** The total number of rows for the query, regardless of the number of rows in the response. */
  var totalResults: js.UndefOr[Double] = js.native
  
  /**
    * Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as the metric order specified in
    * the request.
    */
  var totalsForAllResults: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.McfData with TopLevel[js.Any]
  ] = js.native
}
object McfData {
  
  @scala.inline
  def apply(): McfData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[McfData]
  }
  
  @scala.inline
  implicit class McfDataMutableBuilder[Self <: McfData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnHeaders(value: js.Array[ColumnType]): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
    
    @scala.inline
    def setColumnHeadersVarargs(value: ColumnType*): Self = StObject.set(x, "columnHeaders", js.Array(value :_*))
    
    @scala.inline
    def setContainsSampledData(value: Boolean): Self = StObject.set(x, "containsSampledData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsSampledDataUndefined: Self = StObject.set(x, "containsSampledData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    
    @scala.inline
    def setPreviousLink(value: String): Self = StObject.set(x, "previousLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousLinkUndefined: Self = StObject.set(x, "previousLink", js.undefined)
    
    @scala.inline
    def setProfileInfo(value: AccountId): Self = StObject.set(x, "profileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileInfoUndefined: Self = StObject.set(x, "profileInfo", js.undefined)
    
    @scala.inline
    def setQuery(value: Dimensions): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[js.Array[ConversionPathValue]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[ConversionPathValue]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSampleSize(value: String): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    @scala.inline
    def setSampleSpace(value: String): Self = StObject.set(x, "sampleSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSpaceUndefined: Self = StObject.set(x, "sampleSpace", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
    
    @scala.inline
    def setTotalsForAllResults(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.McfData with TopLevel[js.Any]
    ): Self = StObject.set(x, "totalsForAllResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsForAllResultsUndefined: Self = StObject.set(x, "totalsForAllResults", js.undefined)
  }
}
