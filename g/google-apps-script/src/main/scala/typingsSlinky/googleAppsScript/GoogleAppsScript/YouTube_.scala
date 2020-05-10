package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.ActivitiesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.CaptionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.ChannelBannersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.ChannelSectionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.ChannelsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.CommentThreadsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.CommentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.GuideCategoriesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.I18nLanguagesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.I18nRegionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveBroadcastsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveChatBansCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveChatMessagesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveChatModeratorsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.LiveStreamsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.PlaylistItemsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.PlaylistsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.SearchCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.SponsorsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.SubscriptionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.SuperChatEventsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.ThumbnailsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.VideoAbuseReportReasonsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.VideoCategoriesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.VideosCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Collection.WatermarksCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.AccessPolicy
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.Activity
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsBulletin
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsChannelItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsComment
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsFavorite
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsLike
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsPlaylistItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsPromotedItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsRecommendation
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsSocial
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsSubscription
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivityContentDetailsUpload
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ActivitySnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.Caption
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.CaptionSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.CdnSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.Channel
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelAuditDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelBannerResource
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelBrandingSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelContentDetailsRelatedPlaylists
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelContentOwnerDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelConversionPing
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelConversionPings
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelLocalization
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelProfileDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSection
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionLocalization
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSectionTargeting
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelStatistics
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelTopicDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.Comment
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentThread
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentThreadReplies
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.CommentThreadSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ContentRating
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.GeoPoint
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ImageSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.IngestionInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.InvideoBranding
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.InvideoPosition
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.InvideoPromotion
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.InvideoTiming
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LanguageTag
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcast
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastStatistics
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveBroadcastStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatBan
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatBanSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatFanFundingEventDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessage
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageAuthorDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageDeletedDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageRetractedDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatMessageSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatModerator
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatModeratorSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollClosedDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollEditedDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollOpenedDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatPollVotedDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatSuperChatDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatSuperStickerDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatTextMessageDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatUserBannedMessageDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStream
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamConfigurationIssue
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamHealthStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveStreamStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LocalizedProperty
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.LocalizedString
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.MonitorStreamInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.Playlist
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItemContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItemSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItemStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistLocalization
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistPlayer
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PromotedItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PromotedItemId
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.PropertyValue
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ResourceId
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.Subscription
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.SubscriptionContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.SubscriptionSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.SubscriptionSubscriberSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.SuperStickerMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.Thumbnail
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.ThumbnailDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.Video
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoAbuseReport
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoAgeGating
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoContentDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoContentDetailsRegionRestriction
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoFileDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoFileDetailsAudioStream
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoFileDetailsVideoStream
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoLiveStreamingDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoLocalization
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoMonetizationDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoPlayer
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoProcessingDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoProcessingDetailsProcessingProgress
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoProjectDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoRecordingDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoSnippet
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoStatistics
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoSuggestions
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoSuggestionsTagSuggestion
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoTopicDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema.WatchSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YouTube_ extends js.Object {
  var Activities: js.UndefOr[ActivitiesCollection] = js.native
  var Captions: js.UndefOr[CaptionsCollection] = js.native
  var ChannelBanners: js.UndefOr[ChannelBannersCollection] = js.native
  var ChannelSections: js.UndefOr[ChannelSectionsCollection] = js.native
  var Channels: js.UndefOr[ChannelsCollection] = js.native
  var CommentThreads: js.UndefOr[CommentThreadsCollection] = js.native
  var Comments: js.UndefOr[CommentsCollection] = js.native
  var GuideCategories: js.UndefOr[GuideCategoriesCollection] = js.native
  var I18nLanguages: js.UndefOr[I18nLanguagesCollection] = js.native
  var I18nRegions: js.UndefOr[I18nRegionsCollection] = js.native
  var LiveBroadcasts: js.UndefOr[LiveBroadcastsCollection] = js.native
  var LiveChatBans: js.UndefOr[LiveChatBansCollection] = js.native
  var LiveChatMessages: js.UndefOr[LiveChatMessagesCollection] = js.native
  var LiveChatModerators: js.UndefOr[LiveChatModeratorsCollection] = js.native
  var LiveStreams: js.UndefOr[LiveStreamsCollection] = js.native
  var PlaylistItems: js.UndefOr[PlaylistItemsCollection] = js.native
  var Playlists: js.UndefOr[PlaylistsCollection] = js.native
  var Search: js.UndefOr[SearchCollection] = js.native
  var Sponsors: js.UndefOr[SponsorsCollection] = js.native
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.native
  var SuperChatEvents: js.UndefOr[SuperChatEventsCollection] = js.native
  var Thumbnails: js.UndefOr[ThumbnailsCollection] = js.native
  var VideoAbuseReportReasons: js.UndefOr[VideoAbuseReportReasonsCollection] = js.native
  var VideoCategories: js.UndefOr[VideoCategoriesCollection] = js.native
  var Videos: js.UndefOr[VideosCollection] = js.native
  var Watermarks: js.UndefOr[WatermarksCollection] = js.native
  // Create a new instance of AccessPolicy
  def newAccessPolicy(): AccessPolicy = js.native
  // Create a new instance of Activity
  def newActivity(): Activity = js.native
  // Create a new instance of ActivityContentDetails
  def newActivityContentDetails(): ActivityContentDetails = js.native
  // Create a new instance of ActivityContentDetailsBulletin
  def newActivityContentDetailsBulletin(): ActivityContentDetailsBulletin = js.native
  // Create a new instance of ActivityContentDetailsChannelItem
  def newActivityContentDetailsChannelItem(): ActivityContentDetailsChannelItem = js.native
  // Create a new instance of ActivityContentDetailsComment
  def newActivityContentDetailsComment(): ActivityContentDetailsComment = js.native
  // Create a new instance of ActivityContentDetailsFavorite
  def newActivityContentDetailsFavorite(): ActivityContentDetailsFavorite = js.native
  // Create a new instance of ActivityContentDetailsLike
  def newActivityContentDetailsLike(): ActivityContentDetailsLike = js.native
  // Create a new instance of ActivityContentDetailsPlaylistItem
  def newActivityContentDetailsPlaylistItem(): ActivityContentDetailsPlaylistItem = js.native
  // Create a new instance of ActivityContentDetailsPromotedItem
  def newActivityContentDetailsPromotedItem(): ActivityContentDetailsPromotedItem = js.native
  // Create a new instance of ActivityContentDetailsRecommendation
  def newActivityContentDetailsRecommendation(): ActivityContentDetailsRecommendation = js.native
  // Create a new instance of ActivityContentDetailsSocial
  def newActivityContentDetailsSocial(): ActivityContentDetailsSocial = js.native
  // Create a new instance of ActivityContentDetailsSubscription
  def newActivityContentDetailsSubscription(): ActivityContentDetailsSubscription = js.native
  // Create a new instance of ActivityContentDetailsUpload
  def newActivityContentDetailsUpload(): ActivityContentDetailsUpload = js.native
  // Create a new instance of ActivitySnippet
  def newActivitySnippet(): ActivitySnippet = js.native
  // Create a new instance of Caption
  def newCaption(): Caption = js.native
  // Create a new instance of CaptionSnippet
  def newCaptionSnippet(): CaptionSnippet = js.native
  // Create a new instance of CdnSettings
  def newCdnSettings(): CdnSettings = js.native
  // Create a new instance of Channel
  def newChannel(): Channel = js.native
  // Create a new instance of ChannelAuditDetails
  def newChannelAuditDetails(): ChannelAuditDetails = js.native
  // Create a new instance of ChannelBannerResource
  def newChannelBannerResource(): ChannelBannerResource = js.native
  // Create a new instance of ChannelBrandingSettings
  def newChannelBrandingSettings(): ChannelBrandingSettings = js.native
  // Create a new instance of ChannelContentDetails
  def newChannelContentDetails(): ChannelContentDetails = js.native
  // Create a new instance of ChannelContentDetailsRelatedPlaylists
  def newChannelContentDetailsRelatedPlaylists(): ChannelContentDetailsRelatedPlaylists = js.native
  // Create a new instance of ChannelContentOwnerDetails
  def newChannelContentOwnerDetails(): ChannelContentOwnerDetails = js.native
  // Create a new instance of ChannelConversionPing
  def newChannelConversionPing(): ChannelConversionPing = js.native
  // Create a new instance of ChannelConversionPings
  def newChannelConversionPings(): ChannelConversionPings = js.native
  // Create a new instance of ChannelLocalization
  def newChannelLocalization(): ChannelLocalization = js.native
  // Create a new instance of ChannelProfileDetails
  def newChannelProfileDetails(): ChannelProfileDetails = js.native
  // Create a new instance of ChannelSection
  def newChannelSection(): ChannelSection = js.native
  // Create a new instance of ChannelSectionContentDetails
  def newChannelSectionContentDetails(): ChannelSectionContentDetails = js.native
  // Create a new instance of ChannelSectionLocalization
  def newChannelSectionLocalization(): ChannelSectionLocalization = js.native
  // Create a new instance of ChannelSectionSnippet
  def newChannelSectionSnippet(): ChannelSectionSnippet = js.native
  // Create a new instance of ChannelSectionTargeting
  def newChannelSectionTargeting(): ChannelSectionTargeting = js.native
  // Create a new instance of ChannelSettings
  def newChannelSettings(): ChannelSettings = js.native
  // Create a new instance of ChannelSnippet
  def newChannelSnippet(): ChannelSnippet = js.native
  // Create a new instance of ChannelStatistics
  def newChannelStatistics(): ChannelStatistics = js.native
  // Create a new instance of ChannelStatus
  def newChannelStatus(): ChannelStatus = js.native
  // Create a new instance of ChannelTopicDetails
  def newChannelTopicDetails(): ChannelTopicDetails = js.native
  // Create a new instance of Comment
  def newComment(): Comment = js.native
  // Create a new instance of CommentSnippet
  def newCommentSnippet(): CommentSnippet = js.native
  // Create a new instance of CommentThread
  def newCommentThread(): CommentThread = js.native
  // Create a new instance of CommentThreadReplies
  def newCommentThreadReplies(): CommentThreadReplies = js.native
  // Create a new instance of CommentThreadSnippet
  def newCommentThreadSnippet(): CommentThreadSnippet = js.native
  // Create a new instance of ContentRating
  def newContentRating(): ContentRating = js.native
  // Create a new instance of GeoPoint
  def newGeoPoint(): GeoPoint = js.native
  // Create a new instance of ImageSettings
  def newImageSettings(): ImageSettings = js.native
  // Create a new instance of IngestionInfo
  def newIngestionInfo(): IngestionInfo = js.native
  // Create a new instance of InvideoBranding
  def newInvideoBranding(): InvideoBranding = js.native
  // Create a new instance of InvideoPosition
  def newInvideoPosition(): InvideoPosition = js.native
  // Create a new instance of InvideoPromotion
  def newInvideoPromotion(): InvideoPromotion = js.native
  // Create a new instance of InvideoTiming
  def newInvideoTiming(): InvideoTiming = js.native
  // Create a new instance of LanguageTag
  def newLanguageTag(): LanguageTag = js.native
  // Create a new instance of LiveBroadcast
  def newLiveBroadcast(): LiveBroadcast = js.native
  // Create a new instance of LiveBroadcastContentDetails
  def newLiveBroadcastContentDetails(): LiveBroadcastContentDetails = js.native
  // Create a new instance of LiveBroadcastSnippet
  def newLiveBroadcastSnippet(): LiveBroadcastSnippet = js.native
  // Create a new instance of LiveBroadcastStatistics
  def newLiveBroadcastStatistics(): LiveBroadcastStatistics = js.native
  // Create a new instance of LiveBroadcastStatus
  def newLiveBroadcastStatus(): LiveBroadcastStatus = js.native
  // Create a new instance of LiveChatBan
  def newLiveChatBan(): LiveChatBan = js.native
  // Create a new instance of LiveChatBanSnippet
  def newLiveChatBanSnippet(): LiveChatBanSnippet = js.native
  // Create a new instance of LiveChatFanFundingEventDetails
  def newLiveChatFanFundingEventDetails(): LiveChatFanFundingEventDetails = js.native
  // Create a new instance of LiveChatMessage
  def newLiveChatMessage(): LiveChatMessage = js.native
  // Create a new instance of LiveChatMessageAuthorDetails
  def newLiveChatMessageAuthorDetails(): LiveChatMessageAuthorDetails = js.native
  // Create a new instance of LiveChatMessageDeletedDetails
  def newLiveChatMessageDeletedDetails(): LiveChatMessageDeletedDetails = js.native
  // Create a new instance of LiveChatMessageRetractedDetails
  def newLiveChatMessageRetractedDetails(): LiveChatMessageRetractedDetails = js.native
  // Create a new instance of LiveChatMessageSnippet
  def newLiveChatMessageSnippet(): LiveChatMessageSnippet = js.native
  // Create a new instance of LiveChatModerator
  def newLiveChatModerator(): LiveChatModerator = js.native
  // Create a new instance of LiveChatModeratorSnippet
  def newLiveChatModeratorSnippet(): LiveChatModeratorSnippet = js.native
  // Create a new instance of LiveChatPollClosedDetails
  def newLiveChatPollClosedDetails(): LiveChatPollClosedDetails = js.native
  // Create a new instance of LiveChatPollEditedDetails
  def newLiveChatPollEditedDetails(): LiveChatPollEditedDetails = js.native
  // Create a new instance of LiveChatPollItem
  def newLiveChatPollItem(): LiveChatPollItem = js.native
  // Create a new instance of LiveChatPollOpenedDetails
  def newLiveChatPollOpenedDetails(): LiveChatPollOpenedDetails = js.native
  // Create a new instance of LiveChatPollVotedDetails
  def newLiveChatPollVotedDetails(): LiveChatPollVotedDetails = js.native
  // Create a new instance of LiveChatSuperChatDetails
  def newLiveChatSuperChatDetails(): LiveChatSuperChatDetails = js.native
  // Create a new instance of LiveChatSuperStickerDetails
  def newLiveChatSuperStickerDetails(): LiveChatSuperStickerDetails = js.native
  // Create a new instance of LiveChatTextMessageDetails
  def newLiveChatTextMessageDetails(): LiveChatTextMessageDetails = js.native
  // Create a new instance of LiveChatUserBannedMessageDetails
  def newLiveChatUserBannedMessageDetails(): LiveChatUserBannedMessageDetails = js.native
  // Create a new instance of LiveStream
  def newLiveStream(): LiveStream = js.native
  // Create a new instance of LiveStreamConfigurationIssue
  def newLiveStreamConfigurationIssue(): LiveStreamConfigurationIssue = js.native
  // Create a new instance of LiveStreamContentDetails
  def newLiveStreamContentDetails(): LiveStreamContentDetails = js.native
  // Create a new instance of LiveStreamHealthStatus
  def newLiveStreamHealthStatus(): LiveStreamHealthStatus = js.native
  // Create a new instance of LiveStreamSnippet
  def newLiveStreamSnippet(): LiveStreamSnippet = js.native
  // Create a new instance of LiveStreamStatus
  def newLiveStreamStatus(): LiveStreamStatus = js.native
  // Create a new instance of LocalizedProperty
  def newLocalizedProperty(): LocalizedProperty = js.native
  // Create a new instance of LocalizedString
  def newLocalizedString(): LocalizedString = js.native
  // Create a new instance of MonitorStreamInfo
  def newMonitorStreamInfo(): MonitorStreamInfo = js.native
  // Create a new instance of Playlist
  def newPlaylist(): Playlist = js.native
  // Create a new instance of PlaylistContentDetails
  def newPlaylistContentDetails(): PlaylistContentDetails = js.native
  // Create a new instance of PlaylistItem
  def newPlaylistItem(): PlaylistItem = js.native
  // Create a new instance of PlaylistItemContentDetails
  def newPlaylistItemContentDetails(): PlaylistItemContentDetails = js.native
  // Create a new instance of PlaylistItemSnippet
  def newPlaylistItemSnippet(): PlaylistItemSnippet = js.native
  // Create a new instance of PlaylistItemStatus
  def newPlaylistItemStatus(): PlaylistItemStatus = js.native
  // Create a new instance of PlaylistLocalization
  def newPlaylistLocalization(): PlaylistLocalization = js.native
  // Create a new instance of PlaylistPlayer
  def newPlaylistPlayer(): PlaylistPlayer = js.native
  // Create a new instance of PlaylistSnippet
  def newPlaylistSnippet(): PlaylistSnippet = js.native
  // Create a new instance of PlaylistStatus
  def newPlaylistStatus(): PlaylistStatus = js.native
  // Create a new instance of PromotedItem
  def newPromotedItem(): PromotedItem = js.native
  // Create a new instance of PromotedItemId
  def newPromotedItemId(): PromotedItemId = js.native
  // Create a new instance of PropertyValue
  def newPropertyValue(): PropertyValue = js.native
  // Create a new instance of ResourceId
  def newResourceId(): ResourceId = js.native
  // Create a new instance of Subscription
  def newSubscription(): Subscription = js.native
  // Create a new instance of SubscriptionContentDetails
  def newSubscriptionContentDetails(): SubscriptionContentDetails = js.native
  // Create a new instance of SubscriptionSnippet
  def newSubscriptionSnippet(): SubscriptionSnippet = js.native
  // Create a new instance of SubscriptionSubscriberSnippet
  def newSubscriptionSubscriberSnippet(): SubscriptionSubscriberSnippet = js.native
  // Create a new instance of SuperStickerMetadata
  def newSuperStickerMetadata(): SuperStickerMetadata = js.native
  // Create a new instance of Thumbnail
  def newThumbnail(): Thumbnail = js.native
  // Create a new instance of ThumbnailDetails
  def newThumbnailDetails(): ThumbnailDetails = js.native
  // Create a new instance of Video
  def newVideo(): Video = js.native
  // Create a new instance of VideoAbuseReport
  def newVideoAbuseReport(): VideoAbuseReport = js.native
  // Create a new instance of VideoAgeGating
  def newVideoAgeGating(): VideoAgeGating = js.native
  // Create a new instance of VideoContentDetails
  def newVideoContentDetails(): VideoContentDetails = js.native
  // Create a new instance of VideoContentDetailsRegionRestriction
  def newVideoContentDetailsRegionRestriction(): VideoContentDetailsRegionRestriction = js.native
  // Create a new instance of VideoFileDetails
  def newVideoFileDetails(): VideoFileDetails = js.native
  // Create a new instance of VideoFileDetailsAudioStream
  def newVideoFileDetailsAudioStream(): VideoFileDetailsAudioStream = js.native
  // Create a new instance of VideoFileDetailsVideoStream
  def newVideoFileDetailsVideoStream(): VideoFileDetailsVideoStream = js.native
  // Create a new instance of VideoLiveStreamingDetails
  def newVideoLiveStreamingDetails(): VideoLiveStreamingDetails = js.native
  // Create a new instance of VideoLocalization
  def newVideoLocalization(): VideoLocalization = js.native
  // Create a new instance of VideoMonetizationDetails
  def newVideoMonetizationDetails(): VideoMonetizationDetails = js.native
  // Create a new instance of VideoPlayer
  def newVideoPlayer(): VideoPlayer = js.native
  // Create a new instance of VideoProcessingDetails
  def newVideoProcessingDetails(): VideoProcessingDetails = js.native
  // Create a new instance of VideoProcessingDetailsProcessingProgress
  def newVideoProcessingDetailsProcessingProgress(): VideoProcessingDetailsProcessingProgress = js.native
  // Create a new instance of VideoProjectDetails
  def newVideoProjectDetails(): VideoProjectDetails = js.native
  // Create a new instance of VideoRecordingDetails
  def newVideoRecordingDetails(): VideoRecordingDetails = js.native
  // Create a new instance of VideoSnippet
  def newVideoSnippet(): VideoSnippet = js.native
  // Create a new instance of VideoStatistics
  def newVideoStatistics(): VideoStatistics = js.native
  // Create a new instance of VideoStatus
  def newVideoStatus(): VideoStatus = js.native
  // Create a new instance of VideoSuggestions
  def newVideoSuggestions(): VideoSuggestions = js.native
  // Create a new instance of VideoSuggestionsTagSuggestion
  def newVideoSuggestionsTagSuggestion(): VideoSuggestionsTagSuggestion = js.native
  // Create a new instance of VideoTopicDetails
  def newVideoTopicDetails(): VideoTopicDetails = js.native
  // Create a new instance of WatchSettings
  def newWatchSettings(): WatchSettings = js.native
}

