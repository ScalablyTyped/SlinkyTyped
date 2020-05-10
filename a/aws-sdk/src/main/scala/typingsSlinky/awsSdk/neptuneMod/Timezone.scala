package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timezone extends js.Object {
  /**
    * The name of the time zone.
    */
  var TimezoneName: js.UndefOr[String] = js.native
}

object Timezone {
  @scala.inline
  def apply(): Timezone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timezone]
  }
  @scala.inline
  implicit class TimezoneOps[Self <: Timezone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimezoneName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimezoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimezoneName")(js.undefined)
        ret
    }
  }
  
}

