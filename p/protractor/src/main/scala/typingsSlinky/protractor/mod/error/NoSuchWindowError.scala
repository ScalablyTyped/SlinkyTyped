package typingsSlinky.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

