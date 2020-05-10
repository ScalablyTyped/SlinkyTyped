package typingsSlinky.dojo.dojox.gfx

import typingsSlinky.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/registry.html
  *
  *
  */
@js.native
trait registry extends js.Object {
  /**
    * Returns the shape that matches the specified id.
    *
    * @param id The unique identifier for this Shape.
    */
  def byId(id: String): Shape = js.native
  /**
    * Removes the specified shape from the registry.
    *
    * @param s The shape to unregister.
    * @param recurse               Optional
    */
  def dispose(s: Shape, recurse: Boolean): Unit = js.native
  /**
    * Register the specified shape into the graphics registry.
    *
    * @param s The shape to register.
    */
  def register(s: Shape): Double = js.native
}

object registry {
  @scala.inline
  def apply(byId: String => Shape, dispose: (Shape, Boolean) => Unit, register: Shape => Double): registry = {
    val __obj = js.Dynamic.literal(byId = js.Any.fromFunction1(byId), dispose = js.Any.fromFunction2(dispose), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[registry]
  }
  @scala.inline
  implicit class registryOps[Self <: registry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withById(value: String => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDispose(value: (Shape, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegister(value: Shape => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

