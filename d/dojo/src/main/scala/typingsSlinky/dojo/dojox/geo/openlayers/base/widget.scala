package typingsSlinky.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.widget.html
  *
  *
  */
@js.native
trait widget extends js.Object {
  /**
    *
    */
  def Map(): Unit = js.native
}

object widget {
  @scala.inline
  def apply(Map: () => Unit): widget = {
    val __obj = js.Dynamic.literal(Map = js.Any.fromFunction0(Map))
    __obj.asInstanceOf[widget]
  }
  @scala.inline
  implicit class widgetOps[Self <: widget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Map")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

