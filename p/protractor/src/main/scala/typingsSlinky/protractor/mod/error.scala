package typingsSlinky.protractor.mod

import typingsSlinky.seleniumWebdriver.anon.Error
import typingsSlinky.seleniumWebdriver.mod.error.ErrorCodeType
import typingsSlinky.seleniumWebdriver.mod.error.ErrorData
import typingsSlinky.seleniumWebdriver.mod.error.MaybeLegacyResponse
import typingsSlinky.seleniumWebdriver.mod.error.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object error {
  
  /**
    * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
    * not completed because the click target is obscured by other elements on the
    * page.
    */
  @JSImport("protractor", "error.ElementClickInterceptedError")
  @js.native
  class ElementClickInterceptedError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.ElementClickInterceptedError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a command could not be completed because the target element is
    * not pointer or keyboard interactable. This will often occur if an element
    * is present in the DOM, but not rendered (i.e. its CSS style has
    * "display: none").
    */
  @JSImport("protractor", "error.ElementNotInteractableError")
  @js.native
  class ElementNotInteractableError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.ElementNotInteractableError {
    def this(message: String) = this()
  }
  
  /**
    * An attempt was made to select an element that cannot be selected.
    */
  @JSImport("protractor", "error.ElementNotSelectableError")
  @js.native
  class ElementNotSelectableError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.ElementNotSelectableError {
    def this(message: String) = this()
  }
  
  @JSImport("protractor", "error.ErrorCode")
  @js.native
  val ErrorCode: ErrorCodeType = js.native
  
  @JSImport("protractor", "error.IError")
  @js.native
  class IError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.IError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a navigation event caused the browser to generate a certificate
    * warning. This is usually caused by an expired or invalid TLS certificate.
    */
  @JSImport("protractor", "error.InsecureCertificateError")
  @js.native
  class InsecureCertificateError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.InsecureCertificateError {
    def this(message: String) = this()
  }
  
  /**
    * The arguments passed to a command are either invalid or malformed.
    */
  @JSImport("protractor", "error.InvalidArgumentError")
  @js.native
  class InvalidArgumentError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.InvalidArgumentError {
    def this(message: String) = this()
  }
  
  /**
    * An illegal attempt was made to set a cookie under a different domain than
    * the current page.
    */
  @JSImport("protractor", "error.InvalidCookieDomainError")
  @js.native
  class InvalidCookieDomainError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.InvalidCookieDomainError {
    def this(message: String) = this()
  }
  
  /**
    * The coordinates provided to an interactions operation are invalid.
    */
  @JSImport("protractor", "error.InvalidCoordinatesError")
  @js.native
  class InvalidCoordinatesError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.InvalidCoordinatesError {
    def this(message: String) = this()
  }
  
  /**
    * An element command could not be completed because the element is in an
    * invalid state, e.g. attempting to click an element that is no longer
    * attached to the document.
    */
  @JSImport("protractor", "error.InvalidElementStateError")
  @js.native
  class InvalidElementStateError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.InvalidElementStateError {
    def this(message: String) = this()
  }
  
  /**
    * Argument was an invalid selector.
    */
  @JSImport("protractor", "error.InvalidSelectorError")
  @js.native
  class InvalidSelectorError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.InvalidSelectorError {
    def this(message: String) = this()
  }
  
  /**
    * An error occurred while executing JavaScript supplied by the user.
    */
  @JSImport("protractor", "error.JavascriptError")
  @js.native
  class JavascriptError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.JavascriptError {
    def this(message: String) = this()
  }
  
  /**
    * The target for mouse interaction is not in the browser’s viewport and
    * cannot be brought into that viewport.
    */
  @JSImport("protractor", "error.MoveTargetOutOfBoundsError")
  @js.native
  class MoveTargetOutOfBoundsError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.MoveTargetOutOfBoundsError {
    def this(message: String) = this()
  }
  
  /**
    * An attempt was made to operate on a modal dialog when one was not open.
    */
  @JSImport("protractor", "error.NoSuchAlertError")
  @js.native
  class NoSuchAlertError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.NoSuchAlertError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a named cookie could not be found in the cookie jar for the
    * currently selected document.
    */
  @JSImport("protractor", "error.NoSuchCookieError")
  @js.native
  class NoSuchCookieError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.NoSuchCookieError {
    def this(message: String) = this()
  }
  
  /**
    * An element could not be located on the page using the given search
    * parameters.
    */
  @JSImport("protractor", "error.NoSuchElementError")
  @js.native
  class NoSuchElementError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.NoSuchElementError {
    def this(message: String) = this()
  }
  
  /**
    * A request to switch to a frame could not be satisfied because the frame
    * could not be found.
    */
  @JSImport("protractor", "error.NoSuchFrameError")
  @js.native
  class NoSuchFrameError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.NoSuchFrameError {
    def this(message: String) = this()
  }
  
  /**
    * Occurs when a command is directed to a session that does not exist.
    */
  @JSImport("protractor", "error.NoSuchSessionError")
  @js.native
  class NoSuchSessionError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.NoSuchSessionError {
    def this(message: String) = this()
  }
  
  /**
    * A request to switch to a window could not be satisfied because the window
    * could not be found.
    */
  @JSImport("protractor", "error.NoSuchWindowError")
  @js.native
  class NoSuchWindowError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.NoSuchWindowError {
    def this(message: String) = this()
  }
  
  /**
    * A script did not complete before its timeout expired.
    */
  @JSImport("protractor", "error.ScriptTimeoutError")
  @js.native
  class ScriptTimeoutError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.ScriptTimeoutError {
    def this(message: String) = this()
  }
  
  /**
    * A new session could not be created.
    */
  @JSImport("protractor", "error.SessionNotCreatedError")
  @js.native
  class SessionNotCreatedError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.SessionNotCreatedError {
    def this(message: String) = this()
  }
  
  /**
    * An element command failed because the referenced element is no longer
    * attached to the DOM.
    */
  @JSImport("protractor", "error.StaleElementReferenceError")
  @js.native
  class StaleElementReferenceError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.StaleElementReferenceError {
    def this(message: String) = this()
  }
  
  /**
    * An operation did not completErrorCodee before its timeout expired.
    */
  @JSImport("protractor", "error.TimeoutError")
  @js.native
  class TimeoutError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.TimeoutError {
    def this(message: String) = this()
  }
  
  /**
    * A screen capture operation was not possible.
    */
  @JSImport("protractor", "error.UnableToCaptureScreenError")
  @js.native
  class UnableToCaptureScreenError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.UnableToCaptureScreenError {
    def this(message: String) = this()
  }
  
  /**
    * A request to set a cookie’s value could not be satisfied.
    */
  @JSImport("protractor", "error.UnableToSetCookieError")
  @js.native
  class UnableToSetCookieError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.UnableToSetCookieError {
    def this(message: String) = this()
  }
  
  /**
    * A modal dialog was open, blocking this operation.
    */
  @JSImport("protractor", "error.UnexpectedAlertOpenError")
  @js.native
  class UnexpectedAlertOpenError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.UnexpectedAlertOpenError {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], openAlertText: String) = this()
    def this(message: String, openAlertText: String) = this()
  }
  
  /**
    * A command could not be executed because the remote end is not aware of it.
    */
  @JSImport("protractor", "error.UnknownCommandError")
  @js.native
  class UnknownCommandError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.UnknownCommandError {
    def this(message: String) = this()
  }
  
  /**
    * The requested command matched a known URL but did not match an method for
    * that URL.
    */
  @JSImport("protractor", "error.UnknownMethodError")
  @js.native
  class UnknownMethodError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.UnknownMethodError {
    def this(message: String) = this()
  }
  
  /**
    * Reports an unsupport operation.
    */
  @JSImport("protractor", "error.UnsupportedOperationError")
  @js.native
  class UnsupportedOperationError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.UnsupportedOperationError {
    def this(message: String) = this()
  }
  
  /**
    * The base WebDriver error type. This error type is only used directly when a
    * more appropriate category is not defined for the offending error.
    */
  @JSImport("protractor", "error.WebDriverError")
  @js.native
  class WebDriverError ()
    extends typingsSlinky.seleniumWebdriver.mod.error.WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * Checks a legacy response from the Selenium 2.0 wire protocol for an error.
    */
  @JSImport("protractor", "error.checkLegacyResponse")
  @js.native
  def checkLegacyResponse(response: MaybeLegacyResponse): MaybeLegacyResponse = js.native
  
  /**
    * Checks a response object from a server that adheres to the W3C WebDriver
    * protocol.
    */
  @JSImport("protractor", "error.checkResponse")
  @js.native
  def checkResponse(data: Response): Response = js.native
  
  /**
    * Lookup the err in table of errors.
    */
  @JSImport("protractor", "error.encodeError")
  @js.native
  def encodeError(err: js.Any): Error = js.native
  
  @JSImport("protractor", "error.throwDecodedError")
  @js.native
  def throwDecodedError(data: String): scala.Nothing = js.native
  /**
    * Throws an error coded from the W3C protocol. A generic error will be thrown
    * if the provided `data` is not a valid encoded error.
    */
  @JSImport("protractor", "error.throwDecodedError")
  @js.native
  def throwDecodedError(data: ErrorData): scala.Nothing = js.native
}
