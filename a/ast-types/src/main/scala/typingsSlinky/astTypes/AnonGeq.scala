package typingsSlinky.astTypes

import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGeq extends js.Object {
  var defaults: AnonEmptyArray = js.native
  var isPrimitive: Type[js.Object] = js.native
  def geq(than: js.Any): Type[js.Object] = js.native
}

object AnonGeq {
  @scala.inline
  def apply(defaults: AnonEmptyArray, geq: js.Any => Type[js.Object], isPrimitive: Type[js.Object]): AnonGeq = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], geq = js.Any.fromFunction1(geq), isPrimitive = isPrimitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeq]
  }
  @scala.inline
  implicit class AnonGeqOps[Self <: AnonGeq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: AnonEmptyArray): Self = {
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

