package typingsSlinky.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INodeStore extends IStore {
  /** [Property] (Number) */
  var isExpandingOrCollapsing: js.UndefOr[Double] = js.native
  /** [Property] (Boolean) */
  var isNodeStore: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Model) */
  var node: js.UndefOr[IModel] = js.native
  /** [Config Option] (Boolean) */
  var recursive: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.TreeStore) */
  var treeStore: js.UndefOr[ITreeStore] = js.native
}

object INodeStore {
  @scala.inline
  def apply(): INodeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeStore]
  }
  @scala.inline
  implicit class INodeStoreOps[Self <: INodeStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExpandingOrCollapsing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpandingOrCollapsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpandingOrCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpandingOrCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNodeStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNodeStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNodeStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNodeStore")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
    @scala.inline
    def withRootVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeStore(value: ITreeStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeStore")(js.undefined)
        ret
    }
  }
  
}

