package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetLabelsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetMatchPolicyCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetRelationshipsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetSearchCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetSharesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.AssetsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.CampaignsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ClaimHistoryCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ClaimSearchCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ClaimsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ContentOwnerAdvertisingOptionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ContentOwnersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.LiveCuepointsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.MetadataHistoryCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.OrdersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.OwnershipCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.OwnershipHistoryCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.PackageCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.PoliciesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.PublishersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ReferenceConflictsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ReferencesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.SpreadsheetTemplateCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.UploaderCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.ValidatorCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.VideoAdvertisingOptionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection.WhitelistsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AdBreak
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AdSlot
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AllowedAdvertisingOptions
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Asset
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetLabel
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetMatchPolicy
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.AssetRelationship
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Campaign
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.CampaignData
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.CampaignSource
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.CampaignTargetLink
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Claim
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimMatchInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimMatchInfoLongestMatch
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimMatchInfoTotalMatch
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimOrigin
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ClaimedVideoDefaults
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Conditions
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ConflictingOwnership
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ContentOwnerAdvertisingOption
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.CuepointSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Date
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.DateRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ExcludedInterval
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.IntervalCondition
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.LiveCuepoint
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.MatchSegment
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Metadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Order
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Origination
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.OwnershipConflicts
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Package
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Policy
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.PolicyRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.PromotedContent
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Rating
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Reference
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Requirements
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.RightsOwnership
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Segment
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ShowDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.StateCompleted
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.StatusReport
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.TerritoryCondition
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.TerritoryConflicts
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.TerritoryOwners
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateAsyncRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ValidateStatusRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.VideoAdvertisingOption
import typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Whitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YoutubePartner_ extends js.Object {
  var AssetLabels: js.UndefOr[AssetLabelsCollection] = js.native
  var AssetMatchPolicy: js.UndefOr[AssetMatchPolicyCollection] = js.native
  var AssetRelationships: js.UndefOr[AssetRelationshipsCollection] = js.native
  var AssetSearch: js.UndefOr[AssetSearchCollection] = js.native
  var AssetShares: js.UndefOr[AssetSharesCollection] = js.native
  var Assets: js.UndefOr[AssetsCollection] = js.native
  var Campaigns: js.UndefOr[CampaignsCollection] = js.native
  var ClaimHistory: js.UndefOr[ClaimHistoryCollection] = js.native
  var ClaimSearch: js.UndefOr[ClaimSearchCollection] = js.native
  var Claims: js.UndefOr[ClaimsCollection] = js.native
  var ContentOwnerAdvertisingOptions: js.UndefOr[ContentOwnerAdvertisingOptionsCollection] = js.native
  var ContentOwners: js.UndefOr[ContentOwnersCollection] = js.native
  var LiveCuepoints: js.UndefOr[LiveCuepointsCollection] = js.native
  var MetadataHistory: js.UndefOr[MetadataHistoryCollection] = js.native
  var Orders: js.UndefOr[OrdersCollection] = js.native
  var Ownership: js.UndefOr[OwnershipCollection] = js.native
  var OwnershipHistory: js.UndefOr[OwnershipHistoryCollection] = js.native
  var Package: js.UndefOr[PackageCollection] = js.native
  var Policies: js.UndefOr[PoliciesCollection] = js.native
  var Publishers: js.UndefOr[PublishersCollection] = js.native
  var ReferenceConflicts: js.UndefOr[ReferenceConflictsCollection] = js.native
  var References: js.UndefOr[ReferencesCollection] = js.native
  var SpreadsheetTemplate: js.UndefOr[SpreadsheetTemplateCollection] = js.native
  var Uploader: js.UndefOr[UploaderCollection] = js.native
  var Validator: js.UndefOr[ValidatorCollection] = js.native
  var VideoAdvertisingOptions: js.UndefOr[VideoAdvertisingOptionsCollection] = js.native
  var Whitelists: js.UndefOr[WhitelistsCollection] = js.native
  // Create a new instance of AdBreak
  def newAdBreak(): AdBreak = js.native
  // Create a new instance of AdSlot
  def newAdSlot(): AdSlot = js.native
  // Create a new instance of AllowedAdvertisingOptions
  def newAllowedAdvertisingOptions(): AllowedAdvertisingOptions = js.native
  // Create a new instance of Asset
  def newAsset(): Asset = js.native
  // Create a new instance of AssetLabel
  def newAssetLabel(): AssetLabel = js.native
  // Create a new instance of AssetMatchPolicy
  def newAssetMatchPolicy(): AssetMatchPolicy = js.native
  // Create a new instance of AssetRelationship
  def newAssetRelationship(): AssetRelationship = js.native
  // Create a new instance of Campaign
  def newCampaign(): Campaign = js.native
  // Create a new instance of CampaignData
  def newCampaignData(): CampaignData = js.native
  // Create a new instance of CampaignSource
  def newCampaignSource(): CampaignSource = js.native
  // Create a new instance of CampaignTargetLink
  def newCampaignTargetLink(): CampaignTargetLink = js.native
  // Create a new instance of Claim
  def newClaim(): Claim = js.native
  // Create a new instance of ClaimMatchInfo
  def newClaimMatchInfo(): ClaimMatchInfo = js.native
  // Create a new instance of ClaimMatchInfoLongestMatch
  def newClaimMatchInfoLongestMatch(): ClaimMatchInfoLongestMatch = js.native
  // Create a new instance of ClaimMatchInfoTotalMatch
  def newClaimMatchInfoTotalMatch(): ClaimMatchInfoTotalMatch = js.native
  // Create a new instance of ClaimOrigin
  def newClaimOrigin(): ClaimOrigin = js.native
  // Create a new instance of ClaimedVideoDefaults
  def newClaimedVideoDefaults(): ClaimedVideoDefaults = js.native
  // Create a new instance of Conditions
  def newConditions(): Conditions = js.native
  // Create a new instance of ConflictingOwnership
  def newConflictingOwnership(): ConflictingOwnership = js.native
  // Create a new instance of ContentOwnerAdvertisingOption
  def newContentOwnerAdvertisingOption(): ContentOwnerAdvertisingOption = js.native
  // Create a new instance of CuepointSettings
  def newCuepointSettings(): CuepointSettings = js.native
  // Create a new instance of Date
  def newDate(): Date = js.native
  // Create a new instance of DateRange
  def newDateRange(): DateRange = js.native
  // Create a new instance of ExcludedInterval
  def newExcludedInterval(): ExcludedInterval = js.native
  // Create a new instance of IntervalCondition
  def newIntervalCondition(): IntervalCondition = js.native
  // Create a new instance of LiveCuepoint
  def newLiveCuepoint(): LiveCuepoint = js.native
  // Create a new instance of MatchSegment
  def newMatchSegment(): MatchSegment = js.native
  // Create a new instance of Metadata
  def newMetadata(): Metadata = js.native
  // Create a new instance of Order
  def newOrder(): Order = js.native
  // Create a new instance of Origination
  def newOrigination(): Origination = js.native
  // Create a new instance of OwnershipConflicts
  def newOwnershipConflicts(): OwnershipConflicts = js.native
  // Create a new instance of Package
  def newPackage(): Package = js.native
  // Create a new instance of Policy
  def newPolicy(): Policy = js.native
  // Create a new instance of PolicyRule
  def newPolicyRule(): PolicyRule = js.native
  // Create a new instance of PromotedContent
  def newPromotedContent(): PromotedContent = js.native
  // Create a new instance of Rating
  def newRating(): Rating = js.native
  // Create a new instance of Reference
  def newReference(): Reference = js.native
  // Create a new instance of Requirements
  def newRequirements(): Requirements = js.native
  // Create a new instance of RightsOwnership
  def newRightsOwnership(): RightsOwnership = js.native
  // Create a new instance of Segment
  def newSegment(): Segment = js.native
  // Create a new instance of ShowDetails
  def newShowDetails(): ShowDetails = js.native
  // Create a new instance of StateCompleted
  def newStateCompleted(): StateCompleted = js.native
  // Create a new instance of StatusReport
  def newStatusReport(): StatusReport = js.native
  // Create a new instance of TerritoryCondition
  def newTerritoryCondition(): TerritoryCondition = js.native
  // Create a new instance of TerritoryConflicts
  def newTerritoryConflicts(): TerritoryConflicts = js.native
  // Create a new instance of TerritoryOwners
  def newTerritoryOwners(): TerritoryOwners = js.native
  // Create a new instance of ValidateAsyncRequest
  def newValidateAsyncRequest(): ValidateAsyncRequest = js.native
  // Create a new instance of ValidateRequest
  def newValidateRequest(): ValidateRequest = js.native
  // Create a new instance of ValidateStatusRequest
  def newValidateStatusRequest(): ValidateStatusRequest = js.native
  // Create a new instance of VideoAdvertisingOption
  def newVideoAdvertisingOption(): VideoAdvertisingOption = js.native
  // Create a new instance of Whitelist
  def newWhitelist(): Whitelist = js.native
}

