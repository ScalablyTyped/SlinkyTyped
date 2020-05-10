package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionColumnProperties extends js.Object {
  var paddingEnd: js.UndefOr[Dimension] = js.native
  var width: js.UndefOr[Dimension] = js.native
}

object SectionColumnProperties {
  @scala.inline
  def apply(): SectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionColumnProperties]
  }
  @scala.inline
  implicit class SectionColumnPropertiesOps[Self <: SectionColumnProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingEnd(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

