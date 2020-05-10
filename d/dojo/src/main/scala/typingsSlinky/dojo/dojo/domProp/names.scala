package typingsSlinky.dojo.dojo.domProp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom-prop.names.html
  *
  *
  */
@js.native
trait names extends js.Object {
  /**
    *
    */
  var `class`: String = js.native
  /**
    *
    */
  var colspan: String = js.native
  /**
    *
    */
  var `for`: String = js.native
  /**
    *
    */
  var frameborder: String = js.native
  /**
    *
    */
  var readonly: String = js.native
  /**
    *
    */
  var rowspan: String = js.native
  /**
    *
    */
  var tabindex: String = js.native
  /**
    *
    */
  var valuetype: String = js.native
}

object names {
  @scala.inline
  def apply(
    `class`: String,
    colspan: String,
    `for`: String,
    frameborder: String,
    readonly: String,
    rowspan: String,
    tabindex: String,
    valuetype: String
  ): names = {
    val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], frameborder = frameborder.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any], tabindex = tabindex.asInstanceOf[js.Any], valuetype = valuetype.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    __obj.asInstanceOf[names]
  }
  @scala.inline
  implicit class namesOps[Self <: names] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColspan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameborder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameborder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowspan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabindex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuetype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuetype")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

