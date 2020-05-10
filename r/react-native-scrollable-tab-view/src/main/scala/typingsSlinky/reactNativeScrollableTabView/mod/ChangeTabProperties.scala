package typingsSlinky.reactNativeScrollableTabView.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeTabProperties extends js.Object {
  // previousPage
  var from: Double = js.native
  // currentPage
  var i: Double = js.native
  // currentPage object
  var ref: ReactElement = js.native
}

object ChangeTabProperties {
  @scala.inline
  def apply(from: Double, i: Double, ref: ReactElement): ChangeTabProperties = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTabProperties]
  }
  @scala.inline
  implicit class ChangeTabPropertiesOps[Self <: ChangeTabProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

