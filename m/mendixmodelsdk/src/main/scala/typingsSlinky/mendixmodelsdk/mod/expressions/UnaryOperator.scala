package typingsSlinky.mendixmodelsdk.mod.expressions

import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "expressions.UnaryOperator")
@js.native
class UnaryOperator protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.expressions.UnaryOperator {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object UnaryOperator {
  
  @JSImport("mendixmodelsdk", "expressions.UnaryOperator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryOperator.None")
  @js.native
  def None: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.UnaryOperator = js.native
  @scala.inline
  def None_=(x: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryOperator.UnaryMinus")
  @js.native
  def UnaryMinus: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.UnaryOperator = js.native
  @scala.inline
  def UnaryMinus_=(x: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryMinus")(x.asInstanceOf[js.Any])
}
