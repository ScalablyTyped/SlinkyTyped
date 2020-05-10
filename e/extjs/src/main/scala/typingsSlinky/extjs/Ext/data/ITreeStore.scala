package typingsSlinky.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeStore extends IAbstractStore {
  /** [Config Option] (Boolean) */
  var clearOnLoad: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var defaultRootId: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultRootProperty: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultRootText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the record node by id
  		* @param id Object
  		* @returns Ext.data.NodeInterface
  		*/
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], INodeInterface]] = js.native
  /** [Method] Returns the root node for this tree
  		* @returns Ext.data.NodeInterface
  		*/
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.native
  /** [Config Option] (String) */
  var nodeParam: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the root node for this store
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object
  		* @returns Ext.data.NodeInterface The new root
  		*/
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface]] = js.native
}

object ITreeStore {
  @scala.inline
  def apply(): ITreeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreeStore]
  }
  @scala.inline
  implicit class ITreeStoreOps[Self <: ITreeStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withClearRemovedOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearRemovedOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearRemovedOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearRemovedOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRootId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRootId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRootProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRootText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRootText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootText")(js.undefined)
        ret
    }
    @scala.inline
    def withFolderSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolderSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderSort")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNodeById(value: /* id */ js.UndefOr[js.Any] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetNodeById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeById")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRootNode(value: () => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRootNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeParam")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRootNode(value: /* root */ js.UndefOr[js.Any] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRootNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootNode")(js.undefined)
        ret
    }
  }
  
}

