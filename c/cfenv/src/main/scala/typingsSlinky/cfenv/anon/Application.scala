package typingsSlinky.cfenv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  var application: js.UndefOr[String] = js.native
  var services: js.UndefOr[String] = js.native
}

object Application {
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
  }
  
}

