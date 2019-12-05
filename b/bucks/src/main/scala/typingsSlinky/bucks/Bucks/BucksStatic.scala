package typingsSlinky.bucks.Bucks

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucksStatic
  extends /**
  * Create bucks object.
  */
Instantiable0[typingsSlinky.bucks.Bucks.Bucks] {
  /**
    * If set `true`, uncaught errors are logged.
    */
  var DEBUG: Boolean = js.native
  /**
    * bucks.js version.
    */
  var VERSION: String = js.native
  /**
    * Not yet called `end` bucks object.
    */
  var living: js.Array[typingsSlinky.bucks.Bucks.Bucks] = js.native
  /**
    * Running bucks objects.
    */
  var running: js.Array[typingsSlinky.bucks.Bucks.Bucks] = js.native
  /**
    * Catch all errors.
    * @param onError Function called after catching error
    */
  def onError(onError: js.Function2[/* err */ js.Error, /* bucks */ typingsSlinky.bucks.Bucks.Bucks, _]): Unit = js.native
}

