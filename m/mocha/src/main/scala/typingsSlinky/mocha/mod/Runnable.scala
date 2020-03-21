package typingsSlinky.mocha.mod

import typingsSlinky.mocha.Mocha_.AsyncFunc
import typingsSlinky.mocha.Mocha_.Func
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
@JSImport("mocha", "Runnable")
@js.native
class Runnable protected ()
  extends typingsSlinky.mocha.Mocha_.Runnable {
  def this(title: String) = this()
  def this(title: String, fn: AsyncFunc) = this()
  def this(title: String, fn: Func) = this()
}

