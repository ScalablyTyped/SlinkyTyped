package typingsSlinky.protractor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ProtractorBrowser")
@js.native
class ProtractorBrowser protected ()
  extends typingsSlinky.protractor.browserMod.ProtractorBrowser {
  def this(webdriverInstance: typingsSlinky.seleniumWebdriver.mod.WebDriver) = this()
  def this(webdriverInstance: typingsSlinky.seleniumWebdriver.mod.WebDriver, opt_baseUrl: String) = this()
  def this(
    webdriverInstance: typingsSlinky.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String
  ) = this()
  def this(
    webdriverInstance: typingsSlinky.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String]
  ) = this()
  def this(
    webdriverInstance: typingsSlinky.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typingsSlinky.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typingsSlinky.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typingsSlinky.seleniumWebdriver.mod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
}

/* static members */
@JSImport("protractor", "ProtractorBrowser")
@js.native
object ProtractorBrowser extends js.Object {
  /**
    * @type {ProtractorBy}
    */
  var By: typingsSlinky.protractor.locatorsMod.ProtractorBy = js.native
}

