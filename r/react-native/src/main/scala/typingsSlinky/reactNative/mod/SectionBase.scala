package typingsSlinky.reactNative.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionBase[ItemT] extends js.Object {
  var ItemSeparatorComponent: js.UndefOr[ReactComponentClass[_] | Null] = js.native
  var data: js.Array[ItemT] = js.native
  var key: js.UndefOr[String] = js.native
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.native
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT]] = js.native
}

object SectionBase {
  @scala.inline
  def apply[ItemT](data: js.Array[ItemT]): SectionBase[ItemT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionBase[ItemT]]
  }
  @scala.inline
  implicit class SectionBaseOps[Self[itemt] <: SectionBase[itemt], ItemT] (val x: Self[ItemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemT] with Other]
    @scala.inline
    def withData(value: js.Array[ItemT]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSeparatorComponentFunctionComponent(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSeparatorComponentComponentClass(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSeparatorComponent(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSeparatorComponent: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSeparatorComponentNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSeparatorComponent")(null)
        ret
    }
    @scala.inline
    def withKey(value: String): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExtractor(value: (/* item */ ItemT, /* index */ Double) => String): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExtractor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeyExtractor: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItem(value: /* info */ SectionListRenderItemInfo[ItemT] => ReactElement | Null): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderItem: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.undefined)
        ret
    }
  }
  
}

