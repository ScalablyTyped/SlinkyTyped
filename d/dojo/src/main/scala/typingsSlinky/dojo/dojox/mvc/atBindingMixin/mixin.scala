package typingsSlinky.dojo.dojox.mvc.atBindingMixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/_atBindingMixin.mixin.html
  *
  * The mixin for dijit/_WidgetBase to support data binding.
  *
  */
@js.native
trait mixin extends js.Object {
  /**
    *
    */
  var `data-mvc-bindings`: String = js.native
  /**
    * The attribute name for data binding.
    *
    */
  var dataBindAttr: String = js.native
}

object mixin {
  @scala.inline
  def apply(`data-mvc-bindings`: String, dataBindAttr: String): mixin = {
    val __obj = js.Dynamic.literal(dataBindAttr = dataBindAttr.asInstanceOf[js.Any])
    __obj.updateDynamic("data-mvc-bindings")(`data-mvc-bindings`.asInstanceOf[js.Any])
    __obj.asInstanceOf[mixin]
  }
  @scala.inline
  implicit class mixinOps[Self <: mixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withData-mvc-bindings`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-mvc-bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataBindAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBindAttr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

