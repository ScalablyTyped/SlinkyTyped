package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundImage extends js.Object {
  /** Defines how to align the background image over the diagram area.
    * @Default {ej.datavisualization.Diagram.ImageAlignment.XMidYMid}
    */
  var alignment: js.UndefOr[ImageAlignment | String] = js.native
}

object BackgroundImage {
  @scala.inline
  def apply(): BackgroundImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImage]
  }
  @scala.inline
  implicit class BackgroundImageOps[Self <: BackgroundImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: ImageAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
  }
  
}

