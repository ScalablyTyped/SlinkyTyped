package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDetails extends js.Object {
  /**
    * Details about a CloudFront distribution.
    */
  var AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails] = js.native
  /**
    * Details for an AWS CodeBuild project.
    */
  var AwsCodeBuildProject: js.UndefOr[AwsCodeBuildProjectDetails] = js.native
  /**
    * Details about an Amazon EC2 instance related to a finding.
    */
  var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.native
  /**
    * Details for an AWS EC2 network interface.
    */
  var AwsEc2NetworkInterface: js.UndefOr[AwsEc2NetworkInterfaceDetails] = js.native
  /**
    * Details for an EC2 security group.
    */
  var AwsEc2SecurityGroup: js.UndefOr[AwsEc2SecurityGroupDetails] = js.native
  /**
    * Details for an Elasticsearch domain.
    */
  var AwsElasticsearchDomain: js.UndefOr[AwsElasticsearchDomainDetails] = js.native
  /**
    * Details about a load balancer.
    */
  var AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails] = js.native
  /**
    * Details about an IAM access key related to a finding.
    */
  var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.native
  /**
    * Details about an IAM role.
    */
  var AwsIamRole: js.UndefOr[AwsIamRoleDetails] = js.native
  /**
    * Details about a KMS key.
    */
  var AwsKmsKey: js.UndefOr[AwsKmsKeyDetails] = js.native
  /**
    * Details about a Lambda function.
    */
  var AwsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails] = js.native
  /**
    * Details for a Lambda layer version.
    */
  var AwsLambdaLayerVersion: js.UndefOr[AwsLambdaLayerVersionDetails] = js.native
  /**
    * Details for an RDS database instance.
    */
  var AwsRdsDbInstance: js.UndefOr[AwsRdsDbInstanceDetails] = js.native
  /**
    * Details about an Amazon S3 Bucket related to a finding.
    */
  var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.native
  /**
    * Details about an Amazon S3 object related to a finding.
    */
  var AwsS3Object: js.UndefOr[AwsS3ObjectDetails] = js.native
  /**
    * Details about an SNS topic.
    */
  var AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails] = js.native
  /**
    * Details about an SQS queue.
    */
  var AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails] = js.native
  /**
    * Details for a WAF WebACL.
    */
  var AwsWafWebAcl: js.UndefOr[AwsWafWebAclDetails] = js.native
  /**
    * Details about a container resource related to a finding.
    */
  var Container: js.UndefOr[ContainerDetails] = js.native
  /**
    * Details about a resource that are not available in a type-specific details object. Use the Other object in the following cases.   The type-specific object does not contain all of the fields that you want to populate. In this case, first use the type-specific object to populate those fields. Use the Other object to populate the fields that are missing from the type-specific object.   The resource type does not have a corresponding object. This includes resources for which the type is Other.   
    */
  var Other: js.UndefOr[FieldMap] = js.native
}

object ResourceDetails {
  @scala.inline
  def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  @scala.inline
  implicit class ResourceDetailsOps[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsCloudFrontDistribution(value: AwsCloudFrontDistributionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsCloudFrontDistribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsCloudFrontDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsCloudFrontDistribution")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsCodeBuildProject(value: AwsCodeBuildProjectDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsCodeBuildProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsCodeBuildProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsCodeBuildProject")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsEc2Instance(value: AwsEc2InstanceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsEc2Instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsEc2Instance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsEc2Instance")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsEc2NetworkInterface(value: AwsEc2NetworkInterfaceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsEc2NetworkInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsEc2NetworkInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsEc2NetworkInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsEc2SecurityGroup(value: AwsEc2SecurityGroupDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsEc2SecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsEc2SecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsEc2SecurityGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsElasticsearchDomain(value: AwsElasticsearchDomainDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsElasticsearchDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsElasticsearchDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsElasticsearchDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsElbv2LoadBalancer(value: AwsElbv2LoadBalancerDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsElbv2LoadBalancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsElbv2LoadBalancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsElbv2LoadBalancer")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsIamAccessKey(value: AwsIamAccessKeyDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsIamAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsIamAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsIamAccessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsIamRole(value: AwsIamRoleDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsIamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsIamRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsIamRole")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsKmsKey(value: AwsKmsKeyDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsKmsKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsKmsKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsKmsKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsLambdaFunction(value: AwsLambdaFunctionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsLambdaFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsLambdaFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsLambdaFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsLambdaLayerVersion(value: AwsLambdaLayerVersionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsLambdaLayerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsLambdaLayerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsLambdaLayerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsRdsDbInstance(value: AwsRdsDbInstanceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRdsDbInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRdsDbInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRdsDbInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsS3Bucket(value: AwsS3BucketDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsS3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsS3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsS3Object(value: AwsS3ObjectDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsS3Object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsS3Object: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsS3Object")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsSnsTopic(value: AwsSnsTopicDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsSnsTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsSnsTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsSnsTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsSqsQueue(value: AwsSqsQueueDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsSqsQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsSqsQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsSqsQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsWafWebAcl(value: AwsWafWebAclDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsWafWebAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsWafWebAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsWafWebAcl")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: ContainerDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(js.undefined)
        ret
    }
    @scala.inline
    def withOther(value: FieldMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Other")(js.undefined)
        ret
    }
  }
  
}

