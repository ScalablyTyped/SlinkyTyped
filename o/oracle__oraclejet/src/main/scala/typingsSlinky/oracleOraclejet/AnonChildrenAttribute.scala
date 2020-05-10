package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typingsSlinky.oracleOraclejet.ojdataproviderMod.SortCriterion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.global
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.siblings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildrenAttribute[D] extends js.Object {
  var childrenAttribute: js.UndefOr[String] = js.native
  var implicitSort: js.UndefOr[js.Array[SortCriterion[D]]] = js.native
  var keyAttributes: js.UndefOr[String | js.Array[String]] = js.native
  var keyAttributesScope: js.UndefOr[global | siblings] = js.native
  var sortComparators: js.UndefOr[SortComparators[D]] = js.native
}

object AnonChildrenAttribute {
  @scala.inline
  def apply[D](): AnonChildrenAttribute[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChildrenAttribute[D]]
  }
  @scala.inline
  implicit class AnonChildrenAttributeOps[Self[d] <: AnonChildrenAttribute[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withChildrenAttribute(value: String): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenAttribute: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenAttribute")(js.undefined)
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
    def withKeyAttributesScope(value: global | siblings): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAttributesScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyAttributesScope: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAttributesScope")(js.undefined)
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

