package typingsSlinky.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.powerappsComponentFramework.ComponentFramework.WebApi.Entity
import typingsSlinky.powerappsComponentFramework.ComponentFramework.WebApi.RetrieveMultipleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for context.webApi
  */
@js.native
trait WebApi extends StObject {
  
  /**
    * Creates an entity record.
    * @param entityType logical name of the entity type record to create
    * @param data dictionary with attribute schema name and value
    * @returns The deferred object for the result of the operation. The created record object will be resolved if successful.
    */
  def createRecord(entityType: String, data: Entity): js.Promise[EntityReference] = js.native
  
  /**
    * Deletes an entity record.
    * @param id GUID of the entity record you want to delete.
    * @param entityType logical name of the entity type record to delete
    * @returns The deferred object for the result of the operation. The deleted record object will be resolved if successful.
    */
  def deleteRecord(entityType: String, id: String): js.Promise[EntityReference] = js.native
  
  /**
    * Retrieves a collection of entity records.
    * @param entityType logical name of the entity type record to retrieve
    * @param options OData system query options or FetchXML query to retrieve your data.
    * For support options, please refer to https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/retrievemultiplerecords
    * @param maxPageSize Max number of records to be retrieved per page
    * @returns The deferred object for the result of the operation. An object with interface RetrieveMultipleResponse will be resolved if successful.
    */
  def retrieveMultipleRecords(entityType: String): js.Promise[RetrieveMultipleResponse] = js.native
  def retrieveMultipleRecords(entityType: String, options: js.UndefOr[scala.Nothing], maxPageSize: Double): js.Promise[RetrieveMultipleResponse] = js.native
  def retrieveMultipleRecords(entityType: String, options: String): js.Promise[RetrieveMultipleResponse] = js.native
  def retrieveMultipleRecords(entityType: String, options: String, maxPageSize: Double): js.Promise[RetrieveMultipleResponse] = js.native
  
  /**
    * Retrieves an entity record.
    * @param id GUID of the entity record you want to retrieve.
    * @param entityType logical name of the entity type record to retrieve
    * @param options OData system query options, $select and $expand, to retrieve your data.
    * For support options, please refer to https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/retrieverecord
    * @returns The deferred object for the result of the operation. A JSON object with the retrieved properties and values will be resolved if successful.
    */
  def retrieveRecord(entityType: String, id: String): js.Promise[Entity] = js.native
  def retrieveRecord(entityType: String, id: String, options: String): js.Promise[Entity] = js.native
  
  /**
    * Updates an entity record.
    * @param id GUID of the entity record you want to update.
    * @param data dictionary containing to-change attributes with schema name and value
    * @param entityType logical name of the entity type record to update
    * @returns The deferred object for the result of the operation. The updated record object will be resolved if successful.
    */
  def updateRecord(entityType: String, id: String, data: Entity): js.Promise[EntityReference] = js.native
}
/**
  * Objects related to interacting with the Web API.
  */
object WebApi {
  
  /**
    * Interface that describes an entity sent or received from the SDK through the Web API.
    */
  type Entity = StringDictionary[js.Any]
  
  @js.native
  trait RetrieveMultipleResponse extends StObject {
    
    /**
      * An array of JSON objects, where each object represents the retrieved entity record containing attributes and their values
      */
    var entities: js.Array[Entity] = js.native
    
    /**
      * If the number of records being retrieved is more than the value specified in the 'maxPageSize' parameter in the request, this attribute returns the URL to return next set of records.
      */
    var nextLink: String = js.native
  }
  object RetrieveMultipleResponse {
    
    @scala.inline
    def apply(entities: js.Array[Entity], nextLink: String): RetrieveMultipleResponse = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetrieveMultipleResponse]
    }
    
    @scala.inline
    implicit class RetrieveMultipleResponseMutableBuilder[Self <: RetrieveMultipleResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
      
      @scala.inline
      def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    }
  }
}
