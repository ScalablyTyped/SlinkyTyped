package typingsSlinky.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.scopeMap.html
  *
  *
  */
@js.native
trait scopeMap extends js.Object {
  /**
    *
    */
  var dijit: js.Array[_] = js.native
  /**
    *
    */
  var dojo: js.Array[_] = js.native
  /**
    *
    */
  var dojox: js.Array[_] = js.native
}

object scopeMap {
  @scala.inline
  def apply(dijit: js.Array[_], dojo: js.Array[_], dojox: js.Array[_]): scopeMap = {
    val __obj = js.Dynamic.literal(dijit = dijit.asInstanceOf[js.Any], dojo = dojo.asInstanceOf[js.Any], dojox = dojox.asInstanceOf[js.Any])
    __obj.asInstanceOf[scopeMap]
  }
  @scala.inline
  implicit class scopeMapOps[Self <: scopeMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDijit(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dijit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDojo(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dojo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDojox(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dojox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

