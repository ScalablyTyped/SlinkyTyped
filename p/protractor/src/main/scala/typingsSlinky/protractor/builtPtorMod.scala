package typingsSlinky.protractor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.protractor.builtBrowserMod.ElementHelper
import typingsSlinky.protractor.builtBrowserMod.ProtractorBrowser
import typingsSlinky.protractor.builtElementMod.ElementArrayFinder
import typingsSlinky.protractor.builtElementMod.ElementFinder
import typingsSlinky.protractor.builtExpectedConditionsMod.ProtractorExpectedConditions
import typingsSlinky.protractor.builtLocatorsMod.Locator
import typingsSlinky.protractor.builtLocatorsMod.ProtractorBy
import typingsSlinky.protractor.builtPtorMod.Ptor
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.IBrowser
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.ICapability
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/ptor", JSImport.Namespace)
@js.native
object builtPtorMod extends js.Object {
  @js.native
  class Ptor () extends js.Object {
    var ActionSequence: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webdriver.ActionSequence */ js.Any = js.native
    var Browser: IBrowser = js.native
    var Builder: Instantiable0[typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Builder] = js.native
    var Button: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IButton */ js.Any = js.native
    var By: ProtractorBy = js.native
    var Capabilities: TypeofClassCapabilities = js.native
    var Capability: ICapability = js.native
    var Command: js.Any = js.native
    var CommandName: js.Any = js.native
    var ElementArrayFinder: js.Any = js.native
    var ElementFinder: js.Any = js.native
    var EventEmitter: Instantiable0[typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.EventEmitter] = js.native
    var ExpectedConditions: ProtractorExpectedConditions = js.native
    var FileDetector: Instantiable0[typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.FileDetector] = js.native
    var Key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IKey */ js.Any = js.native
    var ProtractorBrowser: js.Any = js.native
    var ProtractorBy: js.Any = js.native
    var ProtractorExpectedConditions: js.Any = js.native
    var Session: Instantiable2[
        /* id */ String, 
        /* capabilities */ Capabilities, 
        typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Session
      ] = js.native
    var WebDriver: TypeofClassWebDriver = js.native
    var WebElement: TypeofClassWebElement = js.native
    var WebElementPromise: Instantiable2[
        /* driver */ WebDriver, 
        /* el */ js.Promise[WebElement], 
        typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementPromise
      ] = js.native
    var browser: ProtractorBrowser = js.native
    var by: ProtractorBy = js.native
    @JSName("element")
    var element_Original: ElementHelper = js.native
    var error: Typeoferror = js.native
    var logging: Typeoflogging = js.native
    var promise: Typeofpromise = js.native
    var until: Typeofuntil = js.native
    var utils: Anon_Chrome = js.native
    @JSName("$")
    def $(search: String): ElementFinder = js.native
    @JSName("$$")
    def $$(search: String): ElementArrayFinder = js.native
    def element(locator: Locator): ElementFinder = js.native
    def wrapDriver(webdriver: WebDriver): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String, rootElement: String): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String, rootElement: String, untrackOutstandingTimeouts: Boolean): ProtractorBrowser = js.native
  }
  
  @js.native
  object protractor extends TopLevel[Ptor] {
    @js.native
    // region Constructors
    /**
      * @constructor
      */
    class Builder ()
      extends typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Builder
    
    @js.native
    // region Constructors
    /**
      * @constructor
      */
    class EventEmitter ()
      extends typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.EventEmitter
    
    @js.native
    /** @constructor */
    class FileDetector ()
      extends typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.FileDetector
    
    @js.native
    class Session protected ()
      extends typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Session {
      // region Constructors
      /**
        * @param {string} id The session ID.
        * @param {!(Object|Capabilities)} capabilities The session
        *     capabilities.
        * @constructor
        */
      def this(id: String, capabilities: Capabilities) = this()
    }
    
    @js.native
    class WebElementPromise protected ()
      extends typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementPromise {
      /**
        * @param {!WebDriver} driver The parent WebDriver instance for this
        *     element.
        * @param {!Promise<!WebElement>} el A promise
        *     that will resolve to the promised element.
        */
      def this(driver: WebDriver, el: js.Promise[WebElement]) = this()
    }
    
  }
  
}

