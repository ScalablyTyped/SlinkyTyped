package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasCondensedHeadline extends js.Object {
  var hasCondensedHeadline: Boolean = js.native
  var imageProps: AnonHeight = js.native
}

object AnonHasCondensedHeadline {
  @scala.inline
  def apply(hasCondensedHeadline: Boolean, imageProps: AnonHeight): AnonHasCondensedHeadline = {
    val __obj = js.Dynamic.literal(hasCondensedHeadline = hasCondensedHeadline.asInstanceOf[js.Any], imageProps = imageProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasCondensedHeadline]
  }
  @scala.inline
  implicit class AnonHasCondensedHeadlineOps[Self <: AnonHasCondensedHeadline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasCondensedHeadline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCondensedHeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageProps(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

