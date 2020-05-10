package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.DataCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.ManagementCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.MetadataCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.ProvisioningCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.UserDeletionCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Account
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountChildLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountPermissions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountRef
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTicket
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AdWordsAccount
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AnalyticsDataimportDeleteUploadDataRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomDimension
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomDimensionParentLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomMetric
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomMetricParentLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityAdWordsLinkEntity
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLinkEntity
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.EntityUserLinkPermissions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Experiment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.ExperimentParentLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.ExperimentVariations
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Filter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterAdvancedDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterExpression
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterLowercaseDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterParentLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterRef
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterSearchAndReplaceDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.FilterUppercaseDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Goal
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalEventDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalEventDetailsEventConditions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalParentLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalUrlDestinationDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalUrlDestinationDetailsSteps
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalVisitNumPagesDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.GoalVisitTimeOnSiteDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.HashClientIdRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.IncludeConditions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.LinkedForeignAccount
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Profile
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileChildLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileFilterLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileParentLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfilePermissions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.ProfileRef
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudience
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceAudienceDefinition
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceStateBasedAudienceDefinition
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReport
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReportCloudStorageDownloadDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReportDriveDownloadDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserDeletionRequestId
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.UserRef
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebPropertyRef
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Webproperty
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebpropertyChildLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebpropertyParentLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.WebpropertyPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics_ extends js.Object {
  var Data: js.UndefOr[DataCollection] = js.native
  var Management: js.UndefOr[ManagementCollection] = js.native
  var Metadata: js.UndefOr[MetadataCollection] = js.native
  var Provisioning: js.UndefOr[ProvisioningCollection] = js.native
  var UserDeletion: js.UndefOr[UserDeletionCollection] = js.native
  // Create a new instance of Account
  def newAccount(): Account = js.native
  // Create a new instance of AccountChildLink
  def newAccountChildLink(): AccountChildLink = js.native
  // Create a new instance of AccountPermissions
  def newAccountPermissions(): AccountPermissions = js.native
  // Create a new instance of AccountRef
  def newAccountRef(): AccountRef = js.native
  // Create a new instance of AccountTicket
  def newAccountTicket(): AccountTicket = js.native
  // Create a new instance of AccountTreeRequest
  def newAccountTreeRequest(): AccountTreeRequest = js.native
  // Create a new instance of AdWordsAccount
  def newAdWordsAccount(): AdWordsAccount = js.native
  // Create a new instance of AnalyticsDataimportDeleteUploadDataRequest
  def newAnalyticsDataimportDeleteUploadDataRequest(): AnalyticsDataimportDeleteUploadDataRequest = js.native
  // Create a new instance of CustomDimension
  def newCustomDimension(): CustomDimension = js.native
  // Create a new instance of CustomDimensionParentLink
  def newCustomDimensionParentLink(): CustomDimensionParentLink = js.native
  // Create a new instance of CustomMetric
  def newCustomMetric(): CustomMetric = js.native
  // Create a new instance of CustomMetricParentLink
  def newCustomMetricParentLink(): CustomMetricParentLink = js.native
  // Create a new instance of EntityAdWordsLink
  def newEntityAdWordsLink(): EntityAdWordsLink = js.native
  // Create a new instance of EntityAdWordsLinkEntity
  def newEntityAdWordsLinkEntity(): EntityAdWordsLinkEntity = js.native
  // Create a new instance of EntityUserLink
  def newEntityUserLink(): EntityUserLink = js.native
  // Create a new instance of EntityUserLinkEntity
  def newEntityUserLinkEntity(): EntityUserLinkEntity = js.native
  // Create a new instance of EntityUserLinkPermissions
  def newEntityUserLinkPermissions(): EntityUserLinkPermissions = js.native
  // Create a new instance of Experiment
  def newExperiment(): Experiment = js.native
  // Create a new instance of ExperimentParentLink
  def newExperimentParentLink(): ExperimentParentLink = js.native
  // Create a new instance of ExperimentVariations
  def newExperimentVariations(): ExperimentVariations = js.native
  // Create a new instance of Filter
  def newFilter(): Filter = js.native
  // Create a new instance of FilterAdvancedDetails
  def newFilterAdvancedDetails(): FilterAdvancedDetails = js.native
  // Create a new instance of FilterExpression
  def newFilterExpression(): FilterExpression = js.native
  // Create a new instance of FilterLowercaseDetails
  def newFilterLowercaseDetails(): FilterLowercaseDetails = js.native
  // Create a new instance of FilterParentLink
  def newFilterParentLink(): FilterParentLink = js.native
  // Create a new instance of FilterRef
  def newFilterRef(): FilterRef = js.native
  // Create a new instance of FilterSearchAndReplaceDetails
  def newFilterSearchAndReplaceDetails(): FilterSearchAndReplaceDetails = js.native
  // Create a new instance of FilterUppercaseDetails
  def newFilterUppercaseDetails(): FilterUppercaseDetails = js.native
  // Create a new instance of Goal
  def newGoal(): Goal = js.native
  // Create a new instance of GoalEventDetails
  def newGoalEventDetails(): GoalEventDetails = js.native
  // Create a new instance of GoalEventDetailsEventConditions
  def newGoalEventDetailsEventConditions(): GoalEventDetailsEventConditions = js.native
  // Create a new instance of GoalParentLink
  def newGoalParentLink(): GoalParentLink = js.native
  // Create a new instance of GoalUrlDestinationDetails
  def newGoalUrlDestinationDetails(): GoalUrlDestinationDetails = js.native
  // Create a new instance of GoalUrlDestinationDetailsSteps
  def newGoalUrlDestinationDetailsSteps(): GoalUrlDestinationDetailsSteps = js.native
  // Create a new instance of GoalVisitNumPagesDetails
  def newGoalVisitNumPagesDetails(): GoalVisitNumPagesDetails = js.native
  // Create a new instance of GoalVisitTimeOnSiteDetails
  def newGoalVisitTimeOnSiteDetails(): GoalVisitTimeOnSiteDetails = js.native
  // Create a new instance of HashClientIdRequest
  def newHashClientIdRequest(): HashClientIdRequest = js.native
  // Create a new instance of IncludeConditions
  def newIncludeConditions(): IncludeConditions = js.native
  // Create a new instance of LinkedForeignAccount
  def newLinkedForeignAccount(): LinkedForeignAccount = js.native
  // Create a new instance of Profile
  def newProfile(): Profile = js.native
  // Create a new instance of ProfileChildLink
  def newProfileChildLink(): ProfileChildLink = js.native
  // Create a new instance of ProfileFilterLink
  def newProfileFilterLink(): ProfileFilterLink = js.native
  // Create a new instance of ProfileParentLink
  def newProfileParentLink(): ProfileParentLink = js.native
  // Create a new instance of ProfilePermissions
  def newProfilePermissions(): ProfilePermissions = js.native
  // Create a new instance of ProfileRef
  def newProfileRef(): ProfileRef = js.native
  // Create a new instance of RemarketingAudience
  def newRemarketingAudience(): RemarketingAudience = js.native
  // Create a new instance of RemarketingAudienceAudienceDefinition
  def newRemarketingAudienceAudienceDefinition(): RemarketingAudienceAudienceDefinition = js.native
  // Create a new instance of RemarketingAudienceStateBasedAudienceDefinition
  def newRemarketingAudienceStateBasedAudienceDefinition(): RemarketingAudienceStateBasedAudienceDefinition = js.native
  // Create a new instance of RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions
  def newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions(): RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions = js.native
  // Create a new instance of UnsampledReport
  def newUnsampledReport(): UnsampledReport = js.native
  // Create a new instance of UnsampledReportCloudStorageDownloadDetails
  def newUnsampledReportCloudStorageDownloadDetails(): UnsampledReportCloudStorageDownloadDetails = js.native
  // Create a new instance of UnsampledReportDriveDownloadDetails
  def newUnsampledReportDriveDownloadDetails(): UnsampledReportDriveDownloadDetails = js.native
  // Create a new instance of UserDeletionRequest
  def newUserDeletionRequest(): UserDeletionRequest = js.native
  // Create a new instance of UserDeletionRequestId
  def newUserDeletionRequestId(): UserDeletionRequestId = js.native
  // Create a new instance of UserRef
  def newUserRef(): UserRef = js.native
  // Create a new instance of WebPropertyRef
  def newWebPropertyRef(): WebPropertyRef = js.native
  // Create a new instance of Webproperty
  def newWebproperty(): Webproperty = js.native
  // Create a new instance of WebpropertyChildLink
  def newWebpropertyChildLink(): WebpropertyChildLink = js.native
  // Create a new instance of WebpropertyParentLink
  def newWebpropertyParentLink(): WebpropertyParentLink = js.native
  // Create a new instance of WebpropertyPermissions
  def newWebpropertyPermissions(): WebpropertyPermissions = js.native
}

