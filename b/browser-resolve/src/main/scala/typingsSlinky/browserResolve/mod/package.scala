package typingsSlinky.browserResolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Callback invoked when resolving asynchronously
    *
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type resolveCallback = js.Function2[
    /* err */ js.UndefOr[js.Error], 
    /* resolved */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
