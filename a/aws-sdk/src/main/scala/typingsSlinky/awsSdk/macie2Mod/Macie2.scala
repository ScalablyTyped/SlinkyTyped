package typingsSlinky.awsSdk.macie2Mod

import typingsSlinky.awsSdk.configBaseMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Macie2 extends Service {
  
  /**
    * Accepts an Amazon Macie membership invitation that was received from a specific account.
    */
  def acceptInvitation(): Request[AcceptInvitationResponse, AWSError] = js.native
  def acceptInvitation(callback: js.Function2[/* err */ AWSError, /* data */ AcceptInvitationResponse, scala.Unit]): Request[AcceptInvitationResponse, AWSError] = js.native
  /**
    * Accepts an Amazon Macie membership invitation that was received from a specific account.
    */
  def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse, AWSError] = js.native
  def acceptInvitation(
    params: AcceptInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptInvitationResponse, scala.Unit]
  ): Request[AcceptInvitationResponse, AWSError] = js.native
  
  /**
    * Retrieves information about one or more custom data identifiers.
    */
  def batchGetCustomDataIdentifiers(): Request[BatchGetCustomDataIdentifiersResponse, AWSError] = js.native
  def batchGetCustomDataIdentifiers(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetCustomDataIdentifiersResponse, scala.Unit]
  ): Request[BatchGetCustomDataIdentifiersResponse, AWSError] = js.native
  /**
    * Retrieves information about one or more custom data identifiers.
    */
  def batchGetCustomDataIdentifiers(params: BatchGetCustomDataIdentifiersRequest): Request[BatchGetCustomDataIdentifiersResponse, AWSError] = js.native
  def batchGetCustomDataIdentifiers(
    params: BatchGetCustomDataIdentifiersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetCustomDataIdentifiersResponse, scala.Unit]
  ): Request[BatchGetCustomDataIdentifiersResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Macie2: ConfigBase with ClientConfiguration = js.native
  
  /**
    *  Creates and defines the settings for a classification job.
    */
  def createClassificationJob(): Request[CreateClassificationJobResponse, AWSError] = js.native
  def createClassificationJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateClassificationJobResponse, scala.Unit]): Request[CreateClassificationJobResponse, AWSError] = js.native
  /**
    *  Creates and defines the settings for a classification job.
    */
  def createClassificationJob(params: CreateClassificationJobRequest): Request[CreateClassificationJobResponse, AWSError] = js.native
  def createClassificationJob(
    params: CreateClassificationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClassificationJobResponse, scala.Unit]
  ): Request[CreateClassificationJobResponse, AWSError] = js.native
  
  /**
    * Creates and defines the criteria and other settings for a custom data identifier.
    */
  def createCustomDataIdentifier(): Request[CreateCustomDataIdentifierResponse, AWSError] = js.native
  def createCustomDataIdentifier(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomDataIdentifierResponse, scala.Unit]
  ): Request[CreateCustomDataIdentifierResponse, AWSError] = js.native
  /**
    * Creates and defines the criteria and other settings for a custom data identifier.
    */
  def createCustomDataIdentifier(params: CreateCustomDataIdentifierRequest): Request[CreateCustomDataIdentifierResponse, AWSError] = js.native
  def createCustomDataIdentifier(
    params: CreateCustomDataIdentifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomDataIdentifierResponse, scala.Unit]
  ): Request[CreateCustomDataIdentifierResponse, AWSError] = js.native
  
  /**
    * Creates and defines the criteria and other settings for a findings filter.
    */
  def createFindingsFilter(): Request[CreateFindingsFilterResponse, AWSError] = js.native
  def createFindingsFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateFindingsFilterResponse, scala.Unit]): Request[CreateFindingsFilterResponse, AWSError] = js.native
  /**
    * Creates and defines the criteria and other settings for a findings filter.
    */
  def createFindingsFilter(params: CreateFindingsFilterRequest): Request[CreateFindingsFilterResponse, AWSError] = js.native
  def createFindingsFilter(
    params: CreateFindingsFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFindingsFilterResponse, scala.Unit]
  ): Request[CreateFindingsFilterResponse, AWSError] = js.native
  
  /**
    *  Sends an Amazon Macie membership invitation to one or more accounts.
    */
  def createInvitations(): Request[CreateInvitationsResponse, AWSError] = js.native
  def createInvitations(callback: js.Function2[/* err */ AWSError, /* data */ CreateInvitationsResponse, scala.Unit]): Request[CreateInvitationsResponse, AWSError] = js.native
  /**
    *  Sends an Amazon Macie membership invitation to one or more accounts.
    */
  def createInvitations(params: CreateInvitationsRequest): Request[CreateInvitationsResponse, AWSError] = js.native
  def createInvitations(
    params: CreateInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInvitationsResponse, scala.Unit]
  ): Request[CreateInvitationsResponse, AWSError] = js.native
  
  /**
    *  Associates an account with an Amazon Macie master account.
    */
  def createMember(): Request[CreateMemberResponse, AWSError] = js.native
  def createMember(callback: js.Function2[/* err */ AWSError, /* data */ CreateMemberResponse, scala.Unit]): Request[CreateMemberResponse, AWSError] = js.native
  /**
    *  Associates an account with an Amazon Macie master account.
    */
  def createMember(params: CreateMemberRequest): Request[CreateMemberResponse, AWSError] = js.native
  def createMember(
    params: CreateMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMemberResponse, scala.Unit]
  ): Request[CreateMemberResponse, AWSError] = js.native
  
  /**
    *  Creates sample findings.
    */
  def createSampleFindings(): Request[CreateSampleFindingsResponse, AWSError] = js.native
  def createSampleFindings(callback: js.Function2[/* err */ AWSError, /* data */ CreateSampleFindingsResponse, scala.Unit]): Request[CreateSampleFindingsResponse, AWSError] = js.native
  /**
    *  Creates sample findings.
    */
  def createSampleFindings(params: CreateSampleFindingsRequest): Request[CreateSampleFindingsResponse, AWSError] = js.native
  def createSampleFindings(
    params: CreateSampleFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSampleFindingsResponse, scala.Unit]
  ): Request[CreateSampleFindingsResponse, AWSError] = js.native
  
  /**
    * Declines Amazon Macie membership invitations that were received from specific accounts.
    */
  def declineInvitations(): Request[DeclineInvitationsResponse, AWSError] = js.native
  def declineInvitations(callback: js.Function2[/* err */ AWSError, /* data */ DeclineInvitationsResponse, scala.Unit]): Request[DeclineInvitationsResponse, AWSError] = js.native
  /**
    * Declines Amazon Macie membership invitations that were received from specific accounts.
    */
  def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse, AWSError] = js.native
  def declineInvitations(
    params: DeclineInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeclineInvitationsResponse, scala.Unit]
  ): Request[DeclineInvitationsResponse, AWSError] = js.native
  
  /**
    * Soft deletes a custom data identifier.
    */
  def deleteCustomDataIdentifier(): Request[DeleteCustomDataIdentifierResponse, AWSError] = js.native
  def deleteCustomDataIdentifier(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomDataIdentifierResponse, scala.Unit]
  ): Request[DeleteCustomDataIdentifierResponse, AWSError] = js.native
  /**
    * Soft deletes a custom data identifier.
    */
  def deleteCustomDataIdentifier(params: DeleteCustomDataIdentifierRequest): Request[DeleteCustomDataIdentifierResponse, AWSError] = js.native
  def deleteCustomDataIdentifier(
    params: DeleteCustomDataIdentifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomDataIdentifierResponse, scala.Unit]
  ): Request[DeleteCustomDataIdentifierResponse, AWSError] = js.native
  
  /**
    * Deletes a findings filter.
    */
  def deleteFindingsFilter(): Request[DeleteFindingsFilterResponse, AWSError] = js.native
  def deleteFindingsFilter(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFindingsFilterResponse, scala.Unit]): Request[DeleteFindingsFilterResponse, AWSError] = js.native
  /**
    * Deletes a findings filter.
    */
  def deleteFindingsFilter(params: DeleteFindingsFilterRequest): Request[DeleteFindingsFilterResponse, AWSError] = js.native
  def deleteFindingsFilter(
    params: DeleteFindingsFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFindingsFilterResponse, scala.Unit]
  ): Request[DeleteFindingsFilterResponse, AWSError] = js.native
  
  /**
    * Deletes Amazon Macie membership invitations that were received from specific accounts.
    */
  def deleteInvitations(): Request[DeleteInvitationsResponse, AWSError] = js.native
  def deleteInvitations(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInvitationsResponse, scala.Unit]): Request[DeleteInvitationsResponse, AWSError] = js.native
  /**
    * Deletes Amazon Macie membership invitations that were received from specific accounts.
    */
  def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse, AWSError] = js.native
  def deleteInvitations(
    params: DeleteInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInvitationsResponse, scala.Unit]
  ): Request[DeleteInvitationsResponse, AWSError] = js.native
  
  /**
    * Deletes the association between an Amazon Macie master account and an account.
    */
  def deleteMember(): Request[DeleteMemberResponse, AWSError] = js.native
  def deleteMember(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMemberResponse, scala.Unit]): Request[DeleteMemberResponse, AWSError] = js.native
  /**
    * Deletes the association between an Amazon Macie master account and an account.
    */
  def deleteMember(params: DeleteMemberRequest): Request[DeleteMemberResponse, AWSError] = js.native
  def deleteMember(
    params: DeleteMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMemberResponse, scala.Unit]
  ): Request[DeleteMemberResponse, AWSError] = js.native
  
  /**
    *  Retrieves (queries) statistical data and other information about one or more S3 buckets that Amazon Macie monitors and analyzes.
    */
  def describeBuckets(): Request[DescribeBucketsResponse, AWSError] = js.native
  def describeBuckets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBucketsResponse, scala.Unit]): Request[DescribeBucketsResponse, AWSError] = js.native
  /**
    *  Retrieves (queries) statistical data and other information about one or more S3 buckets that Amazon Macie monitors and analyzes.
    */
  def describeBuckets(params: DescribeBucketsRequest): Request[DescribeBucketsResponse, AWSError] = js.native
  def describeBuckets(
    params: DescribeBucketsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBucketsResponse, scala.Unit]
  ): Request[DescribeBucketsResponse, AWSError] = js.native
  
  /**
    * Retrieves the status and settings for a classification job.
    */
  def describeClassificationJob(): Request[DescribeClassificationJobResponse, AWSError] = js.native
  def describeClassificationJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClassificationJobResponse, scala.Unit]
  ): Request[DescribeClassificationJobResponse, AWSError] = js.native
  /**
    * Retrieves the status and settings for a classification job.
    */
  def describeClassificationJob(params: DescribeClassificationJobRequest): Request[DescribeClassificationJobResponse, AWSError] = js.native
  def describeClassificationJob(
    params: DescribeClassificationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClassificationJobResponse, scala.Unit]
  ): Request[DescribeClassificationJobResponse, AWSError] = js.native
  
  /**
    * Retrieves the Amazon Macie configuration settings for an AWS organization.
    */
  def describeOrganizationConfiguration(): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  def describeOrganizationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigurationResponse, scala.Unit]
  ): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the Amazon Macie configuration settings for an AWS organization.
    */
  def describeOrganizationConfiguration(params: DescribeOrganizationConfigurationRequest): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  def describeOrganizationConfiguration(
    params: DescribeOrganizationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigurationResponse, scala.Unit]
  ): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  
  /**
    * Disables an Amazon Macie account and deletes Macie resources for the account.
    */
  def disableMacie(): Request[DisableMacieResponse, AWSError] = js.native
  def disableMacie(callback: js.Function2[/* err */ AWSError, /* data */ DisableMacieResponse, scala.Unit]): Request[DisableMacieResponse, AWSError] = js.native
  /**
    * Disables an Amazon Macie account and deletes Macie resources for the account.
    */
  def disableMacie(params: DisableMacieRequest): Request[DisableMacieResponse, AWSError] = js.native
  def disableMacie(
    params: DisableMacieRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableMacieResponse, scala.Unit]
  ): Request[DisableMacieResponse, AWSError] = js.native
  
  /**
    * Disables an account as the delegated Amazon Macie administrator account for an AWS organization.
    */
  def disableOrganizationAdminAccount(): Request[DisableOrganizationAdminAccountResponse, AWSError] = js.native
  def disableOrganizationAdminAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ DisableOrganizationAdminAccountResponse, scala.Unit]
  ): Request[DisableOrganizationAdminAccountResponse, AWSError] = js.native
  /**
    * Disables an account as the delegated Amazon Macie administrator account for an AWS organization.
    */
  def disableOrganizationAdminAccount(params: DisableOrganizationAdminAccountRequest): Request[DisableOrganizationAdminAccountResponse, AWSError] = js.native
  def disableOrganizationAdminAccount(
    params: DisableOrganizationAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableOrganizationAdminAccountResponse, scala.Unit]
  ): Request[DisableOrganizationAdminAccountResponse, AWSError] = js.native
  
  /**
    * Disassociates a member account from its Amazon Macie master account.
    */
  def disassociateFromMasterAccount(): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  def disassociateFromMasterAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromMasterAccountResponse, scala.Unit]
  ): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  /**
    * Disassociates a member account from its Amazon Macie master account.
    */
  def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  def disassociateFromMasterAccount(
    params: DisassociateFromMasterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromMasterAccountResponse, scala.Unit]
  ): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  
  /**
    * Disassociates an Amazon Macie master account from a member account.
    */
  def disassociateMember(): Request[DisassociateMemberResponse, AWSError] = js.native
  def disassociateMember(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMemberResponse, scala.Unit]): Request[DisassociateMemberResponse, AWSError] = js.native
  /**
    * Disassociates an Amazon Macie master account from a member account.
    */
  def disassociateMember(params: DisassociateMemberRequest): Request[DisassociateMemberResponse, AWSError] = js.native
  def disassociateMember(
    params: DisassociateMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMemberResponse, scala.Unit]
  ): Request[DisassociateMemberResponse, AWSError] = js.native
  
  /**
    * Enables Amazon Macie and specifies the configuration settings for a Macie account.
    */
  def enableMacie(): Request[EnableMacieResponse, AWSError] = js.native
  def enableMacie(callback: js.Function2[/* err */ AWSError, /* data */ EnableMacieResponse, scala.Unit]): Request[EnableMacieResponse, AWSError] = js.native
  /**
    * Enables Amazon Macie and specifies the configuration settings for a Macie account.
    */
  def enableMacie(params: EnableMacieRequest): Request[EnableMacieResponse, AWSError] = js.native
  def enableMacie(
    params: EnableMacieRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableMacieResponse, scala.Unit]
  ): Request[EnableMacieResponse, AWSError] = js.native
  
  /**
    * Designates an account as the delegated Amazon Macie administrator account for an AWS organization.
    */
  def enableOrganizationAdminAccount(): Request[EnableOrganizationAdminAccountResponse, AWSError] = js.native
  def enableOrganizationAdminAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableOrganizationAdminAccountResponse, scala.Unit]
  ): Request[EnableOrganizationAdminAccountResponse, AWSError] = js.native
  /**
    * Designates an account as the delegated Amazon Macie administrator account for an AWS organization.
    */
  def enableOrganizationAdminAccount(params: EnableOrganizationAdminAccountRequest): Request[EnableOrganizationAdminAccountResponse, AWSError] = js.native
  def enableOrganizationAdminAccount(
    params: EnableOrganizationAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableOrganizationAdminAccountResponse, scala.Unit]
  ): Request[EnableOrganizationAdminAccountResponse, AWSError] = js.native
  
  /**
    *  Retrieves (queries) aggregated statistical data for all the S3 buckets that Amazon Macie monitors and analyzes.
    */
  def getBucketStatistics(): Request[GetBucketStatisticsResponse, AWSError] = js.native
  def getBucketStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketStatisticsResponse, scala.Unit]): Request[GetBucketStatisticsResponse, AWSError] = js.native
  /**
    *  Retrieves (queries) aggregated statistical data for all the S3 buckets that Amazon Macie monitors and analyzes.
    */
  def getBucketStatistics(params: GetBucketStatisticsRequest): Request[GetBucketStatisticsResponse, AWSError] = js.native
  def getBucketStatistics(
    params: GetBucketStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketStatisticsResponse, scala.Unit]
  ): Request[GetBucketStatisticsResponse, AWSError] = js.native
  
  /**
    * Retrieves the configuration settings for storing data classification results.
    */
  def getClassificationExportConfiguration(): Request[GetClassificationExportConfigurationResponse, AWSError] = js.native
  def getClassificationExportConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetClassificationExportConfigurationResponse, 
      scala.Unit
    ]
  ): Request[GetClassificationExportConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the configuration settings for storing data classification results.
    */
  def getClassificationExportConfiguration(params: GetClassificationExportConfigurationRequest): Request[GetClassificationExportConfigurationResponse, AWSError] = js.native
  def getClassificationExportConfiguration(
    params: GetClassificationExportConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetClassificationExportConfigurationResponse, 
      scala.Unit
    ]
  ): Request[GetClassificationExportConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves the criteria and other settings for a custom data identifier.
    */
  def getCustomDataIdentifier(): Request[GetCustomDataIdentifierResponse, AWSError] = js.native
  def getCustomDataIdentifier(callback: js.Function2[/* err */ AWSError, /* data */ GetCustomDataIdentifierResponse, scala.Unit]): Request[GetCustomDataIdentifierResponse, AWSError] = js.native
  /**
    * Retrieves the criteria and other settings for a custom data identifier.
    */
  def getCustomDataIdentifier(params: GetCustomDataIdentifierRequest): Request[GetCustomDataIdentifierResponse, AWSError] = js.native
  def getCustomDataIdentifier(
    params: GetCustomDataIdentifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomDataIdentifierResponse, scala.Unit]
  ): Request[GetCustomDataIdentifierResponse, AWSError] = js.native
  
  /**
    *  Retrieves (queries) aggregated statistical data about findings.
    */
  def getFindingStatistics(): Request[GetFindingStatisticsResponse, AWSError] = js.native
  def getFindingStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingStatisticsResponse, scala.Unit]): Request[GetFindingStatisticsResponse, AWSError] = js.native
  /**
    *  Retrieves (queries) aggregated statistical data about findings.
    */
  def getFindingStatistics(params: GetFindingStatisticsRequest): Request[GetFindingStatisticsResponse, AWSError] = js.native
  def getFindingStatistics(
    params: GetFindingStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingStatisticsResponse, scala.Unit]
  ): Request[GetFindingStatisticsResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of one or more findings.
    */
  def getFindings(): Request[GetFindingsResponse, AWSError] = js.native
  def getFindings(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsResponse, scala.Unit]): Request[GetFindingsResponse, AWSError] = js.native
  /**
    * Retrieves the details of one or more findings.
    */
  def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse, AWSError] = js.native
  def getFindings(
    params: GetFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsResponse, scala.Unit]
  ): Request[GetFindingsResponse, AWSError] = js.native
  
  /**
    * Retrieves the criteria and other settings for a findings filter.
    */
  def getFindingsFilter(): Request[GetFindingsFilterResponse, AWSError] = js.native
  def getFindingsFilter(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsFilterResponse, scala.Unit]): Request[GetFindingsFilterResponse, AWSError] = js.native
  /**
    * Retrieves the criteria and other settings for a findings filter.
    */
  def getFindingsFilter(params: GetFindingsFilterRequest): Request[GetFindingsFilterResponse, AWSError] = js.native
  def getFindingsFilter(
    params: GetFindingsFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsFilterResponse, scala.Unit]
  ): Request[GetFindingsFilterResponse, AWSError] = js.native
  
  /**
    * Retrieves the count of Amazon Macie membership invitations that were received by an account.
    */
  def getInvitationsCount(): Request[GetInvitationsCountResponse, AWSError] = js.native
  def getInvitationsCount(callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationsCountResponse, scala.Unit]): Request[GetInvitationsCountResponse, AWSError] = js.native
  /**
    * Retrieves the count of Amazon Macie membership invitations that were received by an account.
    */
  def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse, AWSError] = js.native
  def getInvitationsCount(
    params: GetInvitationsCountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationsCountResponse, scala.Unit]
  ): Request[GetInvitationsCountResponse, AWSError] = js.native
  
  /**
    * Retrieves the current status and configuration settings for an Amazon Macie account.
    */
  def getMacieSession(): Request[GetMacieSessionResponse, AWSError] = js.native
  def getMacieSession(callback: js.Function2[/* err */ AWSError, /* data */ GetMacieSessionResponse, scala.Unit]): Request[GetMacieSessionResponse, AWSError] = js.native
  /**
    * Retrieves the current status and configuration settings for an Amazon Macie account.
    */
  def getMacieSession(params: GetMacieSessionRequest): Request[GetMacieSessionResponse, AWSError] = js.native
  def getMacieSession(
    params: GetMacieSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMacieSessionResponse, scala.Unit]
  ): Request[GetMacieSessionResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the Amazon Macie master account for an account.
    */
  def getMasterAccount(): Request[GetMasterAccountResponse, AWSError] = js.native
  def getMasterAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetMasterAccountResponse, scala.Unit]): Request[GetMasterAccountResponse, AWSError] = js.native
  /**
    * Retrieves information about the Amazon Macie master account for an account.
    */
  def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse, AWSError] = js.native
  def getMasterAccount(
    params: GetMasterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMasterAccountResponse, scala.Unit]
  ): Request[GetMasterAccountResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a member account that's associated with an Amazon Macie master account.
    */
  def getMember(): Request[GetMemberResponse, AWSError] = js.native
  def getMember(callback: js.Function2[/* err */ AWSError, /* data */ GetMemberResponse, scala.Unit]): Request[GetMemberResponse, AWSError] = js.native
  /**
    * Retrieves information about a member account that's associated with an Amazon Macie master account.
    */
  def getMember(params: GetMemberRequest): Request[GetMemberResponse, AWSError] = js.native
  def getMember(
    params: GetMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMemberResponse, scala.Unit]
  ): Request[GetMemberResponse, AWSError] = js.native
  
  /**
    * Retrieves (queries) quotas and aggregated usage data for one or more accounts.
    */
  def getUsageStatistics(): Request[GetUsageStatisticsResponse, AWSError] = js.native
  def getUsageStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetUsageStatisticsResponse, scala.Unit]): Request[GetUsageStatisticsResponse, AWSError] = js.native
  /**
    * Retrieves (queries) quotas and aggregated usage data for one or more accounts.
    */
  def getUsageStatistics(params: GetUsageStatisticsRequest): Request[GetUsageStatisticsResponse, AWSError] = js.native
  def getUsageStatistics(
    params: GetUsageStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUsageStatisticsResponse, scala.Unit]
  ): Request[GetUsageStatisticsResponse, AWSError] = js.native
  
  /**
    * Retrieves (queries) aggregated usage data for an account.
    */
  def getUsageTotals(): Request[GetUsageTotalsResponse, AWSError] = js.native
  def getUsageTotals(callback: js.Function2[/* err */ AWSError, /* data */ GetUsageTotalsResponse, scala.Unit]): Request[GetUsageTotalsResponse, AWSError] = js.native
  /**
    * Retrieves (queries) aggregated usage data for an account.
    */
  def getUsageTotals(params: GetUsageTotalsRequest): Request[GetUsageTotalsResponse, AWSError] = js.native
  def getUsageTotals(
    params: GetUsageTotalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUsageTotalsResponse, scala.Unit]
  ): Request[GetUsageTotalsResponse, AWSError] = js.native
  
  /**
    * Retrieves a subset of information about one or more classification jobs.
    */
  def listClassificationJobs(): Request[ListClassificationJobsResponse, AWSError] = js.native
  def listClassificationJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListClassificationJobsResponse, scala.Unit]): Request[ListClassificationJobsResponse, AWSError] = js.native
  /**
    * Retrieves a subset of information about one or more classification jobs.
    */
  def listClassificationJobs(params: ListClassificationJobsRequest): Request[ListClassificationJobsResponse, AWSError] = js.native
  def listClassificationJobs(
    params: ListClassificationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClassificationJobsResponse, scala.Unit]
  ): Request[ListClassificationJobsResponse, AWSError] = js.native
  
  /**
    * Retrieves a subset of information about all the custom data identifiers for an account.
    */
  def listCustomDataIdentifiers(): Request[ListCustomDataIdentifiersResponse, AWSError] = js.native
  def listCustomDataIdentifiers(
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomDataIdentifiersResponse, scala.Unit]
  ): Request[ListCustomDataIdentifiersResponse, AWSError] = js.native
  /**
    * Retrieves a subset of information about all the custom data identifiers for an account.
    */
  def listCustomDataIdentifiers(params: ListCustomDataIdentifiersRequest): Request[ListCustomDataIdentifiersResponse, AWSError] = js.native
  def listCustomDataIdentifiers(
    params: ListCustomDataIdentifiersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomDataIdentifiersResponse, scala.Unit]
  ): Request[ListCustomDataIdentifiersResponse, AWSError] = js.native
  
  /**
    *  Retrieves a subset of information about one or more findings.
    */
  def listFindings(): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, scala.Unit]): Request[ListFindingsResponse, AWSError] = js.native
  /**
    *  Retrieves a subset of information about one or more findings.
    */
  def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(
    params: ListFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, scala.Unit]
  ): Request[ListFindingsResponse, AWSError] = js.native
  
  /**
    * Retrieves a subset of information about all the findings filters for an account.
    */
  def listFindingsFilters(): Request[ListFindingsFiltersResponse, AWSError] = js.native
  def listFindingsFilters(callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsFiltersResponse, scala.Unit]): Request[ListFindingsFiltersResponse, AWSError] = js.native
  /**
    * Retrieves a subset of information about all the findings filters for an account.
    */
  def listFindingsFilters(params: ListFindingsFiltersRequest): Request[ListFindingsFiltersResponse, AWSError] = js.native
  def listFindingsFilters(
    params: ListFindingsFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsFiltersResponse, scala.Unit]
  ): Request[ListFindingsFiltersResponse, AWSError] = js.native
  
  /**
    * Retrieves information about all the Amazon Macie membership invitations that were received by an account.
    */
  def listInvitations(): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, scala.Unit]): Request[ListInvitationsResponse, AWSError] = js.native
  /**
    * Retrieves information about all the Amazon Macie membership invitations that were received by an account.
    */
  def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(
    params: ListInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, scala.Unit]
  ): Request[ListInvitationsResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the accounts that are associated with an Amazon Macie master account.
    */
  def listMembers(): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, scala.Unit]): Request[ListMembersResponse, AWSError] = js.native
  /**
    * Retrieves information about the accounts that are associated with an Amazon Macie master account.
    */
  def listMembers(params: ListMembersRequest): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(
    params: ListMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, scala.Unit]
  ): Request[ListMembersResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the delegated Amazon Macie administrator account for an AWS organization.
    */
  def listOrganizationAdminAccounts(): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  def listOrganizationAdminAccounts(
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationAdminAccountsResponse, scala.Unit]
  ): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  /**
    * Retrieves information about the delegated Amazon Macie administrator account for an AWS organization.
    */
  def listOrganizationAdminAccounts(params: ListOrganizationAdminAccountsRequest): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  def listOrganizationAdminAccounts(
    params: ListOrganizationAdminAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationAdminAccountsResponse, scala.Unit]
  ): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  
  /**
    * Retrieves the tags (keys and values) that are associated with a classification job, custom data identifier, findings filter, or member account.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves the tags (keys and values) that are associated with a classification job, custom data identifier, findings filter, or member account.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Creates or updates the configuration settings for storing data classification results.
    */
  def putClassificationExportConfiguration(): Request[PutClassificationExportConfigurationResponse, AWSError] = js.native
  def putClassificationExportConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutClassificationExportConfigurationResponse, 
      scala.Unit
    ]
  ): Request[PutClassificationExportConfigurationResponse, AWSError] = js.native
  /**
    * Creates or updates the configuration settings for storing data classification results.
    */
  def putClassificationExportConfiguration(params: PutClassificationExportConfigurationRequest): Request[PutClassificationExportConfigurationResponse, AWSError] = js.native
  def putClassificationExportConfiguration(
    params: PutClassificationExportConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutClassificationExportConfigurationResponse, 
      scala.Unit
    ]
  ): Request[PutClassificationExportConfigurationResponse, AWSError] = js.native
  
  /**
    * Adds or updates one or more tags (keys and values) that are associated with a classification job, custom data identifier, findings filter, or member account.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, scala.Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds or updates one or more tags (keys and values) that are associated with a classification job, custom data identifier, findings filter, or member account.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, scala.Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Tests a custom data identifier.
    */
  def testCustomDataIdentifier(): Request[TestCustomDataIdentifierResponse, AWSError] = js.native
  def testCustomDataIdentifier(
    callback: js.Function2[/* err */ AWSError, /* data */ TestCustomDataIdentifierResponse, scala.Unit]
  ): Request[TestCustomDataIdentifierResponse, AWSError] = js.native
  /**
    * Tests a custom data identifier.
    */
  def testCustomDataIdentifier(params: TestCustomDataIdentifierRequest): Request[TestCustomDataIdentifierResponse, AWSError] = js.native
  def testCustomDataIdentifier(
    params: TestCustomDataIdentifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestCustomDataIdentifierResponse, scala.Unit]
  ): Request[TestCustomDataIdentifierResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags (keys and values) from a classification job, custom data identifier, findings filter, or member account.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, scala.Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags (keys and values) from a classification job, custom data identifier, findings filter, or member account.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, scala.Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Changes the status of a classification job.
    */
  def updateClassificationJob(): Request[UpdateClassificationJobResponse, AWSError] = js.native
  def updateClassificationJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClassificationJobResponse, scala.Unit]): Request[UpdateClassificationJobResponse, AWSError] = js.native
  /**
    * Changes the status of a classification job.
    */
  def updateClassificationJob(params: UpdateClassificationJobRequest): Request[UpdateClassificationJobResponse, AWSError] = js.native
  def updateClassificationJob(
    params: UpdateClassificationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClassificationJobResponse, scala.Unit]
  ): Request[UpdateClassificationJobResponse, AWSError] = js.native
  
  /**
    * Updates the criteria and other settings for a findings filter.
    */
  def updateFindingsFilter(): Request[UpdateFindingsFilterResponse, AWSError] = js.native
  def updateFindingsFilter(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingsFilterResponse, scala.Unit]): Request[UpdateFindingsFilterResponse, AWSError] = js.native
  /**
    * Updates the criteria and other settings for a findings filter.
    */
  def updateFindingsFilter(params: UpdateFindingsFilterRequest): Request[UpdateFindingsFilterResponse, AWSError] = js.native
  def updateFindingsFilter(
    params: UpdateFindingsFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingsFilterResponse, scala.Unit]
  ): Request[UpdateFindingsFilterResponse, AWSError] = js.native
  
  /**
    * Suspends or re-enables an Amazon Macie account, or updates the configuration settings for a Macie account.
    */
  def updateMacieSession(): Request[UpdateMacieSessionResponse, AWSError] = js.native
  def updateMacieSession(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMacieSessionResponse, scala.Unit]): Request[UpdateMacieSessionResponse, AWSError] = js.native
  /**
    * Suspends or re-enables an Amazon Macie account, or updates the configuration settings for a Macie account.
    */
  def updateMacieSession(params: UpdateMacieSessionRequest): Request[UpdateMacieSessionResponse, AWSError] = js.native
  def updateMacieSession(
    params: UpdateMacieSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMacieSessionResponse, scala.Unit]
  ): Request[UpdateMacieSessionResponse, AWSError] = js.native
  
  /**
    *  Enables an Amazon Macie master account to suspend or re-enable a member account.
    */
  def updateMemberSession(): Request[UpdateMemberSessionResponse, AWSError] = js.native
  def updateMemberSession(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMemberSessionResponse, scala.Unit]): Request[UpdateMemberSessionResponse, AWSError] = js.native
  /**
    *  Enables an Amazon Macie master account to suspend or re-enable a member account.
    */
  def updateMemberSession(params: UpdateMemberSessionRequest): Request[UpdateMemberSessionResponse, AWSError] = js.native
  def updateMemberSession(
    params: UpdateMemberSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMemberSessionResponse, scala.Unit]
  ): Request[UpdateMemberSessionResponse, AWSError] = js.native
  
  /**
    * Updates the Amazon Macie configuration settings for an AWS organization.
    */
  def updateOrganizationConfiguration(): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  def updateOrganizationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOrganizationConfigurationResponse, scala.Unit]
  ): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  /**
    * Updates the Amazon Macie configuration settings for an AWS organization.
    */
  def updateOrganizationConfiguration(params: UpdateOrganizationConfigurationRequest): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  def updateOrganizationConfiguration(
    params: UpdateOrganizationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOrganizationConfigurationResponse, scala.Unit]
  ): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
}
