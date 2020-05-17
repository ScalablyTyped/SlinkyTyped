package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerMixin extends js.Object {
   // DEPRECATED: use 'fills' instead
  var backgroundStyleId: String = js.native
  var backgrounds: js.Array[Paint] = js.native
  var expanded: Boolean = js.native
}

object ContainerMixin {
  @scala.inline
  def apply(backgroundStyleId: String, backgrounds: js.Array[Paint], expanded: Boolean): ContainerMixin = {
    val __obj = js.Dynamic.literal(backgroundStyleId = backgroundStyleId.asInstanceOf[js.Any], backgrounds = backgrounds.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerMixin]
  }
  @scala.inline
  implicit class ContainerMixinOps[Self <: ContainerMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundStyleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgrounds(value: js.Array[Paint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgrounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

