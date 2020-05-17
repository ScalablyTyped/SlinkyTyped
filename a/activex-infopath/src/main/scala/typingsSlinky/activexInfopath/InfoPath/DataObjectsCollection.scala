package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObjectsCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.DataObjectsCollection_typekey")
  var InfoPathDotDataObjectsCollection_typekey: DataObjectsCollection = js.native
  def Item(varIndex: js.Any): DataSourceObject = js.native
}

object DataObjectsCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotDataObjectsCollection_typekey: DataObjectsCollection,
    Item: js.Any => DataSourceObject
  ): DataObjectsCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.DataObjectsCollection_typekey")(InfoPathDotDataObjectsCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectsCollection]
  }
  @scala.inline
  implicit class DataObjectsCollectionOps[Self <: DataObjectsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotDataObjectsCollection_typekey(value: DataObjectsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.DataObjectsCollection_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => DataSourceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

