package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewInfosCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.ViewInfosCollection_typekey")
  var InfoPathDotViewInfosCollection_typekey: ViewInfosCollection = js.native
  def Item(varIndex: js.Any): ViewInfoObject = js.native
}

object ViewInfosCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotViewInfosCollection_typekey: ViewInfosCollection,
    Item: js.Any => ViewInfoObject
  ): ViewInfosCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.ViewInfosCollection_typekey")(InfoPathDotViewInfosCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewInfosCollection]
  }
  @scala.inline
  implicit class ViewInfosCollectionOps[Self <: ViewInfosCollection] (val x: Self) extends AnyVal {
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
    def withInfoPathDotViewInfosCollection_typekey(value: ViewInfosCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.ViewInfosCollection_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => ViewInfoObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

