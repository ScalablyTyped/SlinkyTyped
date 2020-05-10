package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsSecurityFindingFilters extends js.Object {
  /**
    * The AWS account ID that a finding is generated in.
    */
  var AwsAccountId: js.UndefOr[StringFilterList] = js.native
  /**
    * The name of the findings provider (company) that owns the solution (product) that generates findings.
    */
  var CompanyName: js.UndefOr[StringFilterList] = js.native
  /**
    * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard, such as CIS AWS Foundations. Contains security standard-related finding details.
    */
  var ComplianceStatus: js.UndefOr[StringFilterList] = js.native
  /**
    * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var Confidence: js.UndefOr[NumberFilterList] = js.native
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider captured the potential security issue that a finding captured.
    */
  var CreatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The level of importance assigned to the resources associated with the finding. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources.
    */
  var Criticality: js.UndefOr[NumberFilterList] = js.native
  /**
    * A finding's description.
    */
  var Description: js.UndefOr[StringFilterList] = js.native
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider first observed the potential security issue that a finding captured.
    */
  var FirstObservedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The identifier for the solution-specific component (a discrete unit of logic) that generated a finding. In various security-findings providers' solutions, this generator can be called a rule, a check, a detector, a plug-in, etc.
    */
  var GeneratorId: js.UndefOr[StringFilterList] = js.native
  /**
    * The security findings provider-specific identifier for a finding.
    */
  var Id: js.UndefOr[StringFilterList] = js.native
  /**
    * A keyword for a finding.
    */
  var Keyword: js.UndefOr[KeywordFilterList] = js.native
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider most recently observed the potential security issue that a finding captured.
    */
  var LastObservedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The name of the malware that was observed.
    */
  var MalwareName: js.UndefOr[StringFilterList] = js.native
  /**
    * The filesystem path of the malware that was observed.
    */
  var MalwarePath: js.UndefOr[StringFilterList] = js.native
  /**
    * The state of the malware that was observed.
    */
  var MalwareState: js.UndefOr[StringFilterList] = js.native
  /**
    * The type of the malware that was observed.
    */
  var MalwareType: js.UndefOr[StringFilterList] = js.native
  /**
    * The destination domain of network-related information about a finding.
    */
  var NetworkDestinationDomain: js.UndefOr[StringFilterList] = js.native
  /**
    * The destination IPv4 address of network-related information about a finding.
    */
  var NetworkDestinationIpV4: js.UndefOr[IpFilterList] = js.native
  /**
    * The destination IPv6 address of network-related information about a finding.
    */
  var NetworkDestinationIpV6: js.UndefOr[IpFilterList] = js.native
  /**
    * The destination port of network-related information about a finding.
    */
  var NetworkDestinationPort: js.UndefOr[NumberFilterList] = js.native
  /**
    * Indicates the direction of network traffic associated with a finding.
    */
  var NetworkDirection: js.UndefOr[StringFilterList] = js.native
  /**
    * The protocol of network-related information about a finding.
    */
  var NetworkProtocol: js.UndefOr[StringFilterList] = js.native
  /**
    * The source domain of network-related information about a finding.
    */
  var NetworkSourceDomain: js.UndefOr[StringFilterList] = js.native
  /**
    * The source IPv4 address of network-related information about a finding.
    */
  var NetworkSourceIpV4: js.UndefOr[IpFilterList] = js.native
  /**
    * The source IPv6 address of network-related information about a finding.
    */
  var NetworkSourceIpV6: js.UndefOr[IpFilterList] = js.native
  /**
    * The source media access control (MAC) address of network-related information about a finding.
    */
  var NetworkSourceMac: js.UndefOr[StringFilterList] = js.native
  /**
    * The source port of network-related information about a finding.
    */
  var NetworkSourcePort: js.UndefOr[NumberFilterList] = js.native
  /**
    * The text of a note.
    */
  var NoteText: js.UndefOr[StringFilterList] = js.native
  /**
    * The timestamp of when the note was updated.
    */
  var NoteUpdatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The principal that created a note.
    */
  var NoteUpdatedBy: js.UndefOr[StringFilterList] = js.native
  /**
    * The date/time that the process was launched.
    */
  var ProcessLaunchedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The name of the process.
    */
  var ProcessName: js.UndefOr[StringFilterList] = js.native
  /**
    * The parent process ID.
    */
  var ProcessParentPid: js.UndefOr[NumberFilterList] = js.native
  /**
    * The path to the process executable.
    */
  var ProcessPath: js.UndefOr[StringFilterList] = js.native
  /**
    * The process ID.
    */
  var ProcessPid: js.UndefOr[NumberFilterList] = js.native
  /**
    * The date/time that the process was terminated.
    */
  var ProcessTerminatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The ARN generated by Security Hub that uniquely identifies a third-party company (security findings provider) after this provider's product (solution that generates findings) is registered with Security Hub.
    */
  var ProductArn: js.UndefOr[StringFilterList] = js.native
  /**
    * A data type where security-findings providers can include additional solution-specific details that aren't part of the defined AwsSecurityFinding format.
    */
  var ProductFields: js.UndefOr[MapFilterList] = js.native
  /**
    * The name of the solution (product) that generates findings.
    */
  var ProductName: js.UndefOr[StringFilterList] = js.native
  /**
    * The recommendation of what to do about the issue described in a finding.
    */
  var RecommendationText: js.UndefOr[StringFilterList] = js.native
  /**
    * The updated record state for the finding.
    */
  var RecordState: js.UndefOr[StringFilterList] = js.native
  /**
    * The solution-generated identifier for a related finding.
    */
  var RelatedFindingsId: js.UndefOr[StringFilterList] = js.native
  /**
    * The ARN of the solution that generated a related finding.
    */
  var RelatedFindingsProductArn: js.UndefOr[StringFilterList] = js.native
  /**
    * The IAM profile ARN of the instance.
    */
  var ResourceAwsEc2InstanceIamInstanceProfileArn: js.UndefOr[StringFilterList] = js.native
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ResourceAwsEc2InstanceImageId: js.UndefOr[StringFilterList] = js.native
  /**
    * The IPv4 addresses associated with the instance.
    */
  var ResourceAwsEc2InstanceIpV4Addresses: js.UndefOr[IpFilterList] = js.native
  /**
    * The IPv6 addresses associated with the instance.
    */
  var ResourceAwsEc2InstanceIpV6Addresses: js.UndefOr[IpFilterList] = js.native
  /**
    * The key name associated with the instance.
    */
  var ResourceAwsEc2InstanceKeyName: js.UndefOr[StringFilterList] = js.native
  /**
    * The date and time the instance was launched.
    */
  var ResourceAwsEc2InstanceLaunchedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList] = js.native
  /**
    * The instance type of the instance.
    */
  var ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList] = js.native
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var ResourceAwsEc2InstanceVpcId: js.UndefOr[StringFilterList] = js.native
  /**
    * The creation date/time of the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyCreatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The status of the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList] = js.native
  /**
    * The user associated with the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList] = js.native
  /**
    * The canonical user ID of the owner of the S3 bucket.
    */
  var ResourceAwsS3BucketOwnerId: js.UndefOr[StringFilterList] = js.native
  /**
    * The display name of the owner of the S3 bucket.
    */
  var ResourceAwsS3BucketOwnerName: js.UndefOr[StringFilterList] = js.native
  /**
    * The identifier of the image related to a finding.
    */
  var ResourceContainerImageId: js.UndefOr[StringFilterList] = js.native
  /**
    * The name of the image related to a finding.
    */
  var ResourceContainerImageName: js.UndefOr[StringFilterList] = js.native
  /**
    * The date/time that the container was started.
    */
  var ResourceContainerLaunchedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The name of the container related to a finding.
    */
  var ResourceContainerName: js.UndefOr[StringFilterList] = js.native
  /**
    * The details of a resource that doesn't have a specific subfield for the resource type defined.
    */
  var ResourceDetailsOther: js.UndefOr[MapFilterList] = js.native
  /**
    * The canonical identifier for the given resource type.
    */
  var ResourceId: js.UndefOr[StringFilterList] = js.native
  /**
    * The canonical AWS partition name that the Region is assigned to.
    */
  var ResourcePartition: js.UndefOr[StringFilterList] = js.native
  /**
    * The canonical AWS external Region name where this resource is located.
    */
  var ResourceRegion: js.UndefOr[StringFilterList] = js.native
  /**
    * A list of AWS tags associated with a resource at the time the finding was processed.
    */
  var ResourceTags: js.UndefOr[MapFilterList] = js.native
  /**
    * Specifies the type of the resource that details are provided for.
    */
  var ResourceType: js.UndefOr[StringFilterList] = js.native
  /**
    * The label of a finding's severity.
    */
  var SeverityLabel: js.UndefOr[StringFilterList] = js.native
  /**
    * The normalized severity of a finding.
    */
  var SeverityNormalized: js.UndefOr[NumberFilterList] = js.native
  /**
    * The native severity as defined by the security-findings provider's solution that generated the finding.
    */
  var SeverityProduct: js.UndefOr[NumberFilterList] = js.native
  /**
    * A URL that links to a page about the current finding in the security-findings provider's solution.
    */
  var SourceUrl: js.UndefOr[StringFilterList] = js.native
  /**
    * The category of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList] = js.native
  /**
    * The date/time of the last observation of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The source of the threat intelligence.
    */
  var ThreatIntelIndicatorSource: js.UndefOr[StringFilterList] = js.native
  /**
    * The URL for more details from the source of the threat intelligence.
    */
  var ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList] = js.native
  /**
    * The type of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorType: js.UndefOr[StringFilterList] = js.native
  /**
    * The value of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorValue: js.UndefOr[StringFilterList] = js.native
  /**
    * A finding's title.
    */
  var Title: js.UndefOr[StringFilterList] = js.native
  /**
    * A finding type in the format of namespace/category/classifier that classifies a finding.
    */
  var Type: js.UndefOr[StringFilterList] = js.native
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider last updated the finding record. 
    */
  var UpdatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. 
    */
  var UserDefinedFields: js.UndefOr[MapFilterList] = js.native
  /**
    * The veracity of a finding.
    */
  var VerificationState: js.UndefOr[StringFilterList] = js.native
  /**
    * The workflow state of a finding.
    */
  var WorkflowState: js.UndefOr[StringFilterList] = js.native
  /**
    * The status of the investigation into a finding. Allowed values are the following.    NEW - The initial state of a finding, before it is reviewed.    NOTIFIED - Indicates that the resource owner has been notified about the security issue. Used when the initial reviewer is not the resource owner, and needs intervention from the resource owner.    SUPPRESSED - The finding will not be reviewed again and will not be acted upon.    RESOLVED - The finding was reviewed and remediated and is now considered resolved.   
    */
  var WorkflowStatus: js.UndefOr[StringFilterList] = js.native
}

