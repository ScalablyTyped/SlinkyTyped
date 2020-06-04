package typingsSlinky.antd.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/transfer.TransferLocale> */
trait PartialTransferLocale extends js.Object {
  var itemUnit: js.UndefOr[String] = js.undefined
  var itemsUnit: js.UndefOr[String] = js.undefined
  var notFoundContent: js.UndefOr[TagMod[Any]] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var titles: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialTransferLocale {
  @scala.inline
  def apply(): PartialTransferLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTransferLocale]
  }
  @scala.inline
  implicit class PartialTransferLocaleOps[Self <: PartialTransferLocale] (val x: Self) extends AnyVal {
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
    def setItemUnit(value: String): Self = this.set("itemUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemUnit: Self = this.set("itemUnit", js.undefined)
    @scala.inline
    def setItemsUnit(value: String): Self = this.set("itemsUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsUnit: Self = this.set("itemsUnit", js.undefined)
    @scala.inline
    def setNotFoundContentReactElement(value: ReactElement): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotFoundContent(value: TagMod[Any]): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    @scala.inline
    def setTitles(value: js.Array[String]): Self = this.set("titles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitles: Self = this.set("titles", js.undefined)
  }
  
}

