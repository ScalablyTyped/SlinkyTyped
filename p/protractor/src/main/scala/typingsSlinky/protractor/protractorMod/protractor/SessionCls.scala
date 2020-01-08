package typingsSlinky.protractor.protractorMod.protractor

import typingsSlinky.seleniumDashWebdriver.libCapabilitiesMod.Capabilities
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "protractor.Session")
@js.native
class SessionCls protected () extends Session {
  // region Constructors
  /**
    * @param {string} id The session ID.
    * @param {!(Object|Capabilities)} capabilities The session
    *     capabilities.
    * @constructor
    */
  def this(id: String, capabilities: Capabilities) = this()
}

