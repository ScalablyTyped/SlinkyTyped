package typingsSlinky.gapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationName extends js.Object {
  /** Application name to which the event belongs. */
  var applicationName: js.UndefOr[String] = js.native
  /** Obfuscated customer ID of the source customer. */
  var customerId: js.UndefOr[String] = js.native
  /** Time of occurrence of the activity. */
  var time: js.UndefOr[String] = js.native
  /** Unique qualifier if multiple events have the same time. */
  var uniqueQualifier: js.UndefOr[String] = js.native
}

object ApplicationName {
  @scala.inline
  def apply(): ApplicationName = {
    val __obj = js.Dynamic.literal()
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
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueQualifier")(js.undefined)
        ret
    }
  }
  
}

