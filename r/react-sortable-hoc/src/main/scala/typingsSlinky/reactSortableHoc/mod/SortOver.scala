package typingsSlinky.reactSortableHoc.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortOver extends js.Object {
  
  var collection: Offset = js.native
  
  var helper: HTMLElement = js.native
  
  var index: Double = js.native
  
  var isKeySorting: Boolean = js.native
  
  var newIndex: Double = js.native
  
  var nodes: js.Array[HTMLElement] = js.native
  
  var oldIndex: Double = js.native
}
object SortOver {
  
  @scala.inline
  def apply(
    collection: Offset,
    helper: HTMLElement,
    index: Double,
    isKeySorting: Boolean,
    newIndex: Double,
    nodes: js.Array[HTMLElement],
    oldIndex: Double
  ): SortOver = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortOver]
  }
  
  @scala.inline
  implicit class SortOverOps[Self <: SortOver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollection(value: Offset): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelper(value: HTMLElement): Self = this.set("helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKeySorting(value: Boolean): Self = this.set("isKeySorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: HTMLElement*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[HTMLElement]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
  }
}
