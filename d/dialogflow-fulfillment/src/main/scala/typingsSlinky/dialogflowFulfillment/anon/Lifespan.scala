package typingsSlinky.dialogflowFulfillment.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lifespan extends js.Object {
  var lifespan: Double = js.native
  var name: String = js.native
  var parameters: js.Object = js.native
}

object Lifespan {
  @scala.inline
  def apply(lifespan: Double, name: String, parameters: js.Object): Lifespan = {
    val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifespan]
  }
  @scala.inline
  implicit class LifespanOps[Self <: Lifespan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLifespan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifespan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

