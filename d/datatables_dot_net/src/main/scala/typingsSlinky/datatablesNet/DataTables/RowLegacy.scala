package typingsSlinky.datatablesNet.DataTables

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowLegacy extends js.Object {
  var _aData: js.Any = js.native
  var _aSortData: js.Array[_] = js.native
  var _anHidden: js.Array[Node] = js.native
  var _sRowStripe: String = js.native
  var nTr: Node = js.native
}

object RowLegacy {
  @scala.inline
  def apply(_aData: js.Any, _aSortData: js.Array[_], _anHidden: js.Array[Node], _sRowStripe: String, nTr: Node): RowLegacy = {
    val __obj = js.Dynamic.literal(_aData = _aData.asInstanceOf[js.Any], _aSortData = _aSortData.asInstanceOf[js.Any], _anHidden = _anHidden.asInstanceOf[js.Any], _sRowStripe = _sRowStripe.asInstanceOf[js.Any], nTr = nTr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLegacy]
  }
  @scala.inline
  implicit class RowLegacyOps[Self <: RowLegacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_aData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_aData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_aSortData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_aSortData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_anHidden(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_anHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sRowStripe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sRowStripe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNTr(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nTr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

