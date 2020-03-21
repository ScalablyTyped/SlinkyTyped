package typingsSlinky.jestEnvironmentPuppeteer.mod

import typingsSlinky.node.vmMod.Context
import typingsSlinky.puppeteer.mod.Browser
import typingsSlinky.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global
  extends typingsSlinky.jestTypes.globalMod.Global {
  var browser: Browser = js.native
  var context: Context = js.native
  var jestPuppeteer: JestPuppeteer = js.native
  var page: Page = js.native
}

