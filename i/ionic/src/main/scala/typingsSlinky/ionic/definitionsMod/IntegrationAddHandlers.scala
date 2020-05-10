package typingsSlinky.ionic.definitionsMod

import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegrationAddHandlers extends js.Object {
  var conflictHandler: js.UndefOr[js.Function2[/* f */ String, /* stats */ Stats, js.Promise[Boolean]]] = js.native
  var onFileCreate: js.UndefOr[js.Function1[/* f */ String, Unit]] = js.native
}

object IntegrationAddHandlers {
  @scala.inline
  def apply(): IntegrationAddHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationAddHandlers]
  }
  @scala.inline
  implicit class IntegrationAddHandlersOps[Self <: IntegrationAddHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflictHandler(value: (/* f */ String, /* stats */ Stats) => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConflictHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFileCreate(value: /* f */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFileCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileCreate")(js.undefined)
        ret
    }
  }
  
}

