package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCompatibleImagesResult extends js.Object {
  /**
    * A JSON-formatted object that describes a compatible AMI, including the ID and name for a Snowball Edge AMI.
    */
  var CompatibleImages: js.UndefOr[CompatibleImageList] = js.native
  /**
    * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListCompatibleImagesResult {
  @scala.inline
  def apply(): ListCompatibleImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCompatibleImagesResult]
  }
  @scala.inline
  implicit class ListCompatibleImagesResultOps[Self <: ListCompatibleImagesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibleImages(value: CompatibleImageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleImages")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

