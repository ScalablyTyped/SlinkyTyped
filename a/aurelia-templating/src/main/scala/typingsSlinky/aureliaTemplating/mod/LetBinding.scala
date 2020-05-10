package typingsSlinky.aureliaTemplating.mod

import typingsSlinky.aureliaBinding.mod.Expression
import typingsSlinky.aureliaBinding.mod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LetBinding extends js.Object {
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: Expression = js.native
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): Unit = js.native
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): Unit = js.native
  /**
    * Assigns a value to the target.
    */
  def updateTarget(value: js.Any): Unit = js.native
}

object LetBinding {
  @scala.inline
  def apply(
    bind: Scope => Unit,
    sourceExpression: Expression,
    unbind: () => Unit,
    updateTarget: js.Any => Unit
  ): LetBinding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), sourceExpression = sourceExpression.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind), updateTarget = js.Any.fromFunction1(updateTarget))
    __obj.asInstanceOf[LetBinding]
  }
  @scala.inline
  implicit class LetBindingOps[Self <: LetBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: Scope => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSourceExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnbind(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateTarget(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTarget")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

