package typingsSlinky.astDashTypes.libPathDashVisitorMod

import typingsSlinky.astDashTypes.libTypesMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathVisitorStatics extends js.Object {
  def fromMethodsObject(): Visitor = js.native
  def fromMethodsObject(methods: js.Any): Visitor = js.native
  def visit[M](node: ASTNode): js.Any = js.native
  def visit[M](node: ASTNode, methods: typingsSlinky.astDashTypes.genVisitorMod.Visitor[M]): js.Any = js.native
}

