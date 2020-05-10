package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotTransportConnection extends js.Object {
  var catalog: js.UndefOr[String] = js.native
  var cube: js.UndefOr[String] = js.native
}

object PivotTransportConnection {
  @scala.inline
  def apply(): PivotTransportConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransportConnection]
  }
  @scala.inline
  implicit class PivotTransportConnectionOps[Self <: PivotTransportConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalog")(js.undefined)
        ret
    }
    @scala.inline
    def withCube(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCube: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(js.undefined)
        ret
    }
  }
  
}

