package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaulttitle extends js.Object {
  var default_title: js.UndefOr[String] = js.native
  var file_filters: js.UndefOr[js.Array[String]] = js.native
  var id: js.UndefOr[String] = js.native
}

object AnonDefaulttitle {
  @scala.inline
  def apply(): AnonDefaulttitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaulttitle]
  }
  @scala.inline
  implicit class AnonDefaulttitleOps[Self <: AnonDefaulttitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_title")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_filters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_filters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_filters")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

