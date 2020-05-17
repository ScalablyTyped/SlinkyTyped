package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pk extends js.Object {
  var pk: String | Double = js.native
}

object Pk {
  @scala.inline
  def apply(pk: String | Double): Pk = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pk]
  }
  @scala.inline
  implicit class PkOps[Self <: Pk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPk(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

