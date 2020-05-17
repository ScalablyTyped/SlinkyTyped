package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureLinesCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.SignatureLinesCollection_typekey")
  var InfoPathDotSignatureLinesCollection_typekey: SignatureLinesCollection = js.native
  def Item(varIndex: js.Any): SignatureLineObject = js.native
}

object SignatureLinesCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotSignatureLinesCollection_typekey: SignatureLinesCollection,
    Item: js.Any => SignatureLineObject
  ): SignatureLinesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignatureLinesCollection_typekey")(InfoPathDotSignatureLinesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureLinesCollection]
  }
  @scala.inline
  implicit class SignatureLinesCollectionOps[Self <: SignatureLinesCollection] (val x: Self) extends AnyVal {
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
    def withInfoPathDotSignatureLinesCollection_typekey(value: SignatureLinesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.SignatureLinesCollection_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => SignatureLineObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

