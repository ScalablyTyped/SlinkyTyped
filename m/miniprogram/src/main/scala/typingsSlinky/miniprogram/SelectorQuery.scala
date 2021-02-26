package typingsSlinky.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorQuery extends StObject {
  
  /**
    * Put the location of the current selected node into the query
    * result. It is similar to the `getBoundingClientRect` of `DOM`,
    * the returned value includes width, height, left, top, bottom,
    * right. If current node is window object, only width and height will be returned.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-boundingclientrect)
    */
  def boundingClientRect(): SelectorQuery = js.native
  
  /**
    * Put the query result into callback function. The query result
    * is an array according to the query sequence, the object in the
    *  array is the result of each query. If the selected node is
    * the list of node, the query result of the single query is also an array.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-exec)
    */
  def exec(callback: SelectorQueryExecCallback): Unit = js.native
  
  /**
    * Put the scroll information of current selected node into the
    * query result, the returned value includes scrollTop, scrollLeft.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-scrolloffset)
    */
  def scrollOffset(): SelectorQuery = js.native
  
  /**
    * Select the first node that matches the selector, the selector
    * can support ID selector and class selector.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-select)
    */
  def select(value: String): SelectorQuery = js.native
  
  /**
    * Select all the nodes that match the selector, the selector can
    *  support ID selector and class selector.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-selectall)
    */
  def selectAll(value: String): SelectorQuery = js.native
  
  /**
    * The object of select window.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-selectviewport)
    */
  def selectViewport(): SelectorQuery = js.native
}
object SelectorQuery {
  
  @scala.inline
  def apply(
    boundingClientRect: () => SelectorQuery,
    exec: SelectorQueryExecCallback => Unit,
    scrollOffset: () => SelectorQuery,
    select: String => SelectorQuery,
    selectAll: String => SelectorQuery,
    selectViewport: () => SelectorQuery
  ): SelectorQuery = {
    val __obj = js.Dynamic.literal(boundingClientRect = js.Any.fromFunction0(boundingClientRect), exec = js.Any.fromFunction1(exec), scrollOffset = js.Any.fromFunction0(scrollOffset), select = js.Any.fromFunction1(select), selectAll = js.Any.fromFunction1(selectAll), selectViewport = js.Any.fromFunction0(selectViewport))
    __obj.asInstanceOf[SelectorQuery]
  }
  
  @scala.inline
  implicit class SelectorQueryMutableBuilder[Self <: SelectorQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingClientRect(value: () => SelectorQuery): Self = StObject.set(x, "boundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExec(value: SelectorQueryExecCallback => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollOffset(value: () => SelectorQuery): Self = StObject.set(x, "scrollOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: String => SelectorQuery): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectAll(value: String => SelectorQuery): Self = StObject.set(x, "selectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectViewport(value: () => SelectorQuery): Self = StObject.set(x, "selectViewport", js.Any.fromFunction0(value))
  }
}
