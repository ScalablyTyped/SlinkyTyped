package typingsSlinky.dojo.dojox.uuid.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/uuid/_base.variant.html
  *
  *
  */
@js.native
trait variant extends js.Object {
  /**
    *
    */
  var DCE: String = js.native
  /**
    *
    */
  var MICROSOFT: String = js.native
  /**
    *
    */
  var NCS: String = js.native
  /**
    *
    */
  var UNKNOWN: String = js.native
}

object variant {
  @scala.inline
  def apply(DCE: String, MICROSOFT: String, NCS: String, UNKNOWN: String): variant = {
    val __obj = js.Dynamic.literal(DCE = DCE.asInstanceOf[js.Any], MICROSOFT = MICROSOFT.asInstanceOf[js.Any], NCS = NCS.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[variant]
  }
  @scala.inline
  implicit class variantOps[Self <: variant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDCE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DCE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMICROSOFT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MICROSOFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNCS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NCS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

