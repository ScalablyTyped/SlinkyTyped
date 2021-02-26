package typingsSlinky.protractor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.protractor.anon.Chrome
import typingsSlinky.protractor.anon.TypeofCapabilities
import typingsSlinky.protractor.anon.TypeofWebDriver
import typingsSlinky.protractor.anon.TypeofWebElement
import typingsSlinky.protractor.anon.Typeoferror
import typingsSlinky.protractor.anon.Typeoflogging
import typingsSlinky.protractor.anon.Typeofpromise
import typingsSlinky.protractor.anon.Typeofuntil
import typingsSlinky.protractor.browserMod.ElementHelper
import typingsSlinky.protractor.browserMod.ProtractorBrowser
import typingsSlinky.protractor.elementMod.ElementArrayFinder
import typingsSlinky.protractor.elementMod.ElementFinder
import typingsSlinky.protractor.expectedConditionsMod.ProtractorExpectedConditions
import typingsSlinky.protractor.locatorsMod.Locator
import typingsSlinky.protractor.locatorsMod.ProtractorBy
import typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities
import typingsSlinky.seleniumWebdriver.httpMod.Executor
import typingsSlinky.seleniumWebdriver.mod.WebDriver
import typingsSlinky.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ptorMod {
  
  @JSImport("protractor/built/ptor", "Ptor")
  @js.native
  class Ptor () extends StObject {
    
    @JSName("$")
    def $(search: String): ElementFinder = js.native
    
    var ActionSequence: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webdriver.ActionSequence */ js.Any = js.native
    
    var Browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IBrowser */ js.Any = js.native
    
    var Builder: Instantiable0[typingsSlinky.seleniumWebdriver.mod.Builder] = js.native
    
    var Button: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IButton */ js.Any = js.native
    
    var By: ProtractorBy = js.native
    
    var Capabilities: TypeofCapabilities = js.native
    
    var Capability: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.ICapability */ js.Any = js.native
    
    var Command: js.Any = js.native
    
    var CommandName: js.Any = js.native
    
    @JSName("$$")
    def DollarDollar(search: String): ElementArrayFinder = js.native
    
    var ElementArrayFinder: js.Any = js.native
    
    var ElementFinder: js.Any = js.native
    
    var EventEmitter: Instantiable0[typingsSlinky.seleniumWebdriver.mod.EventEmitter] = js.native
    
    var ExpectedConditions: ProtractorExpectedConditions = js.native
    
    var FileDetector: Instantiable0[typingsSlinky.seleniumWebdriver.mod.FileDetector] = js.native
    
    var Key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IKey */ js.Any = js.native
    
    var ProtractorBrowser: js.Any = js.native
    
    var ProtractorBy: js.Any = js.native
    
    var ProtractorExpectedConditions: js.Any = js.native
    
    var Session: Instantiable2[
        /* id */ String, 
        /* capabilities */ Capabilities, 
        typingsSlinky.seleniumWebdriver.mod.Session
      ] = js.native
    
    var WebDriver: TypeofWebDriver = js.native
    
    var WebElement: TypeofWebElement = js.native
    
    var WebElementPromise: Instantiable2[
        /* driver */ WebDriver, 
        /* el */ js.Promise[WebElement], 
        typingsSlinky.seleniumWebdriver.mod.WebElementPromise
      ] = js.native
    
    var browser: ProtractorBrowser = js.native
    
    var by: ProtractorBy = js.native
    
    def element(locator: Locator): ElementFinder = js.native
    @JSName("element")
    var element_Original: ElementHelper = js.native
    
    var error: Typeoferror = js.native
    
    var logging: Typeoflogging = js.native
    
    var promise: Typeofpromise = js.native
    
    var until: Typeofuntil = js.native
    
    var utils: Chrome = js.native
    
    def wrapDriver(webdriver: WebDriver): ProtractorBrowser = js.native
    def wrapDriver(
      webdriver: WebDriver,
      baseUrl: js.UndefOr[scala.Nothing],
      rootElement: js.UndefOr[scala.Nothing],
      untrackOutstandingTimeouts: Boolean
    ): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: js.UndefOr[scala.Nothing], rootElement: String): ProtractorBrowser = js.native
    def wrapDriver(
      webdriver: WebDriver,
      baseUrl: js.UndefOr[scala.Nothing],
      rootElement: String,
      untrackOutstandingTimeouts: Boolean
    ): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String): ProtractorBrowser = js.native
    def wrapDriver(
      webdriver: WebDriver,
      baseUrl: String,
      rootElement: js.UndefOr[scala.Nothing],
      untrackOutstandingTimeouts: Boolean
    ): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String, rootElement: String): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String, rootElement: String, untrackOutstandingTimeouts: Boolean): ProtractorBrowser = js.native
  }
  
  object protractor extends Shortcut {
    
    @JSImport("protractor/built/ptor", "protractor")
    @js.native
    val ^ : Ptor = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.Builder")
    @js.native
    // region Constructors
    /**
      * @constructor
      */
    class Builder ()
      extends typingsSlinky.seleniumWebdriver.mod.Builder
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.Capabilities")
    @js.native
    // region Constructors
    /**
      * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
      *     capabilities to initialize this instance from.
      */
    class Capabilities ()
      extends typingsSlinky.seleniumWebdriver.mod.Capabilities
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.EventEmitter")
    @js.native
    // region Constructors
    /**
      * @constructor
      */
    class EventEmitter ()
      extends typingsSlinky.seleniumWebdriver.mod.EventEmitter
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.FileDetector")
    @js.native
    /** @constructor */
    class FileDetector ()
      extends typingsSlinky.seleniumWebdriver.mod.FileDetector
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.Session")
    @js.native
    class Session protected ()
      extends typingsSlinky.seleniumWebdriver.mod.Session {
      // region Constructors
      /**
        * @param {string} id The session ID.
        * @param {!(Object|Capabilities)} capabilities The session
        *     capabilities.
        * @constructor
        */
      def this(id: String, capabilities: typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.WebDriver")
    @js.native
    class WebDriver protected ()
      extends typingsSlinky.seleniumWebdriver.mod.WebDriver {
      // region Constructors
      /**
        * @param {!(Session|Promise<!Session>)} session Either a
        *     known session or a promise that will be resolved to a session.
        * @param {!command.Executor} executor The executor to use when sending
        *     commands to the browser.
        */
      def this(session: typingsSlinky.seleniumWebdriver.mod.Session, executor: Executor) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.WebElement")
    @js.native
    class WebElement protected ()
      extends typingsSlinky.seleniumWebdriver.mod.WebElement {
      /**
        * @param {!WebDriver} driver the parent WebDriver instance for this element.
        * @param {(!IThenable<string>|string)} id The server-assigned opaque ID for
        *     the underlying DOM element.
        */
      def this(driver: typingsSlinky.seleniumWebdriver.mod.WebDriver, id: js.Promise[String]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("protractor/built/ptor", "protractor.WebElementPromise")
    @js.native
    class WebElementPromise protected ()
      extends typingsSlinky.seleniumWebdriver.mod.WebElementPromise {
      /**
        * @param {!WebDriver} driver The parent WebDriver instance for this
        *     element.
        * @param {!Promise<!WebElement>} el A promise
        *     that will resolve to the promised element.
        */
      def this(
        driver: typingsSlinky.seleniumWebdriver.mod.WebDriver,
        el: js.Promise[typingsSlinky.seleniumWebdriver.mod.WebElement]
      ) = this()
    }
    
    type _To = Ptor
    
    /* This means you don't have to write `^`, but can instead just say `protractor.foo` */
    override def _to: Ptor = ^
  }
}
