package typingsSlinky.pendoIoBrowser

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.pendoIoBrowser.anon.Auto
import typingsSlinky.pendoIoBrowser.anon.AutoHeight
import typingsSlinky.pendoIoBrowser.anon.Badge
import typingsSlinky.pendoIoBrowser.anon.Delay
import typingsSlinky.pendoIoBrowser.anon.Filters
import typingsSlinky.pendoIoBrowser.anon.Steps
import typingsSlinky.pendoIoBrowser.anon.Until
import typingsSlinky.pendoIoBrowser.pendoIoBrowserBooleans.`false`
import typingsSlinky.pendoIoBrowser.pendoIoBrowserBooleans.`true`
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.No
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.Yes
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.api
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.automatic
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.badge
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.button
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.disabled
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.dom
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.draft
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.element
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.launcher
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.programatic
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.published
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.staged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pendo {
  
  @js.native
  trait Debugging extends StObject {
    
    // TODO
    def getAllGuides(): js.Array[Guide] = js.native
    
    def getAutoGuides(): Auto = js.native
    
    def getBadgeGuides(): js.Array[Guide] = js.native
    
    def getEventCache(): js.Array[_] = js.native
    
    def getLauncherGuides(): js.Array[Guide] = js.native
  }
  object Debugging {
    
    @scala.inline
    def apply(
      getAllGuides: () => js.Array[Guide],
      getAutoGuides: () => Auto,
      getBadgeGuides: () => js.Array[Guide],
      getEventCache: () => js.Array[_],
      getLauncherGuides: () => js.Array[Guide]
    ): Debugging = {
      val __obj = js.Dynamic.literal(getAllGuides = js.Any.fromFunction0(getAllGuides), getAutoGuides = js.Any.fromFunction0(getAutoGuides), getBadgeGuides = js.Any.fromFunction0(getBadgeGuides), getEventCache = js.Any.fromFunction0(getEventCache), getLauncherGuides = js.Any.fromFunction0(getLauncherGuides))
      __obj.asInstanceOf[Debugging]
    }
    
    @scala.inline
    implicit class DebuggingMutableBuilder[Self <: Debugging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAllGuides(value: () => js.Array[Guide]): Self = StObject.set(x, "getAllGuides", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAutoGuides(value: () => Auto): Self = StObject.set(x, "getAutoGuides", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBadgeGuides(value: () => js.Array[Guide]): Self = StObject.set(x, "getBadgeGuides", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEventCache(value: () => js.Array[_]): Self = StObject.set(x, "getEventCache", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLauncherGuides(value: () => js.Array[Guide]): Self = StObject.set(x, "getLauncherGuides", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait EventCallbacks extends StObject {
    
    var guidesFailed: js.UndefOr[js.Function0[Unit]] = js.native
    
    var guidesLoaded: js.UndefOr[js.Function0[Unit]] = js.native
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object EventCallbacks {
    
    @scala.inline
    def apply(): EventCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventCallbacks]
    }
    
    @scala.inline
    implicit class EventCallbacksMutableBuilder[Self <: EventCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuidesFailed(value: () => Unit): Self = StObject.set(x, "guidesFailed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGuidesFailedUndefined: Self = StObject.set(x, "guidesFailed", js.undefined)
      
      @scala.inline
      def setGuidesLoaded(value: () => Unit): Self = StObject.set(x, "guidesLoaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGuidesLoadedUndefined: Self = StObject.set(x, "guidesLoaded", js.undefined)
      
      @scala.inline
      def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof pendo-io-browser.pendo.EventCallbacks ]: -? (callback : pendo-io-browser.pendo.EventCallbacks[K]): pendo-io-browser.pendo.Events} */
  @js.native
  trait Events extends StObject {
    
    def guidesFailed(): this.type = js.native
    def guidesFailed(callback: js.Function0[Unit]): this.type = js.native
    @JSName("guidesFailed")
    var guidesFailed_Original: js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], this.type] = js.native
    
    def guidesLoaded(): this.type = js.native
    def guidesLoaded(callback: js.Function0[Unit]): this.type = js.native
    @JSName("guidesLoaded")
    var guidesLoaded_Original: js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], this.type] = js.native
    
    def ready(): this.type = js.native
    def ready(callback: js.Function0[Unit]): this.type = js.native
    @JSName("ready")
    var ready_Original: js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], this.type] = js.native
  }
  
  @js.native
  trait Guide extends StObject {
    
    var attributes: Badge = js.native
    
    var audience: js.Array[_] = js.native
    
    // TODO
    var audienceUiHint: Filters = js.native
    
    var createdAt: Double = js.native
    
    var createdByUser: User = js.native
    
    var id: String = js.native
    
    var isMultiStep: Boolean = js.native
    
    var kind: String = js.native
    
    var lastUpdatedAt: Double = js.native
    
    var lastUpdatedByUser: User = js.native
    
    var launchMethod: api | automatic | badge | dom | launcher = js.native
    
    var name: String = js.native
    
    var publishedAt: Double = js.native
    
    // TODO
    var resetAt: Double = js.native
    
    var rootVersionId: String = js.native
    
    var stableVersionId: String = js.native
    
    var state: published | staged | draft | disabled = js.native
    
    var steps: js.Array[GuideStep] = js.native
  }
  object Guide {
    
    @scala.inline
    def apply(
      attributes: Badge,
      audience: js.Array[_],
      audienceUiHint: Filters,
      createdAt: Double,
      createdByUser: User,
      id: String,
      isMultiStep: Boolean,
      kind: String,
      lastUpdatedAt: Double,
      lastUpdatedByUser: User,
      launchMethod: api | automatic | badge | dom | launcher,
      name: String,
      publishedAt: Double,
      resetAt: Double,
      rootVersionId: String,
      stableVersionId: String,
      state: published | staged | draft | disabled,
      steps: js.Array[GuideStep]
    ): Guide = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], audience = audience.asInstanceOf[js.Any], audienceUiHint = audienceUiHint.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdByUser = createdByUser.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isMultiStep = isMultiStep.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], lastUpdatedByUser = lastUpdatedByUser.asInstanceOf[js.Any], launchMethod = launchMethod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any], rootVersionId = rootVersionId.asInstanceOf[js.Any], stableVersionId = stableVersionId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guide]
    }
    
    @scala.inline
    implicit class GuideMutableBuilder[Self <: Guide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Badge): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudience(value: js.Array[_]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUiHint(value: Filters): Self = StObject.set(x, "audienceUiHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceVarargs(value: js.Any*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedByUser(value: User): Self = StObject.set(x, "createdByUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultiStep(value: Boolean): Self = StObject.set(x, "isMultiStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedAt(value: Double): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedByUser(value: User): Self = StObject.set(x, "lastUpdatedByUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchMethod(value: api | automatic | badge | dom | launcher): Self = StObject.set(x, "launchMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishedAt(value: Double): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetAt(value: Double): Self = StObject.set(x, "resetAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootVersionId(value: String): Self = StObject.set(x, "rootVersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStableVersionId(value: String): Self = StObject.set(x, "stableVersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: published | staged | draft | disabled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: js.Array[GuideStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: GuideStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GuideStep extends StObject {
    
    var advanceMethod: button | programatic | element = js.native
    
    var attributes: AutoHeight = js.native
    
    var contentType: String = js.native
    
    var contentUrl: js.UndefOr[String] = js.native
    
    var contentUrlCss: js.UndefOr[String] = js.native
    
    var contentUrlJs: js.UndefOr[String] = js.native
    
    var elementPathRule: String = js.native
    
    var guideId: String = js.native
    
    var id: String = js.native
    
    var lastUpdatedAt: Double = js.native
    
    var rank: Double = js.native
    
    var resetAt: Double = js.native
    
    var thumbnailUrls: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
  }
  object GuideStep {
    
    @scala.inline
    def apply(
      advanceMethod: button | programatic | element,
      attributes: AutoHeight,
      contentType: String,
      elementPathRule: String,
      guideId: String,
      id: String,
      lastUpdatedAt: Double,
      rank: Double,
      resetAt: Double,
      `type`: String
    ): GuideStep = {
      val __obj = js.Dynamic.literal(advanceMethod = advanceMethod.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], elementPathRule = elementPathRule.asInstanceOf[js.Any], guideId = guideId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GuideStep]
    }
    
    @scala.inline
    implicit class GuideStepMutableBuilder[Self <: GuideStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvanceMethod(value: button | programatic | element): Self = StObject.set(x, "advanceMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: AutoHeight): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrlCss(value: String): Self = StObject.set(x, "contentUrlCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrlCssUndefined: Self = StObject.set(x, "contentUrlCss", js.undefined)
      
      @scala.inline
      def setContentUrlJs(value: String): Self = StObject.set(x, "contentUrlJs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrlJsUndefined: Self = StObject.set(x, "contentUrlJs", js.undefined)
      
      @scala.inline
      def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
      
      @scala.inline
      def setElementPathRule(value: String): Self = StObject.set(x, "elementPathRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuideId(value: String): Self = StObject.set(x, "guideId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedAt(value: Double): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetAt(value: Double): Self = StObject.set(x, "resetAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUrls(value: String): Self = StObject.set(x, "thumbnailUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUrlsUndefined: Self = StObject.set(x, "thumbnailUrls", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Identity extends StObject {
    
    var account: js.UndefOr[IdentityMetadata] = js.native
    
    /** visitor.id is required if user is logged in, otherwise an anonymous ID is generated and tracked by a cookie */
    var visitor: js.UndefOr[IdentityMetadata] = js.native
  }
  object Identity {
    
    @scala.inline
    def apply(): Identity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Identity]
    }
    
    @scala.inline
    implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: IdentityMetadata): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      @scala.inline
      def setVisitor(value: IdentityMetadata): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitorUndefined: Self = StObject.set(x, "visitor", js.undefined)
    }
  }
  
  /* Inlined {  id :string | undefined} & pendo-io-browser.pendo.Metadata */
  @js.native
  trait IdentityMetadata extends /* key */ StringDictionary[String | Double | Boolean] {
    
    var id: js.UndefOr[String] = js.native
  }
  object IdentityMetadata {
    
    @scala.inline
    def apply(): IdentityMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityMetadata]
    }
    
    @scala.inline
    implicit class IdentityMetadataMutableBuilder[Self <: IdentityMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait InitOptions extends Identity {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var disablePersistence: js.UndefOr[Boolean] = js.native
    
    var events: js.UndefOr[EventCallbacks] = js.native
    
    var excludeAllText: js.UndefOr[Boolean] = js.native
    
    var excludeTitle: js.UndefOr[Boolean] = js.native
    
    var guides: js.UndefOr[Delay] = js.native
  }
  object InitOptions {
    
    @scala.inline
    def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setDisablePersistence(value: Boolean): Self = StObject.set(x, "disablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePersistenceUndefined: Self = StObject.set(x, "disablePersistence", js.undefined)
      
      @scala.inline
      def setEvents(value: EventCallbacks): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setExcludeAllText(value: Boolean): Self = StObject.set(x, "excludeAllText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeAllTextUndefined: Self = StObject.set(x, "excludeAllText", js.undefined)
      
      @scala.inline
      def setExcludeTitle(value: Boolean): Self = StObject.set(x, "excludeTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeTitleUndefined: Self = StObject.set(x, "excludeTitle", js.undefined)
      
      @scala.inline
      def setGuides(value: Delay): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuidesUndefined: Self = StObject.set(x, "guides", js.undefined)
    }
  }
  
  type Metadata = StringDictionary[String | Double | Boolean]
  
  @js.native
  trait Pendo extends StObject {
    
    var debugging: Debugging = js.native
    
    def disableDebugging(): Unit = js.native
    
    def dom(input: js.Any): HTMLElement = js.native
    
    // Debugging
    def enableDebugging(): Unit = js.native
    
    // Events
    var events: Events = js.native
    
    def findGuideById(id: String): Guide | Unit = js.native
    
    // Guides and Guide Center
    def findGuideByName(name: String): Guide | Unit = js.native
    
    def flushNow(): js.Promise[_] = js.native
    
    def getAccountId(): String = js.native
    
    def getCurrentUrl(): String = js.native
    
    def getVersion(): String = js.native
    
    def getVisitorId(): String = js.native
    
    def identify(identity: Identity): Unit = js.native
    def identify(visitorId: String): Unit = js.native
    def identify(visitorId: String, accountId: String): Unit = js.native
    
    // Initialization and Identification
    def initialize(): Unit = js.native
    def initialize(options: InitOptions): Unit = js.native
    
    def isDebuggingEnabled(): Yes | No = js.native
    @JSName("isDebuggingEnabled")
    def isDebuggingEnabled_false(coerce: `false`): Yes | No = js.native
    @JSName("isDebuggingEnabled")
    def isDebuggingEnabled_true(coerce: `true`): Boolean = js.native
    
    def isReady(): Boolean = js.native
    
    // Troubleshooting
    def loadGuides(): Unit = js.native
    
    // Guide Events
    def onGuideAdvanced(): Unit = js.native
    def onGuideAdvanced(steps: Steps): Unit = js.native
    def onGuideAdvanced(step: GuideStep): Unit = js.native
    
    def onGuideDismissed(): Unit = js.native
    def onGuideDismissed(step: GuideStep): Unit = js.native
    def onGuideDismissed(until: Until): Unit = js.native
    
    def onGuidePrevious(): Unit = js.native
    def onGuidePrevious(step: GuideStep): Unit = js.native
    
    def removeLauncher(): Unit = js.native
    
    def showGuideById(id: String): Unit = js.native
    
    def showGuideByName(name: String): Unit = js.native
    
    def startGuides(): Unit = js.native
    
    def stopGuides(): Unit = js.native
    
    def toggleLauncher(): Unit = js.native
    
    def track(trackType: String): Unit = js.native
    def track(trackType: String, metadata: Metadata): Unit = js.native
    
    def updateOptions(options: Identity): Unit = js.native
    
    // Other
    def validateInstall(): Unit = js.native
  }
  
  @js.native
  trait User extends StObject {
    
    var first: String = js.native
    
    var id: String = js.native
    
    var last: String = js.native
    
    var role: Double = js.native
    
    var userType: String = js.native
    
    var username: String = js.native
  }
  object User {
    
    @scala.inline
    def apply(first: String, id: String, last: String, role: Double, userType: String, username: String): User = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], userType = userType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: Double): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserType(value: String): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
