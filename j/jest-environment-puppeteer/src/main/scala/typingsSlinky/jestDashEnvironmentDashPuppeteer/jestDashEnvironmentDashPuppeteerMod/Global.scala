package typingsSlinky.jestDashEnvironmentDashPuppeteer.jestDashEnvironmentDashPuppeteerMod

import typingsSlinky.node.vmMod.Context
import typingsSlinky.puppeteer.puppeteerMod.Browser
import typingsSlinky.puppeteer.puppeteerMod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global
  extends typingsSlinky.atJestTypes.buildGlobalMod.Global {
  var browser: Browser = js.native
  var context: Context = js.native
  var jestPuppeteer: JestPuppeteer = js.native
  var page: Page = js.native
}

