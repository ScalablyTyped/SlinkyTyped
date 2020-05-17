package typingsSlinky.jestEnvironmentPuppeteer.mod

import typingsSlinky.jestTypes.globalMod.Global
import typingsSlinky.node.vmMod.Context
import typingsSlinky.puppeteer.mod.Browser
import typingsSlinky.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global_ extends Global {
  var browser: Browser = js.native
  var context: Context = js.native
  var jestPuppeteer: JestPuppeteer = js.native
  var page: Page = js.native
}

