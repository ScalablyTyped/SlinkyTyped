package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，查找联系人参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
@js.native
trait PlusContactsContactFindOption extends StObject {
  
  /**
    * 数组，查找时的过滤器
    * 可设置为空，表示不过滤。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var filter: js.UndefOr[PlusContactsContactFindFilter] = js.native
  
  /**
    * 是否查找多个联系人，默认值为true
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var multiple: js.UndefOr[Boolean] = js.native
}
object PlusContactsContactFindOption {
  
  @scala.inline
  def apply(): PlusContactsContactFindOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusContactsContactFindOption]
  }
  
  @scala.inline
  implicit class PlusContactsContactFindOptionMutableBuilder[Self <: PlusContactsContactFindOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: PlusContactsContactFindFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
