package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevEndpoint extends js.Object {
  /**
    * A map of arguments used to configure the DevEndpoint. Valid arguments are:    "--enable-glue-datacatalog": ""     "GLUE_PYTHON_VERSION": "3"     "GLUE_PYTHON_VERSION": "2"    You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var Arguments: js.UndefOr[MapValue] = js.native
  /**
    * The AWS Availability Zone where this DevEndpoint is located.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.native
  /**
    * The point in time at which this DevEndpoint was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The name of the DevEndpoint.
    */
  var EndpointName: js.UndefOr[GenericString] = js.native
  /**
    * The path to one or more Java .jar files in an S3 bucket that should be loaded in your DevEndpoint.  You can only use pure Java/Scala libraries with a DevEndpoint. 
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma.  You can only use pure Python libraries with a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not currently supported. 
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * The reason for a current failure in this DevEndpoint.
    */
  var FailureReason: js.UndefOr[GenericString] = js.native
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for running your ETL scripts on development endpoints.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Development endpoints that are created without specifying a Glue version default to Glue 0.9. You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The point in time at which this DevEndpoint was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The status of the last update.
    */
  var LastUpdateStatus: js.UndefOr[GenericString] = js.native
  /**
    * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.native
  /**
    * The number of workers of a defined workerType that are allocated to the development endpoint. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * A private IP address to access the DevEndpoint within a VPC if the DevEndpoint is created within one. The PrivateAddress field is present only when you create the DevEndpoint within your VPC.
    */
  var PrivateAddress: js.UndefOr[GenericString] = js.native
  /**
    * The public IP address used by this DevEndpoint. The PublicAddress field is present only when you create a non-virtual private cloud (VPC) DevEndpoint.
    */
  var PublicAddress: js.UndefOr[GenericString] = js.native
  /**
    * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward compatibility because the recommended attribute to use is public keys.
    */
  var PublicKey: js.UndefOr[GenericString] = js.native
  /**
    * A list of public keys to be used by the DevEndpoints for authentication. Using this attribute is preferred over a single public key because the public keys allow you to have a different private key per client.  If you previously created an endpoint with a public key, you must remove that key to be able to set a list of public keys. Call the UpdateDevEndpoint API operation with the public key content in the deletePublicKeys attribute, and the list of new keys in the addPublicKeys attribute. 
    */
  var PublicKeys: js.UndefOr[PublicKeysList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used in this DevEndpoint.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.glueMod.RoleArn] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * A list of security group identifiers used in this DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * The current status of this DevEndpoint.
    */
  var Status: js.UndefOr[GenericString] = js.native
  /**
    * The subnet ID for this DevEndpoint.
    */
  var SubnetId: js.UndefOr[GenericString] = js.native
  /**
    * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
    */
  var VpcId: js.UndefOr[GenericString] = js.native
  /**
    * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.2X worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   Known issue: when a development endpoint is created with the G.2X WorkerType configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB disk. 
    */
  var WorkerType: js.UndefOr[typingsSlinky.awsSdk.glueMod.WorkerType] = js.native
  /**
    * The YARN endpoint address used by this DevEndpoint.
    */
  var YarnEndpointAddress: js.UndefOr[GenericString] = js.native
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.native
}

object DevEndpoint {
  @scala.inline
  def apply(): DevEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevEndpoint]
  }
  @scala.inline
  implicit class DevEndpointOps[Self <: DevEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: MapValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointName(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraJarsS3Path(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraJarsS3Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraJarsS3Path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraJarsS3Path")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraPythonLibsS3Path(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraPythonLibsS3Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraPythonLibsS3Path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraPythonLibsS3Path")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withGlueVersion(value: GlueVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlueVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlueVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlueVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateStatus(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfNodes(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfWorkers(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateAddress(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicAddress(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKey(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeys(value: PublicKeysList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityConfiguration(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerType(value: WorkerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerType")(js.undefined)
        ret
    }
    @scala.inline
    def withYarnEndpointAddress(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YarnEndpointAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYarnEndpointAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YarnEndpointAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withZeppelinRemoteSparkInterpreterPort(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZeppelinRemoteSparkInterpreterPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeppelinRemoteSparkInterpreterPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZeppelinRemoteSparkInterpreterPort")(js.undefined)
        ret
    }
  }
  
}