object YoutubePartner_ {
  @scala.inline
  def apply(
    newAdBreak: () => AdBreak,
    newAdSlot: () => AdSlot,
    newAllowedAdvertisingOptions: () => AllowedAdvertisingOptions,
    newAsset: () => Asset,
    newAssetLabel: () => AssetLabel,
    newAssetMatchPolicy: () => AssetMatchPolicy,
    newAssetRelationship: () => AssetRelationship,
    newCampaign: () => Campaign,
    newCampaignData: () => CampaignData,
    newCampaignSource: () => CampaignSource,
    newCampaignTargetLink: () => CampaignTargetLink,
    newClaim: () => Claim,
    newClaimMatchInfo: () => ClaimMatchInfo,
    newClaimMatchInfoLongestMatch: () => ClaimMatchInfoLongestMatch,
    newClaimMatchInfoTotalMatch: () => ClaimMatchInfoTotalMatch,
    newClaimOrigin: () => ClaimOrigin,
    newClaimedVideoDefaults: () => ClaimedVideoDefaults,
    newConditions: () => Conditions,
    newConflictingOwnership: () => ConflictingOwnership,
    newContentOwnerAdvertisingOption: () => ContentOwnerAdvertisingOption,
    newCuepointSettings: () => CuepointSettings,
    newDate: () => Date,
    newDateRange: () => DateRange,
    newExcludedInterval: () => ExcludedInterval,
    newIntervalCondition: () => IntervalCondition,
    newLiveCuepoint: () => LiveCuepoint,
    newMatchSegment: () => MatchSegment,
    newMetadata: () => Metadata,
    newOrder: () => Order,
    newOrigination: () => Origination,
    newOwnershipConflicts: () => OwnershipConflicts,
    newPackage: () => Package,
    newPolicy: () => Policy,
    newPolicyRule: () => PolicyRule,
    newPromotedContent: () => PromotedContent,
    newRating: () => Rating,
    newReference: () => Reference,
    newRequirements: () => Requirements,
    newRightsOwnership: () => RightsOwnership,
    newSegment: () => Segment,
    newShowDetails: () => ShowDetails,
    newStateCompleted: () => StateCompleted,
    newStatusReport: () => StatusReport,
    newTerritoryCondition: () => TerritoryCondition,
    newTerritoryConflicts: () => TerritoryConflicts,
    newTerritoryOwners: () => TerritoryOwners,
    newValidateAsyncRequest: () => ValidateAsyncRequest,
    newValidateRequest: () => ValidateRequest,
    newValidateStatusRequest: () => ValidateStatusRequest,
    newVideoAdvertisingOption: () => VideoAdvertisingOption,
    newWhitelist: () => Whitelist
  ): YoutubePartner_ = {
    val __obj = js.Dynamic.literal(newAdBreak = js.Any.fromFunction0(newAdBreak), newAdSlot = js.Any.fromFunction0(newAdSlot), newAllowedAdvertisingOptions = js.Any.fromFunction0(newAllowedAdvertisingOptions), newAsset = js.Any.fromFunction0(newAsset), newAssetLabel = js.Any.fromFunction0(newAssetLabel), newAssetMatchPolicy = js.Any.fromFunction0(newAssetMatchPolicy), newAssetRelationship = js.Any.fromFunction0(newAssetRelationship), newCampaign = js.Any.fromFunction0(newCampaign), newCampaignData = js.Any.fromFunction0(newCampaignData), newCampaignSource = js.Any.fromFunction0(newCampaignSource), newCampaignTargetLink = js.Any.fromFunction0(newCampaignTargetLink), newClaim = js.Any.fromFunction0(newClaim), newClaimMatchInfo = js.Any.fromFunction0(newClaimMatchInfo), newClaimMatchInfoLongestMatch = js.Any.fromFunction0(newClaimMatchInfoLongestMatch), newClaimMatchInfoTotalMatch = js.Any.fromFunction0(newClaimMatchInfoTotalMatch), newClaimOrigin = js.Any.fromFunction0(newClaimOrigin), newClaimedVideoDefaults = js.Any.fromFunction0(newClaimedVideoDefaults), newConditions = js.Any.fromFunction0(newConditions), newConflictingOwnership = js.Any.fromFunction0(newConflictingOwnership), newContentOwnerAdvertisingOption = js.Any.fromFunction0(newContentOwnerAdvertisingOption), newCuepointSettings = js.Any.fromFunction0(newCuepointSettings), newDate = js.Any.fromFunction0(newDate), newDateRange = js.Any.fromFunction0(newDateRange), newExcludedInterval = js.Any.fromFunction0(newExcludedInterval), newIntervalCondition = js.Any.fromFunction0(newIntervalCondition), newLiveCuepoint = js.Any.fromFunction0(newLiveCuepoint), newMatchSegment = js.Any.fromFunction0(newMatchSegment), newMetadata = js.Any.fromFunction0(newMetadata), newOrder = js.Any.fromFunction0(newOrder), newOrigination = js.Any.fromFunction0(newOrigination), newOwnershipConflicts = js.Any.fromFunction0(newOwnershipConflicts), newPackage = js.Any.fromFunction0(newPackage), newPolicy = js.Any.fromFunction0(newPolicy), newPolicyRule = js.Any.fromFunction0(newPolicyRule), newPromotedContent = js.Any.fromFunction0(newPromotedContent), newRating = js.Any.fromFunction0(newRating), newReference = js.Any.fromFunction0(newReference), newRequirements = js.Any.fromFunction0(newRequirements), newRightsOwnership = js.Any.fromFunction0(newRightsOwnership), newSegment = js.Any.fromFunction0(newSegment), newShowDetails = js.Any.fromFunction0(newShowDetails), newStateCompleted = js.Any.fromFunction0(newStateCompleted), newStatusReport = js.Any.fromFunction0(newStatusReport), newTerritoryCondition = js.Any.fromFunction0(newTerritoryCondition), newTerritoryConflicts = js.Any.fromFunction0(newTerritoryConflicts), newTerritoryOwners = js.Any.fromFunction0(newTerritoryOwners), newValidateAsyncRequest = js.Any.fromFunction0(newValidateAsyncRequest), newValidateRequest = js.Any.fromFunction0(newValidateRequest), newValidateStatusRequest = js.Any.fromFunction0(newValidateStatusRequest), newVideoAdvertisingOption = js.Any.fromFunction0(newVideoAdvertisingOption), newWhitelist = js.Any.fromFunction0(newWhitelist))
    __obj.asInstanceOf[YoutubePartner_]
  }
  @scala.inline
  implicit class YoutubePartner_Ops[Self <: YoutubePartner_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAdBreak(value: () => AdBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAdBreak")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAdSlot(value: () => AdSlot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAdSlot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAllowedAdvertisingOptions(value: () => AllowedAdvertisingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAllowedAdvertisingOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAsset(value: () => Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAsset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAssetLabel(value: () => AssetLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAssetLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAssetMatchPolicy(value: () => AssetMatchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAssetMatchPolicy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAssetRelationship(value: () => AssetRelationship): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAssetRelationship")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCampaign(value: () => Campaign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCampaign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCampaignData(value: () => CampaignData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCampaignData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCampaignSource(value: () => CampaignSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCampaignSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCampaignTargetLink(value: () => CampaignTargetLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCampaignTargetLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewClaim(value: () => Claim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClaim")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewClaimMatchInfo(value: () => ClaimMatchInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClaimMatchInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewClaimMatchInfoLongestMatch(value: () => ClaimMatchInfoLongestMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClaimMatchInfoLongestMatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewClaimMatchInfoTotalMatch(value: () => ClaimMatchInfoTotalMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClaimMatchInfoTotalMatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewClaimOrigin(value: () => ClaimOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClaimOrigin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewClaimedVideoDefaults(value: () => ClaimedVideoDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClaimedVideoDefaults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConditions(value: () => Conditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConditions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConflictingOwnership(value: () => ConflictingOwnership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConflictingOwnership")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewContentOwnerAdvertisingOption(value: () => ContentOwnerAdvertisingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newContentOwnerAdvertisingOption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCuepointSettings(value: () => CuepointSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCuepointSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDate(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDateRange(value: () => DateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDateRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewExcludedInterval(value: () => ExcludedInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExcludedInterval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewIntervalCondition(value: () => IntervalCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIntervalCondition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveCuepoint(value: () => LiveCuepoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveCuepoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMatchSegment(value: () => MatchSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMatchSegment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMetadata(value: () => Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrder(value: () => Order): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrigination(value: () => Origination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrigination")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOwnershipConflicts(value: () => OwnershipConflicts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOwnershipConflicts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPackage(value: () => Package): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPackage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPolicy(value: () => Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPolicy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPolicyRule(value: () => PolicyRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPolicyRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPromotedContent(value: () => PromotedContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPromotedContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRating(value: () => Rating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReference(value: () => Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRequirements(value: () => Requirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRequirements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRightsOwnership(value: () => RightsOwnership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRightsOwnership")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSegment(value: () => Segment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSegment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShowDetails(value: () => ShowDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShowDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStateCompleted(value: () => StateCompleted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStateCompleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStatusReport(value: () => StatusReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStatusReport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTerritoryCondition(value: () => TerritoryCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTerritoryCondition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTerritoryConflicts(value: () => TerritoryConflicts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTerritoryConflicts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTerritoryOwners(value: () => TerritoryOwners): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTerritoryOwners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewValidateAsyncRequest(value: () => ValidateAsyncRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValidateAsyncRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewValidateRequest(value: () => ValidateRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValidateRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewValidateStatusRequest(value: () => ValidateStatusRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValidateStatusRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoAdvertisingOption(value: () => VideoAdvertisingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoAdvertisingOption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWhitelist(value: () => Whitelist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWhitelist")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAssetLabels(value: AssetLabelsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetMatchPolicy(value: AssetMatchPolicyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetMatchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetMatchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetMatchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetRelationships(value: AssetRelationshipsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetRelationships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetRelationships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetRelationships")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetSearch(value: AssetSearchCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetShares(value: AssetSharesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetShares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetShares: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetShares")(js.undefined)
        ret
    }
    @scala.inline
    def withAssets(value: AssetsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assets")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaigns(value: CampaignsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Campaigns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaigns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Campaigns")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimHistory(value: ClaimHistoryCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClaimHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClaimHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimSearch(value: ClaimSearchCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClaimSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClaimSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withClaims(value: ClaimsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Claims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Claims")(js.undefined)
        ret
    }
    @scala.inline
    def withContentOwnerAdvertisingOptions(value: ContentOwnerAdvertisingOptionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentOwnerAdvertisingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOwnerAdvertisingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentOwnerAdvertisingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withContentOwners(value: ContentOwnersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentOwners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentOwners")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveCuepoints(value: LiveCuepointsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveCuepoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveCuepoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveCuepoints")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataHistory(value: MetadataHistoryCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withOrders(value: OrdersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orders")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnership(value: OwnershipCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ownership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ownership")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnershipHistory(value: OwnershipHistoryCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnershipHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnershipHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnershipHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withPackage(value: PackageCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Package")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicies(value: PoliciesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishers(value: PublishersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Publishers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Publishers")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceConflicts(value: ReferenceConflictsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceConflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceConflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceConflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withReferences(value: ReferencesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("References")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("References")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadsheetTemplate(value: SpreadsheetTemplateCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadsheetTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadsheetTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpreadsheetTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUploader(value: UploaderCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uploader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uploader")(js.undefined)
        ret
    }
    @scala.inline
    def withValidator(value: ValidatorCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validator")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoAdvertisingOptions(value: VideoAdvertisingOptionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoAdvertisingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoAdvertisingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoAdvertisingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelists(value: WhitelistsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Whitelists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Whitelists")(js.undefined)
        ret
    }
  }
  
}

