package typingsSlinky.cypress

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.cypress.cypressMod.Cypress.ObjectLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.LogConfig> */
@js.native
trait PartialLogConfig extends js.Object {
  @JSName("$el")
  var $el: js.UndefOr[JQuery_[HTMLElement]] = js.native
  var consoleProps: js.UndefOr[js.Function0[ObjectLike]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var message: js.UndefOr[js.Array[_]] = js.native
  var name: js.UndefOr[String] = js.native
}

object PartialLogConfig {
  @scala.inline
  def apply(): PartialLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLogConfig]
  }
  @scala.inline
  implicit class PartialLogConfigOps[Self <: PartialLogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$el(value: JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$el: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$el")(js.undefined)
        ret
    }
    @scala.inline
    def withConsoleProps(value: () => ObjectLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutConsoleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

