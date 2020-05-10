package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewEnrichmentItem extends js.Object {
  /** Location to be added to the album. */
  var locationEnrichment: js.UndefOr[LocationEnrichment] = js.native
  /** Map to be added to the album. */
  var mapEnrichment: js.UndefOr[MapEnrichment] = js.native
  /** Text to be added to the album. */
  var textEnrichment: js.UndefOr[TextEnrichment] = js.native
}

object NewEnrichmentItem {
  @scala.inline
  def apply(): NewEnrichmentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewEnrichmentItem]
  }
  @scala.inline
  implicit class NewEnrichmentItemOps[Self <: NewEnrichmentItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationEnrichment(value: LocationEnrichment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationEnrichment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationEnrichment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationEnrichment")(js.undefined)
        ret
    }
    @scala.inline
    def withMapEnrichment(value: MapEnrichment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapEnrichment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapEnrichment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapEnrichment")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEnrichment(value: TextEnrichment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEnrichment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEnrichment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEnrichment")(js.undefined)
        ret
    }
  }
  
}

