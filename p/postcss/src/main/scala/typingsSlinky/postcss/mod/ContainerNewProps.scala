package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerNewProps extends NodeNewProps {
  /**
    * Contains the container's children.
    */
  var nodes: js.UndefOr[js.Array[ChildNode]] = js.native
  @JSName("raws")
  var raws_ContainerNewProps: js.UndefOr[ContainerRaws] = js.native
}

object ContainerNewProps {
  @scala.inline
  def apply(): ContainerNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerNewProps]
  }
  @scala.inline
  implicit class ContainerNewPropsOps[Self <: ContainerNewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: js.Array[ChildNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withRaws(value: ContainerRaws): Self = {
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
  }
  
}

