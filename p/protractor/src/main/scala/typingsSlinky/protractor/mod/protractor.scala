package typingsSlinky.protractor.mod

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.seleniumWebdriver.httpMod.Executor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protractor extends Shortcut {
  
  @JSImport("protractor", "protractor")
  @js.native
  val ^ : typingsSlinky.protractor.ptorMod.Ptor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("protractor", "protractor.Builder")
  @js.native
  // region Constructors
  /**
    * @constructor
    */
  class BuilderCls ()
    extends typingsSlinky.seleniumWebdriver.mod.Builder
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("protractor", "protractor.Capabilities")
  @js.native
  // region Constructors
  /**
    * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
    *     capabilities to initialize this instance from.
    */
  class CapabilitiesCls ()
    extends typingsSlinky.seleniumWebdriver.mod.Capabilities
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("protractor", "protractor.EventEmitter")
  @js.native
  // region Constructors
  /**
    * @constructor
    */
  class EventEmitterCls ()
    extends typingsSlinky.seleniumWebdriver.mod.EventEmitter
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("protractor", "protractor.FileDetector")
  @js.native
  /** @constructor */
  class FileDetectorCls ()
    extends typingsSlinky.seleniumWebdriver.mod.FileDetector
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("protractor", "protractor.Session")
  @js.native
  class SessionCls protected ()
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("protractor", "protractor.WebDriver")
  @js.native
  class WebDriverCls protected ()
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("protractor", "protractor.WebElement")
  @js.native
  class WebElementCls protected ()
    extends typingsSlinky.seleniumWebdriver.mod.WebElement {
    /**
      * @param {!WebDriver} driver the parent WebDriver instance for this element.
      * @param {(!IThenable<string>|string)} id The server-assigned opaque ID for
      *     the underlying DOM element.
      */
    def this(driver: typingsSlinky.seleniumWebdriver.mod.WebDriver, id: js.Promise[String]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("protractor", "protractor.WebElementPromise")
  @js.native
  class WebElementPromiseCls protected ()
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
  
  type _To = typingsSlinky.protractor.ptorMod.Ptor
  
  /* This means you don't have to write `^`, but can instead just say `protractor.foo` */
  override def _to: typingsSlinky.protractor.ptorMod.Ptor = ^
}
