package typingsSlinky.layuiSrc.layui

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.layuiSrc.layuiSrcStrings.count
import typingsSlinky.layuiSrc.layuiSrcStrings.limit
import typingsSlinky.layuiSrc.layuiSrcStrings.next
import typingsSlinky.layuiSrc.layuiSrcStrings.page
import typingsSlinky.layuiSrc.layuiSrcStrings.prev
import typingsSlinky.layuiSrc.layuiSrcStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageOptions extends StObject {
  
  var count: js.UndefOr[Double] = js.native
  
  var curr: js.UndefOr[Double] = js.native
  
  // id选择器 不加#
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var first: js.UndefOr[String] = js.native
  
  var groups: js.UndefOr[Double] = js.native
  
  var hash: js.UndefOr[String | Boolean] = js.native
  
  var jump: js.UndefOr[js.Function2[/* obj */ this.type, /* first */ Boolean, Unit]] = js.native
  
  var last: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[js.Array[count | prev | page | next | limit | skip]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var limits: js.UndefOr[js.Array[Double]] = js.native
  
  var next: js.UndefOr[String] = js.native
  
  var prev: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object PageOptions {
  
  @scala.inline
  def apply(): PageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageOptions]
  }
  
  @scala.inline
  implicit class PageOptionsMutableBuilder[Self <: PageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setCurr(value: Double): Self = StObject.set(x, "curr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrUndefined: Self = StObject.set(x, "curr", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemHTMLElement(value: HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setGroups(value: Double): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setHash(value: String | Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setJump(value: (PageOptions, /* first */ Boolean) => Unit): Self = StObject.set(x, "jump", js.Any.fromFunction2(value))
    
    @scala.inline
    def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
    
    @scala.inline
    def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Array[count | prev | page | next | limit | skip]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLayoutVarargs(value: (count | prev | page | next | limit | skip)*): Self = StObject.set(x, "layout", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLimits(value: js.Array[Double]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    @scala.inline
    def setLimitsVarargs(value: Double*): Self = StObject.set(x, "limits", js.Array(value :_*))
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
