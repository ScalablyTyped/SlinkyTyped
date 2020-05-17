package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the information regarding named tokens */
@js.native
trait NameToken extends js.Object {
  var Index: Double = js.native
  var Sheet: Double = js.native
}

object NameToken {
  @scala.inline
  def apply(Index: Double, Sheet: Double): NameToken = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameToken]
  }
  @scala.inline
  implicit class NameTokenOps[Self <: NameToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sheet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

