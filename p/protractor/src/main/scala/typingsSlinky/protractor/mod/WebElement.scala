package typingsSlinky.protractor.mod

import typingsSlinky.seleniumWebdriver.mod.IWebElementId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor", "WebElement")
@js.native
class WebElement protected ()
  extends typingsSlinky.seleniumWebdriver.mod.WebElement {
  def this(driver: typingsSlinky.seleniumWebdriver.mod.WebDriver, id: String) = this()
  /**
    * @param {!WebDriver} driver the parent WebDriver instance for this element.
    * @param {(!IThenable<string>|string)} id The server-assigned opaque ID for
    *     the underlying DOM element.
    */
  def this(driver: typingsSlinky.seleniumWebdriver.mod.WebDriver, id: js.Promise[String]) = this()
}
/* static members */
object WebElement {
  
  /**
    * @param {string} id The raw ID.
    * @param {boolean=} opt_noLegacy Whether to exclude the legacy element key.
    * @return {!Object} The element ID for use with WebDriver's wire protocol.
    */
  @JSImport("protractor", "WebElement.buildId")
  @js.native
  def buildId(id: String): IWebElementId = js.native
  @JSImport("protractor", "WebElement.buildId")
  @js.native
  def buildId(id: String, opt_noLegacy: Boolean): IWebElementId = js.native
  
  /**
    * Compares two WebElements for equality.
    *
    * @param {!WebElement} a A WebElement.
    * @param {!WebElement} b A WebElement.
    * @return {!Promise<boolean>} A promise that will be
    *     resolved to whether the two WebElements are equal.
    */
  @JSImport("protractor", "WebElement.equals")
  @js.native
  def equals(
    a: typingsSlinky.seleniumWebdriver.mod.WebElement,
    b: typingsSlinky.seleniumWebdriver.mod.WebElement
  ): js.Promise[Boolean] = js.native
  
  /**
    * Extracts the encoded WebElement ID from the object.
    *
    * @param {?} obj The object to extract the ID from.
    * @return {string} the extracted ID.
    * @throws {TypeError} if the object is not a valid encoded ID.
    */
  @JSImport("protractor", "WebElement.extractId")
  @js.native
  def extractId(obj: IWebElementId): String = js.native
  
  /**
    * @param {?} obj the object to test.
    * @return {boolean} whether the object is a valid encoded WebElement ID.
    */
  @JSImport("protractor", "WebElement.isId")
  @js.native
  def isId(obj: IWebElementId): Boolean = js.native
}
