package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialplanCEP extends js.Object {
  var app_data: String = js.native
  var app_name: String = js.native
  /* Properties */
  var context: String = js.native
  var exten: String = js.native
  var priority: Double = js.native
}

object DialplanCEP {
  @scala.inline
  def apply(app_data: String, app_name: String, context: String, exten: String, priority: Double): DialplanCEP = {
    val __obj = js.Dynamic.literal(app_data = app_data.asInstanceOf[js.Any], app_name = app_name.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], exten = exten.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialplanCEP]
  }
  @scala.inline
  implicit class DialplanCEPOps[Self <: DialplanCEP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_data(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExten(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

