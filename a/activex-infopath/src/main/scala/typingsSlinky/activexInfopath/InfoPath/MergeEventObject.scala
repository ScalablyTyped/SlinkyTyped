package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeEventObject extends js.Object {
  val Count: Double = js.native
  val DOM: IXMLDOMDocument = js.native
  @JSName("InfoPath.MergeEventObject_typekey")
  var InfoPathDotMergeEventObject_typekey: MergeEventObject = js.native
  var ReturnStatus: Boolean = js.native
  var RollBack: Boolean = js.native
  val XDocument: _XDocument = js.native
  val index: Double = js.native
}

object MergeEventObject {
  @scala.inline
  def apply(
    Count: Double,
    DOM: IXMLDOMDocument,
    InfoPathDotMergeEventObject_typekey: MergeEventObject,
    ReturnStatus: Boolean,
    RollBack: Boolean,
    XDocument: _XDocument,
    index: Double
  ): MergeEventObject = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DOM = DOM.asInstanceOf[js.Any], ReturnStatus = ReturnStatus.asInstanceOf[js.Any], RollBack = RollBack.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.MergeEventObject_typekey")(InfoPathDotMergeEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeEventObject]
  }
  @scala.inline
  implicit class MergeEventObjectOps[Self <: MergeEventObject] (val x: Self) extends AnyVal {
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
    def withDOM(value: IXMLDOMDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotMergeEventObject_typekey(value: MergeEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.MergeEventObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollBack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RollBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXDocument(value: _XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

