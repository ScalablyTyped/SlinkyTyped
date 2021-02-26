package typingsSlinky.backstopjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.backstopjs.anon.Args
import typingsSlinky.backstopjs.anon.Bitmapsreference
import typingsSlinky.backstopjs.anon.ErrorColor
import typingsSlinky.backstopjs.anon.Format
import typingsSlinky.backstopjs.backstopjsStrings.CI
import typingsSlinky.backstopjs.backstopjsStrings.approve
import typingsSlinky.backstopjs.backstopjsStrings.browser
import typingsSlinky.backstopjs.backstopjsStrings.chromy
import typingsSlinky.backstopjs.backstopjsStrings.desktop
import typingsSlinky.backstopjs.backstopjsStrings.init
import typingsSlinky.backstopjs.backstopjsStrings.json
import typingsSlinky.backstopjs.backstopjsStrings.phone
import typingsSlinky.backstopjs.backstopjsStrings.puppeteer
import typingsSlinky.backstopjs.backstopjsStrings.reference
import typingsSlinky.backstopjs.backstopjsStrings.tablet
import typingsSlinky.backstopjs.backstopjsStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backstopjs", JSImport.Default)
  @js.native
  def default_approve(command: approve): js.Promise[Unit] = js.native
  @JSImport("backstopjs", JSImport.Default)
  @js.native
  def default_approve(command: approve, options: typingsSlinky.backstopjs.anon.Config): js.Promise[Unit] = js.native
  @JSImport("backstopjs", JSImport.Default)
  @js.native
  def default_init(command: init): js.Promise[Unit] = js.native
  @JSImport("backstopjs", JSImport.Default)
  @js.native
  def default_init(command: init, options: typingsSlinky.backstopjs.anon.Config): js.Promise[Unit] = js.native
  @JSImport("backstopjs", JSImport.Default)
  @js.native
  def default_reference(command: reference): js.Promise[Unit] = js.native
  @JSImport("backstopjs", JSImport.Default)
  @js.native
  def default_reference(command: reference, options: typingsSlinky.backstopjs.anon.Config): js.Promise[Unit] = js.native
  @JSImport("backstopjs", JSImport.Default)
  @js.native
  def default_test(command: test): js.Promise[Unit] = js.native
  @JSImport("backstopjs", JSImport.Default)
  @js.native
  def default_test(command: test, options: typingsSlinky.backstopjs.anon.Config): js.Promise[Unit] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var asyncCaptureLimit: js.UndefOr[Double] = js.native
    
    var asyncCompareLimit: js.UndefOr[Double] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var ci: js.UndefOr[Format] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var debugWindow: js.UndefOr[Boolean] = js.native
    
    var dockerCommandTemplate: js.UndefOr[String] = js.native
    
    var engine: js.UndefOr[chromy | puppeteer] = js.native
    
    var engineOptions: js.UndefOr[Args] = js.native
    
    var id: String = js.native
    
    var onBeforeScript: js.UndefOr[String] = js.native
    
    var onReadyScript: js.UndefOr[String] = js.native
    
    var paths: js.UndefOr[Bitmapsreference] = js.native
    
    var report: js.UndefOr[js.Array[browser | CI | json]] = js.native
    
    var resembleOutputOptions: js.UndefOr[ErrorColor] = js.native
    
    var scenarios: js.Array[Scenario] = js.native
    
    var viewports: js.Array[Viewport] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(id: String, scenarios: js.Array[Scenario], viewports: js.Array[Viewport]): Config = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], viewports = viewports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncCaptureLimit(value: Double): Self = StObject.set(x, "asyncCaptureLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncCaptureLimitUndefined: Self = StObject.set(x, "asyncCaptureLimit", js.undefined)
      
      @scala.inline
      def setAsyncCompareLimit(value: Double): Self = StObject.set(x, "asyncCompareLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncCompareLimitUndefined: Self = StObject.set(x, "asyncCompareLimit", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setCi(value: Format): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDebugWindow(value: Boolean): Self = StObject.set(x, "debugWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugWindowUndefined: Self = StObject.set(x, "debugWindow", js.undefined)
      
      @scala.inline
      def setDockerCommandTemplate(value: String): Self = StObject.set(x, "dockerCommandTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockerCommandTemplateUndefined: Self = StObject.set(x, "dockerCommandTemplate", js.undefined)
      
      @scala.inline
      def setEngine(value: chromy | puppeteer): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineOptions(value: Args): Self = StObject.set(x, "engineOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineOptionsUndefined: Self = StObject.set(x, "engineOptions", js.undefined)
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforeScript(value: String): Self = StObject.set(x, "onBeforeScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforeScriptUndefined: Self = StObject.set(x, "onBeforeScript", js.undefined)
      
      @scala.inline
      def setOnReadyScript(value: String): Self = StObject.set(x, "onReadyScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyScriptUndefined: Self = StObject.set(x, "onReadyScript", js.undefined)
      
      @scala.inline
      def setPaths(value: Bitmapsreference): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setReport(value: js.Array[browser | CI | json]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
      
      @scala.inline
      def setReportVarargs(value: (browser | CI | json)*): Self = StObject.set(x, "report", js.Array(value :_*))
      
      @scala.inline
      def setResembleOutputOptions(value: ErrorColor): Self = StObject.set(x, "resembleOutputOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResembleOutputOptionsUndefined: Self = StObject.set(x, "resembleOutputOptions", js.undefined)
      
      @scala.inline
      def setScenarios(value: js.Array[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenariosVarargs(value: Scenario*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      @scala.inline
      def setViewports(value: js.Array[Viewport]): Self = StObject.set(x, "viewports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportsVarargs(value: Viewport*): Self = StObject.set(x, "viewports", js.Array(value :_*))
    }
  }
  
  @js.native
  trait KeypressSelector extends StObject {
    
    var keyPress: String = js.native
    
    var selector: String = js.native
  }
  object KeypressSelector {
    
    @scala.inline
    def apply(keyPress: String, selector: String): KeypressSelector = {
      val __obj = js.Dynamic.literal(keyPress = keyPress.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeypressSelector]
    }
    
    @scala.inline
    implicit class KeypressSelectorMutableBuilder[Self <: KeypressSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyPress(value: String): Self = StObject.set(x, "keyPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scenario
    extends /* key */ StringDictionary[js.Any] {
    
    // Allow for custom properties.
    var clickSelector: js.UndefOr[String] = js.native
    
    // Click the specified DOM element prior to screenshot
    var clickSelectors: js.UndefOr[js.Array[String]] = js.native
    
    // Simulates multiple sequential click interactions
    var cookiePath: js.UndefOr[String] = js.native
    
    // Import cookies in JSON format
    var delay: js.UndefOr[Double] = js.native
    
    // Wait for x milliseconds
    var expect: js.UndefOr[Double] = js.native
    
    // Use with selectorExpansion true to expect number of results found
    var hideSelectors: js.UndefOr[js.Array[String]] = js.native
    
    // Selectors set to visibility: hidden
    var hoverSelector: js.UndefOr[String] = js.native
    
    // Move pointer over the given DOM element prior to screenshot
    var hoverSelectors: js.UndefOr[js.Array[String]] = js.native
    
    // Simulates multiple sequential hover interactions
    var keyPressSelector: js.UndefOr[KeypressSelector] = js.native
    
    // Press key in the DOM element prior to screenshot
    var keyPressSelectors: js.UndefOr[js.Array[KeypressSelector]] = js.native
    
    // Simulates multiple sequential keypress interactions
    var label: String = js.native
    
    // Tag saved with your reference images
    var misMatchThreshold: js.UndefOr[Double] = js.native
    
    // Percentage of different pixels allowed to pass test
    var onBeforeScript: js.UndefOr[String] = js.native
    
    // Used to set up browser state e.g. cookies
    var onReadyScript: js.UndefOr[String] = js.native
    
    // Used to modify UI state prior to screenshots e.g. hovers, clicks etc
    var postInteractionWait: js.UndefOr[Double] = js.native
    
    // Wait for selector (ms) after interacting with hover or click
    var readyEvent: js.UndefOr[String] = js.native
    
    // Wait until this string has been logged to the console
    var readySelector: js.UndefOr[String] = js.native
    
    // Wait until this selector exists before continuing
    var referenceUrl: js.UndefOr[String] = js.native
    
    // Specify a different state or environment when creating reference
    var removeSelectors: js.UndefOr[js.Array[String]] = js.native
    
    // Selectors set to display: none
    var requireSameDimensions: js.UndefOr[Boolean] = js.native
    
    // If true, take screenshots of all matching selector instances
    var scrollToSelector: js.UndefOr[String] = js.native
    
    // Selectors to capture
    var selectorExpansion: js.UndefOr[Boolean] = js.native
    
    // If true, any change in selector size will trigger a failure
    var selectors: js.UndefOr[js.Array[String]] = js.native
    
    // Scroll the specified DOM element into view prior to screenshots
    var url: String = js.native
    
    // The url of your app state
    var viewports: js.UndefOr[js.Array[Viewport]] = js.native
  }
  object Scenario {
    
    @scala.inline
    def apply(label: String, url: String): Scenario = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scenario]
    }
    
    @scala.inline
    implicit class ScenarioMutableBuilder[Self <: Scenario] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickSelector(value: String): Self = StObject.set(x, "clickSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickSelectorUndefined: Self = StObject.set(x, "clickSelector", js.undefined)
      
      @scala.inline
      def setClickSelectors(value: js.Array[String]): Self = StObject.set(x, "clickSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickSelectorsUndefined: Self = StObject.set(x, "clickSelectors", js.undefined)
      
      @scala.inline
      def setClickSelectorsVarargs(value: String*): Self = StObject.set(x, "clickSelectors", js.Array(value :_*))
      
      @scala.inline
      def setCookiePath(value: String): Self = StObject.set(x, "cookiePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiePathUndefined: Self = StObject.set(x, "cookiePath", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setExpect(value: Double): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectUndefined: Self = StObject.set(x, "expect", js.undefined)
      
      @scala.inline
      def setHideSelectors(value: js.Array[String]): Self = StObject.set(x, "hideSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideSelectorsUndefined: Self = StObject.set(x, "hideSelectors", js.undefined)
      
      @scala.inline
      def setHideSelectorsVarargs(value: String*): Self = StObject.set(x, "hideSelectors", js.Array(value :_*))
      
      @scala.inline
      def setHoverSelector(value: String): Self = StObject.set(x, "hoverSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverSelectorUndefined: Self = StObject.set(x, "hoverSelector", js.undefined)
      
      @scala.inline
      def setHoverSelectors(value: js.Array[String]): Self = StObject.set(x, "hoverSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverSelectorsUndefined: Self = StObject.set(x, "hoverSelectors", js.undefined)
      
      @scala.inline
      def setHoverSelectorsVarargs(value: String*): Self = StObject.set(x, "hoverSelectors", js.Array(value :_*))
      
      @scala.inline
      def setKeyPressSelector(value: KeypressSelector): Self = StObject.set(x, "keyPressSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPressSelectorUndefined: Self = StObject.set(x, "keyPressSelector", js.undefined)
      
      @scala.inline
      def setKeyPressSelectors(value: js.Array[KeypressSelector]): Self = StObject.set(x, "keyPressSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPressSelectorsUndefined: Self = StObject.set(x, "keyPressSelectors", js.undefined)
      
      @scala.inline
      def setKeyPressSelectorsVarargs(value: KeypressSelector*): Self = StObject.set(x, "keyPressSelectors", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMisMatchThreshold(value: Double): Self = StObject.set(x, "misMatchThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMisMatchThresholdUndefined: Self = StObject.set(x, "misMatchThreshold", js.undefined)
      
      @scala.inline
      def setOnBeforeScript(value: String): Self = StObject.set(x, "onBeforeScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforeScriptUndefined: Self = StObject.set(x, "onBeforeScript", js.undefined)
      
      @scala.inline
      def setOnReadyScript(value: String): Self = StObject.set(x, "onReadyScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyScriptUndefined: Self = StObject.set(x, "onReadyScript", js.undefined)
      
      @scala.inline
      def setPostInteractionWait(value: Double): Self = StObject.set(x, "postInteractionWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostInteractionWaitUndefined: Self = StObject.set(x, "postInteractionWait", js.undefined)
      
      @scala.inline
      def setReadyEvent(value: String): Self = StObject.set(x, "readyEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadyEventUndefined: Self = StObject.set(x, "readyEvent", js.undefined)
      
      @scala.inline
      def setReadySelector(value: String): Self = StObject.set(x, "readySelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadySelectorUndefined: Self = StObject.set(x, "readySelector", js.undefined)
      
      @scala.inline
      def setReferenceUrl(value: String): Self = StObject.set(x, "referenceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceUrlUndefined: Self = StObject.set(x, "referenceUrl", js.undefined)
      
      @scala.inline
      def setRemoveSelectors(value: js.Array[String]): Self = StObject.set(x, "removeSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveSelectorsUndefined: Self = StObject.set(x, "removeSelectors", js.undefined)
      
      @scala.inline
      def setRemoveSelectorsVarargs(value: String*): Self = StObject.set(x, "removeSelectors", js.Array(value :_*))
      
      @scala.inline
      def setRequireSameDimensions(value: Boolean): Self = StObject.set(x, "requireSameDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireSameDimensionsUndefined: Self = StObject.set(x, "requireSameDimensions", js.undefined)
      
      @scala.inline
      def setScrollToSelector(value: String): Self = StObject.set(x, "scrollToSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToSelectorUndefined: Self = StObject.set(x, "scrollToSelector", js.undefined)
      
      @scala.inline
      def setSelectorExpansion(value: Boolean): Self = StObject.set(x, "selectorExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorExpansionUndefined: Self = StObject.set(x, "selectorExpansion", js.undefined)
      
      @scala.inline
      def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      @scala.inline
      def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewports(value: js.Array[Viewport]): Self = StObject.set(x, "viewports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportsUndefined: Self = StObject.set(x, "viewports", js.undefined)
      
      @scala.inline
      def setViewportsVarargs(value: Viewport*): Self = StObject.set(x, "viewports", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.backstopjs.mod.ViewportNext
    - typingsSlinky.backstopjs.mod.ViewportLegacy
  */
  trait Viewport extends StObject
  object Viewport {
    
    @scala.inline
    def ViewportLegacy(height: Double, name: phone | tablet | desktop, width: Double): typingsSlinky.backstopjs.mod.ViewportLegacy = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.backstopjs.mod.ViewportLegacy]
    }
    
    @scala.inline
    def ViewportNext(height: Double, label: String, width: Double): typingsSlinky.backstopjs.mod.ViewportNext = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.backstopjs.mod.ViewportNext]
    }
  }
  
  @js.native
  trait ViewportLegacy extends Viewport {
    
    var height: Double = js.native
    
    var name: phone | tablet | desktop = js.native
    
    var width: Double = js.native
  }
  object ViewportLegacy {
    
    @scala.inline
    def apply(height: Double, name: phone | tablet | desktop, width: Double): ViewportLegacy = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportLegacy]
    }
    
    @scala.inline
    implicit class ViewportLegacyMutableBuilder[Self <: ViewportLegacy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: phone | tablet | desktop): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewportNext extends Viewport {
    
    var height: Double = js.native
    
    var label: String = js.native
    
    var width: Double = js.native
  }
  object ViewportNext {
    
    @scala.inline
    def apply(height: Double, label: String, width: Double): ViewportNext = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportNext]
    }
    
    @scala.inline
    implicit class ViewportNextMutableBuilder[Self <: ViewportNext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
