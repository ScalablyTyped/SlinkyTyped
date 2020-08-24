package typingsSlinky.netflixNerror.mod.VError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Represents a collection of errors for the purpose of consumers that generally
  * only deal with one error.  Callers can extract the individual errors
  * contained in this object, but may also just treat it as a normal single
  * error, in which case a summary message will be printed.
  */
@JSImport("@netflix/nerror", "VError.MultiError")
@js.native
class MultiError protected ()
  extends typingsSlinky.netflixNerror.mod.VError {
  def this(errors: js.Array[js.Error]) = this()
  def errors(): js.Array[js.Error] = js.native
}

