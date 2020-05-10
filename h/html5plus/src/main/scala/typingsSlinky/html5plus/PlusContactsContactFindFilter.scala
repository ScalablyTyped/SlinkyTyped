package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，联系人查找过滤器
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
@js.native
trait PlusContactsContactFindFilter extends js.Object {
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
  implicit class PlusContactsContactFindFilterOps[Self <: PlusContactsContactFindFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withLogic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logic")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

