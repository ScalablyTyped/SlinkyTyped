package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.StorageItem")
@js.native
class StorageItem protected () extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Attachments: typingsSlinky.activexOutlook.Outlook.Attachments = js.native
  var Body: String = js.native
  val Class: OlObjectClass = js.native
  val CreationTime: VarDate = js.native
  var Creator: String = js.native
  val EntryID: String = js.native
  val LastModificationTime: VarDate = js.native
  @JSName("Outlook.StorageItem_typekey")
  var OutlookDotStorageItem_typekey: StorageItem = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typingsSlinky.activexOutlook.Outlook.PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  var Subject: String = js.native
  val UserProperties: typingsSlinky.activexOutlook.Outlook.UserProperties = js.native
  def Delete(): Unit = js.native
  def Save(): Unit = js.native
}

