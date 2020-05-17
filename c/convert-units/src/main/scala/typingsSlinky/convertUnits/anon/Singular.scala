package typingsSlinky.convertUnits.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Singular extends js.Object {
  var plural: String = js.native
  var singular: String = js.native
}

object Singular {
  @scala.inline
  def apply(plural: String, singular: String): Singular = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Singular]
  }
  @scala.inline
  implicit class SingularOps[Self <: Singular] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

