package typingsSlinky.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Isolines extends js.Object {
  var MetaInfo: Timestamp = js.native
  var View: js.Array[Result] = js.native
  var isolines: js.Array[_] = js.native
}

object Isolines {
  @scala.inline
  def apply(MetaInfo: Timestamp, View: js.Array[Result], isolines: js.Array[_]): Isolines = {
    val __obj = js.Dynamic.literal(MetaInfo = MetaInfo.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], isolines = isolines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Isolines]
  }
  @scala.inline
  implicit class IsolinesOps[Self <: Isolines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetaInfo(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsolines(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolines")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

