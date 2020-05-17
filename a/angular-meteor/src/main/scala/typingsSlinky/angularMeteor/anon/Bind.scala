package typingsSlinky.angularMeteor.anon

import typingsSlinky.angularMeteor.mod.meteor.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bind extends js.Object {
  /**
    * @param scope - The scope the document will be bound to.
    * @param model - The name of the scope's model variable that the document will be bound to.
    */
  def bind(scope: IScope, model: String): Unit = js.native
}

object Bind {
  @scala.inline
  def apply(bind: (IScope, String) => Unit): Bind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind))
    __obj.asInstanceOf[Bind]
  }
  @scala.inline
  implicit class BindOps[Self <: Bind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: (IScope, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

