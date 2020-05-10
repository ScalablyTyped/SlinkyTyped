package typingsSlinky.dojo.dojox.drawing.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/_registry.html
  *
  *
  */
@js.native
trait registry extends js.Object {
  /**
    *
    * @param type
    * @param id
    */
  def getRegistered(`type`: js.Any, id: js.Any): js.Any = js.native
  /**
    *
    * @param item
    * @param type
    */
  def register(item: js.Any, `type`: js.Any): Unit = js.native
}

object registry {
  @scala.inline
  def apply(getRegistered: (js.Any, js.Any) => js.Any, register: (js.Any, js.Any) => Unit): registry = {
    val __obj = js.Dynamic.literal(getRegistered = js.Any.fromFunction2(getRegistered), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[registry]
  }
  @scala.inline
  implicit class registryOps[Self <: registry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRegistered(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegistered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegister(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

