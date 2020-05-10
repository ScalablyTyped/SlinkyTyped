package typingsSlinky.dojo.dojox.atom.io.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model._Constants.html
  *
  * Container for general constants.
  *
  */
@js.native
trait Constants extends js.Object {
  /**
    *
    */
  var APP_NS: String = js.native
  /**
    *
    */
  var ATOM_NS: String = js.native
  /**
    *
    */
  var ATOM_URI: String = js.native
  /**
    *
    */
  var PURL_NS: String = js.native
}

object Constants {
  @scala.inline
  def apply(APP_NS: String, ATOM_NS: String, ATOM_URI: String, PURL_NS: String): Constants = {
    val __obj = js.Dynamic.literal(APP_NS = APP_NS.asInstanceOf[js.Any], ATOM_NS = ATOM_NS.asInstanceOf[js.Any], ATOM_URI = ATOM_URI.asInstanceOf[js.Any], PURL_NS = PURL_NS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
  @scala.inline
  implicit class ConstantsOps[Self <: Constants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPP_NS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APP_NS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withATOM_NS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ATOM_NS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withATOM_URI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ATOM_URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPURL_NS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PURL_NS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

