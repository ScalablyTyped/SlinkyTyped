package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArtUrl extends js.Object {
  var artUrl: js.UndefOr[String] = js.native
  var gservicesKey: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[AnonAuthor]] = js.native
}

object AnonArtUrl {
  @scala.inline
  def apply(): AnonArtUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonArtUrl]
  }
  @scala.inline
  implicit class AnonArtUrlOps[Self <: AnonArtUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withGservicesKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gservicesKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGservicesKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gservicesKey")(js.undefined)
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
    @scala.inline
    def withItems(value: js.Array[AnonAuthor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

