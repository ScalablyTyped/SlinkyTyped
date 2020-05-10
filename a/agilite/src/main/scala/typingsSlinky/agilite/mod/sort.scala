package typingsSlinky.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sort extends js.Object {
  var ASC: String = js.native
  var ASC_VALUE: String = js.native
  var DESC: String = js.native
  var DESC_VALUE: String = js.native
}

object sort {
  @scala.inline
  def apply(ASC: String, ASC_VALUE: String, DESC: String, DESC_VALUE: String): sort = {
    val __obj = js.Dynamic.literal(ASC = ASC.asInstanceOf[js.Any], ASC_VALUE = ASC_VALUE.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any], DESC_VALUE = DESC_VALUE.asInstanceOf[js.Any])
    __obj.asInstanceOf[sort]
  }
  @scala.inline
  implicit class sortOps[Self <: sort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withASC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ASC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withASC_VALUE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ASC_VALUE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDESC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DESC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDESC_VALUE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DESC_VALUE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

