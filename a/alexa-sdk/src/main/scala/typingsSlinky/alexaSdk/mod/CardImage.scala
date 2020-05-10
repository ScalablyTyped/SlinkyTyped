package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardImage extends js.Object {
  /**
    * Recommended size (in px): 1200w x 800h
    */
  var largeImageUrl: String = js.native
  /**
    * Recommended size (in px): 720w x 480h
    */
  var smallImageUrl: String = js.native
}

object CardImage {
  @scala.inline
  def apply(largeImageUrl: String, smallImageUrl: String): CardImage = {
    val __obj = js.Dynamic.literal(largeImageUrl = largeImageUrl.asInstanceOf[js.Any], smallImageUrl = smallImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardImage]
  }
  @scala.inline
  implicit class CardImageOps[Self <: CardImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLargeImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

