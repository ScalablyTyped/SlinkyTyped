package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationName extends js.Object {
  var applicationName: String = js.native
}

object ApplicationName {
  @scala.inline
  def apply(applicationName: String): ApplicationName = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationName]
  }
  @scala.inline
  implicit class ApplicationNameOps[Self <: ApplicationName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

