package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，联系人域数据对象
  * 联系人域数据对象，保存联系人特定域信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
@js.native
trait PlusContactsContactField extends js.Object {
  /**
    * 是否为首选项
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var preferred: js.UndefOr[Boolean] = js.native
  /**
    * 联系人域类型，如电话号码中的“mobile”、“home”、“company”
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * 联系人域值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var value: js.UndefOr[String] = js.native
}

object PlusContactsContactField {
  @scala.inline
  def apply(): PlusContactsContactField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusContactsContactField]
  }
  @scala.inline
  implicit class PlusContactsContactFieldOps[Self <: PlusContactsContactField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreferred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

