package typingsSlinky.awsSdkRoute53IdNormalizerMiddleware

import typingsSlinky.awsSdkRoute53IdNormalizerMiddleware.mod.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChanges extends js.Object {
  var Changes: js.Iterable[Change] = js.native
}

object AnonChanges {
  @scala.inline
  def apply(Changes: js.Iterable[Change]): AnonChanges = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChanges]
  }
  @scala.inline
  implicit class AnonChangesOps[Self <: AnonChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Iterable[Change]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Changes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

