package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.C
import typingsSlinky.qlik.qlikStrings.H
import typingsSlinky.qlik.qlikStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxInlineDimensionDef extends js.Object {
  var qActiveField: Double = js.native
  var qFieldDefs: js.Array[String] = js.native
  var qGrouping: N | H | C = js.native
  var qNumberPresentations: js.Array[FieldAttributes] = js.native
  var qReverseSort: Boolean = js.native
  var qSortCriteries: js.Array[SortCriteria] = js.native
}

object NxInlineDimensionDef {
  @scala.inline
  def apply(
    qActiveField: Double,
    qFieldDefs: js.Array[String],
    qGrouping: N | H | C,
    qNumberPresentations: js.Array[FieldAttributes],
    qReverseSort: Boolean,
    qSortCriteries: js.Array[SortCriteria]
  ): NxInlineDimensionDef = {
    val __obj = js.Dynamic.literal(qActiveField = qActiveField.asInstanceOf[js.Any], qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qNumberPresentations = qNumberPresentations.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortCriteries = qSortCriteries.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxInlineDimensionDef]
  }
  @scala.inline
  implicit class NxInlineDimensionDefOps[Self <: NxInlineDimensionDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQActiveField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qActiveField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFieldDefs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGrouping(value: N | H | C): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNumberPresentations(value: js.Array[FieldAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumberPresentations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQReverseSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReverseSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortCriteries(value: js.Array[SortCriteria]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortCriteries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

