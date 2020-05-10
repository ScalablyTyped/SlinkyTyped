package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵLContext extends js.Object {
  /**
    * The instance of the Component node.
    */
  var component: js.UndefOr[js.Object | Null] = js.native
  /**
    * The list of active directives that exist on this element.
    */
  var directives: js.UndefOr[js.Array[_] | Null] = js.native
  /**
    * The component's parent view data.
    */
  var lView: ɵangularPackagesCoreCoreBj = js.native
  /**
    * The map of local references (local reference name => element or directive instance) that exist
    * on this element.
    */
  var localRefs: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  /**
    * The instance of the DOM node that is attached to the lNode.
    */
  var native: RNode = js.native
  /**
    * The index instance of the node.
    */
  var nodeIndex: Double = js.native
}

object ɵLContext {
  @scala.inline
  def apply(lView: ɵangularPackagesCoreCoreBj, native: RNode, nodeIndex: Double): ɵLContext = {
    val __obj = js.Dynamic.literal(lView = lView.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵLContext]
  }
  @scala.inline
  implicit class ɵLContextOps[Self <: ɵLContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLView(value: ɵangularPackagesCoreCoreBj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative(value: RNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(null)
        ret
    }
    @scala.inline
    def withDirectives(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectivesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(null)
        ret
    }
    @scala.inline
    def withLocalRefs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalRefsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localRefs")(null)
        ret
    }
  }
  
}

