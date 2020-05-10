package typingsSlinky.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.cldr.html
  *
  *
  */
@js.native
trait cldr extends js.Object {
  /**
    * TODOC
    *
    */
  var monetary: js.Object = js.native
  /**
    * TODOC
    *
    */
  var supplemental: js.Object = js.native
}

object cldr {
  @scala.inline
  def apply(monetary: js.Object, supplemental: js.Object): cldr = {
    val __obj = js.Dynamic.literal(monetary = monetary.asInstanceOf[js.Any], supplemental = supplemental.asInstanceOf[js.Any])
    __obj.asInstanceOf[cldr]
  }
  @scala.inline
  implicit class cldrOps[Self <: cldr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonetary(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monetary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupplemental(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplemental")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

