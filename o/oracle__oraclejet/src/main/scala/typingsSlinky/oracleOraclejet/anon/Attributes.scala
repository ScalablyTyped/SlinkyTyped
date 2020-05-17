package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataMapping
import typingsSlinky.oracleOraclejet.ojdataproviderMod.FetchAttribute
import typingsSlinky.oracleOraclejet.ojdataproviderMod.SortCriterion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes[Kin, D, K, Din] extends js.Object {
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.native
  var dataMapping: js.UndefOr[DataMapping[K, D, Kin, Din]] = js.native
  var from: js.UndefOr[Kin] = js.native
  var offset: js.UndefOr[Double] = js.native
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.native
}

object Attributes {
  @scala.inline
  def apply[Kin, D, K, Din](): Attributes[Kin, D, K, Din] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes[Kin, D, K, Din]]
  }
  @scala.inline
  implicit class AttributesOps[Self[kin, d, k, din] <: Attributes[kin, d, k, din], Kin, D, K, Din] (val x: Self[Kin, D, K, Din]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Kin, D, K, Din] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Kin, D, K, Din]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Kin, D, K, Din]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Kin, D, K, Din]) with Other]
    @scala.inline
    def withAttributes(value: js.Array[String | FetchAttribute]): Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMapping(value: DataMapping[K, D, Kin, Din]): Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMapping: Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Kin): Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withSortCriteria(value: js.Array[SortCriterion[D]]): Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortCriteria: Self[Kin, D, K, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCriteria")(js.undefined)
        ret
    }
  }
  
}

