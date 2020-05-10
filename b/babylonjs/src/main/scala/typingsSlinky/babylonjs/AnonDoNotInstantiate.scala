package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDoNotInstantiate extends js.Object {
  var doNotInstantiate: Boolean = js.native
}

object AnonDoNotInstantiate {
  @scala.inline
  def apply(doNotInstantiate: Boolean): AnonDoNotInstantiate = {
    val __obj = js.Dynamic.literal(doNotInstantiate = doNotInstantiate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDoNotInstantiate]
  }
  @scala.inline
  implicit class AnonDoNotInstantiateOps[Self <: AnonDoNotInstantiate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoNotInstantiate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotInstantiate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

