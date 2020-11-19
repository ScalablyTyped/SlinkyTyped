package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("documentdb", "UriFactory")
@js.native
object UriFactory extends js.Object {
  
  /**
    * @summary Given a database, collection and conflict id, this creates a conflict link.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param documentId        -The document Id\
    * @param attachmentId      -The attachment Id
    * @returns                 -A conflict link in the format of dbs/{0}/colls/{1}/conflicts/{2} with {0} being a Uri escaped version of the databaseId,
    *                                    {1} being collectionId and {2} being the conflictId
    * @description Would be used when creating a Conflict in Azure DocumentDB database service.
    */
  def createAttachmentUri(databaseId: String, collectionId: String, documentId: String, attachmentId: String): String = js.native
  
  /**
    * @summary
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param conflictId        -The conflict Id
    * @returns                 -A conflict link in the format of dbs/{0}/colls/{1}/conflicts/{2}
    *                                    with {0} being a Uri escaped version of the databaseId, {1} being collectionId and {2} being the conflictId
    * @description Would be used when creating a Conflict in Azure DocumentDB database service.
    */
  def createConflictUri(databaseId: String, collectionId: String, conflictId: String): String = js.native
  
  /**
    * Given a database id, this creates a database link.
    * @param databaseId -The database id
    * @returns          -A database link in the format of dbs/{0} with {0} being a Uri escaped version of the databaseId
    * @description Would be used when creating or deleting a DocumentCollection or a User in Azure DocumentDB database service
    */
  def createDatabaseUri(databaseId: String): String = js.native
  
  /**
    * Given a database and collection id, this creates a collection link.
    * @param databaseId        -The database id
    * @param collectionId      -The collection id
    * @returns                 A collection link in the format of dbs/{0}/colls/{1} with {0} being a Uri escaped version of the databaseId and {1} being collectionId
    * @description Would be used when updating or deleting a DocumentCollection, creating a Document, a StoredProcedure, a
    *              Trigger, a UserDefinedFunction, or when executing a query with CreateDocumentQuery in Azure DocumentDB database service.
    */
  def createDocumentCollectionUri(databaseId: String, collectionId: String): String = js.native
  
  /**
    * Given a database and collection id, this creates a collection link.
    * @param databaseId        -The database id
    * @param collectionId      -The collection id
    * @param documentId        -The document id
    * @returns                 -A document link in the format of dbs/{0}/colls/{1}/docs/{2} with {0}
    *                                    being a Uri escaped version of the databaseId, {1} being collectionId and {2} being the documentId
    * @description Would be used when creating an Attachment, or when replacing or deleting a Document in Azure DocumentDB database service
    */
  def createDocumentUri(databaseId: String, collectionId: String, documentId: String): String = js.native
  
  /**
    * @summary Given a database and collection, this creates a partition key ranges link in the Azure DocumentDB database service.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @returns                 -A partition key ranges link in the format of dbs/{0}/colls/{1}/pkranges with {0} being a Uri escaped version of the databaseId and {1} being collectionId
    */
  def createPartitionKeyRangesUri(databaseId: String, collectionId: String): String = js.native
  
  /**
    * Given a database, collection and document id, this creates a document link.
    * @param databaseId    -The database Id
    * @param userId        -The user Id
    * @param permissionId  - The permissionId
    * @returns A permission link in the format of dbs/{0}/users/{1}/permissions/{2} with {0} being a Uri escaped version of the databaseId, {1} being userId and {2} being permissionId
    * @description Would be used when replacing or deleting a Permission in Azure DocumentDB database service.
    */
  def createPermissionUri(databaseId: String, userId: String, permissionId: String): String = js.native
  
  /**
    * Given a database, collection and stored proc id, this creates a stored proc link.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param storedProcedureId -The stored procedure Id
    * @returns                 -A stored procedure link in the format of dbs/{0}/colls/{1}/sprocs/{2}
    *                                    with {0} being a Uri escaped version of the databaseId,
    *                                    {1} being collectionId and {2} being the storedProcedureId
    * @description Would be used when replacing, executing, or deleting a StoredProcedure in Azure DocumentDB database service.
    */
  def createStoredProcedureUri(databaseId: String, collectionId: String, storedProcedureId: String): String = js.native
  
  /**
    * @summary Given a database, collection and trigger id, this creates a trigger link.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param triggerId         -The trigger Id
    * @returns                 -A trigger link in the format of dbs/{0}/colls/{1}/triggers/{2}
    *                                    with {0} being a Uri escaped version of the databaseId,
    *                                    {1} being collectionId and {2} being the triggerId
    * @description Would be used when replacing, executing, or deleting a Trigger in Azure DocumentDB database service
    */
  def createTriggerUri(databaseId: String, collectionId: String, triggerId: String): String = js.native
  
  /**
    * @summary Given a database, collection and udf id, this creates a udf link.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param udfId             -The User Defined Function Id
    * @returns                 -A udf link in the format of dbs/{0}/colls/{1}/udfs/{2} with {0} being a Uri escaped version of the databaseId, {1} being collectionId and {2} being the udfId
    * @description Would be used when replacing, executing, or deleting a UserDefinedFunction in Azure DocumentDB database service
    */
  def createUserDefinedFunctionUri(databaseId: String, collectionId: String, udfId: String): String = js.native
}
