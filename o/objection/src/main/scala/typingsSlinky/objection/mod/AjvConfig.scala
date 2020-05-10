package typingsSlinky.objection.mod

import typingsSlinky.ajv.mod.Ajv
import typingsSlinky.ajv.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjvConfig extends js.Object {
  var options: js.UndefOr[Options] = js.native
  def onCreateAjv(ajv: Ajv): Unit = js.native
}

object AjvConfig {
  @scala.inline
  def apply(onCreateAjv: Ajv => Unit): AjvConfig = {
    val __obj = js.Dynamic.literal(onCreateAjv = js.Any.fromFunction1(onCreateAjv))
    __obj.asInstanceOf[AjvConfig]
  }
  @scala.inline
  implicit class AjvConfigOps[Self <: AjvConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCreateAjv(value: Ajv => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateAjv")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

