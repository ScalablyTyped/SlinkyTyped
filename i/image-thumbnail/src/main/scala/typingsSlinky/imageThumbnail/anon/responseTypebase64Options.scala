package typingsSlinky.imageThumbnail.anon

import typingsSlinky.imageThumbnail.imageThumbnailStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  responseType  :'base64'} & image-thumbnail.image-thumbnail.Options */
@js.native
trait responseTypebase64Options extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var percentage: js.UndefOr[Double] = js.native
  var responseType: js.UndefOr[base64 with String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object responseTypebase64Options {
  @scala.inline
  def apply(): responseTypebase64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[responseTypebase64Options]
  }
  @scala.inline
  implicit class responseTypebase64OptionsOps[Self <: responseTypebase64Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: base64 with String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

