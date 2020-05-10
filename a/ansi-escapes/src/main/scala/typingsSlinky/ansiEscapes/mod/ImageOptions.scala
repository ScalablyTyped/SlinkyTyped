package typingsSlinky.ansiEscapes.mod

import typingsSlinky.ansiEscapes.ansiEscapesStrings.auto
import typingsSlinky.typeFest.mod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageOptions extends js.Object {
  /**
  		The height is given as a number followed by a unit, or the word `'auto'`.
  		- `N`: N character cells.
  		- `Npx`: N pixels.
  		- `N%`: N percent of the session's width or height.
  		- `auto`: The image's inherent size will be used to determine an appropriate dimension.
  		*/
  val height: js.UndefOr[LiteralUnion[auto, Double | String]] = js.native
  val preserveAspectRatio: js.UndefOr[Boolean] = js.native
  /**
  		The width is given as a number followed by a unit, or the word `'auto'`.
  		- `N`: N character cells.
  		- `Npx`: N pixels.
  		- `N%`: N percent of the session's width or height.
  		- `auto`: The image's inherent size will be used to determine an appropriate dimension.
  		*/
  val width: js.UndefOr[LiteralUnion[auto, Double | String]] = js.native
}

object ImageOptions {
  @scala.inline
  def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  @scala.inline
  implicit class ImageOptionsOps[Self <: ImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: LiteralUnion[auto, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: LiteralUnion[auto, Double | String]): Self = {
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

