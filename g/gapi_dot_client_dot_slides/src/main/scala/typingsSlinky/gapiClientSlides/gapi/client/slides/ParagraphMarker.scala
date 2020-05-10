package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphMarker extends js.Object {
  /**
    * The bullet for this paragraph. If not present, the paragraph does not
    * belong to a list.
    */
  var bullet: js.UndefOr[Bullet] = js.native
  /** The paragraph's style */
  var style: js.UndefOr[ParagraphStyle] = js.native
}

object ParagraphMarker {
  @scala.inline
  def apply(): ParagraphMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphMarker]
  }
  @scala.inline
  implicit class ParagraphMarkerOps[Self <: ParagraphMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBullet(value: Bullet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBullet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullet")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

