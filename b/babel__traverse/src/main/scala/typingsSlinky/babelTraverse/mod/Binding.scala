package typingsSlinky.babelTraverse.mod

import typingsSlinky.babelTraverse.anon.Existing
import typingsSlinky.babelTraverse.babelTraverseStrings.`var`
import typingsSlinky.babelTraverse.babelTraverseStrings.const
import typingsSlinky.babelTraverse.babelTraverseStrings.let
import typingsSlinky.babelTraverse.babelTraverseStrings.module
import typingsSlinky.babelTypes.mod.Identifier_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/traverse", "Binding")
@js.native
class Binding protected () extends js.Object {
  def this(opts: Existing) = this()
  var constant: Boolean = js.native
  var constantViolations: js.Array[NodePath[Node]] = js.native
  var identifier: Identifier_ = js.native
  var kind: `var` | let | const | module = js.native
  var path: NodePath[Node] = js.native
  var referencePaths: js.Array[NodePath[Node]] = js.native
  var referenced: Boolean = js.native
  var references: Double = js.native
  var scope: Scope = js.native
}

