package typingsSlinky.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViewPrefixCls extends StObject {
  
  var listPrefixCls: String = js.native
  
  var listViewPrefixCls: String = js.native
  
  var prefixCls: String = js.native
}
object ListViewPrefixCls {
  
  @scala.inline
  def apply(listPrefixCls: String, listViewPrefixCls: String, prefixCls: String): ListViewPrefixCls = {
    val __obj = js.Dynamic.literal(listPrefixCls = listPrefixCls.asInstanceOf[js.Any], listViewPrefixCls = listViewPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPrefixCls]
  }
  
  @scala.inline
  implicit class ListViewPrefixClsMutableBuilder[Self <: ListViewPrefixCls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListPrefixCls(value: String): Self = StObject.set(x, "listPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListViewPrefixCls(value: String): Self = StObject.set(x, "listViewPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