object AwsSecurityFindingFilters {
  @scala.inline
  def apply(): AwsSecurityFindingFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSecurityFindingFilters]
  }
  @scala.inline
  implicit class AwsSecurityFindingFiltersOps[Self <: AwsSecurityFindingFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyName(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyName")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceStatus(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withConfidence(value: NumberFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCriticality(value: NumberFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Criticality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriticality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Criticality")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstObservedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstObservedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstObservedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstObservedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratorId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneratorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneratorId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyword(value: KeywordFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keyword")(js.undefined)
        ret
    }
    @scala.inline
    def withLastObservedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastObservedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastObservedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastObservedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMalwareName(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MalwareName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMalwareName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MalwareName")(js.undefined)
        ret
    }
    @scala.inline
    def withMalwarePath(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MalwarePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMalwarePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MalwarePath")(js.undefined)
        ret
    }
    @scala.inline
    def withMalwareState(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MalwareState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMalwareState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MalwareState")(js.undefined)
        ret
    }
    @scala.inline
    def withMalwareType(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MalwareType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMalwareType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MalwareType")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkDestinationDomain(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDestinationDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkDestinationDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDestinationDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkDestinationIpV4(value: IpFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDestinationIpV4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkDestinationIpV4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDestinationIpV4")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkDestinationIpV6(value: IpFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDestinationIpV6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkDestinationIpV6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDestinationIpV6")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkDestinationPort(value: NumberFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDestinationPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkDestinationPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDestinationPort")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkDirection(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProtocol(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkSourceDomain(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourceDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkSourceDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourceDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkSourceIpV4(value: IpFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourceIpV4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkSourceIpV4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourceIpV4")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkSourceIpV6(value: IpFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourceIpV6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkSourceIpV6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourceIpV6")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkSourceMac(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourceMac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkSourceMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourceMac")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkSourcePort(value: NumberFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourcePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkSourcePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSourcePort")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteText(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoteText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoteText")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteUpdatedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoteUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoteUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteUpdatedBy(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoteUpdatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteUpdatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoteUpdatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessLaunchedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessLaunchedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessLaunchedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessLaunchedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessName(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessName")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessParentPid(value: NumberFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessParentPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessParentPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessParentPid")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessPath(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessPath")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessPid(value: NumberFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessPid")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessTerminatedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessTerminatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessTerminatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessTerminatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withProductArn(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductArn")(js.undefined)
        ret
    }
    @scala.inline
    def withProductFields(value: MapFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductFields")(js.undefined)
        ret
    }
    @scala.inline
    def withProductName(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductName")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationText(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationText")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordState(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordState")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedFindingsId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedFindingsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedFindingsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedFindingsId")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedFindingsProductArn(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedFindingsProductArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedFindingsProductArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedFindingsProductArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsEc2InstanceIamInstanceProfileArn(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceIamInstanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsEc2InstanceIamInstanceProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceIamInstanceProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsEc2InstanceImageId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsEc2InstanceImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsEc2InstanceIpV4Addresses(value: IpFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceIpV4Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsEc2InstanceIpV4Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceIpV4Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsEc2InstanceIpV6Addresses(value: IpFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceIpV6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsEc2InstanceIpV6Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceIpV6Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsEc2InstanceKeyName(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsEc2InstanceKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsEc2InstanceLaunchedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceLaunchedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsEc2InstanceLaunchedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceLaunchedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsEc2InstanceSubnetId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceSubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsEc2InstanceSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceSubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsEc2InstanceType(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsEc2InstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsEc2InstanceVpcId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsEc2InstanceVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsEc2InstanceVpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsIamAccessKeyCreatedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsIamAccessKeyCreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsIamAccessKeyCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsIamAccessKeyCreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsIamAccessKeyStatus(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsIamAccessKeyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsIamAccessKeyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsIamAccessKeyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsIamAccessKeyUserName(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsIamAccessKeyUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsIamAccessKeyUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsIamAccessKeyUserName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsS3BucketOwnerId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsS3BucketOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsS3BucketOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsS3BucketOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAwsS3BucketOwnerName(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsS3BucketOwnerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAwsS3BucketOwnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAwsS3BucketOwnerName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceContainerImageId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceContainerImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceContainerImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceContainerImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceContainerImageName(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceContainerImageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceContainerImageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceContainerImageName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceContainerLaunchedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceContainerLaunchedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceContainerLaunchedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceContainerLaunchedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceContainerName(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceContainerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceContainerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceContainerName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceDetailsOther(value: MapFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceDetailsOther")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceDetailsOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceDetailsOther")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcePartition(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourcePartition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcePartition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourcePartition")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRegion(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTags(value: MapFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTags")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverityLabel(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverityNormalized(value: NumberFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityNormalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverityNormalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityNormalized")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverityProduct(value: NumberFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityProduct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverityProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityProduct")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUrl(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatIntelIndicatorCategory(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatIntelIndicatorCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatIntelIndicatorLastObservedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorLastObservedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatIntelIndicatorLastObservedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorLastObservedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatIntelIndicatorSource(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatIntelIndicatorSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorSource")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatIntelIndicatorSourceUrl(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatIntelIndicatorSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorSourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatIntelIndicatorType(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatIntelIndicatorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorType")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatIntelIndicatorValue(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatIntelIndicatorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreatIntelIndicatorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: DateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDefinedFields(value: MapFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefinedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefinedFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefinedFields")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationState(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationState")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowState(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowState")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowStatus(value: StringFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowStatus")(js.undefined)
        ret
    }
  }
  
}

