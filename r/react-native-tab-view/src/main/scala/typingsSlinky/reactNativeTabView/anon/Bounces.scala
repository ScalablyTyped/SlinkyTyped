package typingsSlinky.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounces extends js.Object {
  var bounces: Boolean = js.native
}

object Bounces {
  @scala.inline
  def apply(bounces: Boolean): Bounces = {
    val __obj = js.Dynamic.literal(bounces = bounces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounces]
  }
  @scala.inline
  implicit class BouncesOps[Self <: Bounces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

