package typingsSlinky.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
