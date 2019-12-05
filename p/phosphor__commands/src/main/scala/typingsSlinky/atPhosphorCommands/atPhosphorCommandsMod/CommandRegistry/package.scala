package typingsSlinky.atPhosphorCommands.atPhosphorCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CommandRegistry {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject

  /**
    * A type alias for a user-defined command function.
    */
  type CommandFunc[T] = js.Function1[/* args */ ReadonlyJSONObject, T]
  /**
    * A type alias for a simple immutable string dataset.
    */
  type Dataset = StringDictionary[String]
}