object YouTube_ {
  @scala.inline
  def apply(
    newAccessPolicy: () => AccessPolicy,
    newActivity: () => Activity,
    newActivityContentDetails: () => ActivityContentDetails,
    newActivityContentDetailsBulletin: () => ActivityContentDetailsBulletin,
    newActivityContentDetailsChannelItem: () => ActivityContentDetailsChannelItem,
    newActivityContentDetailsComment: () => ActivityContentDetailsComment,
    newActivityContentDetailsFavorite: () => ActivityContentDetailsFavorite,
    newActivityContentDetailsLike: () => ActivityContentDetailsLike,
    newActivityContentDetailsPlaylistItem: () => ActivityContentDetailsPlaylistItem,
    newActivityContentDetailsPromotedItem: () => ActivityContentDetailsPromotedItem,
    newActivityContentDetailsRecommendation: () => ActivityContentDetailsRecommendation,
    newActivityContentDetailsSocial: () => ActivityContentDetailsSocial,
    newActivityContentDetailsSubscription: () => ActivityContentDetailsSubscription,
    newActivityContentDetailsUpload: () => ActivityContentDetailsUpload,
    newActivitySnippet: () => ActivitySnippet,
    newCaption: () => Caption,
    newCaptionSnippet: () => CaptionSnippet,
    newCdnSettings: () => CdnSettings,
    newChannel: () => Channel,
    newChannelAuditDetails: () => ChannelAuditDetails,
    newChannelBannerResource: () => ChannelBannerResource,
    newChannelBrandingSettings: () => ChannelBrandingSettings,
    newChannelContentDetails: () => ChannelContentDetails,
    newChannelContentDetailsRelatedPlaylists: () => ChannelContentDetailsRelatedPlaylists,
    newChannelContentOwnerDetails: () => ChannelContentOwnerDetails,
    newChannelConversionPing: () => ChannelConversionPing,
    newChannelConversionPings: () => ChannelConversionPings,
    newChannelLocalization: () => ChannelLocalization,
    newChannelProfileDetails: () => ChannelProfileDetails,
    newChannelSection: () => ChannelSection,
    newChannelSectionContentDetails: () => ChannelSectionContentDetails,
    newChannelSectionLocalization: () => ChannelSectionLocalization,
    newChannelSectionSnippet: () => ChannelSectionSnippet,
    newChannelSectionTargeting: () => ChannelSectionTargeting,
    newChannelSettings: () => ChannelSettings,
    newChannelSnippet: () => ChannelSnippet,
    newChannelStatistics: () => ChannelStatistics,
    newChannelStatus: () => ChannelStatus,
    newChannelTopicDetails: () => ChannelTopicDetails,
    newComment: () => Comment,
    newCommentSnippet: () => CommentSnippet,
    newCommentThread: () => CommentThread,
    newCommentThreadReplies: () => CommentThreadReplies,
    newCommentThreadSnippet: () => CommentThreadSnippet,
    newContentRating: () => ContentRating,
    newGeoPoint: () => GeoPoint,
    newImageSettings: () => ImageSettings,
    newIngestionInfo: () => IngestionInfo,
    newInvideoBranding: () => InvideoBranding,
    newInvideoPosition: () => InvideoPosition,
    newInvideoPromotion: () => InvideoPromotion,
    newInvideoTiming: () => InvideoTiming,
    newLanguageTag: () => LanguageTag,
    newLiveBroadcast: () => LiveBroadcast,
    newLiveBroadcastContentDetails: () => LiveBroadcastContentDetails,
    newLiveBroadcastSnippet: () => LiveBroadcastSnippet,
    newLiveBroadcastStatistics: () => LiveBroadcastStatistics,
    newLiveBroadcastStatus: () => LiveBroadcastStatus,
    newLiveChatBan: () => LiveChatBan,
    newLiveChatBanSnippet: () => LiveChatBanSnippet,
    newLiveChatFanFundingEventDetails: () => LiveChatFanFundingEventDetails,
    newLiveChatMessage: () => LiveChatMessage,
    newLiveChatMessageAuthorDetails: () => LiveChatMessageAuthorDetails,
    newLiveChatMessageDeletedDetails: () => LiveChatMessageDeletedDetails,
    newLiveChatMessageRetractedDetails: () => LiveChatMessageRetractedDetails,
    newLiveChatMessageSnippet: () => LiveChatMessageSnippet,
    newLiveChatModerator: () => LiveChatModerator,
    newLiveChatModeratorSnippet: () => LiveChatModeratorSnippet,
    newLiveChatPollClosedDetails: () => LiveChatPollClosedDetails,
    newLiveChatPollEditedDetails: () => LiveChatPollEditedDetails,
    newLiveChatPollItem: () => LiveChatPollItem,
    newLiveChatPollOpenedDetails: () => LiveChatPollOpenedDetails,
    newLiveChatPollVotedDetails: () => LiveChatPollVotedDetails,
    newLiveChatSuperChatDetails: () => LiveChatSuperChatDetails,
    newLiveChatSuperStickerDetails: () => LiveChatSuperStickerDetails,
    newLiveChatTextMessageDetails: () => LiveChatTextMessageDetails,
    newLiveChatUserBannedMessageDetails: () => LiveChatUserBannedMessageDetails,
    newLiveStream: () => LiveStream,
    newLiveStreamConfigurationIssue: () => LiveStreamConfigurationIssue,
    newLiveStreamContentDetails: () => LiveStreamContentDetails,
    newLiveStreamHealthStatus: () => LiveStreamHealthStatus,
    newLiveStreamSnippet: () => LiveStreamSnippet,
    newLiveStreamStatus: () => LiveStreamStatus,
    newLocalizedProperty: () => LocalizedProperty,
    newLocalizedString: () => LocalizedString,
    newMonitorStreamInfo: () => MonitorStreamInfo,
    newPlaylist: () => Playlist,
    newPlaylistContentDetails: () => PlaylistContentDetails,
    newPlaylistItem: () => PlaylistItem,
    newPlaylistItemContentDetails: () => PlaylistItemContentDetails,
    newPlaylistItemSnippet: () => PlaylistItemSnippet,
    newPlaylistItemStatus: () => PlaylistItemStatus,
    newPlaylistLocalization: () => PlaylistLocalization,
    newPlaylistPlayer: () => PlaylistPlayer,
    newPlaylistSnippet: () => PlaylistSnippet,
    newPlaylistStatus: () => PlaylistStatus,
    newPromotedItem: () => PromotedItem,
    newPromotedItemId: () => PromotedItemId,
    newPropertyValue: () => PropertyValue,
    newResourceId: () => ResourceId,
    newSubscription: () => Subscription,
    newSubscriptionContentDetails: () => SubscriptionContentDetails,
    newSubscriptionSnippet: () => SubscriptionSnippet,
    newSubscriptionSubscriberSnippet: () => SubscriptionSubscriberSnippet,
    newSuperStickerMetadata: () => SuperStickerMetadata,
    newThumbnail: () => Thumbnail,
    newThumbnailDetails: () => ThumbnailDetails,
    newVideo: () => Video,
    newVideoAbuseReport: () => VideoAbuseReport,
    newVideoAgeGating: () => VideoAgeGating,
    newVideoContentDetails: () => VideoContentDetails,
    newVideoContentDetailsRegionRestriction: () => VideoContentDetailsRegionRestriction,
    newVideoFileDetails: () => VideoFileDetails,
    newVideoFileDetailsAudioStream: () => VideoFileDetailsAudioStream,
    newVideoFileDetailsVideoStream: () => VideoFileDetailsVideoStream,
    newVideoLiveStreamingDetails: () => VideoLiveStreamingDetails,
    newVideoLocalization: () => VideoLocalization,
    newVideoMonetizationDetails: () => VideoMonetizationDetails,
    newVideoPlayer: () => VideoPlayer,
    newVideoProcessingDetails: () => VideoProcessingDetails,
    newVideoProcessingDetailsProcessingProgress: () => VideoProcessingDetailsProcessingProgress,
    newVideoProjectDetails: () => VideoProjectDetails,
    newVideoRecordingDetails: () => VideoRecordingDetails,
    newVideoSnippet: () => VideoSnippet,
    newVideoStatistics: () => VideoStatistics,
    newVideoStatus: () => VideoStatus,
    newVideoSuggestions: () => VideoSuggestions,
    newVideoSuggestionsTagSuggestion: () => VideoSuggestionsTagSuggestion,
    newVideoTopicDetails: () => VideoTopicDetails,
    newWatchSettings: () => WatchSettings
  ): YouTube_ = {
    val __obj = js.Dynamic.literal(newAccessPolicy = js.Any.fromFunction0(newAccessPolicy), newActivity = js.Any.fromFunction0(newActivity), newActivityContentDetails = js.Any.fromFunction0(newActivityContentDetails), newActivityContentDetailsBulletin = js.Any.fromFunction0(newActivityContentDetailsBulletin), newActivityContentDetailsChannelItem = js.Any.fromFunction0(newActivityContentDetailsChannelItem), newActivityContentDetailsComment = js.Any.fromFunction0(newActivityContentDetailsComment), newActivityContentDetailsFavorite = js.Any.fromFunction0(newActivityContentDetailsFavorite), newActivityContentDetailsLike = js.Any.fromFunction0(newActivityContentDetailsLike), newActivityContentDetailsPlaylistItem = js.Any.fromFunction0(newActivityContentDetailsPlaylistItem), newActivityContentDetailsPromotedItem = js.Any.fromFunction0(newActivityContentDetailsPromotedItem), newActivityContentDetailsRecommendation = js.Any.fromFunction0(newActivityContentDetailsRecommendation), newActivityContentDetailsSocial = js.Any.fromFunction0(newActivityContentDetailsSocial), newActivityContentDetailsSubscription = js.Any.fromFunction0(newActivityContentDetailsSubscription), newActivityContentDetailsUpload = js.Any.fromFunction0(newActivityContentDetailsUpload), newActivitySnippet = js.Any.fromFunction0(newActivitySnippet), newCaption = js.Any.fromFunction0(newCaption), newCaptionSnippet = js.Any.fromFunction0(newCaptionSnippet), newCdnSettings = js.Any.fromFunction0(newCdnSettings), newChannel = js.Any.fromFunction0(newChannel), newChannelAuditDetails = js.Any.fromFunction0(newChannelAuditDetails), newChannelBannerResource = js.Any.fromFunction0(newChannelBannerResource), newChannelBrandingSettings = js.Any.fromFunction0(newChannelBrandingSettings), newChannelContentDetails = js.Any.fromFunction0(newChannelContentDetails), newChannelContentDetailsRelatedPlaylists = js.Any.fromFunction0(newChannelContentDetailsRelatedPlaylists), newChannelContentOwnerDetails = js.Any.fromFunction0(newChannelContentOwnerDetails), newChannelConversionPing = js.Any.fromFunction0(newChannelConversionPing), newChannelConversionPings = js.Any.fromFunction0(newChannelConversionPings), newChannelLocalization = js.Any.fromFunction0(newChannelLocalization), newChannelProfileDetails = js.Any.fromFunction0(newChannelProfileDetails), newChannelSection = js.Any.fromFunction0(newChannelSection), newChannelSectionContentDetails = js.Any.fromFunction0(newChannelSectionContentDetails), newChannelSectionLocalization = js.Any.fromFunction0(newChannelSectionLocalization), newChannelSectionSnippet = js.Any.fromFunction0(newChannelSectionSnippet), newChannelSectionTargeting = js.Any.fromFunction0(newChannelSectionTargeting), newChannelSettings = js.Any.fromFunction0(newChannelSettings), newChannelSnippet = js.Any.fromFunction0(newChannelSnippet), newChannelStatistics = js.Any.fromFunction0(newChannelStatistics), newChannelStatus = js.Any.fromFunction0(newChannelStatus), newChannelTopicDetails = js.Any.fromFunction0(newChannelTopicDetails), newComment = js.Any.fromFunction0(newComment), newCommentSnippet = js.Any.fromFunction0(newCommentSnippet), newCommentThread = js.Any.fromFunction0(newCommentThread), newCommentThreadReplies = js.Any.fromFunction0(newCommentThreadReplies), newCommentThreadSnippet = js.Any.fromFunction0(newCommentThreadSnippet), newContentRating = js.Any.fromFunction0(newContentRating), newGeoPoint = js.Any.fromFunction0(newGeoPoint), newImageSettings = js.Any.fromFunction0(newImageSettings), newIngestionInfo = js.Any.fromFunction0(newIngestionInfo), newInvideoBranding = js.Any.fromFunction0(newInvideoBranding), newInvideoPosition = js.Any.fromFunction0(newInvideoPosition), newInvideoPromotion = js.Any.fromFunction0(newInvideoPromotion), newInvideoTiming = js.Any.fromFunction0(newInvideoTiming), newLanguageTag = js.Any.fromFunction0(newLanguageTag), newLiveBroadcast = js.Any.fromFunction0(newLiveBroadcast), newLiveBroadcastContentDetails = js.Any.fromFunction0(newLiveBroadcastContentDetails), newLiveBroadcastSnippet = js.Any.fromFunction0(newLiveBroadcastSnippet), newLiveBroadcastStatistics = js.Any.fromFunction0(newLiveBroadcastStatistics), newLiveBroadcastStatus = js.Any.fromFunction0(newLiveBroadcastStatus), newLiveChatBan = js.Any.fromFunction0(newLiveChatBan), newLiveChatBanSnippet = js.Any.fromFunction0(newLiveChatBanSnippet), newLiveChatFanFundingEventDetails = js.Any.fromFunction0(newLiveChatFanFundingEventDetails), newLiveChatMessage = js.Any.fromFunction0(newLiveChatMessage), newLiveChatMessageAuthorDetails = js.Any.fromFunction0(newLiveChatMessageAuthorDetails), newLiveChatMessageDeletedDetails = js.Any.fromFunction0(newLiveChatMessageDeletedDetails), newLiveChatMessageRetractedDetails = js.Any.fromFunction0(newLiveChatMessageRetractedDetails), newLiveChatMessageSnippet = js.Any.fromFunction0(newLiveChatMessageSnippet), newLiveChatModerator = js.Any.fromFunction0(newLiveChatModerator), newLiveChatModeratorSnippet = js.Any.fromFunction0(newLiveChatModeratorSnippet), newLiveChatPollClosedDetails = js.Any.fromFunction0(newLiveChatPollClosedDetails), newLiveChatPollEditedDetails = js.Any.fromFunction0(newLiveChatPollEditedDetails), newLiveChatPollItem = js.Any.fromFunction0(newLiveChatPollItem), newLiveChatPollOpenedDetails = js.Any.fromFunction0(newLiveChatPollOpenedDetails), newLiveChatPollVotedDetails = js.Any.fromFunction0(newLiveChatPollVotedDetails), newLiveChatSuperChatDetails = js.Any.fromFunction0(newLiveChatSuperChatDetails), newLiveChatSuperStickerDetails = js.Any.fromFunction0(newLiveChatSuperStickerDetails), newLiveChatTextMessageDetails = js.Any.fromFunction0(newLiveChatTextMessageDetails), newLiveChatUserBannedMessageDetails = js.Any.fromFunction0(newLiveChatUserBannedMessageDetails), newLiveStream = js.Any.fromFunction0(newLiveStream), newLiveStreamConfigurationIssue = js.Any.fromFunction0(newLiveStreamConfigurationIssue), newLiveStreamContentDetails = js.Any.fromFunction0(newLiveStreamContentDetails), newLiveStreamHealthStatus = js.Any.fromFunction0(newLiveStreamHealthStatus), newLiveStreamSnippet = js.Any.fromFunction0(newLiveStreamSnippet), newLiveStreamStatus = js.Any.fromFunction0(newLiveStreamStatus), newLocalizedProperty = js.Any.fromFunction0(newLocalizedProperty), newLocalizedString = js.Any.fromFunction0(newLocalizedString), newMonitorStreamInfo = js.Any.fromFunction0(newMonitorStreamInfo), newPlaylist = js.Any.fromFunction0(newPlaylist), newPlaylistContentDetails = js.Any.fromFunction0(newPlaylistContentDetails), newPlaylistItem = js.Any.fromFunction0(newPlaylistItem), newPlaylistItemContentDetails = js.Any.fromFunction0(newPlaylistItemContentDetails), newPlaylistItemSnippet = js.Any.fromFunction0(newPlaylistItemSnippet), newPlaylistItemStatus = js.Any.fromFunction0(newPlaylistItemStatus), newPlaylistLocalization = js.Any.fromFunction0(newPlaylistLocalization), newPlaylistPlayer = js.Any.fromFunction0(newPlaylistPlayer), newPlaylistSnippet = js.Any.fromFunction0(newPlaylistSnippet), newPlaylistStatus = js.Any.fromFunction0(newPlaylistStatus), newPromotedItem = js.Any.fromFunction0(newPromotedItem), newPromotedItemId = js.Any.fromFunction0(newPromotedItemId), newPropertyValue = js.Any.fromFunction0(newPropertyValue), newResourceId = js.Any.fromFunction0(newResourceId), newSubscription = js.Any.fromFunction0(newSubscription), newSubscriptionContentDetails = js.Any.fromFunction0(newSubscriptionContentDetails), newSubscriptionSnippet = js.Any.fromFunction0(newSubscriptionSnippet), newSubscriptionSubscriberSnippet = js.Any.fromFunction0(newSubscriptionSubscriberSnippet), newSuperStickerMetadata = js.Any.fromFunction0(newSuperStickerMetadata), newThumbnail = js.Any.fromFunction0(newThumbnail), newThumbnailDetails = js.Any.fromFunction0(newThumbnailDetails), newVideo = js.Any.fromFunction0(newVideo), newVideoAbuseReport = js.Any.fromFunction0(newVideoAbuseReport), newVideoAgeGating = js.Any.fromFunction0(newVideoAgeGating), newVideoContentDetails = js.Any.fromFunction0(newVideoContentDetails), newVideoContentDetailsRegionRestriction = js.Any.fromFunction0(newVideoContentDetailsRegionRestriction), newVideoFileDetails = js.Any.fromFunction0(newVideoFileDetails), newVideoFileDetailsAudioStream = js.Any.fromFunction0(newVideoFileDetailsAudioStream), newVideoFileDetailsVideoStream = js.Any.fromFunction0(newVideoFileDetailsVideoStream), newVideoLiveStreamingDetails = js.Any.fromFunction0(newVideoLiveStreamingDetails), newVideoLocalization = js.Any.fromFunction0(newVideoLocalization), newVideoMonetizationDetails = js.Any.fromFunction0(newVideoMonetizationDetails), newVideoPlayer = js.Any.fromFunction0(newVideoPlayer), newVideoProcessingDetails = js.Any.fromFunction0(newVideoProcessingDetails), newVideoProcessingDetailsProcessingProgress = js.Any.fromFunction0(newVideoProcessingDetailsProcessingProgress), newVideoProjectDetails = js.Any.fromFunction0(newVideoProjectDetails), newVideoRecordingDetails = js.Any.fromFunction0(newVideoRecordingDetails), newVideoSnippet = js.Any.fromFunction0(newVideoSnippet), newVideoStatistics = js.Any.fromFunction0(newVideoStatistics), newVideoStatus = js.Any.fromFunction0(newVideoStatus), newVideoSuggestions = js.Any.fromFunction0(newVideoSuggestions), newVideoSuggestionsTagSuggestion = js.Any.fromFunction0(newVideoSuggestionsTagSuggestion), newVideoTopicDetails = js.Any.fromFunction0(newVideoTopicDetails), newWatchSettings = js.Any.fromFunction0(newWatchSettings))
    __obj.asInstanceOf[YouTube_]
  }
  @scala.inline
  implicit class YouTube_Ops[Self <: YouTube_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAccessPolicy(value: () => AccessPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccessPolicy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivity(value: () => Activity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetails(value: () => ActivityContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsBulletin(value: () => ActivityContentDetailsBulletin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsBulletin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsChannelItem(value: () => ActivityContentDetailsChannelItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsChannelItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsComment(value: () => ActivityContentDetailsComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsComment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsFavorite(value: () => ActivityContentDetailsFavorite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsFavorite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsLike(value: () => ActivityContentDetailsLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsLike")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsPlaylistItem(value: () => ActivityContentDetailsPlaylistItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsPlaylistItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsPromotedItem(value: () => ActivityContentDetailsPromotedItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsPromotedItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsRecommendation(value: () => ActivityContentDetailsRecommendation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsRecommendation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsSocial(value: () => ActivityContentDetailsSocial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsSocial")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsSubscription(value: () => ActivityContentDetailsSubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsSubscription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivityContentDetailsUpload(value: () => ActivityContentDetailsUpload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivityContentDetailsUpload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewActivitySnippet(value: () => ActivitySnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivitySnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCaption(value: () => Caption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCaption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCaptionSnippet(value: () => CaptionSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCaptionSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCdnSettings(value: () => CdnSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCdnSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannel(value: () => Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelAuditDetails(value: () => ChannelAuditDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelAuditDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelBannerResource(value: () => ChannelBannerResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelBannerResource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelBrandingSettings(value: () => ChannelBrandingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelBrandingSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelContentDetails(value: () => ChannelContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelContentDetailsRelatedPlaylists(value: () => ChannelContentDetailsRelatedPlaylists): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelContentDetailsRelatedPlaylists")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelContentOwnerDetails(value: () => ChannelContentOwnerDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelContentOwnerDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelConversionPing(value: () => ChannelConversionPing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelConversionPing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelConversionPings(value: () => ChannelConversionPings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelConversionPings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelLocalization(value: () => ChannelLocalization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelLocalization")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelProfileDetails(value: () => ChannelProfileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelProfileDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelSection(value: () => ChannelSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelSection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelSectionContentDetails(value: () => ChannelSectionContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelSectionContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelSectionLocalization(value: () => ChannelSectionLocalization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelSectionLocalization")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelSectionSnippet(value: () => ChannelSectionSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelSectionSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelSectionTargeting(value: () => ChannelSectionTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelSectionTargeting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelSettings(value: () => ChannelSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelSnippet(value: () => ChannelSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelStatistics(value: () => ChannelStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelStatistics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelStatus(value: () => ChannelStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannelTopicDetails(value: () => ChannelTopicDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannelTopicDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewComment(value: () => Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newComment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCommentSnippet(value: () => CommentSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCommentSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCommentThread(value: () => CommentThread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCommentThread")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCommentThreadReplies(value: () => CommentThreadReplies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCommentThreadReplies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCommentThreadSnippet(value: () => CommentThreadSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCommentThreadSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewContentRating(value: () => ContentRating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newContentRating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGeoPoint(value: () => GeoPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGeoPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewImageSettings(value: () => ImageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newImageSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewIngestionInfo(value: () => IngestionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIngestionInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInvideoBranding(value: () => InvideoBranding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInvideoBranding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInvideoPosition(value: () => InvideoPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInvideoPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInvideoPromotion(value: () => InvideoPromotion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInvideoPromotion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInvideoTiming(value: () => InvideoTiming): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInvideoTiming")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLanguageTag(value: () => LanguageTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLanguageTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveBroadcast(value: () => LiveBroadcast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveBroadcast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveBroadcastContentDetails(value: () => LiveBroadcastContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveBroadcastContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveBroadcastSnippet(value: () => LiveBroadcastSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveBroadcastSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveBroadcastStatistics(value: () => LiveBroadcastStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveBroadcastStatistics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveBroadcastStatus(value: () => LiveBroadcastStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveBroadcastStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatBan(value: () => LiveChatBan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatBan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatBanSnippet(value: () => LiveChatBanSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatBanSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatFanFundingEventDetails(value: () => LiveChatFanFundingEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatFanFundingEventDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatMessage(value: () => LiveChatMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatMessageAuthorDetails(value: () => LiveChatMessageAuthorDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatMessageAuthorDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatMessageDeletedDetails(value: () => LiveChatMessageDeletedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatMessageDeletedDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatMessageRetractedDetails(value: () => LiveChatMessageRetractedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatMessageRetractedDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatMessageSnippet(value: () => LiveChatMessageSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatMessageSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatModerator(value: () => LiveChatModerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatModerator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatModeratorSnippet(value: () => LiveChatModeratorSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatModeratorSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatPollClosedDetails(value: () => LiveChatPollClosedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatPollClosedDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatPollEditedDetails(value: () => LiveChatPollEditedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatPollEditedDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatPollItem(value: () => LiveChatPollItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatPollItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatPollOpenedDetails(value: () => LiveChatPollOpenedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatPollOpenedDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatPollVotedDetails(value: () => LiveChatPollVotedDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatPollVotedDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatSuperChatDetails(value: () => LiveChatSuperChatDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatSuperChatDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatSuperStickerDetails(value: () => LiveChatSuperStickerDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatSuperStickerDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatTextMessageDetails(value: () => LiveChatTextMessageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatTextMessageDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveChatUserBannedMessageDetails(value: () => LiveChatUserBannedMessageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveChatUserBannedMessageDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveStream(value: () => LiveStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveStreamConfigurationIssue(value: () => LiveStreamConfigurationIssue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveStreamConfigurationIssue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveStreamContentDetails(value: () => LiveStreamContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveStreamContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveStreamHealthStatus(value: () => LiveStreamHealthStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveStreamHealthStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveStreamSnippet(value: () => LiveStreamSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveStreamSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLiveStreamStatus(value: () => LiveStreamStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLiveStreamStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLocalizedProperty(value: () => LocalizedProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLocalizedProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLocalizedString(value: () => LocalizedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLocalizedString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMonitorStreamInfo(value: () => MonitorStreamInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMonitorStreamInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylist(value: () => Playlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylist")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylistContentDetails(value: () => PlaylistContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylistContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylistItem(value: () => PlaylistItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylistItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylistItemContentDetails(value: () => PlaylistItemContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylistItemContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylistItemSnippet(value: () => PlaylistItemSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylistItemSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylistItemStatus(value: () => PlaylistItemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylistItemStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylistLocalization(value: () => PlaylistLocalization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylistLocalization")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylistPlayer(value: () => PlaylistPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylistPlayer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylistSnippet(value: () => PlaylistSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylistSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaylistStatus(value: () => PlaylistStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaylistStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPromotedItem(value: () => PromotedItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPromotedItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPromotedItemId(value: () => PromotedItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPromotedItemId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPropertyValue(value: () => PropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPropertyValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewResourceId(value: () => ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newResourceId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscription(value: () => Subscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscriptionContentDetails(value: () => SubscriptionContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscriptionContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscriptionSnippet(value: () => SubscriptionSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscriptionSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscriptionSubscriberSnippet(value: () => SubscriptionSubscriberSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscriptionSubscriberSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSuperStickerMetadata(value: () => SuperStickerMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSuperStickerMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewThumbnail(value: () => Thumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newThumbnail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewThumbnailDetails(value: () => ThumbnailDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newThumbnailDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideo(value: () => Video): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoAbuseReport(value: () => VideoAbuseReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoAbuseReport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoAgeGating(value: () => VideoAgeGating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoAgeGating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoContentDetails(value: () => VideoContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoContentDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoContentDetailsRegionRestriction(value: () => VideoContentDetailsRegionRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoContentDetailsRegionRestriction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoFileDetails(value: () => VideoFileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoFileDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoFileDetailsAudioStream(value: () => VideoFileDetailsAudioStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoFileDetailsAudioStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoFileDetailsVideoStream(value: () => VideoFileDetailsVideoStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoFileDetailsVideoStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoLiveStreamingDetails(value: () => VideoLiveStreamingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoLiveStreamingDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoLocalization(value: () => VideoLocalization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoLocalization")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoMonetizationDetails(value: () => VideoMonetizationDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoMonetizationDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoPlayer(value: () => VideoPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoPlayer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoProcessingDetails(value: () => VideoProcessingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoProcessingDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoProcessingDetailsProcessingProgress(value: () => VideoProcessingDetailsProcessingProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoProcessingDetailsProcessingProgress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoProjectDetails(value: () => VideoProjectDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoProjectDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoRecordingDetails(value: () => VideoRecordingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoRecordingDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoSnippet(value: () => VideoSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoStatistics(value: () => VideoStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoStatistics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoStatus(value: () => VideoStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoSuggestions(value: () => VideoSuggestions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoSuggestions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoSuggestionsTagSuggestion(value: () => VideoSuggestionsTagSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoSuggestionsTagSuggestion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoTopicDetails(value: () => VideoTopicDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoTopicDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWatchSettings(value: () => WatchSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWatchSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivities(value: ActivitiesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activities")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptions(value: CaptionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Captions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Captions")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelBanners(value: ChannelBannersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelBanners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelBanners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelBanners")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelSections(value: ChannelSectionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelSections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelSections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelSections")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: ChannelsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentThreads(value: CommentThreadsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentThreads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentThreads")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: CommentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comments")(js.undefined)
        ret
    }
    @scala.inline
    def withGuideCategories(value: GuideCategoriesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GuideCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuideCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GuideCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withI18nLanguages(value: I18nLanguagesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("I18nLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18nLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("I18nLanguages")(js.undefined)
        ret
    }
    @scala.inline
    def withI18nRegions(value: I18nRegionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("I18nRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18nRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("I18nRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveBroadcasts(value: LiveBroadcastsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveBroadcasts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveBroadcasts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveBroadcasts")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveChatBans(value: LiveChatBansCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveChatBans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveChatBans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveChatBans")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveChatMessages(value: LiveChatMessagesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveChatMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveChatMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveChatMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveChatModerators(value: LiveChatModeratorsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveChatModerators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveChatModerators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveChatModerators")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveStreams(value: LiveStreamsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylistItems(value: PlaylistItemsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaylistItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylistItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaylistItems")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylists(value: PlaylistsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Playlists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Playlists")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: SearchCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Search")(js.undefined)
        ret
    }
    @scala.inline
    def withSponsors(value: SponsorsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sponsors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSponsors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sponsors")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptions(value: SubscriptionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperChatEvents(value: SuperChatEventsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuperChatEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperChatEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuperChatEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnails(value: ThumbnailsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumbnails")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoAbuseReportReasons(value: VideoAbuseReportReasonsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoAbuseReportReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoAbuseReportReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoAbuseReportReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoCategories(value: VideoCategoriesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withVideos(value: VideosCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Videos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Videos")(js.undefined)
        ret
    }
    @scala.inline
    def withWatermarks(value: WatermarksCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Watermarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Watermarks")(js.undefined)
        ret
    }
  }
  
}

