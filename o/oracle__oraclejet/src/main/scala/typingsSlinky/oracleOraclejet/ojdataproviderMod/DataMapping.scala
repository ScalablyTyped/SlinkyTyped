package typingsSlinky.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMapping[K, D, Kin, Din] extends js.Object {
  var mapFilterCriterion: js.UndefOr[
    js.Function1[/* filterCriterion */ js.Array[FilterOperator[D]], js.Array[FilterOperator[Din]]]
  ] = js.native
  var mapSortCriteria: js.UndefOr[
    js.Function1[/* sortCriteria */ js.Array[SortCriterion[D]], js.Array[SortCriterion[Din]]]
  ] = js.native
  var unmapSortCriteria: js.UndefOr[
    js.Function1[/* sortCriteria */ js.Array[SortCriterion[Din]], js.Array[SortCriterion[D]]]
  ] = js.native
  def mapFields(item: Item[Kin, Din]): Item[K, D] = js.native
}

object DataMapping {
  @scala.inline
  def apply[K, D, Kin, Din](mapFields: Item[Kin, Din] => Item[K, D]): DataMapping[K, D, Kin, Din] = {
    val __obj = js.Dynamic.literal(mapFields = js.Any.fromFunction1(mapFields))
    __obj.asInstanceOf[DataMapping[K, D, Kin, Din]]
  }
  @scala.inline
  implicit class DataMappingOps[Self[k, d, kin, din] <: DataMapping[k, d, kin, din], K, D, Kin, Din] (val x: Self[K, D, Kin, Din]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D, Kin, Din] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D, Kin, Din]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D, Kin, Din]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D, Kin, Din]) with Other]
    @scala.inline
    def withMapFields(value: Item[Kin, Din] => Item[K, D]): Self[K, D, Kin, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMapFilterCriterion(value: /* filterCriterion */ js.Array[FilterOperator[D]] => js.Array[FilterOperator[Din]]): Self[K, D, Kin, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFilterCriterion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapFilterCriterion: Self[K, D, Kin, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFilterCriterion")(js.undefined)
        ret
    }
    @scala.inline
    def withMapSortCriteria(value: /* sortCriteria */ js.Array[SortCriterion[D]] => js.Array[SortCriterion[Din]]): Self[K, D, Kin, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapSortCriteria")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapSortCriteria: Self[K, D, Kin, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapSortCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmapSortCriteria(value: /* sortCriteria */ js.Array[SortCriterion[Din]] => js.Array[SortCriterion[D]]): Self[K, D, Kin, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmapSortCriteria")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnmapSortCriteria: Self[K, D, Kin, Din] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmapSortCriteria")(js.undefined)
        ret
    }
  }
  
}

