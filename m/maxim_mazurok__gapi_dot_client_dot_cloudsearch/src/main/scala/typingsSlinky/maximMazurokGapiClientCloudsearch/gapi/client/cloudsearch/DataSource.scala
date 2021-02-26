package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends StObject {
  
  /**
    * If true, sets the datasource to read-only mode. In read-only mode, the Indexing API rejects any requests to index or delete items in this source. Enabling read-only mode does not
    * stop the processing of previously accepted data.
    */
  var disableModifications: js.UndefOr[Boolean] = js.native
  
  /** Disable serving any search or assist results. */
  var disableServing: js.UndefOr[Boolean] = js.native
  
  /** Required. Display name of the datasource The maximum length is 300 characters. */
  var displayName: js.UndefOr[String] = js.native
  
  /** List of service accounts that have indexing access. */
  var indexingServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This field restricts visibility to items at the datasource level. Items within the datasource are restricted to the union of users and groups included in this field. Note that, this
    * does not ensure access to a specific item, as users need to have ACL permissions on the contained items. This ensures a high level access on the entire datasource, and that the
    * individual items are not shared outside this visibility.
    */
  var itemsVisibility: js.UndefOr[js.Array[GSuitePrincipal]] = js.native
  
  /** Name of the datasource resource. Format: datasources/{source_id}. The name is ignored when creating a datasource. */
  var name: js.UndefOr[String] = js.native
  
  /** IDs of the Long Running Operations (LROs) currently running for this schema. */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A short name or alias for the source. This value will be used to match the 'source' operator. For example, if the short name is *<value>* then queries like *source:<value>* will
    * only return results for this source. The value must be unique across all datasources. The value must only contain alphanumeric characters (a-zA-Z0-9). The value cannot start with
    * 'google' and cannot be one of the following: mail, gmail, docs, drive, groups, sites, calendar, hangouts, gplus, keep, people, teams. Its maximum length is 32 characters.
    */
  var shortName: js.UndefOr[String] = js.native
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableModifications(value: Boolean): Self = StObject.set(x, "disableModifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableModificationsUndefined: Self = StObject.set(x, "disableModifications", js.undefined)
    
    @scala.inline
    def setDisableServing(value: Boolean): Self = StObject.set(x, "disableServing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableServingUndefined: Self = StObject.set(x, "disableServing", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIndexingServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "indexingServiceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexingServiceAccountsUndefined: Self = StObject.set(x, "indexingServiceAccounts", js.undefined)
    
    @scala.inline
    def setIndexingServiceAccountsVarargs(value: String*): Self = StObject.set(x, "indexingServiceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setItemsVisibility(value: js.Array[GSuitePrincipal]): Self = StObject.set(x, "itemsVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVisibilityUndefined: Self = StObject.set(x, "itemsVisibility", js.undefined)
    
    @scala.inline
    def setItemsVisibilityVarargs(value: GSuitePrincipal*): Self = StObject.set(x, "itemsVisibility", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperationIds(value: js.Array[String]): Self = StObject.set(x, "operationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdsUndefined: Self = StObject.set(x, "operationIds", js.undefined)
    
    @scala.inline
    def setOperationIdsVarargs(value: String*): Self = StObject.set(x, "operationIds", js.Array(value :_*))
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
  }
}
