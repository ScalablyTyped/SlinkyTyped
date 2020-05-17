package typingsSlinky.oauth2Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Represents a generic callback structure for model callbacks
    */
  type Callback[T] = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  /**
    * An interface representing the user.
    * A user object is completely transparent to oauth2-server and is simply used as input to model functions.
    */
  type User = org.scalablytyped.runtime.StringDictionary[js.Any]
}
