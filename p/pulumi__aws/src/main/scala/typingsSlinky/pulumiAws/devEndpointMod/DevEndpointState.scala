package typingsSlinky.pulumiAws.devEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevEndpointState extends js.Object {
  
  /**
    * A map of arguments used to configure the endpoint.
    */
  val arguments: js.UndefOr[Input[StringDictionary[_]]] = js.native
  
  /**
    * The ARN of the endpoint.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS availability zone where this endpoint is located.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
    */
  val extraJarsS3Path: js.UndefOr[Input[String]] = js.native
  
  /**
    * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
    */
  val extraPythonLibsS3Path: js.UndefOr[Input[String]] = js.native
  
  /**
    * The reason for a current failure in this endpoint.
    */
  val failureReason: js.UndefOr[Input[String]] = js.native
  
  /**
    * -  Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
    */
  val glueVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of this endpoint. It must be unique in your account.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `workerType`.
    */
  val numberOfNodes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
    */
  val numberOfWorkers: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A private IP address to access the endpoint within a VPC, if this endpoint is created within one.
    */
  val privateAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * The public IP address used by this endpoint. The PublicAddress field is present only when you create a non-VPC endpoint.
    */
  val publicAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * The public key to be used by this endpoint for authentication.
    */
  val publicKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of public keys to be used by this endpoint for authentication.
    */
  val publicKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The IAM role for this endpoint.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the Security Configuration structure to be used with this endpoint.
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.native
  
  /**
    * Security group IDs for the security groups to be used by this endpoint.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The current status of this endpoint.
    */
  val status: js.UndefOr[Input[String]] = js.native
  
  /**
    * The subnet ID for the new endpoint to use.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * he ID of the VPC used by this endpoint.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
    */
  val workerType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The YARN endpoint address used by this endpoint.
    */
  val yarnEndpointAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  val zeppelinRemoteSparkInterpreterPort: js.UndefOr[Input[Double]] = js.native
}
object DevEndpointState {
  
  @scala.inline
  def apply(): DevEndpointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevEndpointState]
  }
  
  @scala.inline
  implicit class DevEndpointStateOps[Self <: DevEndpointState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArguments(value: Input[StringDictionary[_]]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setExtraJarsS3Path(value: Input[String]): Self = this.set("extraJarsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraJarsS3Path: Self = this.set("extraJarsS3Path", js.undefined)
    
    @scala.inline
    def setExtraPythonLibsS3Path(value: Input[String]): Self = this.set("extraPythonLibsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraPythonLibsS3Path: Self = this.set("extraPythonLibsS3Path", js.undefined)
    
    @scala.inline
    def setFailureReason(value: Input[String]): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setGlueVersion(value: Input[String]): Self = this.set("glueVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlueVersion: Self = this.set("glueVersion", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: Input[Double]): Self = this.set("numberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("numberOfNodes", js.undefined)
    
    @scala.inline
    def setNumberOfWorkers(value: Input[Double]): Self = this.set("numberOfWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfWorkers: Self = this.set("numberOfWorkers", js.undefined)
    
    @scala.inline
    def setPrivateAddress(value: Input[String]): Self = this.set("privateAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateAddress: Self = this.set("privateAddress", js.undefined)
    
    @scala.inline
    def setPublicAddress(value: Input[String]): Self = this.set("publicAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicAddress: Self = this.set("publicAddress", js.undefined)
    
    @scala.inline
    def setPublicKey(value: Input[String]): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    
    @scala.inline
    def setPublicKeysVarargs(value: Input[String]*): Self = this.set("publicKeys", js.Array(value :_*))
    
    @scala.inline
    def setPublicKeys(value: Input[js.Array[Input[String]]]): Self = this.set("publicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeys: Self = this.set("publicKeys", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setSecurityConfiguration(value: Input[String]): Self = this.set("securityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("securityConfiguration", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
    
    @scala.inline
    def setWorkerType(value: Input[String]): Self = this.set("workerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerType: Self = this.set("workerType", js.undefined)
    
    @scala.inline
    def setYarnEndpointAddress(value: Input[String]): Self = this.set("yarnEndpointAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYarnEndpointAddress: Self = this.set("yarnEndpointAddress", js.undefined)
    
    @scala.inline
    def setZeppelinRemoteSparkInterpreterPort(value: Input[Double]): Self = this.set("zeppelinRemoteSparkInterpreterPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeppelinRemoteSparkInterpreterPort: Self = this.set("zeppelinRemoteSparkInterpreterPort", js.undefined)
  }
}
