package typingsSlinky.awsSdk.simpledbMod

import typingsSlinky.awsSdk.configMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleDB extends Service {
  
  /**
    *  Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies. This enables Amazon SimpleDB to optimize requests, which generally yields better throughput.    If you specify BatchDeleteAttributes without attributes or values, all the attributes for the item are deleted.   BatchDeleteAttributes is an idempotent operation; running it multiple times on the same item or attribute doesn't result in an error.   The BatchDeleteAttributes operation succeeds or fails in its entirety. There are no partial deletes. You can execute multiple BatchDeleteAttributes operations and other operations in parallel. However, large numbers of concurrent BatchDeleteAttributes calls can result in Service Unavailable (503) responses.   This operation is vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method.   This operation does not support conditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists.    The following limitations are enforced for this operation:  1 MB request size 25 item limit per BatchDeleteAttributes operation  
    */
  def batchDeleteAttributes(): Request[js.Object, AWSError] = js.native
  def batchDeleteAttributes(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies. This enables Amazon SimpleDB to optimize requests, which generally yields better throughput.    If you specify BatchDeleteAttributes without attributes or values, all the attributes for the item are deleted.   BatchDeleteAttributes is an idempotent operation; running it multiple times on the same item or attribute doesn't result in an error.   The BatchDeleteAttributes operation succeeds or fails in its entirety. There are no partial deletes. You can execute multiple BatchDeleteAttributes operations and other operations in parallel. However, large numbers of concurrent BatchDeleteAttributes calls can result in Service Unavailable (503) responses.   This operation is vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method.   This operation does not support conditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists.    The following limitations are enforced for this operation:  1 MB request size 25 item limit per BatchDeleteAttributes operation  
    */
  def batchDeleteAttributes(params: BatchDeleteAttributesRequest): Request[js.Object, AWSError] = js.native
  def batchDeleteAttributes(
    params: BatchDeleteAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  The BatchPutAttributes operation creates or replaces attributes within one or more items. By using this operation, the client can perform multiple PutAttribute operation with a single call. This helps yield savings in round trips and latencies, enabling Amazon SimpleDB to optimize requests and generally produce better throughput.   The client may specify the item name with the Item.X.ItemName parameter. The client may specify new attributes using a combination of the Item.X.Attribute.Y.Name and Item.X.Attribute.Y.Value parameters. The client may specify the first attribute for the first item using the parameters Item.0.Attribute.0.Name and Item.0.Attribute.0.Value, and for the second attribute for the first item by the parameters Item.0.Attribute.1.Name and Item.0.Attribute.1.Value, and so on.   Attributes are uniquely identified within an item by their name/value combination. For example, a single item can have the attributes { "first_name", "first_value" } and { "first_name", "second_value" }. However, it cannot have two attribute instances where both the Item.X.Attribute.Y.Name and Item.X.Attribute.Y.Value are the same.   Optionally, the requester can supply the Replace parameter for each individual value. Setting this value to true will cause the new attribute values to replace the existing attribute values. For example, if an item I has the attributes { 'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requester does a BatchPutAttributes of {'I', 'b', '4' } with the Replace parameter set to true, the final attributes of the item will be { 'a', '1' } and { 'b', '4' }, replacing the previous values of the 'b' attribute with the new value.   You cannot specify an empty string as an item or as an attribute name. The BatchPutAttributes operation succeeds or fails in its entirety. There are no partial puts.   This operation is vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method. This operation does not support conditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists.   You can execute multiple BatchPutAttributes operations and other operations in parallel. However, large numbers of concurrent BatchPutAttributes calls can result in Service Unavailable (503) responses.   The following limitations are enforced for this operation:  256 attribute name-value pairs per item 1 MB request size 1 billion attributes per domain 10 GB of total user data storage per domain 25 item limit per BatchPutAttributes operation  
    */
  def batchPutAttributes(): Request[js.Object, AWSError] = js.native
  def batchPutAttributes(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  The BatchPutAttributes operation creates or replaces attributes within one or more items. By using this operation, the client can perform multiple PutAttribute operation with a single call. This helps yield savings in round trips and latencies, enabling Amazon SimpleDB to optimize requests and generally produce better throughput.   The client may specify the item name with the Item.X.ItemName parameter. The client may specify new attributes using a combination of the Item.X.Attribute.Y.Name and Item.X.Attribute.Y.Value parameters. The client may specify the first attribute for the first item using the parameters Item.0.Attribute.0.Name and Item.0.Attribute.0.Value, and for the second attribute for the first item by the parameters Item.0.Attribute.1.Name and Item.0.Attribute.1.Value, and so on.   Attributes are uniquely identified within an item by their name/value combination. For example, a single item can have the attributes { "first_name", "first_value" } and { "first_name", "second_value" }. However, it cannot have two attribute instances where both the Item.X.Attribute.Y.Name and Item.X.Attribute.Y.Value are the same.   Optionally, the requester can supply the Replace parameter for each individual value. Setting this value to true will cause the new attribute values to replace the existing attribute values. For example, if an item I has the attributes { 'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requester does a BatchPutAttributes of {'I', 'b', '4' } with the Replace parameter set to true, the final attributes of the item will be { 'a', '1' } and { 'b', '4' }, replacing the previous values of the 'b' attribute with the new value.   You cannot specify an empty string as an item or as an attribute name. The BatchPutAttributes operation succeeds or fails in its entirety. There are no partial puts.   This operation is vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method. This operation does not support conditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists.   You can execute multiple BatchPutAttributes operations and other operations in parallel. However, large numbers of concurrent BatchPutAttributes calls can result in Service Unavailable (503) responses.   The following limitations are enforced for this operation:  256 attribute name-value pairs per item 1 MB request size 1 billion attributes per domain 10 GB of total user data storage per domain 25 item limit per BatchPutAttributes operation  
    */
  def batchPutAttributes(params: BatchPutAttributesRequest): Request[js.Object, AWSError] = js.native
  def batchPutAttributes(
    params: BatchPutAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_SimpleDB: ConfigBase with ClientConfiguration = js.native
  
  /**
    *  The CreateDomain operation creates a new domain. The domain name should be unique among the domains associated with the Access Key ID provided in the request. The CreateDomain operation may take 10 or more seconds to complete.   CreateDomain is an idempotent operation; running it multiple times using the same domain name will not result in an error response.   The client can create up to 100 domains per account.   If the client requires additional domains, go to  http://aws.amazon.com/contact-us/simpledb-limit-request/. 
    */
  def createDomain(): Request[js.Object, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  The CreateDomain operation creates a new domain. The domain name should be unique among the domains associated with the Access Key ID provided in the request. The CreateDomain operation may take 10 or more seconds to complete.   CreateDomain is an idempotent operation; running it multiple times using the same domain name will not result in an error response.   The client can create up to 100 domains per account.   If the client requires additional domains, go to  http://aws.amazon.com/contact-us/simpledb-limit-request/. 
    */
  def createDomain(params: CreateDomainRequest): Request[js.Object, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Deletes one or more attributes associated with an item. If all attributes of the item are deleted, the item is deleted.   If DeleteAttributes is called without being passed any attributes or values specified, all the attributes for the item are deleted.   DeleteAttributes is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response.   Because Amazon SimpleDB makes multiple copies of item data and uses an eventual consistency update model, performing a GetAttributes or Select operation (read) immediately after a DeleteAttributes or PutAttributes operation (write) might not return updated item data. 
    */
  def deleteAttributes(): Request[js.Object, AWSError] = js.native
  def deleteAttributes(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes one or more attributes associated with an item. If all attributes of the item are deleted, the item is deleted.   If DeleteAttributes is called without being passed any attributes or values specified, all the attributes for the item are deleted.   DeleteAttributes is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response.   Because Amazon SimpleDB makes multiple copies of item data and uses an eventual consistency update model, performing a GetAttributes or Select operation (read) immediately after a DeleteAttributes or PutAttributes operation (write) might not return updated item data. 
    */
  def deleteAttributes(params: DeleteAttributesRequest): Request[js.Object, AWSError] = js.native
  def deleteAttributes(
    params: DeleteAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  The DeleteDomain operation deletes a domain. Any items (and their attributes) in the domain are deleted as well. The DeleteDomain operation might take 10 or more seconds to complete.   Running DeleteDomain on a domain that does not exist or running the function multiple times using the same domain name will not result in an error response. 
    */
  def deleteDomain(): Request[js.Object, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  The DeleteDomain operation deletes a domain. Any items (and their attributes) in the domain are deleted as well. The DeleteDomain operation might take 10 or more seconds to complete.   Running DeleteDomain on a domain that does not exist or running the function multiple times using the same domain name will not result in an error response. 
    */
  def deleteDomain(params: DeleteDomainRequest): Request[js.Object, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Returns information about the domain, including when the domain was created, the number of items and attributes in the domain, and the size of the attribute names and values. 
    */
  def domainMetadata(): Request[DomainMetadataResult, AWSError] = js.native
  def domainMetadata(callback: js.Function2[/* err */ AWSError, /* data */ DomainMetadataResult, Unit]): Request[DomainMetadataResult, AWSError] = js.native
  /**
    *  Returns information about the domain, including when the domain was created, the number of items and attributes in the domain, and the size of the attribute names and values. 
    */
  def domainMetadata(params: DomainMetadataRequest): Request[DomainMetadataResult, AWSError] = js.native
  def domainMetadata(
    params: DomainMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DomainMetadataResult, Unit]
  ): Request[DomainMetadataResult, AWSError] = js.native
  
  /**
    *  Returns all of the attributes associated with the specified item. Optionally, the attributes returned can be limited to one or more attributes by specifying an attribute name parameter.   If the item does not exist on the replica that was accessed for this operation, an empty set is returned. The system does not return an error as it cannot guarantee the item does not exist on other replicas.   If GetAttributes is called without being passed any attribute names, all the attributes for the item are returned. 
    */
  def getAttributes(): Request[GetAttributesResult, AWSError] = js.native
  def getAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetAttributesResult, Unit]): Request[GetAttributesResult, AWSError] = js.native
  /**
    *  Returns all of the attributes associated with the specified item. Optionally, the attributes returned can be limited to one or more attributes by specifying an attribute name parameter.   If the item does not exist on the replica that was accessed for this operation, an empty set is returned. The system does not return an error as it cannot guarantee the item does not exist on other replicas.   If GetAttributes is called without being passed any attribute names, all the attributes for the item are returned. 
    */
  def getAttributes(params: GetAttributesRequest): Request[GetAttributesResult, AWSError] = js.native
  def getAttributes(
    params: GetAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAttributesResult, Unit]
  ): Request[GetAttributesResult, AWSError] = js.native
  
  /**
    *  The ListDomains operation lists all domains associated with the Access Key ID. It returns domain names up to the limit set by MaxNumberOfDomains. A NextToken is returned if there are more than MaxNumberOfDomains domains. Calling ListDomains successive times with the NextToken provided by the operation returns up to MaxNumberOfDomains more domain names with each successive operation call. 
    */
  def listDomains(): Request[ListDomainsResult, AWSError] = js.native
  def listDomains(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResult, Unit]): Request[ListDomainsResult, AWSError] = js.native
  /**
    *  The ListDomains operation lists all domains associated with the Access Key ID. It returns domain names up to the limit set by MaxNumberOfDomains. A NextToken is returned if there are more than MaxNumberOfDomains domains. Calling ListDomains successive times with the NextToken provided by the operation returns up to MaxNumberOfDomains more domain names with each successive operation call. 
    */
  def listDomains(params: ListDomainsRequest): Request[ListDomainsResult, AWSError] = js.native
  def listDomains(
    params: ListDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResult, Unit]
  ): Request[ListDomainsResult, AWSError] = js.native
  
  /**
    *  The PutAttributes operation creates or replaces attributes in an item. The client may specify new attributes using a combination of the Attribute.X.Name and Attribute.X.Value parameters. The client specifies the first attribute by the parameters Attribute.0.Name and Attribute.0.Value, the second attribute by the parameters Attribute.1.Name and Attribute.1.Value, and so on.   Attributes are uniquely identified in an item by their name/value combination. For example, a single item can have the attributes { "first_name", "first_value" } and { "first_name", second_value" }. However, it cannot have two attribute instances where both the Attribute.X.Name and Attribute.X.Value are the same.   Optionally, the requestor can supply the Replace parameter for each individual attribute. Setting this value to true causes the new attribute value to replace the existing attribute value(s). For example, if an item has the attributes { 'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requestor calls PutAttributes using the attributes { 'b', '4' } with the Replace parameter set to true, the final attributes of the item are changed to { 'a', '1' } and { 'b', '4' }, which replaces the previous values of the 'b' attribute with the new value.   Using PutAttributes to replace attribute values that do not exist will not result in an error response.   You cannot specify an empty string as an attribute name.   Because Amazon SimpleDB makes multiple copies of client data and uses an eventual consistency update model, an immediate GetAttributes or Select operation (read) immediately after a PutAttributes or DeleteAttributes operation (write) might not return the updated data.   The following limitations are enforced for this operation:  256 total attribute name-value pairs per item One billion attributes per domain 10 GB of total user data storage per domain  
    */
  def putAttributes(): Request[js.Object, AWSError] = js.native
  def putAttributes(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  The PutAttributes operation creates or replaces attributes in an item. The client may specify new attributes using a combination of the Attribute.X.Name and Attribute.X.Value parameters. The client specifies the first attribute by the parameters Attribute.0.Name and Attribute.0.Value, the second attribute by the parameters Attribute.1.Name and Attribute.1.Value, and so on.   Attributes are uniquely identified in an item by their name/value combination. For example, a single item can have the attributes { "first_name", "first_value" } and { "first_name", second_value" }. However, it cannot have two attribute instances where both the Attribute.X.Name and Attribute.X.Value are the same.   Optionally, the requestor can supply the Replace parameter for each individual attribute. Setting this value to true causes the new attribute value to replace the existing attribute value(s). For example, if an item has the attributes { 'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requestor calls PutAttributes using the attributes { 'b', '4' } with the Replace parameter set to true, the final attributes of the item are changed to { 'a', '1' } and { 'b', '4' }, which replaces the previous values of the 'b' attribute with the new value.   Using PutAttributes to replace attribute values that do not exist will not result in an error response.   You cannot specify an empty string as an attribute name.   Because Amazon SimpleDB makes multiple copies of client data and uses an eventual consistency update model, an immediate GetAttributes or Select operation (read) immediately after a PutAttributes or DeleteAttributes operation (write) might not return the updated data.   The following limitations are enforced for this operation:  256 total attribute name-value pairs per item One billion attributes per domain 10 GB of total user data storage per domain  
    */
  def putAttributes(params: PutAttributesRequest): Request[js.Object, AWSError] = js.native
  def putAttributes(
    params: PutAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  The Select operation returns a set of attributes for ItemNames that match the select expression. Select is similar to the standard SQL SELECT statement.   The total size of the response cannot exceed 1 MB in total size. Amazon SimpleDB automatically adjusts the number of items returned per page to enforce this limit. For example, if the client asks to retrieve 2500 items, but each individual item is 10 kB in size, the system returns 100 items and an appropriate NextToken so the client can access the next page of results.   For information on how to construct select expressions, see Using Select to Create Amazon SimpleDB Queries in the Developer Guide. 
    */
  def select(): Request[SelectResult, AWSError] = js.native
  def select(callback: js.Function2[/* err */ AWSError, /* data */ SelectResult, Unit]): Request[SelectResult, AWSError] = js.native
  /**
    *  The Select operation returns a set of attributes for ItemNames that match the select expression. Select is similar to the standard SQL SELECT statement.   The total size of the response cannot exceed 1 MB in total size. Amazon SimpleDB automatically adjusts the number of items returned per page to enforce this limit. For example, if the client asks to retrieve 2500 items, but each individual item is 10 kB in size, the system returns 100 items and an appropriate NextToken so the client can access the next page of results.   For information on how to construct select expressions, see Using Select to Create Amazon SimpleDB Queries in the Developer Guide. 
    */
  def select(params: SelectRequest): Request[SelectResult, AWSError] = js.native
  def select(params: SelectRequest, callback: js.Function2[/* err */ AWSError, /* data */ SelectResult, Unit]): Request[SelectResult, AWSError] = js.native
}
