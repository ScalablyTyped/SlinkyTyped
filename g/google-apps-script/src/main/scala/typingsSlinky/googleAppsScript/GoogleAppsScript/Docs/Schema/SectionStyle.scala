package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionStyle extends js.Object {
  var columnProperties: js.UndefOr[js.Array[SectionColumnProperties]] = js.native
  var columnSeparatorStyle: js.UndefOr[String] = js.native
  var contentDirection: js.UndefOr[String] = js.native
}

object SectionStyle {
  @scala.inline
  def apply(): SectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionStyle]
  }
  @scala.inline
  implicit class SectionStyleOps[Self <: SectionStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnProperties(value: js.Array[SectionColumnProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSeparatorStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSeparatorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSeparatorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSeparatorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDirection")(js.undefined)
        ret
    }
  }
  
}

