package typingsSlinky.agiledigitalMulePreview.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MulePreviewContentProps extends js.Object {
  val contentRoot: String = js.native
  val contentString: String = js.native
}

object MulePreviewContentProps {
  @scala.inline
  def apply(contentRoot: String, contentString: String): MulePreviewContentProps = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentString = contentString.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulePreviewContentProps]
  }
  @scala.inline
  implicit class MulePreviewContentPropsOps[Self <: MulePreviewContentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

