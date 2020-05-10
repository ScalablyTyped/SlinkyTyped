package typingsSlinky.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavImagesValues extends js.Object {
  var DOWN: String = js.native
  var GROUP: String = js.native
  var HOVER: String = js.native
  var REST: String = js.native
}

object NavImagesValues {
  @scala.inline
  def apply(DOWN: String, GROUP: String, HOVER: String, REST: String): NavImagesValues = {
    val __obj = js.Dynamic.literal(DOWN = DOWN.asInstanceOf[js.Any], GROUP = GROUP.asInstanceOf[js.Any], HOVER = HOVER.asInstanceOf[js.Any], REST = REST.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavImagesValues]
  }
  @scala.inline
  implicit class NavImagesValuesOps[Self <: NavImagesValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDOWN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGROUP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GROUP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOVER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOVER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REST")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

