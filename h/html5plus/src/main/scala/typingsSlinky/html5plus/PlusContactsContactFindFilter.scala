package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，联系人查找过滤器
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
@js.native
trait PlusContactsContactFindFilter extends StObject {
  
  /**
    * 区配的联系人域，可取联系人的属性名称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * 区配的逻辑
    * 可取“and”、“or”、“not”，默认值为“and”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var logic: js.UndefOr[String] = js.native
  
  /**
    * 区配的联系人值，可使用区配符号“?”和“*”
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var value: js.UndefOr[String] = js.native
}
object PlusContactsContactFindFilter {
  
  @scala.inline
  def apply(): PlusContactsContactFindFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusContactsContactFindFilter]
  }
  
  @scala.inline
  implicit class PlusContactsContactFindFilterMutableBuilder[Self <: PlusContactsContactFindFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLogic(value: String): Self = StObject.set(x, "logic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
