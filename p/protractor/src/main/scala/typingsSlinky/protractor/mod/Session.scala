package typingsSlinky.protractor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "Session")
@js.native
class Session protected ()
  extends typingsSlinky.seleniumWebdriver.mod.Session {
  def this(id: String, capabilities: js.Object) = this()
  // region Constructors
  /**
    * @param {string} id The session ID.
    * @param {!(Object|Capabilities)} capabilities The session
    *     capabilities.
    * @constructor
    */
  def this(id: String, capabilities: typingsSlinky.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
}

