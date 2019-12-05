package typingsSlinky.babelDashPluginDashMacros

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object babelDashPluginDashMacrosMod {
  import typingsSlinky.atBabelCore.atBabelCoreMod.NodePath
  import typingsSlinky.atBabelTraverse.atBabelTraverseMod.Node

  type MacroHandler = js.Function1[/* params */ MacroParams, Unit]
  type References = js.Array[NodePath[Node]]
}
