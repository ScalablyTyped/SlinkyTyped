package typingsSlinky.reactInspector.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewProps extends js.Object {
  /**
    * Not required prop because we also allow undefined value.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * An integer specifying to which level the tree should be initially expanded.
    */
  var expandLevel: js.UndefOr[Double] = js.native
  /**
    * An array containing all the paths that should be expanded when the component is initialized, or a string of just one path.
    */
  var expandPaths: js.UndefOr[String | js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  /**
    * Provide a custom nodeRenderer.
    */
  var nodeRenderer: js.UndefOr[InspectorNodeRenderer] = js.native
}

object TreeViewProps {
  @scala.inline
  def apply(): TreeViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewProps]
  }
  @scala.inline
  implicit class TreeViewPropsOps[Self <: TreeViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandPaths(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeRenderer(value: /* params */ InspectorNodeParams => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRenderer")(js.undefined)
        ret
    }
  }
  
}

