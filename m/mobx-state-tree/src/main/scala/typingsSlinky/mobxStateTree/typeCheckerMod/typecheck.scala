package typingsSlinky.mobxStateTree.typeCheckerMod

import typingsSlinky.mobxStateTree.typeMod.ExtractCSTWithSTN
import typingsSlinky.mobxStateTree.typeMod.IAnyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/core/type/type-checker", "typecheck")
@js.native
object typecheck extends js.Object {
  
  def apply[IT /* <: IAnyType */](`type`: IT, value: ExtractCSTWithSTN[IT]): Unit = js.native
}
