package typingsSlinky.ejWebAll

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwidget extends js.Object {
  val autoInit: Boolean = js.native
  val registeredInstances: js.Array[_] = js.native
  val registeredWidgets: js.Array[_] = js.native
  def destroyAll(elements: Element): Unit = js.native
  def init(element: Element): Unit = js.native
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit = js.native
}

object Typeofwidget {
  @scala.inline
  def apply(
    autoInit: Boolean,
    destroyAll: Element => Unit,
    init: Element => Unit,
    register: (String, String, js.Any) => Unit,
    registerInstance: (Element, String, String, js.Any) => Unit,
    registeredInstances: js.Array[_],
    registeredWidgets: js.Array[_]
  ): Typeofwidget = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any], destroyAll = js.Any.fromFunction1(destroyAll), init = js.Any.fromFunction1(init), register = js.Any.fromFunction3(register), registerInstance = js.Any.fromFunction4(registerInstance), registeredInstances = registeredInstances.asInstanceOf[js.Any], registeredWidgets = registeredWidgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwidget]
  }
  @scala.inline
  implicit class TypeofwidgetOps[Self <: Typeofwidget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyAll(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInit(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegister(value: (String, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRegisterInstance(value: (Element, String, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInstance")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRegisteredInstances(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisteredWidgets(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredWidgets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

