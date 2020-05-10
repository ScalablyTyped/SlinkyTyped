package typingsSlinky.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binding extends js.Object {
  /**
    * Calls the source method with the specified args object. This method is present in event bindings like trigger/delegate.
    */
  var callSource: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  /**
    * Whether the binding is data-bound.
    */
  var isBound: Boolean = js.native
  /**
    * The directionality of the binding.
    */
  var mode: js.UndefOr[bindingMode] = js.native
  /**
    * The binding's source.
    */
  var source: Scope = js.native
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: js.UndefOr[Expression] = js.native
  /**
    * Assigns a value to the source.
    */
  var updateSource: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  /**
    * Assigns a value to the target.
    */
  var updateTarget: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): Unit = js.native
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): Unit = js.native
}

object Binding {
  @scala.inline
  def apply(bind: Scope => Unit, isBound: Boolean, source: Scope, unbind: () => Unit): Binding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), isBound = isBound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  implicit class BindingOps[Self <: Binding] (val x: Self) extends AnyVal {
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
    def withIsBound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnbind(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCallSource(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: bindingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSource(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSource")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTarget(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTarget")(js.undefined)
        ret
    }
  }
  
}

