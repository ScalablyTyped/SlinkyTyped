package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDevEndpointRequest extends StObject {
  
  /**
    * A map of arguments used to configure the DevEndpoint.
    */
  var Arguments: js.UndefOr[MapValue] = js.native
  
  /**
    * The name to be assigned to the new DevEndpoint.
    */
  var EndpointName: GenericString = js.native
  
  /**
    * The path to one or more Java .jar files in an S3 bucket that should be loaded in your DevEndpoint.
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.native
  
  /**
    * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma.  You can only use pure Python libraries with a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not yet supported. 
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.native
  
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for running your ETL scripts on development endpoints.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Development endpoints that are created without specifying a Glue version default to Glue 0.9. You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  
  /**
    * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.native
  
  /**
    * The number of workers of a defined workerType that are allocated to the development endpoint. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward compatibility because the recommended attribute to use is public keys.
    */
  var PublicKey: js.UndefOr[GenericString] = js.native
  
  /**
    * A list of public keys to be used by the development endpoints for authentication. The use of this attribute is preferred over a single public key because the public keys allow you to have a different private key per client.  If you previously created an endpoint with a public key, you must remove that key to be able to set a list of public keys. Call the UpdateDevEndpoint API with the public key content in the deletePublicKeys attribute, and the list of new keys in the addPublicKeys attribute. 
    */
  var PublicKeys: js.UndefOr[PublicKeysList] = js.native
  
  /**
    * The IAM role for the DevEndpoint.
    */
  var RoleArn: typingsSlinky.awsSdk.glueMod.RoleArn = js.native
  
  /**
    * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  
  /**
    * Security group IDs for the security groups to be used by the new DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.native
  
  /**
    * The subnet ID for the new DevEndpoint to use.
    */
  var SubnetId: js.UndefOr[GenericString] = js.native
  
  /**
    * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
  
  /**
    * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.2X worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   Known issue: when a development endpoint is created with the G.2X WorkerType configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB disk. 
    */
  var WorkerType: js.UndefOr[typingsSlinky.awsSdk.glueMod.WorkerType] = js.native
}
object CreateDevEndpointRequest {
  
  @scala.inline
  def apply(EndpointName: GenericString, RoleArn: RoleArn): CreateDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDevEndpointRequest]
  }
  
  @scala.inline
  implicit class CreateDevEndpointRequestMutableBuilder[Self <: CreateDevEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: MapValue): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "Arguments", js.undefined)
    
    @scala.inline
    def setEndpointName(value: GenericString): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraJarsS3Path(value: GenericString): Self = StObject.set(x, "ExtraJarsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraJarsS3PathUndefined: Self = StObject.set(x, "ExtraJarsS3Path", js.undefined)
    
    @scala.inline
    def setExtraPythonLibsS3Path(value: GenericString): Self = StObject.set(x, "ExtraPythonLibsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraPythonLibsS3PathUndefined: Self = StObject.set(x, "ExtraPythonLibsS3Path", js.undefined)
    
    @scala.inline
    def setGlueVersion(value: GlueVersionString): Self = StObject.set(x, "GlueVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueVersionUndefined: Self = StObject.set(x, "GlueVersion", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: IntegerValue): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    @scala.inline
    def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    @scala.inline
    def setPublicKey(value: GenericString): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
    
    @scala.inline
    def setPublicKeys(value: PublicKeysList): Self = StObject.set(x, "PublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeysUndefined: Self = StObject.set(x, "PublicKeys", js.undefined)
    
    @scala.inline
    def setPublicKeysVarargs(value: GenericString*): Self = StObject.set(x, "PublicKeys", js.Array(value :_*))
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfiguration(value: NameString): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: GenericString*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: GenericString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setWorkerType(value: WorkerType): Self = StObject.set(x, "WorkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerTypeUndefined: Self = StObject.set(x, "WorkerType", js.undefined)
  }
}
