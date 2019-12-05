package typingsSlinky.atIonicCliDashFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libOptionsMod {
  import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
  import typingsSlinky.atIonicCliDashFramework.definitionsMod.ParsedArg

  type OptionPredicate[O /* <: CommandMetadataOption */] = js.Function2[/* option */ O, /* value */ js.UndefOr[ParsedArg], Boolean]
}
