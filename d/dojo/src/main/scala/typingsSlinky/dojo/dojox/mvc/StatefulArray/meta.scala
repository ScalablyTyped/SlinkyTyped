package typingsSlinky.dojo.dojox.mvc.StatefulArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StatefulArray._meta.html
  *
  *
  */
@js.native
trait meta extends js.Object {
  /**
    *
    */
  var bases: js.Array[_] = js.native
}

object meta {
  @scala.inline
  def apply(bases: js.Array[_]): meta = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any])
    __obj.asInstanceOf[meta]
  }
  @scala.inline
  implicit class metaOps[Self <: meta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBases(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bases")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

