package typingsSlinky.atJimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesPluginsMod {
  import typingsSlinky.atJimpCore.atJimpCoreStrings.`class`
  import typingsSlinky.atJimpCore.atJimpCoreStrings.constants
  import typingsSlinky.atJimpCore.atJimpCoreStrings.mime
  import typingsSlinky.atJimpCore.typesEtcMod.Image
  import typingsSlinky.atJimpCore.typesUtilsMod.Omit
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type ClassOrConstantPlugin[T /* <: Image */] = WellFormedPlugin[T] with (Required[Pick[WellFormedPlugin[T], `class` | constants]])
  type IllformedPlugin = (Omit[_, `class` | constants]) with js.Object
  type JimpPlugin[T /* <: Image */] = ClassOrConstantPlugin[T] | IllformedPlugin
  type JimpType[T /* <: Image */] = WellFormedPlugin[T] with (Required[Pick[WellFormedPlugin[T], mime]])
}