object Analytics_ {
  @scala.inline
  def apply(
    newAccount: () => Account,
    newAccountChildLink: () => AccountChildLink,
    newAccountPermissions: () => AccountPermissions,
    newAccountRef: () => AccountRef,
    newAccountTicket: () => AccountTicket,
    newAccountTreeRequest: () => AccountTreeRequest,
    newAdWordsAccount: () => AdWordsAccount,
    newAnalyticsDataimportDeleteUploadDataRequest: () => AnalyticsDataimportDeleteUploadDataRequest,
    newCustomDimension: () => CustomDimension,
    newCustomDimensionParentLink: () => CustomDimensionParentLink,
    newCustomMetric: () => CustomMetric,
    newCustomMetricParentLink: () => CustomMetricParentLink,
    newEntityAdWordsLink: () => EntityAdWordsLink,
    newEntityAdWordsLinkEntity: () => EntityAdWordsLinkEntity,
    newEntityUserLink: () => EntityUserLink,
    newEntityUserLinkEntity: () => EntityUserLinkEntity,
    newEntityUserLinkPermissions: () => EntityUserLinkPermissions,
    newExperiment: () => Experiment,
    newExperimentParentLink: () => ExperimentParentLink,
    newExperimentVariations: () => ExperimentVariations,
    newFilter: () => Filter,
    newFilterAdvancedDetails: () => FilterAdvancedDetails,
    newFilterExpression: () => FilterExpression,
    newFilterLowercaseDetails: () => FilterLowercaseDetails,
    newFilterParentLink: () => FilterParentLink,
    newFilterRef: () => FilterRef,
    newFilterSearchAndReplaceDetails: () => FilterSearchAndReplaceDetails,
    newFilterUppercaseDetails: () => FilterUppercaseDetails,
    newGoal: () => Goal,
    newGoalEventDetails: () => GoalEventDetails,
    newGoalEventDetailsEventConditions: () => GoalEventDetailsEventConditions,
    newGoalParentLink: () => GoalParentLink,
    newGoalUrlDestinationDetails: () => GoalUrlDestinationDetails,
    newGoalUrlDestinationDetailsSteps: () => GoalUrlDestinationDetailsSteps,
    newGoalVisitNumPagesDetails: () => GoalVisitNumPagesDetails,
    newGoalVisitTimeOnSiteDetails: () => GoalVisitTimeOnSiteDetails,
    newHashClientIdRequest: () => HashClientIdRequest,
    newIncludeConditions: () => IncludeConditions,
    newLinkedForeignAccount: () => LinkedForeignAccount,
    newProfile: () => Profile,
    newProfileChildLink: () => ProfileChildLink,
    newProfileFilterLink: () => ProfileFilterLink,
    newProfileParentLink: () => ProfileParentLink,
    newProfilePermissions: () => ProfilePermissions,
    newProfileRef: () => ProfileRef,
    newRemarketingAudience: () => RemarketingAudience,
    newRemarketingAudienceAudienceDefinition: () => RemarketingAudienceAudienceDefinition,
    newRemarketingAudienceStateBasedAudienceDefinition: () => RemarketingAudienceStateBasedAudienceDefinition,
    newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions: () => RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions,
    newUnsampledReport: () => UnsampledReport,
    newUnsampledReportCloudStorageDownloadDetails: () => UnsampledReportCloudStorageDownloadDetails,
    newUnsampledReportDriveDownloadDetails: () => UnsampledReportDriveDownloadDetails,
    newUserDeletionRequest: () => UserDeletionRequest,
    newUserDeletionRequestId: () => UserDeletionRequestId,
    newUserRef: () => UserRef,
    newWebPropertyRef: () => WebPropertyRef,
    newWebproperty: () => Webproperty,
    newWebpropertyChildLink: () => WebpropertyChildLink,
    newWebpropertyParentLink: () => WebpropertyParentLink,
    newWebpropertyPermissions: () => WebpropertyPermissions
  ): Analytics_ = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAccountChildLink = js.Any.fromFunction0(newAccountChildLink), newAccountPermissions = js.Any.fromFunction0(newAccountPermissions), newAccountRef = js.Any.fromFunction0(newAccountRef), newAccountTicket = js.Any.fromFunction0(newAccountTicket), newAccountTreeRequest = js.Any.fromFunction0(newAccountTreeRequest), newAdWordsAccount = js.Any.fromFunction0(newAdWordsAccount), newAnalyticsDataimportDeleteUploadDataRequest = js.Any.fromFunction0(newAnalyticsDataimportDeleteUploadDataRequest), newCustomDimension = js.Any.fromFunction0(newCustomDimension), newCustomDimensionParentLink = js.Any.fromFunction0(newCustomDimensionParentLink), newCustomMetric = js.Any.fromFunction0(newCustomMetric), newCustomMetricParentLink = js.Any.fromFunction0(newCustomMetricParentLink), newEntityAdWordsLink = js.Any.fromFunction0(newEntityAdWordsLink), newEntityAdWordsLinkEntity = js.Any.fromFunction0(newEntityAdWordsLinkEntity), newEntityUserLink = js.Any.fromFunction0(newEntityUserLink), newEntityUserLinkEntity = js.Any.fromFunction0(newEntityUserLinkEntity), newEntityUserLinkPermissions = js.Any.fromFunction0(newEntityUserLinkPermissions), newExperiment = js.Any.fromFunction0(newExperiment), newExperimentParentLink = js.Any.fromFunction0(newExperimentParentLink), newExperimentVariations = js.Any.fromFunction0(newExperimentVariations), newFilter = js.Any.fromFunction0(newFilter), newFilterAdvancedDetails = js.Any.fromFunction0(newFilterAdvancedDetails), newFilterExpression = js.Any.fromFunction0(newFilterExpression), newFilterLowercaseDetails = js.Any.fromFunction0(newFilterLowercaseDetails), newFilterParentLink = js.Any.fromFunction0(newFilterParentLink), newFilterRef = js.Any.fromFunction0(newFilterRef), newFilterSearchAndReplaceDetails = js.Any.fromFunction0(newFilterSearchAndReplaceDetails), newFilterUppercaseDetails = js.Any.fromFunction0(newFilterUppercaseDetails), newGoal = js.Any.fromFunction0(newGoal), newGoalEventDetails = js.Any.fromFunction0(newGoalEventDetails), newGoalEventDetailsEventConditions = js.Any.fromFunction0(newGoalEventDetailsEventConditions), newGoalParentLink = js.Any.fromFunction0(newGoalParentLink), newGoalUrlDestinationDetails = js.Any.fromFunction0(newGoalUrlDestinationDetails), newGoalUrlDestinationDetailsSteps = js.Any.fromFunction0(newGoalUrlDestinationDetailsSteps), newGoalVisitNumPagesDetails = js.Any.fromFunction0(newGoalVisitNumPagesDetails), newGoalVisitTimeOnSiteDetails = js.Any.fromFunction0(newGoalVisitTimeOnSiteDetails), newHashClientIdRequest = js.Any.fromFunction0(newHashClientIdRequest), newIncludeConditions = js.Any.fromFunction0(newIncludeConditions), newLinkedForeignAccount = js.Any.fromFunction0(newLinkedForeignAccount), newProfile = js.Any.fromFunction0(newProfile), newProfileChildLink = js.Any.fromFunction0(newProfileChildLink), newProfileFilterLink = js.Any.fromFunction0(newProfileFilterLink), newProfileParentLink = js.Any.fromFunction0(newProfileParentLink), newProfilePermissions = js.Any.fromFunction0(newProfilePermissions), newProfileRef = js.Any.fromFunction0(newProfileRef), newRemarketingAudience = js.Any.fromFunction0(newRemarketingAudience), newRemarketingAudienceAudienceDefinition = js.Any.fromFunction0(newRemarketingAudienceAudienceDefinition), newRemarketingAudienceStateBasedAudienceDefinition = js.Any.fromFunction0(newRemarketingAudienceStateBasedAudienceDefinition), newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions = js.Any.fromFunction0(newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions), newUnsampledReport = js.Any.fromFunction0(newUnsampledReport), newUnsampledReportCloudStorageDownloadDetails = js.Any.fromFunction0(newUnsampledReportCloudStorageDownloadDetails), newUnsampledReportDriveDownloadDetails = js.Any.fromFunction0(newUnsampledReportDriveDownloadDetails), newUserDeletionRequest = js.Any.fromFunction0(newUserDeletionRequest), newUserDeletionRequestId = js.Any.fromFunction0(newUserDeletionRequestId), newUserRef = js.Any.fromFunction0(newUserRef), newWebPropertyRef = js.Any.fromFunction0(newWebPropertyRef), newWebproperty = js.Any.fromFunction0(newWebproperty), newWebpropertyChildLink = js.Any.fromFunction0(newWebpropertyChildLink), newWebpropertyParentLink = js.Any.fromFunction0(newWebpropertyParentLink), newWebpropertyPermissions = js.Any.fromFunction0(newWebpropertyPermissions))
    __obj.asInstanceOf[Analytics_]
  }
  @scala.inline
  implicit class Analytics_Ops[Self <: Analytics_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAccount(value: () => Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountChildLink(value: () => AccountChildLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountChildLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountPermissions(value: () => AccountPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountPermissions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountRef(value: () => AccountRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountTicket(value: () => AccountTicket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountTicket")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountTreeRequest(value: () => AccountTreeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountTreeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAdWordsAccount(value: () => AdWordsAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAdWordsAccount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAnalyticsDataimportDeleteUploadDataRequest(value: () => AnalyticsDataimportDeleteUploadDataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAnalyticsDataimportDeleteUploadDataRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomDimension(value: () => CustomDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomDimension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomDimensionParentLink(value: () => CustomDimensionParentLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomDimensionParentLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomMetric(value: () => CustomMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomMetric")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomMetricParentLink(value: () => CustomMetricParentLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomMetricParentLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEntityAdWordsLink(value: () => EntityAdWordsLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEntityAdWordsLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEntityAdWordsLinkEntity(value: () => EntityAdWordsLinkEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEntityAdWordsLinkEntity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEntityUserLink(value: () => EntityUserLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEntityUserLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEntityUserLinkEntity(value: () => EntityUserLinkEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEntityUserLinkEntity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEntityUserLinkPermissions(value: () => EntityUserLinkPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEntityUserLinkPermissions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewExperiment(value: () => Experiment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExperiment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewExperimentParentLink(value: () => ExperimentParentLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExperimentParentLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewExperimentVariations(value: () => ExperimentVariations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExperimentVariations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilter(value: () => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterAdvancedDetails(value: () => FilterAdvancedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterAdvancedDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterExpression(value: () => FilterExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterExpression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterLowercaseDetails(value: () => FilterLowercaseDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterLowercaseDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterParentLink(value: () => FilterParentLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterParentLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterRef(value: () => FilterRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterSearchAndReplaceDetails(value: () => FilterSearchAndReplaceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterSearchAndReplaceDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterUppercaseDetails(value: () => FilterUppercaseDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterUppercaseDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGoal(value: () => Goal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGoal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGoalEventDetails(value: () => GoalEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGoalEventDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGoalEventDetailsEventConditions(value: () => GoalEventDetailsEventConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGoalEventDetailsEventConditions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGoalParentLink(value: () => GoalParentLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGoalParentLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGoalUrlDestinationDetails(value: () => GoalUrlDestinationDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGoalUrlDestinationDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGoalUrlDestinationDetailsSteps(value: () => GoalUrlDestinationDetailsSteps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGoalUrlDestinationDetailsSteps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGoalVisitNumPagesDetails(value: () => GoalVisitNumPagesDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGoalVisitNumPagesDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGoalVisitTimeOnSiteDetails(value: () => GoalVisitTimeOnSiteDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGoalVisitTimeOnSiteDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewHashClientIdRequest(value: () => HashClientIdRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHashClientIdRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewIncludeConditions(value: () => IncludeConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIncludeConditions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLinkedForeignAccount(value: () => LinkedForeignAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLinkedForeignAccount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProfile(value: () => Profile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProfile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProfileChildLink(value: () => ProfileChildLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProfileChildLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProfileFilterLink(value: () => ProfileFilterLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProfileFilterLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProfileParentLink(value: () => ProfileParentLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProfileParentLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProfilePermissions(value: () => ProfilePermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProfilePermissions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProfileRef(value: () => ProfileRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProfileRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRemarketingAudience(value: () => RemarketingAudience): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRemarketingAudience")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRemarketingAudienceAudienceDefinition(value: () => RemarketingAudienceAudienceDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRemarketingAudienceAudienceDefinition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRemarketingAudienceStateBasedAudienceDefinition(value: () => RemarketingAudienceStateBasedAudienceDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRemarketingAudienceStateBasedAudienceDefinition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions(value: () => RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRemarketingAudienceStateBasedAudienceDefinitionExcludeConditions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUnsampledReport(value: () => UnsampledReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUnsampledReport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUnsampledReportCloudStorageDownloadDetails(value: () => UnsampledReportCloudStorageDownloadDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUnsampledReportCloudStorageDownloadDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUnsampledReportDriveDownloadDetails(value: () => UnsampledReportDriveDownloadDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUnsampledReportDriveDownloadDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserDeletionRequest(value: () => UserDeletionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserDeletionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserDeletionRequestId(value: () => UserDeletionRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserDeletionRequestId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserRef(value: () => UserRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWebPropertyRef(value: () => WebPropertyRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWebPropertyRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWebproperty(value: () => Webproperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWebproperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWebpropertyChildLink(value: () => WebpropertyChildLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWebpropertyChildLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWebpropertyParentLink(value: () => WebpropertyParentLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWebpropertyParentLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWebpropertyPermissions(value: () => WebpropertyPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWebpropertyPermissions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: DataCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(js.undefined)
        ret
    }
    @scala.inline
    def withManagement(value: ManagementCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Management")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Management")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioning(value: ProvisioningCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provisioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provisioning")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDeletion(value: UserDeletionCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDeletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDeletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDeletion")(js.undefined)
        ret
    }
  }
  
}

