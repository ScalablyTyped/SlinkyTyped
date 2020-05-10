package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeNewProps extends js.Object {
  var raws: js.UndefOr[NodeRaws] = js.native
  var source: js.UndefOr[NodeSource] = js.native
}

object NodeNewProps {
  @scala.inline
  def apply(): NodeNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeNewProps]
  }
  @scala.inline
  implicit class NodeNewPropsOps[Self <: NodeNewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaws(value: NodeRaws): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaws: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raws")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: NodeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

