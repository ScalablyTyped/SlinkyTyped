package typingsSlinky.reactNativeFlipCard.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceProps extends js.Object {
  var chilren: js.Array[ReactElement] = js.native
}

object FaceProps {
  @scala.inline
  def apply(chilren: js.Array[ReactElement]): FaceProps = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceProps]
  }
  @scala.inline
  implicit class FacePropsOps[Self <: FaceProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChilren(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chilren")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

