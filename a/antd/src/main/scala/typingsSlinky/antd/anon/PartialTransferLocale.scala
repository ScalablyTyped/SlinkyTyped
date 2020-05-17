package typingsSlinky.antd.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/transfer.TransferLocale> */
@js.native
trait PartialTransferLocale extends js.Object {
  var itemUnit: js.UndefOr[String] = js.native
  var itemsUnit: js.UndefOr[String] = js.native
  var notFoundContent: js.UndefOr[TagMod[Any]] = js.native
  var searchPlaceholder: js.UndefOr[String] = js.native
  var titles: js.UndefOr[js.Array[String]] = js.native
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
    def withItemUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFoundContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotFoundContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withTitles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titles")(js.undefined)
        ret
    }
  }
  
}

