package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDevEndpointResponse extends js.Object {
  /**
    * The map of arguments used to configure this DevEndpoint. Valid arguments are:    "--enable-glue-datacatalog": ""     "GLUE_PYTHON_VERSION": "3"     "GLUE_PYTHON_VERSION": "2"    You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
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
    * The name assigned to the new DevEndpoint.
    */
  var EndpointName: js.UndefOr[GenericString] = js.native
  /**
    * Path to one or more Java .jar files in an S3 bucket that will be loaded in your DevEndpoint.
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * The paths to one or more Python libraries in an S3 bucket that will be loaded in your DevEndpoint.
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * The reason for a current failure in this DevEndpoint.
    */
  var FailureReason: js.UndefOr[GenericString] = js.native
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for running your ETL scripts on development endpoints. 
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.native
  /**
    * The number of workers of a defined workerType that are allocated to the development endpoint.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role assigned to the new DevEndpoint.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.glueMod.RoleArn] = js.native
  /**
    * The name of the SecurityConfiguration structure being used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * The security groups assigned to the new DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * The current status of the new DevEndpoint.
    */
  var Status: js.UndefOr[GenericString] = js.native
  /**
    * The subnet ID assigned to the new DevEndpoint.
    */
  var SubnetId: js.UndefOr[GenericString] = js.native
  /**
    * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
    */
  var VpcId: js.UndefOr[GenericString] = js.native
  /**
    * The type of predefined worker that is allocated to the development endpoint. May be a value of Standard, G.1X, or G.2X.
    */
  var WorkerType: js.UndefOr[typingsSlinky.awsSdk.glueMod.WorkerType] = js.native
  /**
    * The address of the YARN endpoint used by this DevEndpoint.
    */
  var YarnEndpointAddress: js.UndefOr[GenericString] = js.native
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.native
}

object CreateDevEndpointResponse {
  @scala.inline
  def apply(): CreateDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDevEndpointResponse]
  }
  @scala.inline
  implicit class CreateDevEndpointResponseOps[Self <: CreateDevEndpointResponse] (val x: Self) extends AnyVal {
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

