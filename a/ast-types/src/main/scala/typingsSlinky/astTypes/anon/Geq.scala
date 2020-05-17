package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geq extends js.Object {
  var defaults: EmptyArray = js.native
  var isPrimitive: Type[js.Object] = js.native
  def geq(than: js.Any): Type[js.Object] = js.native
}

object Geq {
  @scala.inline
  def apply(defaults: EmptyArray, geq: js.Any => Type[js.Object], isPrimitive: Type[js.Object]): Geq = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], geq = js.Any.fromFunction1(geq), isPrimitive = isPrimitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geq]
  }
  @scala.inline
  implicit class GeqOps[Self <: Geq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: EmptyArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeq(value: js.Any => Type[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsPrimitive(value: Type[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimitive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

