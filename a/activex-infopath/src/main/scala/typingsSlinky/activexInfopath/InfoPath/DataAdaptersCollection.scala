package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataAdaptersCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.DataAdaptersCollection_typekey")
  var InfoPathDotDataAdaptersCollection_typekey: DataAdaptersCollection = js.native
  def Item(varIndex: js.Any): js.Any = js.native
}

object DataAdaptersCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotDataAdaptersCollection_typekey: DataAdaptersCollection,
    Item: js.Any => js.Any
  ): DataAdaptersCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.DataAdaptersCollection_typekey")(InfoPathDotDataAdaptersCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAdaptersCollection]
  }
  @scala.inline
  implicit class DataAdaptersCollectionOps[Self <: DataAdaptersCollection] (val x: Self) extends AnyVal {
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
    def withInfoPathDotDataAdaptersCollection_typekey(value: DataAdaptersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.DataAdaptersCollection_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

