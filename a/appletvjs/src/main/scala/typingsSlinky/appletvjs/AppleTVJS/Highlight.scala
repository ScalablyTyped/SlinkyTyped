package typingsSlinky.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Highlight extends js.Object {
  /** The description of the highlight. */
  var description: String = js.native
  /** The duration of the highlight. */
  var duration: Double = js.native
  /** The imageURL of the highlight. */
  var imageURL: String = js.native
  /** The name of the highlight. */
  var name: String = js.native
  /** The starttime of the highlight. */
  var starttime: Double = js.native
}

object Highlight {
  @scala.inline
  def apply(description: String, duration: Double, imageURL: String, name: String, starttime: Double): Highlight = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], imageURL = imageURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  @scala.inline
  implicit class HighlightOps[Self <: Highlight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarttime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starttime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

