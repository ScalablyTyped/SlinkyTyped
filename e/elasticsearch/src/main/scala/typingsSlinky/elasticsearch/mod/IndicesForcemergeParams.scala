package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesForcemergeParams extends GenericParams {
  
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  
  var flush: js.UndefOr[Boolean] = js.native
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  
  var index: NameList = js.native
  
  var maxNumSegments: js.UndefOr[Double] = js.native
  
  var onlyExpungeDeletes: js.UndefOr[Boolean] = js.native
  
  var operationThreading: js.UndefOr[js.Any] = js.native
  
     // even the docs don't know what this does
  var waitForMerge: js.UndefOr[Boolean] = js.native
}
object IndicesForcemergeParams {
  
  @scala.inline
  def apply(index: NameList): IndicesForcemergeParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesForcemergeParams]
  }
  
  @scala.inline
  implicit class IndicesForcemergeParamsOps[Self <: IndicesForcemergeParams] (val x: Self) extends AnyVal {
    
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
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNoIndices(value: Boolean): Self = this.set("allowNoIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNoIndices: Self = this.set("allowNoIndices", js.undefined)
    
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = this.set("expandWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandWildcards: Self = this.set("expandWildcards", js.undefined)
    
    @scala.inline
    def setFlush(value: Boolean): Self = this.set("flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = this.set("ignoreUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnavailable: Self = this.set("ignoreUnavailable", js.undefined)
    
    @scala.inline
    def setMaxNumSegments(value: Double): Self = this.set("maxNumSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumSegments: Self = this.set("maxNumSegments", js.undefined)
    
    @scala.inline
    def setOnlyExpungeDeletes(value: Boolean): Self = this.set("onlyExpungeDeletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyExpungeDeletes: Self = this.set("onlyExpungeDeletes", js.undefined)
    
    @scala.inline
    def setOperationThreading(value: js.Any): Self = this.set("operationThreading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationThreading: Self = this.set("operationThreading", js.undefined)
    
    @scala.inline
    def setWaitForMerge(value: Boolean): Self = this.set("waitForMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForMerge: Self = this.set("waitForMerge", js.undefined)
  }
}
