package typingsSlinky.grammarkdown.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "RightHandSideList")
@js.native
class RightHandSideList ()
  extends Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.RightHandSideList] {
  def this(elements: js.Array[RightHandSide]) = this()
  
  val elements: js.UndefOr[js.Array[RightHandSide]] = js.native
  
  def update(): RightHandSideList = js.native
  def update(elements: js.Array[RightHandSide]): RightHandSideList = js.native
}
