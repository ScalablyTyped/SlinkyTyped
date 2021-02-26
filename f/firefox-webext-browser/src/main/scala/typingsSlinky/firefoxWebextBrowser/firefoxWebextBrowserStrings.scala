package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.activityLog.OnExtensionActivityDetailsType
import typingsSlinky.firefoxWebextBrowser.browser.activityLog.OnExtensionActivityDetailsViewType
import typingsSlinky.firefoxWebextBrowser.browser.bookmarks.BookmarkTreeNodeType
import typingsSlinky.firefoxWebextBrowser.browser.browserSettings.ContextMenuMouseEvent
import typingsSlinky.firefoxWebextBrowser.browser.browserSettings.ImageAnimationBehavior
import typingsSlinky.firefoxWebextBrowser.browser.captivePortal.OnConnectivityAvailableStatus
import typingsSlinky.firefoxWebextBrowser.browser.captivePortal.OnStateChangedDetailsState
import typingsSlinky.firefoxWebextBrowser.browser.clipboard.SetImageDataImageType
import typingsSlinky.firefoxWebextBrowser.browser.contextMenus.ContextType
import typingsSlinky.firefoxWebextBrowser.browser.contextMenus.ItemType
import typingsSlinky.firefoxWebextBrowser.browser.contextMenus.OnClickDataModifiers
import typingsSlinky.firefoxWebextBrowser.browser.contextMenus.OverrideContextContextOptionsContext
import typingsSlinky.firefoxWebextBrowser.browser.cookies.OnChangedCause
import typingsSlinky.firefoxWebextBrowser.browser.cookies.SameSiteStatus
import typingsSlinky.firefoxWebextBrowser.browser.dns._ResolveFlags
import typingsSlinky.firefoxWebextBrowser.browser.downloads.DangerType
import typingsSlinky.firefoxWebextBrowser.browser.downloads.DownloadOptionsMethod
import typingsSlinky.firefoxWebextBrowser.browser.downloads.FilenameConflictAction
import typingsSlinky.firefoxWebextBrowser.browser.downloads.InterruptReason
import typingsSlinky.firefoxWebextBrowser.browser.downloads.State
import typingsSlinky.firefoxWebextBrowser.browser.experiments.APIChildScope
import typingsSlinky.firefoxWebextBrowser.browser.experiments.APIParentScope
import typingsSlinky.firefoxWebextBrowser.browser.extension.ViewType
import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.CSSOrigin
import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.ImageFormat
import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typingsSlinky.firefoxWebextBrowser.browser.geckoProfiler.ProfilerFeature
import typingsSlinky.firefoxWebextBrowser.browser.idle.IdleState
import typingsSlinky.firefoxWebextBrowser.browser.management.ExtensionDisabledReason
import typingsSlinky.firefoxWebextBrowser.browser.management.ExtensionInstallType
import typingsSlinky.firefoxWebextBrowser.browser.management.ExtensionType
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ProtocolHandlerProtocol
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsAlignment
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsTiling
import typingsSlinky.firefoxWebextBrowser.browser.manifest.WebExtensionManifestBrowserActionDefaultArea
import typingsSlinky.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
import typingsSlinky.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
import typingsSlinky.firefoxWebextBrowser.browser.manifest.WebExtensionManifestIncognito
import typingsSlinky.firefoxWebextBrowser.browser.manifest._OptionalPermission
import typingsSlinky.firefoxWebextBrowser.browser.manifest._OptionalPermissionNoPrompt
import typingsSlinky.firefoxWebextBrowser.browser.manifest._PermissionNoPrompt
import typingsSlinky.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfoStatus
import typingsSlinky.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfoType
import typingsSlinky.firefoxWebextBrowser.browser.notifications.PermissionLevel
import typingsSlinky.firefoxWebextBrowser.browser.notifications.TemplateType
import typingsSlinky.firefoxWebextBrowser.browser.omnibox.DescriptionStyleType
import typingsSlinky.firefoxWebextBrowser.browser.omnibox.OnInputEnteredDisposition
import typingsSlinky.firefoxWebextBrowser.browser.privacy.network.IPHandlingPolicy
import typingsSlinky.firefoxWebextBrowser.browser.privacy.network.TlsVersionRestrictionConfigMaximum
import typingsSlinky.firefoxWebextBrowser.browser.privacy.network.TlsVersionRestrictionConfigMinimum
import typingsSlinky.firefoxWebextBrowser.browser.privacy.websites.CookieConfigBehavior
import typingsSlinky.firefoxWebextBrowser.browser.privacy.websites.TrackingProtectionModeOption
import typingsSlinky.firefoxWebextBrowser.browser.proxy.ProxyConfigProxyType
import typingsSlinky.firefoxWebextBrowser.browser.runtime.OnInstalledReason
import typingsSlinky.firefoxWebextBrowser.browser.runtime.OnRestartRequiredReason
import typingsSlinky.firefoxWebextBrowser.browser.runtime.PlatformArch
import typingsSlinky.firefoxWebextBrowser.browser.runtime.PlatformNaclArch
import typingsSlinky.firefoxWebextBrowser.browser.runtime.PlatformOs
import typingsSlinky.firefoxWebextBrowser.browser.runtime.RequestUpdateCheckStatus
import typingsSlinky.firefoxWebextBrowser.browser.tabs.MutedInfoReason
import typingsSlinky.firefoxWebextBrowser.browser.tabs.QueryQueryInfoScreen
import typingsSlinky.firefoxWebextBrowser.browser.tabs.TabStatus
import typingsSlinky.firefoxWebextBrowser.browser.tabs.UpdatePropertyName
import typingsSlinky.firefoxWebextBrowser.browser.tabs.ZoomSettingsMode
import typingsSlinky.firefoxWebextBrowser.browser.tabs.ZoomSettingsScope
import typingsSlinky.firefoxWebextBrowser.browser.telemetry.ScalarType
import typingsSlinky.firefoxWebextBrowser.browser.topSites.MostVisitedURLType
import typingsSlinky.firefoxWebextBrowser.browser.types.LevelOfControl
import typingsSlinky.firefoxWebextBrowser.browser.types.SettingScope
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.EngagementState
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.ResultType
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.SourceType
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.TransitionQualifier
import typingsSlinky.firefoxWebextBrowser.browser.webNavigation.TransitionType
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.CertificateTransparencyStatus
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.OnAuthRequiredOptions
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.OnBeforeRequestOptions
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.OnBeforeSendHeadersOptions
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.OnHeadersReceivedOptions
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.ResourceType
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.SecurityInfoProtocolVersion
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.SecurityInfoState
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.StreamFilterStatus
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.UrlClassificationFlags
import typingsSlinky.firefoxWebextBrowser.browser.windows.CreateType
import typingsSlinky.firefoxWebextBrowser.browser.windows.WindowState
import typingsSlinky.firefoxWebextBrowser.browser.windows.WindowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firefoxWebextBrowserStrings {
  
  @js.native
  sealed trait default extends IPHandlingPolicy
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `2g` extends NetworkLinkInfoType
  @scala.inline
  def `2g`: `2g` = "2g".asInstanceOf[`2g`]
  
  @js.native
  sealed trait `3g` extends NetworkLinkInfoType
  @scala.inline
  def `3g`: `3g` = "3g".asInstanceOf[`3g`]
  
  @js.native
  sealed trait `4g` extends NetworkLinkInfoType
  @scala.inline
  def `4g`: `4g` = "4g".asInstanceOf[`4g`]
  
  @js.native
  sealed trait Alt
    extends OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  @scala.inline
  def Alt: Alt = "Alt".asInstanceOf[Alt]
  
  @js.native
  sealed trait Application extends QueryQueryInfoScreen
  @scala.inline
  def Application: Application = "Application".asInstanceOf[Application]
  
  @js.native
  sealed trait CRASH extends InterruptReason
  @scala.inline
  def CRASH: CRASH = "CRASH".asInstanceOf[CRASH]
  
  @js.native
  sealed trait Command
    extends OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  @scala.inline
  def Command: Command = "Command".asInstanceOf[Command]
  
  @js.native
  sealed trait Ctrl
    extends OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  @scala.inline
  def Ctrl: Ctrl = "Ctrl".asInstanceOf[Ctrl]
  
  @js.native
  sealed trait FILE_ACCESS_DENIED extends InterruptReason
  @scala.inline
  def FILE_ACCESS_DENIED: FILE_ACCESS_DENIED = "FILE_ACCESS_DENIED".asInstanceOf[FILE_ACCESS_DENIED]
  
  @js.native
  sealed trait FILE_BLOCKED extends InterruptReason
  @scala.inline
  def FILE_BLOCKED: FILE_BLOCKED = "FILE_BLOCKED".asInstanceOf[FILE_BLOCKED]
  
  @js.native
  sealed trait FILE_FAILED extends InterruptReason
  @scala.inline
  def FILE_FAILED: FILE_FAILED = "FILE_FAILED".asInstanceOf[FILE_FAILED]
  
  @js.native
  sealed trait FILE_NAME_TOO_LONG extends InterruptReason
  @scala.inline
  def FILE_NAME_TOO_LONG: FILE_NAME_TOO_LONG = "FILE_NAME_TOO_LONG".asInstanceOf[FILE_NAME_TOO_LONG]
  
  @js.native
  sealed trait FILE_NO_SPACE extends InterruptReason
  @scala.inline
  def FILE_NO_SPACE: FILE_NO_SPACE = "FILE_NO_SPACE".asInstanceOf[FILE_NO_SPACE]
  
  @js.native
  sealed trait FILE_SECURITY_CHECK_FAILED extends InterruptReason
  @scala.inline
  def FILE_SECURITY_CHECK_FAILED: FILE_SECURITY_CHECK_FAILED = "FILE_SECURITY_CHECK_FAILED".asInstanceOf[FILE_SECURITY_CHECK_FAILED]
  
  @js.native
  sealed trait FILE_TOO_LARGE extends InterruptReason
  @scala.inline
  def FILE_TOO_LARGE: FILE_TOO_LARGE = "FILE_TOO_LARGE".asInstanceOf[FILE_TOO_LARGE]
  
  @js.native
  sealed trait FILE_TOO_SHORT extends InterruptReason
  @scala.inline
  def FILE_TOO_SHORT: FILE_TOO_SHORT = "FILE_TOO_SHORT".asInstanceOf[FILE_TOO_SHORT]
  
  @js.native
  sealed trait FILE_TRANSIENT_ERROR extends InterruptReason
  @scala.inline
  def FILE_TRANSIENT_ERROR: FILE_TRANSIENT_ERROR = "FILE_TRANSIENT_ERROR".asInstanceOf[FILE_TRANSIENT_ERROR]
  
  @js.native
  sealed trait FILE_VIRUS_INFECTED extends InterruptReason
  @scala.inline
  def FILE_VIRUS_INFECTED: FILE_VIRUS_INFECTED = "FILE_VIRUS_INFECTED".asInstanceOf[FILE_VIRUS_INFECTED]
  
  @js.native
  sealed trait GET extends DownloadOptionsMethod
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait Lessthansignall_urlsGreaterthansign extends StObject
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: Lessthansignall_urlsGreaterthansign = "<all_urls>".asInstanceOf[Lessthansignall_urlsGreaterthansign]
  
  @js.native
  sealed trait MacCtrl
    extends OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  @scala.inline
  def MacCtrl: MacCtrl = "MacCtrl".asInstanceOf[MacCtrl]
  
  @js.native
  sealed trait NETWORK_DISCONNECTED extends InterruptReason
  @scala.inline
  def NETWORK_DISCONNECTED: NETWORK_DISCONNECTED = "NETWORK_DISCONNECTED".asInstanceOf[NETWORK_DISCONNECTED]
  
  @js.native
  sealed trait NETWORK_FAILED extends InterruptReason
  @scala.inline
  def NETWORK_FAILED: NETWORK_FAILED = "NETWORK_FAILED".asInstanceOf[NETWORK_FAILED]
  
  @js.native
  sealed trait NETWORK_INVALID_REQUEST extends InterruptReason
  @scala.inline
  def NETWORK_INVALID_REQUEST: NETWORK_INVALID_REQUEST = "NETWORK_INVALID_REQUEST".asInstanceOf[NETWORK_INVALID_REQUEST]
  
  @js.native
  sealed trait NETWORK_SERVER_DOWN extends InterruptReason
  @scala.inline
  def NETWORK_SERVER_DOWN: NETWORK_SERVER_DOWN = "NETWORK_SERVER_DOWN".asInstanceOf[NETWORK_SERVER_DOWN]
  
  @js.native
  sealed trait NETWORK_TIMEOUT extends InterruptReason
  @scala.inline
  def NETWORK_TIMEOUT: NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[NETWORK_TIMEOUT]
  
  @js.native
  sealed trait POST extends DownloadOptionsMethod
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait SERVER_BAD_CONTENT extends InterruptReason
  @scala.inline
  def SERVER_BAD_CONTENT: SERVER_BAD_CONTENT = "SERVER_BAD_CONTENT".asInstanceOf[SERVER_BAD_CONTENT]
  
  @js.native
  sealed trait SERVER_CERT_PROBLEM extends InterruptReason
  @scala.inline
  def SERVER_CERT_PROBLEM: SERVER_CERT_PROBLEM = "SERVER_CERT_PROBLEM".asInstanceOf[SERVER_CERT_PROBLEM]
  
  @js.native
  sealed trait SERVER_FAILED extends InterruptReason
  @scala.inline
  def SERVER_FAILED: SERVER_FAILED = "SERVER_FAILED".asInstanceOf[SERVER_FAILED]
  
  @js.native
  sealed trait SERVER_FORBIDDEN extends InterruptReason
  @scala.inline
  def SERVER_FORBIDDEN: SERVER_FORBIDDEN = "SERVER_FORBIDDEN".asInstanceOf[SERVER_FORBIDDEN]
  
  @js.native
  sealed trait SERVER_NO_RANGE extends InterruptReason
  @scala.inline
  def SERVER_NO_RANGE: SERVER_NO_RANGE = "SERVER_NO_RANGE".asInstanceOf[SERVER_NO_RANGE]
  
  @js.native
  sealed trait SERVER_UNAUTHORIZED extends InterruptReason
  @scala.inline
  def SERVER_UNAUTHORIZED: SERVER_UNAUTHORIZED = "SERVER_UNAUTHORIZED".asInstanceOf[SERVER_UNAUTHORIZED]
  
  @js.native
  sealed trait Screen extends QueryQueryInfoScreen
  @scala.inline
  def Screen: Screen = "Screen".asInstanceOf[Screen]
  
  @js.native
  sealed trait Shift
    extends OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typingsSlinky.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  @scala.inline
  def Shift: Shift = "Shift".asInstanceOf[Shift]
  
  @js.native
  sealed trait TLSv1
    extends SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  @scala.inline
  def TLSv1: TLSv1 = "TLSv1".asInstanceOf[TLSv1]
  
  @js.native
  sealed trait TLSv1Dot1
    extends SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  @scala.inline
  def TLSv1Dot1: TLSv1Dot1 = "TLSv1.1".asInstanceOf[TLSv1Dot1]
  
  @js.native
  sealed trait TLSv1Dot2
    extends SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  @scala.inline
  def TLSv1Dot2: TLSv1Dot2 = "TLSv1.2".asInstanceOf[TLSv1Dot2]
  
  @js.native
  sealed trait TLSv1Dot3
    extends SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  @scala.inline
  def TLSv1Dot3: TLSv1Dot3 = "TLSv1.3".asInstanceOf[TLSv1Dot3]
  
  @js.native
  sealed trait USER_CANCELED extends InterruptReason
  @scala.inline
  def USER_CANCELED: USER_CANCELED = "USER_CANCELED".asInstanceOf[USER_CANCELED]
  
  @js.native
  sealed trait USER_SHUTDOWN extends InterruptReason
  @scala.inline
  def USER_SHUTDOWN: USER_SHUTDOWN = "USER_SHUTDOWN".asInstanceOf[USER_SHUTDOWN]
  
  @js.native
  sealed trait Window extends QueryQueryInfoScreen
  @scala.inline
  def Window: Window = "Window".asInstanceOf[Window]
  
  @js.native
  sealed trait _empty extends StObject
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait abandonment extends EngagementState
  @scala.inline
  def abandonment: abandonment = "abandonment".asInstanceOf[abandonment]
  
  @js.native
  sealed trait accepted extends DangerType
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait active extends IdleState
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait activeTab extends _OptionalPermissionNoPrompt
  @scala.inline
  def activeTab: activeTab = "activeTab".asInstanceOf[activeTab]
  
  @js.native
  sealed trait activityLog extends _PermissionNoPrompt
  @scala.inline
  def activityLog: activityLog = "activityLog".asInstanceOf[activityLog]
  
  @js.native
  sealed trait addon_child extends APIChildScope
  @scala.inline
  def addon_child: addon_child = "addon_child".asInstanceOf[addon_child]
  
  @js.native
  sealed trait addon_parent extends APIParentScope
  @scala.inline
  def addon_parent: addon_parent = "addon_parent".asInstanceOf[addon_parent]
  
  @js.native
  sealed trait alarms extends _PermissionNoPrompt
  @scala.inline
  def alarms: alarms = "alarms".asInstanceOf[alarms]
  
  @js.native
  sealed trait all
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait allow_all extends CookieConfigBehavior
  @scala.inline
  def allow_all: allow_all = "allow_all".asInstanceOf[allow_all]
  
  @js.native
  sealed trait allow_name_collisions extends _ResolveFlags
  @scala.inline
  def allow_name_collisions: allow_name_collisions = "allow_name_collisions".asInstanceOf[allow_name_collisions]
  
  @js.native
  sealed trait allow_visited extends CookieConfigBehavior
  @scala.inline
  def allow_visited: allow_visited = "allow_visited".asInstanceOf[allow_visited]
  
  @js.native
  sealed trait always extends TrackingProtectionModeOption
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait android extends PlatformOs
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait any_basic_tracking extends UrlClassificationFlags
  @scala.inline
  def any_basic_tracking: any_basic_tracking = "any_basic_tracking".asInstanceOf[any_basic_tracking]
  
  @js.native
  sealed trait any_social_tracking extends UrlClassificationFlags
  @scala.inline
  def any_social_tracking: any_social_tracking = "any_social_tracking".asInstanceOf[any_social_tracking]
  
  @js.native
  sealed trait any_strict_tracking extends UrlClassificationFlags
  @scala.inline
  def any_strict_tracking: any_strict_tracking = "any_strict_tracking".asInstanceOf[any_strict_tracking]
  
  @js.native
  sealed trait api_call extends OnExtensionActivityDetailsType
  @scala.inline
  def api_call: api_call = "api_call".asInstanceOf[api_call]
  
  @js.native
  sealed trait api_event extends OnExtensionActivityDetailsType
  @scala.inline
  def api_event: api_event = "api_event".asInstanceOf[api_event]
  
  @js.native
  sealed trait app
    extends WindowType
       with typingsSlinky.firefoxWebextBrowser.browser.tabs.WindowType
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait app_update extends OnRestartRequiredReason
  @scala.inline
  def app_update: app_update = "app_update".asInstanceOf[app_update]
  
  @js.native
  sealed trait arm
    extends PlatformArch
       with PlatformNaclArch
  @scala.inline
  def arm: arm = "arm".asInstanceOf[arm]
  
  @js.native
  sealed trait asyncBlocking extends OnAuthRequiredOptions
  @scala.inline
  def asyncBlocking: asyncBlocking = "asyncBlocking".asInstanceOf[asyncBlocking]
  
  @js.native
  sealed trait attention extends UpdatePropertyName
  @scala.inline
  def attention: attention = "attention".asInstanceOf[attention]
  
  @js.native
  sealed trait audible extends UpdatePropertyName
  @scala.inline
  def audible: audible = "audible".asInstanceOf[audible]
  
  @js.native
  sealed trait audio
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait audiocallbacktracing extends ProfilerFeature
  @scala.inline
  def audiocallbacktracing: audiocallbacktracing = "audiocallbacktracing".asInstanceOf[audiocallbacktracing]
  
  @js.native
  sealed trait author extends CSSOrigin
  @scala.inline
  def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait autoConfig extends ProxyConfigProxyType
  @scala.inline
  def autoConfig: autoConfig = "autoConfig".asInstanceOf[autoConfig]
  
  @js.native
  sealed trait autoDetect extends ProxyConfigProxyType
  @scala.inline
  def autoDetect: autoDetect = "autoDetect".asInstanceOf[autoDetect]
  
  @js.native
  sealed trait auto_bookmark
    extends TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def auto_bookmark: auto_bookmark = "auto_bookmark".asInstanceOf[auto_bookmark]
  
  @js.native
  sealed trait auto_subframe
    extends TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def auto_subframe: auto_subframe = "auto_subframe".asInstanceOf[auto_subframe]
  
  @js.native
  sealed trait auto_toplevel
    extends typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def auto_toplevel: auto_toplevel = "auto_toplevel".asInstanceOf[auto_toplevel]
  
  @js.native
  sealed trait automatic extends ZoomSettingsMode
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  
  @js.native
  sealed trait background extends OnExtensionActivityDetailsViewType
  @scala.inline
  def background: background = "background".asInstanceOf[background]
  
  @js.native
  sealed trait basic extends TemplateType
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait beacon extends ResourceType
  @scala.inline
  def beacon: beacon = "beacon".asInstanceOf[beacon]
  
  @js.native
  sealed trait bitcoin extends ProtocolHandlerProtocol
  @scala.inline
  def bitcoin: bitcoin = "bitcoin".asInstanceOf[bitcoin]
  
  @js.native
  sealed trait blocking
    extends OnAuthRequiredOptions
       with OnBeforeRequestOptions
       with OnBeforeSendHeadersOptions
       with OnHeadersReceivedOptions
  @scala.inline
  def blocking: blocking = "blocking".asInstanceOf[blocking]
  
  @js.native
  sealed trait bookmark
    extends BookmarkTreeNodeType
       with ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
       with OverrideContextContextOptionsContext
       with typingsSlinky.firefoxWebextBrowser.browser.menus.OverrideContextContextOptionsContext
  @scala.inline
  def bookmark: bookmark = "bookmark".asInstanceOf[bookmark]
  
  @js.native
  sealed trait bookmarks
    extends SourceType
       with _OptionalPermission
  @scala.inline
  def bookmarks: bookmarks = "bookmarks".asInstanceOf[bookmarks]
  
  @js.native
  sealed trait boolean extends ScalarType
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait bottom extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait broken extends SecurityInfoState
  @scala.inline
  def broken: broken = "broken".asInstanceOf[broken]
  
  @js.native
  sealed trait browserSettings extends _OptionalPermission
  @scala.inline
  def browserSettings: browserSettings = "browserSettings".asInstanceOf[browserSettings]
  
  @js.native
  sealed trait browser_action
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def browser_action: browser_action = "browser_action".asInstanceOf[browser_action]
  
  @js.native
  sealed trait browser_update extends OnInstalledReason
  @scala.inline
  def browser_update: browser_update = "browser_update".asInstanceOf[browser_update]
  
  @js.native
  sealed trait browsingData extends _OptionalPermission
  @scala.inline
  def browsingData: browsingData = "browsingData".asInstanceOf[browsingData]
  
  @js.native
  sealed trait bypass_cache extends _ResolveFlags
  @scala.inline
  def bypass_cache: bypass_cache = "bypass_cache".asInstanceOf[bypass_cache]
  
  @js.native
  sealed trait canonical_name extends _ResolveFlags
  @scala.inline
  def canonical_name: canonical_name = "canonical_name".asInstanceOf[canonical_name]
  
  @js.native
  sealed trait captive extends OnConnectivityAvailableStatus
  @scala.inline
  def captive: captive = "captive".asInstanceOf[captive]
  
  @js.native
  sealed trait captivePortal extends _PermissionNoPrompt
  @scala.inline
  def captivePortal: captivePortal = "captivePortal".asInstanceOf[captivePortal]
  
  @js.native
  sealed trait capture extends MutedInfoReason
  @scala.inline
  def capture: capture = "capture".asInstanceOf[capture]
  
  @js.native
  sealed trait center extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait `center bottom` extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def `center bottom`: `center bottom` = ("center bottom").asInstanceOf[`center bottom`]
  
  @js.native
  sealed trait `center center` extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def `center center`: `center center` = ("center center").asInstanceOf[`center center`]
  
  @js.native
  sealed trait `center top` extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def `center top`: `center top` = ("center top").asInstanceOf[`center top`]
  
  @js.native
  sealed trait checkbox
    extends ItemType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ItemType
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait cipher extends StObject
  @scala.inline
  def cipher: cipher = "cipher".asInstanceOf[cipher]
  
  @js.native
  sealed trait clear extends OnConnectivityAvailableStatus
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait client_redirect extends TransitionQualifier
  @scala.inline
  def client_redirect: client_redirect = "client_redirect".asInstanceOf[client_redirect]
  
  @js.native
  sealed trait clipboardRead extends _OptionalPermission
  @scala.inline
  def clipboardRead: clipboardRead = "clipboardRead".asInstanceOf[clipboardRead]
  
  @js.native
  sealed trait clipboardWrite extends _OptionalPermission
  @scala.inline
  def clipboardWrite: clipboardWrite = "clipboardWrite".asInstanceOf[clipboardWrite]
  
  @js.native
  sealed trait closed extends StreamFilterStatus
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait complete
    extends State
       with TabStatus
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait content extends DangerType
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait content_child extends APIChildScope
  @scala.inline
  def content_child: content_child = "content_child".asInstanceOf[content_child]
  
  @js.native
  sealed trait content_parent extends APIParentScope
  @scala.inline
  def content_parent: content_parent = "content_parent".asInstanceOf[content_parent]
  
  @js.native
  sealed trait content_script extends OnExtensionActivityDetailsType
  @scala.inline
  def content_script: content_script = "content_script".asInstanceOf[content_script]
  
  @js.native
  sealed trait contextMenus extends _PermissionNoPrompt
  @scala.inline
  def contextMenus: contextMenus = "contextMenus".asInstanceOf[contextMenus]
  
  @js.native
  sealed trait contextmenu extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  @scala.inline
  def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  
  @js.native
  sealed trait contextualIdentities extends _PermissionNoPrompt
  @scala.inline
  def contextualIdentities: contextualIdentities = "contextualIdentities".asInstanceOf[contextualIdentities]
  
  @js.native
  sealed trait controllable_by_this_extension extends LevelOfControl
  @scala.inline
  def controllable_by_this_extension: controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[controllable_by_this_extension]
  
  @js.native
  sealed trait controlled_by_other_extensions extends LevelOfControl
  @scala.inline
  def controlled_by_other_extensions: controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[controlled_by_other_extensions]
  
  @js.native
  sealed trait controlled_by_this_extension extends LevelOfControl
  @scala.inline
  def controlled_by_this_extension: controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[controlled_by_this_extension]
  
  @js.native
  sealed trait cookies extends _OptionalPermissionNoPrompt
  @scala.inline
  def cookies: cookies = "cookies".asInstanceOf[cookies]
  
  @js.native
  sealed trait count extends ScalarType
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait cros extends PlatformOs
  @scala.inline
  def cros: cros = "cros".asInstanceOf[cros]
  
  @js.native
  sealed trait cryptomining extends UrlClassificationFlags
  @scala.inline
  def cryptomining: cryptomining = "cryptomining".asInstanceOf[cryptomining]
  
  @js.native
  sealed trait cryptomining_content extends UrlClassificationFlags
  @scala.inline
  def cryptomining_content: cryptomining_content = "cryptomining_content".asInstanceOf[cryptomining_content]
  
  @js.native
  sealed trait csp_report extends ResourceType
  @scala.inline
  def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @js.native
  sealed trait currentTab extends OnInputEnteredDisposition
  @scala.inline
  def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @js.native
  sealed trait dat extends ProtocolHandlerProtocol
  @scala.inline
  def dat: dat = "dat".asInstanceOf[dat]
  
  @js.native
  sealed trait default_public_and_private_interfaces extends IPHandlingPolicy
  @scala.inline
  def default_public_and_private_interfaces: default_public_and_private_interfaces = "default_public_and_private_interfaces".asInstanceOf[default_public_and_private_interfaces]
  
  @js.native
  sealed trait default_public_interface_only extends IPHandlingPolicy
  @scala.inline
  def default_public_interface_only: default_public_interface_only = "default_public_interface_only".asInstanceOf[default_public_interface_only]
  
  @js.native
  sealed trait denied extends PermissionLevel
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait detached_panel extends CreateType
  @scala.inline
  def detached_panel: detached_panel = "detached_panel".asInstanceOf[detached_panel]
  
  @js.native
  sealed trait development extends ExtensionInstallType
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait devtools
    extends WindowType
       with typingsSlinky.firefoxWebextBrowser.browser.tabs.WindowType
       with _OptionalPermission
  @scala.inline
  def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @js.native
  sealed trait devtools_child extends APIChildScope
  @scala.inline
  def devtools_child: devtools_child = "devtools_child".asInstanceOf[devtools_child]
  
  @js.native
  sealed trait devtools_page extends OnExtensionActivityDetailsViewType
  @scala.inline
  def devtools_page: devtools_page = "devtools_page".asInstanceOf[devtools_page]
  
  @js.native
  sealed trait devtools_panel extends OnExtensionActivityDetailsViewType
  @scala.inline
  def devtools_panel: devtools_panel = "devtools_panel".asInstanceOf[devtools_panel]
  
  @js.native
  sealed trait devtools_parent extends APIParentScope
  @scala.inline
  def devtools_parent: devtools_parent = "devtools_parent".asInstanceOf[devtools_parent]
  
  @js.native
  sealed trait dim extends DescriptionStyleType
  @scala.inline
  def dim: dim = "dim".asInstanceOf[dim]
  
  @js.native
  sealed trait disable_ipv4 extends _ResolveFlags
  @scala.inline
  def disable_ipv4: disable_ipv4 = "disable_ipv4".asInstanceOf[disable_ipv4]
  
  @js.native
  sealed trait disable_ipv6 extends _ResolveFlags
  @scala.inline
  def disable_ipv6: disable_ipv6 = "disable_ipv6".asInstanceOf[disable_ipv6]
  
  @js.native
  sealed trait disable_non_proxied_udp extends IPHandlingPolicy
  @scala.inline
  def disable_non_proxied_udp: disable_non_proxied_udp = "disable_non_proxied_udp".asInstanceOf[disable_non_proxied_udp]
  
  @js.native
  sealed trait disable_trr extends _ResolveFlags
  @scala.inline
  def disable_trr: disable_trr = "disable_trr".asInstanceOf[disable_trr]
  
  @js.native
  sealed trait disabled extends ZoomSettingsMode
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait discard extends EngagementState
  @scala.inline
  def discard: discard = "discard".asInstanceOf[discard]
  
  @js.native
  sealed trait discarded extends UpdatePropertyName
  @scala.inline
  def discarded: discarded = "discarded".asInstanceOf[discarded]
  
  @js.native
  sealed trait disconnected extends StreamFilterStatus
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait dns extends _PermissionNoPrompt
  @scala.inline
  def dns: dns = "dns".asInstanceOf[dns]
  
  @js.native
  sealed trait docked extends WindowState
  @scala.inline
  def docked: docked = "docked".asInstanceOf[docked]
  
  @js.native
  sealed trait document_end extends RunAt
  @scala.inline
  def document_end: document_end = "document_end".asInstanceOf[document_end]
  
  @js.native
  sealed trait document_idle extends RunAt
  @scala.inline
  def document_idle: document_idle = "document_idle".asInstanceOf[document_idle]
  
  @js.native
  sealed trait document_start extends RunAt
  @scala.inline
  def document_start: document_start = "document_start".asInstanceOf[document_start]
  
  @js.native
  sealed trait down extends NetworkLinkInfoStatus
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait downloads extends _OptionalPermission
  @scala.inline
  def downloads: downloads = "downloads".asInstanceOf[downloads]
  
  @js.native
  sealed trait downloadsDotopen extends _OptionalPermission
  @scala.inline
  def downloadsDotopen: downloadsDotopen = "downloads.open".asInstanceOf[downloadsDotopen]
  
  @js.native
  sealed trait dweb extends ProtocolHandlerProtocol
  @scala.inline
  def dweb: dweb = "dweb".asInstanceOf[dweb]
  
  @js.native
  sealed trait dynamic extends ResultType
  @scala.inline
  def dynamic: dynamic = "dynamic".asInstanceOf[dynamic]
  
  @js.native
  sealed trait editable
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def editable: editable = "editable".asInstanceOf[editable]
  
  @js.native
  sealed trait engagement extends EngagementState
  @scala.inline
  def engagement: engagement = "engagement".asInstanceOf[engagement]
  
  @js.native
  sealed trait ethernet extends NetworkLinkInfoType
  @scala.inline
  def ethernet: ethernet = "ethernet".asInstanceOf[ethernet]
  
  @js.native
  sealed trait evicted extends OnChangedCause
  @scala.inline
  def evicted: evicted = "evicted".asInstanceOf[evicted]
  
  @js.native
  sealed trait expired extends OnChangedCause
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  
  @js.native
  sealed trait expired_overwrite extends OnChangedCause
  @scala.inline
  def expired_overwrite: expired_overwrite = "expired_overwrite".asInstanceOf[expired_overwrite]
  
  @js.native
  sealed trait explicit extends OnChangedCause
  @scala.inline
  def explicit: explicit = "explicit".asInstanceOf[explicit]
  
  @js.native
  sealed trait extension
    extends ExtensionType
       with MutedInfoReason
  @scala.inline
  def extension: extension = "extension".asInstanceOf[extension]
  
  @js.native
  sealed trait failed extends StreamFilterStatus
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait favIconUrl extends UpdatePropertyName
  @scala.inline
  def favIconUrl: favIconUrl = "favIconUrl".asInstanceOf[favIconUrl]
  
  @js.native
  sealed trait file extends DangerType
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fileio extends ProfilerFeature
  @scala.inline
  def fileio: fileio = "fileio".asInstanceOf[fileio]
  
  @js.native
  sealed trait fileioall extends ProfilerFeature
  @scala.inline
  def fileioall: fileioall = "fileioall".asInstanceOf[fileioall]
  
  @js.native
  sealed trait find extends _OptionalPermission
  @scala.inline
  def find: find = "find".asInstanceOf[find]
  
  @js.native
  sealed trait fingerprinting extends UrlClassificationFlags
  @scala.inline
  def fingerprinting: fingerprinting = "fingerprinting".asInstanceOf[fingerprinting]
  
  @js.native
  sealed trait fingerprinting_content extends UrlClassificationFlags
  @scala.inline
  def fingerprinting_content: fingerprinting_content = "fingerprinting_content".asInstanceOf[fingerprinting_content]
  
  @js.native
  sealed trait finishedtransferringdata extends StreamFilterStatus
  @scala.inline
  def finishedtransferringdata: finishedtransferringdata = "finishedtransferringdata".asInstanceOf[finishedtransferringdata]
  
  @js.native
  sealed trait folder extends BookmarkTreeNodeType
  @scala.inline
  def folder: folder = "folder".asInstanceOf[folder]
  
  @js.native
  sealed trait font extends ResourceType
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait form_submit
    extends TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def form_submit: form_submit = "form_submit".asInstanceOf[form_submit]
  
  @js.native
  sealed trait forward_back extends TransitionQualifier
  @scala.inline
  def forward_back: forward_back = "forward_back".asInstanceOf[forward_back]
  
  @js.native
  sealed trait frame
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait from_address_bar extends TransitionQualifier
  @scala.inline
  def from_address_bar: from_address_bar = "from_address_bar".asInstanceOf[from_address_bar]
  
  @js.native
  sealed trait fullscreen extends WindowState
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait geckoProfiler extends _PermissionNoPrompt
  @scala.inline
  def geckoProfiler: geckoProfiler = "geckoProfiler".asInstanceOf[geckoProfiler]
  
  @js.native
  sealed trait generated
    extends TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def generated: generated = "generated".asInstanceOf[generated]
  
  @js.native
  sealed trait geo extends ProtocolHandlerProtocol
  @scala.inline
  def geo: geo = "geo".asInstanceOf[geo]
  
  @js.native
  sealed trait geolocation extends _OptionalPermission
  @scala.inline
  def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @js.native
  sealed trait gopher extends ProtocolHandlerProtocol
  @scala.inline
  def gopher: gopher = "gopher".asInstanceOf[gopher]
  
  @js.native
  sealed trait granted extends PermissionLevel
  @scala.inline
  def granted: granted = "granted".asInstanceOf[granted]
  
  @js.native
  sealed trait hidden extends UpdatePropertyName
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait history
    extends SourceType
       with _OptionalPermission
  @scala.inline
  def history: history = "history".asInstanceOf[history]
  
  @js.native
  sealed trait homepage extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  @scala.inline
  def homepage: homepage = "homepage".asInstanceOf[homepage]
  
  @js.native
  sealed trait host extends DangerType
  @scala.inline
  def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait identity extends _PermissionNoPrompt
  @scala.inline
  def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait idle
    extends IdleState
       with _OptionalPermissionNoPrompt
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait im extends ProtocolHandlerProtocol
  @scala.inline
  def im: im = "im".asInstanceOf[im]
  
  @js.native
  sealed trait image
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
       with ResourceType
       with TemplateType
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait imageset extends ResourceType
  @scala.inline
  def imageset: imageset = "imageset".asInstanceOf[imageset]
  
  @js.native
  sealed trait in_progress extends State
  @scala.inline
  def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  
  @js.native
  sealed trait inactive extends StObject
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait incognito_persistent extends SettingScope
  @scala.inline
  def incognito_persistent: incognito_persistent = "incognito_persistent".asInstanceOf[incognito_persistent]
  
  @js.native
  sealed trait incognito_session_only extends SettingScope
  @scala.inline
  def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @js.native
  sealed trait insecure extends SecurityInfoState
  @scala.inline
  def insecure: insecure = "insecure".asInstanceOf[insecure]
  
  @js.native
  sealed trait install extends OnInstalledReason
  @scala.inline
  def install: install = "install".asInstanceOf[install]
  
  @js.native
  sealed trait interrupted extends State
  @scala.inline
  def interrupted: interrupted = "interrupted".asInstanceOf[interrupted]
  
  @js.native
  sealed trait ipcmessages extends ProfilerFeature
  @scala.inline
  def ipcmessages: ipcmessages = "ipcmessages".asInstanceOf[ipcmessages]
  
  @js.native
  sealed trait ipfs extends ProtocolHandlerProtocol
  @scala.inline
  def ipfs: ipfs = "ipfs".asInstanceOf[ipfs]
  
  @js.native
  sealed trait ipns extends ProtocolHandlerProtocol
  @scala.inline
  def ipns: ipns = "ipns".asInstanceOf[ipns]
  
  @js.native
  sealed trait irc extends ProtocolHandlerProtocol
  @scala.inline
  def irc: irc = "irc".asInstanceOf[irc]
  
  @js.native
  sealed trait ircs extends ProtocolHandlerProtocol
  @scala.inline
  def ircs: ircs = "ircs".asInstanceOf[ircs]
  
  @js.native
  sealed trait isArticle extends UpdatePropertyName
  @scala.inline
  def isArticle: isArticle = "isArticle".asInstanceOf[isArticle]
  
  @js.native
  sealed trait java_ extends ProfilerFeature
  @scala.inline
  def java_ : java_ = "java".asInstanceOf[java_]
  
  @js.native
  sealed trait jpeg
    extends ImageFormat
       with SetImageDataImageType
  @scala.inline
  def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @js.native
  sealed trait js_ extends ProfilerFeature
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait jsallocations extends ProfilerFeature
  @scala.inline
  def jsallocations: jsallocations = "jsallocations".asInstanceOf[jsallocations]
  
  @js.native
  sealed trait jstracer extends ProfilerFeature
  @scala.inline
  def jstracer: jstracer = "jstracer".asInstanceOf[jstracer]
  
  @js.native
  sealed trait keyword
    extends TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  @scala.inline
  def keyword: keyword = "keyword".asInstanceOf[keyword]
  
  @js.native
  sealed trait keyword_generated
    extends TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def keyword_generated: keyword_generated = "keyword_generated".asInstanceOf[keyword_generated]
  
  @js.native
  sealed trait launcher
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def launcher: launcher = "launcher".asInstanceOf[launcher]
  
  @js.native
  sealed trait lax extends SameSiteStatus
  @scala.inline
  def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait leaf extends ProfilerFeature
  @scala.inline
  def leaf: leaf = "leaf".asInstanceOf[leaf]
  
  @js.native
  sealed trait left extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `left bottom` extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def `left bottom`: `left bottom` = ("left bottom").asInstanceOf[`left bottom`]
  
  @js.native
  sealed trait `left center` extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def `left center`: `left center` = ("left center").asInstanceOf[`left center`]
  
  @js.native
  sealed trait `left top` extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def `left top`: `left top` = ("left top").asInstanceOf[`left top`]
  
  @js.native
  sealed trait link
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
       with TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linux extends PlatformOs
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  
  @js.native
  sealed trait list extends TemplateType
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait loading extends TabStatus
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait local extends SourceType
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait locked_portal extends OnStateChangedDetailsState
  @scala.inline
  def locked_portal: locked_portal = "locked_portal".asInstanceOf[locked_portal]
  
  @js.native
  sealed trait mac extends PlatformOs
  @scala.inline
  def mac: mac = "mac".asInstanceOf[mac]
  
  @js.native
  sealed trait magnet extends ProtocolHandlerProtocol
  @scala.inline
  def magnet: magnet = "magnet".asInstanceOf[magnet]
  
  @js.native
  sealed trait mailto extends ProtocolHandlerProtocol
  @scala.inline
  def mailto: mailto = "mailto".asInstanceOf[mailto]
  
  @js.native
  sealed trait main_frame extends ResourceType
  @scala.inline
  def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @js.native
  sealed trait mainthreadio extends ProfilerFeature
  @scala.inline
  def mainthreadio: mainthreadio = "mainthreadio".asInstanceOf[mainthreadio]
  
  @js.native
  sealed trait managed extends StObject
  @scala.inline
  def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait management extends _OptionalPermission
  @scala.inline
  def management: management = "management".asInstanceOf[management]
  
  @js.native
  sealed trait manual
    extends ProxyConfigProxyType
       with ZoomSettingsMode
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait manual_subframe
    extends TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def manual_subframe: manual_subframe = "manual_subframe".asInstanceOf[manual_subframe]
  
  @js.native
  sealed trait `match` extends DescriptionStyleType
  @scala.inline
  def `match`: `match` = "match".asInstanceOf[`match`]
  
  @js.native
  sealed trait maximized extends WindowState
  @scala.inline
  def maximized: maximized = "maximized".asInstanceOf[maximized]
  
  @js.native
  sealed trait media extends ResourceType
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait menupanel extends WebExtensionManifestBrowserActionDefaultArea
  @scala.inline
  def menupanel: menupanel = "menupanel".asInstanceOf[menupanel]
  
  @js.native
  sealed trait menus extends _PermissionNoPrompt
  @scala.inline
  def menus: menus = "menus".asInstanceOf[menus]
  
  @js.native
  sealed trait menusDotoverrideContext extends _OptionalPermissionNoPrompt
  @scala.inline
  def menusDotoverrideContext: menusDotoverrideContext = "menus.overrideContext".asInstanceOf[menusDotoverrideContext]
  
  @js.native
  sealed trait minimized extends WindowState
  @scala.inline
  def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait mms extends ProtocolHandlerProtocol
  @scala.inline
  def mms: mms = "mms".asInstanceOf[mms]
  
  @js.native
  sealed trait mousedown extends ContextMenuMouseEvent
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @js.native
  sealed trait mouseup extends ContextMenuMouseEvent
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @js.native
  sealed trait mozillaAddons extends _PermissionNoPrompt
  @scala.inline
  def mozillaAddons: mozillaAddons = "mozillaAddons".asInstanceOf[mozillaAddons]
  
  @js.native
  sealed trait mutedInfo extends UpdatePropertyName
  @scala.inline
  def mutedInfo: mutedInfo = "mutedInfo".asInstanceOf[mutedInfo]
  
  @js.native
  sealed trait nativeMessaging extends StObject
  @scala.inline
  def nativeMessaging: nativeMessaging = "nativeMessaging".asInstanceOf[nativeMessaging]
  
  @js.native
  sealed trait nativeallocations extends ProfilerFeature
  @scala.inline
  def nativeallocations: nativeallocations = "nativeallocations".asInstanceOf[nativeallocations]
  
  @js.native
  sealed trait navbar extends WebExtensionManifestBrowserActionDefaultArea
  @scala.inline
  def navbar: navbar = "navbar".asInstanceOf[navbar]
  
  @js.native
  sealed trait network extends SourceType
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait networkStatus extends _PermissionNoPrompt
  @scala.inline
  def networkStatus: networkStatus = "networkStatus".asInstanceOf[networkStatus]
  
  @js.native
  sealed trait never extends TrackingProtectionModeOption
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait newBackgroundTab extends OnInputEnteredDisposition
  @scala.inline
  def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  
  @js.native
  sealed trait newForegroundTab extends OnInputEnteredDisposition
  @scala.inline
  def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  
  @js.native
  sealed trait news extends ProtocolHandlerProtocol
  @scala.inline
  def news: news = "news".asInstanceOf[news]
  
  @js.native
  sealed trait newtab extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  @scala.inline
  def newtab: newtab = "newtab".asInstanceOf[newtab]
  
  @js.native
  sealed trait nntp extends ProtocolHandlerProtocol
  @scala.inline
  def nntp: nntp = "nntp".asInstanceOf[nntp]
  
  @js.native
  sealed trait `no-repeat` extends ThemeTypeAdditionalBackgroundsTiling
  @scala.inline
  def `no-repeat`: `no-repeat` = "no-repeat".asInstanceOf[`no-repeat`]
  
  @js.native
  sealed trait no_restriction extends SameSiteStatus
  @scala.inline
  def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @js.native
  sealed trait no_update extends RequestUpdateCheckStatus
  @scala.inline
  def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @js.native
  sealed trait noiostacks extends ProfilerFeature
  @scala.inline
  def noiostacks: noiostacks = "noiostacks".asInstanceOf[noiostacks]
  
  @js.native
  sealed trait none
    extends ImageAnimationBehavior
       with ProxyConfigProxyType
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal
    extends CreateType
       with ExtensionInstallType
       with ImageAnimationBehavior
       with ItemType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ItemType
       with WindowState
       with WindowType
       with typingsSlinky.firefoxWebextBrowser.browser.tabs.WindowType
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait normandyAddonStudy extends _PermissionNoPrompt
  @scala.inline
  def normandyAddonStudy: normandyAddonStudy = "normandyAddonStudy".asInstanceOf[normandyAddonStudy]
  
  @js.native
  sealed trait nostacksampling extends ProfilerFeature
  @scala.inline
  def nostacksampling: nostacksampling = "nostacksampling".asInstanceOf[nostacksampling]
  
  @js.native
  sealed trait not_allowed extends WebExtensionManifestIncognito
  @scala.inline
  def not_allowed: not_allowed = "not_allowed".asInstanceOf[not_allowed]
  
  @js.native
  sealed trait not_applicable extends CertificateTransparencyStatus
  @scala.inline
  def not_applicable: not_applicable = "not_applicable".asInstanceOf[not_applicable]
  
  @js.native
  sealed trait not_captive extends OnStateChangedDetailsState
  @scala.inline
  def not_captive: not_captive = "not_captive".asInstanceOf[not_captive]
  
  @js.native
  sealed trait not_controllable extends LevelOfControl
  @scala.inline
  def not_controllable: not_controllable = "not_controllable".asInstanceOf[not_controllable]
  
  @js.native
  sealed trait notifications extends _OptionalPermission
  @scala.inline
  def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @js.native
  sealed trait `object` extends ResourceType
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait object_subrequest extends ResourceType
  @scala.inline
  def object_subrequest: object_subrequest = "object_subrequest".asInstanceOf[object_subrequest]
  
  @js.native
  sealed trait offline extends _ResolveFlags
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait once extends ImageAnimationBehavior
  @scala.inline
  def once: once = "once".asInstanceOf[once]
  
  @js.native
  sealed trait openbsd extends PlatformOs
  @scala.inline
  def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  
  @js.native
  sealed trait os_update extends OnRestartRequiredReason
  @scala.inline
  def os_update: os_update = "os_update".asInstanceOf[os_update]
  
  @js.native
  sealed trait other
    extends ExtensionInstallType
       with ResourceType
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait overwrite
    extends FilenameConflictAction
       with OnChangedCause
  @scala.inline
  def overwrite: overwrite = "overwrite".asInstanceOf[overwrite]
  
  @js.native
  sealed trait page
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait page_action
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def page_action: page_action = "page_action".asInstanceOf[page_action]
  
  @js.native
  sealed trait panel
    extends CreateType
       with WindowType
       with typingsSlinky.firefoxWebextBrowser.browser.tabs.WindowType
  @scala.inline
  def panel: panel = "panel".asInstanceOf[panel]
  
  @js.native
  sealed trait password
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait `per-origin` extends ZoomSettingsScope
  @scala.inline
  def `per-origin`: `per-origin` = "per-origin".asInstanceOf[`per-origin`]
  
  @js.native
  sealed trait `per-tab` extends ZoomSettingsScope
  @scala.inline
  def `per-tab`: `per-tab` = "per-tab".asInstanceOf[`per-tab`]
  
  @js.native
  sealed trait periodic extends OnRestartRequiredReason
  @scala.inline
  def periodic: periodic = "periodic".asInstanceOf[periodic]
  
  @js.native
  sealed trait permissions_increase extends ExtensionDisabledReason
  @scala.inline
  def permissions_increase: permissions_increase = "permissions_increase".asInstanceOf[permissions_increase]
  
  @js.native
  sealed trait personaltoolbar extends WebExtensionManifestBrowserActionDefaultArea
  @scala.inline
  def personaltoolbar: personaltoolbar = "personaltoolbar".asInstanceOf[personaltoolbar]
  
  @js.native
  sealed trait ping extends ResourceType
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait pinned extends UpdatePropertyName
  @scala.inline
  def pinned: pinned = "pinned".asInstanceOf[pinned]
  
  @js.native
  sealed trait pkcs11 extends _OptionalPermission
  @scala.inline
  def pkcs11: pkcs11 = "pkcs11".asInstanceOf[pkcs11]
  
  @js.native
  sealed trait png
    extends ImageFormat
       with SetImageDataImageType
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait policy_compliant extends CertificateTransparencyStatus
  @scala.inline
  def policy_compliant: policy_compliant = "policy_compliant".asInstanceOf[policy_compliant]
  
  @js.native
  sealed trait policy_not_diverse_scts extends CertificateTransparencyStatus
  @scala.inline
  def policy_not_diverse_scts: policy_not_diverse_scts = "policy_not_diverse_scts".asInstanceOf[policy_not_diverse_scts]
  
  @js.native
  sealed trait policy_not_enough_scts extends CertificateTransparencyStatus
  @scala.inline
  def policy_not_enough_scts: policy_not_enough_scts = "policy_not_enough_scts".asInstanceOf[policy_not_enough_scts]
  
  @js.native
  sealed trait popup
    extends CreateType
       with OnExtensionActivityDetailsViewType
       with ViewType
       with WindowType
       with typingsSlinky.firefoxWebextBrowser.browser.tabs.WindowType
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait pref extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
  @scala.inline
  def pref: pref = "pref".asInstanceOf[pref]
  
  @js.native
  sealed trait preferencereads extends ProfilerFeature
  @scala.inline
  def preferencereads: preferencereads = "preferencereads".asInstanceOf[preferencereads]
  
  @js.native
  sealed trait priority_low extends _ResolveFlags
  @scala.inline
  def priority_low: priority_low = "priority_low".asInstanceOf[priority_low]
  
  @js.native
  sealed trait priority_medium extends _ResolveFlags
  @scala.inline
  def priority_medium: priority_medium = "priority_medium".asInstanceOf[priority_medium]
  
  @js.native
  sealed trait privacy extends _OptionalPermission
  @scala.inline
  def privacy: privacy = "privacy".asInstanceOf[privacy]
  
  @js.native
  sealed trait private_browsing extends TrackingProtectionModeOption
  @scala.inline
  def private_browsing: private_browsing = "private_browsing".asInstanceOf[private_browsing]
  
  @js.native
  sealed trait progress extends TemplateType
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait prompt extends FilenameConflictAction
  @scala.inline
  def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @js.native
  sealed trait proxy extends _OptionalPermission
  @scala.inline
  def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @js.native
  sealed trait proxy_only extends IPHandlingPolicy
  @scala.inline
  def proxy_only: proxy_only = "proxy_only".asInstanceOf[proxy_only]
  
  @js.native
  sealed trait purpose extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
  @scala.inline
  def purpose: purpose = "purpose".asInstanceOf[purpose]
  
  @js.native
  sealed trait radio
    extends ItemType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ItemType
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait regular extends SettingScope
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait regular_only extends SettingScope
  @scala.inline
  def regular_only: regular_only = "regular_only".asInstanceOf[regular_only]
  
  @js.native
  sealed trait reject_all extends CookieConfigBehavior
  @scala.inline
  def reject_all: reject_all = "reject_all".asInstanceOf[reject_all]
  
  @js.native
  sealed trait reject_third_party extends CookieConfigBehavior
  @scala.inline
  def reject_third_party: reject_third_party = "reject_third_party".asInstanceOf[reject_third_party]
  
  @js.native
  sealed trait reject_trackers extends CookieConfigBehavior
  @scala.inline
  def reject_trackers: reject_trackers = "reject_trackers".asInstanceOf[reject_trackers]
  
  @js.native
  sealed trait reject_trackers_and_partition_foreign extends CookieConfigBehavior
  @scala.inline
  def reject_trackers_and_partition_foreign: reject_trackers_and_partition_foreign = "reject_trackers_and_partition_foreign".asInstanceOf[reject_trackers_and_partition_foreign]
  
  @js.native
  sealed trait reload
    extends TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait remote_tab extends ResultType
  @scala.inline
  def remote_tab: remote_tab = "remote_tab".asInstanceOf[remote_tab]
  
  @js.native
  sealed trait repeat extends ThemeTypeAdditionalBackgroundsTiling
  @scala.inline
  def repeat: repeat = "repeat".asInstanceOf[repeat]
  
  @js.native
  sealed trait `repeat-x` extends ThemeTypeAdditionalBackgroundsTiling
  @scala.inline
  def `repeat-x`: `repeat-x` = "repeat-x".asInstanceOf[`repeat-x`]
  
  @js.native
  sealed trait `repeat-y` extends ThemeTypeAdditionalBackgroundsTiling
  @scala.inline
  def `repeat-y`: `repeat-y` = "repeat-y".asInstanceOf[`repeat-y`]
  
  @js.native
  sealed trait requestBody extends OnBeforeRequestOptions
  @scala.inline
  def requestBody: requestBody = "requestBody".asInstanceOf[requestBody]
  
  @js.native
  sealed trait requestHeaders extends OnBeforeSendHeadersOptions
  @scala.inline
  def requestHeaders: requestHeaders = "requestHeaders".asInstanceOf[requestHeaders]
  
  @js.native
  sealed trait responseHeaders
    extends OnAuthRequiredOptions
       with OnHeadersReceivedOptions
  @scala.inline
  def responseHeaders: responseHeaders = "responseHeaders".asInstanceOf[responseHeaders]
  
  @js.native
  sealed trait responsiveness extends ProfilerFeature
  @scala.inline
  def responsiveness: responsiveness = "responsiveness".asInstanceOf[responsiveness]
  
  @js.native
  sealed trait restricting extends StObject
  @scala.inline
  def restricting: restricting = "restricting".asInstanceOf[restricting]
  
  @js.native
  sealed trait right extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `right bottom` extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def `right bottom`: `right bottom` = ("right bottom").asInstanceOf[`right bottom`]
  
  @js.native
  sealed trait `right center` extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def `right center`: `right center` = ("right center").asInstanceOf[`right center`]
  
  @js.native
  sealed trait `right top` extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def `right top`: `right top` = ("right top").asInstanceOf[`right top`]
  
  @js.native
  sealed trait safe extends DangerType
  @scala.inline
  def safe: safe = "safe".asInstanceOf[safe]
  
  @js.native
  sealed trait screenshots extends ProfilerFeature
  @scala.inline
  def screenshots: screenshots = "screenshots".asInstanceOf[screenshots]
  
  @js.native
  sealed trait script extends ResourceType
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait search
    extends MostVisitedURLType
       with ResultType
       with SourceType
       with _OptionalPermissionNoPrompt
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait searchbar extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  @scala.inline
  def searchbar: searchbar = "searchbar".asInstanceOf[searchbar]
  
  @js.native
  sealed trait secure extends SecurityInfoState
  @scala.inline
  def secure: secure = "secure".asInstanceOf[secure]
  
  @js.native
  sealed trait selection
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def selection: selection = "selection".asInstanceOf[selection]
  
  @js.native
  sealed trait separator
    extends BookmarkTreeNodeType
       with ItemType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ItemType
  @scala.inline
  def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait seqstyle extends ProfilerFeature
  @scala.inline
  def seqstyle: seqstyle = "seqstyle".asInstanceOf[seqstyle]
  
  @js.native
  sealed trait server_redirect extends TransitionQualifier
  @scala.inline
  def server_redirect: server_redirect = "server_redirect".asInstanceOf[server_redirect]
  
  @js.native
  sealed trait sessions extends _OptionalPermission
  @scala.inline
  def sessions: sessions = "sessions".asInstanceOf[sessions]
  
  @js.native
  sealed trait sharingState extends UpdatePropertyName
  @scala.inline
  def sharingState: sharingState = "sharingState".asInstanceOf[sharingState]
  
  @js.native
  sealed trait sidebar
    extends OnExtensionActivityDetailsViewType
       with ViewType
  @scala.inline
  def sidebar: sidebar = "sidebar".asInstanceOf[sidebar]
  
  @js.native
  sealed trait sideload extends ExtensionInstallType
  @scala.inline
  def sideload: sideload = "sideload".asInstanceOf[sideload]
  
  @js.native
  sealed trait sip extends ProtocolHandlerProtocol
  @scala.inline
  def sip: sip = "sip".asInstanceOf[sip]
  
  @js.native
  sealed trait sms extends ProtocolHandlerProtocol
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait smsto extends ProtocolHandlerProtocol
  @scala.inline
  def smsto: smsto = "smsto".asInstanceOf[smsto]
  
  @js.native
  sealed trait spanning extends WebExtensionManifestIncognito
  @scala.inline
  def spanning: spanning = "spanning".asInstanceOf[spanning]
  
  @js.native
  sealed trait speculate extends _ResolveFlags
  @scala.inline
  def speculate: speculate = "speculate".asInstanceOf[speculate]
  
  @js.native
  sealed trait speculative extends ResourceType
  @scala.inline
  def speculative: speculative = "speculative".asInstanceOf[speculative]
  
  @js.native
  sealed trait ssb extends ProtocolHandlerProtocol
  @scala.inline
  def ssb: ssb = "ssb".asInstanceOf[ssb]
  
  @js.native
  sealed trait ssh extends ProtocolHandlerProtocol
  @scala.inline
  def ssh: ssh = "ssh".asInstanceOf[ssh]
  
  @js.native
  sealed trait stackwalk extends ProfilerFeature
  @scala.inline
  def stackwalk: stackwalk = "stackwalk".asInstanceOf[stackwalk]
  
  @js.native
  sealed trait start extends EngagementState
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait start_page extends TransitionType
  @scala.inline
  def start_page: start_page = "start_page".asInstanceOf[start_page]
  
  @js.native
  sealed trait startup extends StObject
  @scala.inline
  def startup: startup = "startup".asInstanceOf[startup]
  
  @js.native
  sealed trait status extends UpdatePropertyName
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait stdio extends StObject
  @scala.inline
  def stdio: stdio = "stdio".asInstanceOf[stdio]
  
  @js.native
  sealed trait storage extends _PermissionNoPrompt
  @scala.inline
  def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait strict extends SameSiteStatus
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait string extends ScalarType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait stylesheet extends ResourceType
  @scala.inline
  def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait sub_frame extends ResourceType
  @scala.inline
  def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @js.native
  sealed trait suspended extends StreamFilterStatus
  @scala.inline
  def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @js.native
  sealed trait system extends ProxyConfigProxyType
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait tab
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
       with OnExtensionActivityDetailsViewType
       with OverrideContextContextOptionsContext
       with typingsSlinky.firefoxWebextBrowser.browser.menus.OverrideContextContextOptionsContext
       with ResultType
       with ViewType
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait tabHide extends _OptionalPermission
  @scala.inline
  def tabHide: tabHide = "tabHide".asInstanceOf[tabHide]
  
  @js.native
  sealed trait tabs
    extends SourceType
       with _OptionalPermission
  @scala.inline
  def tabs: tabs = "tabs".asInstanceOf[tabs]
  
  @js.native
  sealed trait tabstrip extends WebExtensionManifestBrowserActionDefaultArea
  @scala.inline
  def tabstrip: tabstrip = "tabstrip".asInstanceOf[tabstrip]
  
  @js.native
  sealed trait tasktracer extends ProfilerFeature
  @scala.inline
  def tasktracer: tasktracer = "tasktracer".asInstanceOf[tasktracer]
  
  @js.native
  sealed trait tel extends ProtocolHandlerProtocol
  @scala.inline
  def tel: tel = "tel".asInstanceOf[tel]
  
  @js.native
  sealed trait telemetry extends _PermissionNoPrompt
  @scala.inline
  def telemetry: telemetry = "telemetry".asInstanceOf[telemetry]
  
  @js.native
  sealed trait theme
    extends ExtensionType
       with _PermissionNoPrompt
  @scala.inline
  def theme: theme = "theme".asInstanceOf[theme]
  
  @js.native
  sealed trait threads extends ProfilerFeature
  @scala.inline
  def threads: threads = "threads".asInstanceOf[threads]
  
  @js.native
  sealed trait throttled extends RequestUpdateCheckStatus
  @scala.inline
  def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @js.native
  sealed trait tip extends ResultType
  @scala.inline
  def tip: tip = "tip".asInstanceOf[tip]
  
  @js.native
  sealed trait title extends UpdatePropertyName
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait tools_menu
    extends typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def tools_menu: tools_menu = "tools_menu".asInstanceOf[tools_menu]
  
  @js.native
  sealed trait top extends ThemeTypeAdditionalBackgroundsAlignment
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait topSites extends _OptionalPermission
  @scala.inline
  def topSites: topSites = "topSites".asInstanceOf[topSites]
  
  @js.native
  sealed trait tracking extends UrlClassificationFlags
  @scala.inline
  def tracking: tracking = "tracking".asInstanceOf[tracking]
  
  @js.native
  sealed trait tracking_ad extends UrlClassificationFlags
  @scala.inline
  def tracking_ad: tracking_ad = "tracking_ad".asInstanceOf[tracking_ad]
  
  @js.native
  sealed trait tracking_analytics extends UrlClassificationFlags
  @scala.inline
  def tracking_analytics: tracking_analytics = "tracking_analytics".asInstanceOf[tracking_analytics]
  
  @js.native
  sealed trait tracking_content extends UrlClassificationFlags
  @scala.inline
  def tracking_content: tracking_content = "tracking_content".asInstanceOf[tracking_content]
  
  @js.native
  sealed trait tracking_social extends UrlClassificationFlags
  @scala.inline
  def tracking_social: tracking_social = "tracking_social".asInstanceOf[tracking_social]
  
  @js.native
  sealed trait transferringdata extends StreamFilterStatus
  @scala.inline
  def transferringdata: transferringdata = "transferringdata".asInstanceOf[transferringdata]
  
  @js.native
  sealed trait typed
    extends TransitionType
       with typingsSlinky.firefoxWebextBrowser.browser.history.TransitionType
  @scala.inline
  def typed: typed = "typed".asInstanceOf[typed]
  
  @js.native
  sealed trait uncommon extends DangerType
  @scala.inline
  def uncommon: uncommon = "uncommon".asInstanceOf[uncommon]
  
  @js.native
  sealed trait uninitialized extends StreamFilterStatus
  @scala.inline
  def uninitialized: uninitialized = "uninitialized".asInstanceOf[uninitialized]
  
  @js.native
  sealed trait uniquify extends FilenameConflictAction
  @scala.inline
  def uniquify: uniquify = "uniquify".asInstanceOf[uniquify]
  
  @js.native
  sealed trait unknown
    extends ExtensionDisabledReason
       with NetworkLinkInfoStatus
       with NetworkLinkInfoType
       with OnStateChangedDetailsState
       with SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unlimitedStorage extends _PermissionNoPrompt
  @scala.inline
  def unlimitedStorage: unlimitedStorage = "unlimitedStorage".asInstanceOf[unlimitedStorage]
  
  @js.native
  sealed trait unlocked_portal extends OnStateChangedDetailsState
  @scala.inline
  def unlocked_portal: unlocked_portal = "unlocked_portal".asInstanceOf[unlocked_portal]
  
  @js.native
  sealed trait unwanted extends DangerType
  @scala.inline
  def unwanted: unwanted = "unwanted".asInstanceOf[unwanted]
  
  @js.native
  sealed trait up extends NetworkLinkInfoStatus
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait update extends OnInstalledReason
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait update_available extends RequestUpdateCheckStatus
  @scala.inline
  def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @js.native
  sealed trait url
    extends DangerType
       with DescriptionStyleType
       with MostVisitedURLType
       with ResultType
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait urlbar extends _PermissionNoPrompt
  @scala.inline
  def urlbar: urlbar = "urlbar".asInstanceOf[urlbar]
  
  @js.native
  sealed trait urn extends ProtocolHandlerProtocol
  @scala.inline
  def urn: urn = "urn".asInstanceOf[urn]
  
  @js.native
  sealed trait usb extends NetworkLinkInfoType
  @scala.inline
  def usb: usb = "usb".asInstanceOf[usb]
  
  @js.native
  sealed trait user
    extends CSSOrigin
       with MutedInfoReason
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait user_script extends OnExtensionActivityDetailsType
  @scala.inline
  def user_script: user_script = "user_script".asInstanceOf[user_script]
  
  @js.native
  sealed trait video
    extends ContextType
       with typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait weak extends SecurityInfoState
  @scala.inline
  def weak: weak = "weak".asInstanceOf[weak]
  
  @js.native
  sealed trait webNavigation extends _OptionalPermission
  @scala.inline
  def webNavigation: webNavigation = "webNavigation".asInstanceOf[webNavigation]
  
  @js.native
  sealed trait webRequest extends _OptionalPermissionNoPrompt
  @scala.inline
  def webRequest: webRequest = "webRequest".asInstanceOf[webRequest]
  
  @js.native
  sealed trait webRequestBlocking extends _OptionalPermissionNoPrompt
  @scala.inline
  def webRequestBlocking: webRequestBlocking = "webRequestBlocking".asInstanceOf[webRequestBlocking]
  
  @js.native
  sealed trait web_manifest extends ResourceType
  @scala.inline
  def web_manifest: web_manifest = "web_manifest".asInstanceOf[web_manifest]
  
  @js.native
  sealed trait webcal extends ProtocolHandlerProtocol
  @scala.inline
  def webcal: webcal = "webcal".asInstanceOf[webcal]
  
  @js.native
  sealed trait websocket extends ResourceType
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait wifi extends NetworkLinkInfoType
  @scala.inline
  def wifi: wifi = "wifi".asInstanceOf[wifi]
  
  @js.native
  sealed trait wimax extends NetworkLinkInfoType
  @scala.inline
  def wimax: wimax = "wimax".asInstanceOf[wimax]
  
  @js.native
  sealed trait win extends PlatformOs
  @scala.inline
  def win: win = "win".asInstanceOf[win]
  
  @js.native
  sealed trait windowLength extends StObject
  @scala.inline
  def windowLength: windowLength = "windowLength".asInstanceOf[windowLength]
  
  @js.native
  sealed trait wtai extends ProtocolHandlerProtocol
  @scala.inline
  def wtai: wtai = "wtai".asInstanceOf[wtai]
  
  @js.native
  sealed trait `x86-32`
    extends PlatformArch
       with PlatformNaclArch
  @scala.inline
  def `x86-32`: `x86-32` = "x86-32".asInstanceOf[`x86-32`]
  
  @js.native
  sealed trait `x86-64`
    extends PlatformArch
       with PlatformNaclArch
  @scala.inline
  def `x86-64`: `x86-64` = "x86-64".asInstanceOf[`x86-64`]
  
  @js.native
  sealed trait xml_dtd extends ResourceType
  @scala.inline
  def xml_dtd: xml_dtd = "xml_dtd".asInstanceOf[xml_dtd]
  
  @js.native
  sealed trait xmlhttprequest extends ResourceType
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @js.native
  sealed trait xmpp extends ProtocolHandlerProtocol
  @scala.inline
  def xmpp: xmpp = "xmpp".asInstanceOf[xmpp]
  
  @js.native
  sealed trait xslt extends ResourceType
  @scala.inline
  def xslt: xslt = "xslt".asInstanceOf[xslt]
}
