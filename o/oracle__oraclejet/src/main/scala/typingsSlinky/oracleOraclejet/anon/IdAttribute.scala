package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typingsSlinky.oracleOraclejet.ojdataproviderMod.SortCriterion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdAttribute[D] extends js.Object {
  var idAttribute: js.UndefOr[String | js.Array[String]] = js.native
  var implicitSort: js.UndefOr[js.Array[SortCriterion[D]]] = js.native
  var keyAttributes: js.UndefOr[String | js.Array[String]] = js.native
  var keys: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.native
  var sortComparators: js.UndefOr[SortComparators[D]] = js.native
}

object IdAttribute {
  @scala.inline
  def apply[D](): IdAttribute[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdAttribute[D]]
  }
  @scala.inline
  implicit class IdAttributeOps[Self[d] <: IdAttribute[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withIdAttribute(value: String | js.Array[String]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdAttribute: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicitSort(value: js.Array[SortCriterion[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitSort: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitSort")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyAttributes(value: String | js.Array[String]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyAttributes: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withKeysFunction0(value: () => js.Array[_]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[_] | js.Function0[js.Array[_]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withSortComparators(value: SortComparators[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortComparators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortComparators: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortComparators")(js.undefined)
        ret
    }
  }
  
}

