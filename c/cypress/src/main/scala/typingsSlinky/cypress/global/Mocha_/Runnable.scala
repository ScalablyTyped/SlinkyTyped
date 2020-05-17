package typingsSlinky.cypress.global.Mocha_

import typingsSlinky.cypress.Mocha.AsyncFunc
import typingsSlinky.cypress.Mocha.Func
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Runnable "error" event
// #region Runnable untyped events
// #region Runnable "error" event
/**
  * Initialize a new `Runnable` with the given `title` and callback `fn`.
  *
  * @see https://mochajs.org/api/Runnable.html
  */
@JSGlobal("Mocha.Runnable")
@js.native
class Runnable protected ()
  extends typingsSlinky.cypress.Mocha.Runnable {
  def this(title: String) = this()
  def this(title: String, fn: AsyncFunc) = this()
  def this(title: String, fn: Func) = this()
}

