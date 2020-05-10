package typingsSlinky.dojo.dojox.uuid.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/uuid/_base.version.html
  *
  *
  */
@js.native
trait version extends js.Object {
  /**
    *
    */
  var DCE_SECURITY: Double = js.native
  /**
    *
    */
  var NAME_BASED_MD5: Double = js.native
  /**
    *
    */
  var NAME_BASED_SHA1: Double = js.native
  /**
    *
    */
  var RANDOM: Double = js.native
  /**
    *
    */
  var TIME_BASED: Double = js.native
  /**
    *
    */
  var UNKNOWN: Double = js.native
}

object version {
  @scala.inline
  def apply(
    DCE_SECURITY: Double,
    NAME_BASED_MD5: Double,
    NAME_BASED_SHA1: Double,
    RANDOM: Double,
    TIME_BASED: Double,
    UNKNOWN: Double
  ): version = {
    val __obj = js.Dynamic.literal(DCE_SECURITY = DCE_SECURITY.asInstanceOf[js.Any], NAME_BASED_MD5 = NAME_BASED_MD5.asInstanceOf[js.Any], NAME_BASED_SHA1 = NAME_BASED_SHA1.asInstanceOf[js.Any], RANDOM = RANDOM.asInstanceOf[js.Any], TIME_BASED = TIME_BASED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[version]
  }
  @scala.inline
  implicit class versionOps[Self <: version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDCE_SECURITY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DCE_SECURITY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNAME_BASED_MD5(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NAME_BASED_MD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNAME_BASED_SHA1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NAME_BASED_SHA1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRANDOM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RANDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIME_BASED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIME_BASED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

