package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArt extends js.Object {
  /** The text rendered as word art. */
  var renderedText: js.UndefOr[String] = js.native
}

object WordArt {
  @scala.inline
  def apply(): WordArt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordArt]
  }
  @scala.inline
  implicit class WordArtOps[Self <: WordArt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedText")(js.undefined)
        ret
    }
  }
  
}

