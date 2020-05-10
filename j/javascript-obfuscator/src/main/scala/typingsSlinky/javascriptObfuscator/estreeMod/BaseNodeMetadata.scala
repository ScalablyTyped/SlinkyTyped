package typingsSlinky.javascriptObfuscator.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseNodeMetadata extends js.Object {
  var ignoredNode: js.UndefOr[Boolean] = js.native
}

object BaseNodeMetadata {
  @scala.inline
  def apply(): BaseNodeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseNodeMetadata]
  }
  @scala.inline
  implicit class BaseNodeMetadataOps[Self <: BaseNodeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoredNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredNode")(js.undefined)
        ret
    }
  }
  
}

