package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelAnchorNodeName extends js.Object {
  var labelAnchorNodeName: String = js.native
  var rootNodeName: String = js.native
  var touchPointNodeName: String = js.native
}

object LabelAnchorNodeName {
  @scala.inline
  def apply(labelAnchorNodeName: String, rootNodeName: String, touchPointNodeName: String): LabelAnchorNodeName = {
    val __obj = js.Dynamic.literal(labelAnchorNodeName = labelAnchorNodeName.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], touchPointNodeName = touchPointNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelAnchorNodeName]
  }
  @scala.inline
  implicit class LabelAnchorNodeNameOps[Self <: LabelAnchorNodeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelAnchorNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnchorNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchPointNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchPointNodeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

