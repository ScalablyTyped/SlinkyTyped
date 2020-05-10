package typingsSlinky.riot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiotComponentShell[Props, State] extends js.Object {
  val css: js.UndefOr[String] = js.native
  val exports: js.UndefOr[js.Function0[(RiotComponentExport[Props, State]) | js.Object]] = js.native
  val name: js.UndefOr[String] = js.native
  // TODO: add the @riotjs/dom-bindings types
  def template(): js.Any = js.native
}

object RiotComponentShell {
  @scala.inline
  def apply[Props, State](template: () => js.Any): RiotComponentShell[Props, State] = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction0(template))
    __obj.asInstanceOf[RiotComponentShell[Props, State]]
  }
  @scala.inline
  implicit class RiotComponentShellOps[Self[props, state] <: RiotComponentShell[props, state], Props, State] (val x: Self[Props, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, State]) with Other]
    @scala.inline
    def withTemplate(value: () => js.Any): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCss(value: String): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withExports(value: () => (RiotComponentExport[Props, State]) | js.Object): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExports: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

