package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtrulePlain
  extends CssNodeCommon
     with CssNodePlain {
  var block: BlockPlain | Null = js.native
  var name: String = js.native
  var prelude: AtrulePreludePlain | Raw | Null = js.native
  @JSName("type")
  var type_AtrulePlain: typingsSlinky.cssTree.cssTreeStrings.Atrule = js.native
}

object AtrulePlain {
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Atrule): AtrulePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtrulePlain]
  }
  @scala.inline
  implicit class AtrulePlainOps[Self <: AtrulePlain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.cssTree.cssTreeStrings.Atrule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlock(value: BlockPlain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(null)
        ret
    }
    @scala.inline
    def withPrelude(value: AtrulePreludePlain | Raw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prelude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreludeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prelude")(null)
        ret
    }
  }
  
}

