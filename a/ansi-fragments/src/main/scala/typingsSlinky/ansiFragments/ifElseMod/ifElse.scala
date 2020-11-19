package typingsSlinky.ansiFragments.ifElseMod

import typingsSlinky.ansiFragments.ifragmentMod.IFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ansi-fragments/build/fragments/IfElse", "ifElse")
@js.native
object ifElse extends js.Object {
  
  def apply(condition: Condition, ifTrueFragment: String): IfElse_ = js.native
  def apply(condition: Condition, ifTrueFragment: String, elseFragment: String): IfElse_ = js.native
  def apply(condition: Condition, ifTrueFragment: String, elseFragment: IFragment): IfElse_ = js.native
  def apply(condition: Condition, ifTrueFragment: IFragment): IfElse_ = js.native
  def apply(condition: Condition, ifTrueFragment: IFragment, elseFragment: String): IfElse_ = js.native
  def apply(condition: Condition, ifTrueFragment: IFragment, elseFragment: IFragment): IfElse_ = js.native
}
