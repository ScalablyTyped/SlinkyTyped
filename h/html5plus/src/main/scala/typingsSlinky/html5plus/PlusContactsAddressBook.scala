package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 通讯录对象
  * 通讯录管理对象，可对系统通讯录进行联系人的增、删、改、查操作。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
@js.native
trait PlusContactsAddressBook extends StObject {
  
  /**
    * 创建联系人
    * 创建一个系统联系人，并返回联系人对象，可对联系人对象进行操作设置联系人信息，如名称、地址、电话等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  def create(): PlusContactsContact = js.native
  
  /**
    * 在通讯录中查找联系人
    * 在通讯录中安装指定的规则查找联系人，contactFields可设定查找返回的联系人中包含的字段值，查找联系人成功时通过successCB回调返回，查找联系人失败则通过errorCB回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  def find(): Unit = js.native
  def find(
    contactFields: js.UndefOr[scala.Nothing],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.UndefOr[scala.Nothing],
    findOptions: PlusContactsContactFindOption
  ): Unit = js.native
  def find(
    contactFields: js.UndefOr[scala.Nothing],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def find(
    contactFields: js.UndefOr[scala.Nothing],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    findOptions: PlusContactsContactFindOption
  ): Unit = js.native
  def find(
    contactFields: js.UndefOr[scala.Nothing],
    successCB: js.Function1[/* result */ PlusContactsContact, Unit]
  ): Unit = js.native
  def find(
    contactFields: js.UndefOr[scala.Nothing],
    successCB: js.Function1[/* result */ PlusContactsContact, Unit],
    errorCB: js.UndefOr[scala.Nothing],
    findOptions: PlusContactsContactFindOption
  ): Unit = js.native
  def find(
    contactFields: js.UndefOr[scala.Nothing],
    successCB: js.Function1[/* result */ PlusContactsContact, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def find(
    contactFields: js.UndefOr[scala.Nothing],
    successCB: js.Function1[/* result */ PlusContactsContact, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    findOptions: PlusContactsContactFindOption
  ): Unit = js.native
  def find(contactFields: js.Array[String]): Unit = js.native
  def find(
    contactFields: js.Array[String],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.UndefOr[scala.Nothing],
    findOptions: PlusContactsContactFindOption
  ): Unit = js.native
  def find(
    contactFields: js.Array[String],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def find(
    contactFields: js.Array[String],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    findOptions: PlusContactsContactFindOption
  ): Unit = js.native
  def find(contactFields: js.Array[String], successCB: js.Function1[/* result */ PlusContactsContact, Unit]): Unit = js.native
  def find(
    contactFields: js.Array[String],
    successCB: js.Function1[/* result */ PlusContactsContact, Unit],
    errorCB: js.UndefOr[scala.Nothing],
    findOptions: PlusContactsContactFindOption
  ): Unit = js.native
  def find(
    contactFields: js.Array[String],
    successCB: js.Function1[/* result */ PlusContactsContact, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def find(
    contactFields: js.Array[String],
    successCB: js.Function1[/* result */ PlusContactsContact, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    findOptions: PlusContactsContactFindOption
  ): Unit = js.native
}
