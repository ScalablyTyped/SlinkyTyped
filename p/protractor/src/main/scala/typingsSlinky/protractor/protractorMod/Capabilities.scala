package typingsSlinky.protractor.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Object)=} opt_other Another set of
  *     capabilities to merge into this instance.
  * @constructor
  */
class Capabilities ()
  extends typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities {
  def this(opt_other: js.Object) = this()
  def this(opt_other: typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities) = this()
}

/* static members */
@JSImport("protractor", "Capabilities")
@js.native
object Capabilities extends js.Object {
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Android.
    */
  def android(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  def chrome(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  def edge(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  def firefox(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for HTMLUnit.
    */
  def htmlunit(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for HTMLUnit
    *                                   with enabled Javascript.
    */
  def htmlunitwithjs(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  def ie(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for iPad.
    */
  def ipad(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for iPhone.
    */
  def iphone(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Opera.
    */
  def opera(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     PhantomJS.
    */
  def phantomjs(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  def safari(): typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
}

