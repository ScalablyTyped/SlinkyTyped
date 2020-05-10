package typingsSlinky.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUsesOnChanges extends js.Object {
  /**
    * Whether the directive uses NgOnChanges.
    */
  var usesOnChanges: Boolean = js.native
}

object AnonUsesOnChanges {
  @scala.inline
  def apply(usesOnChanges: Boolean): AnonUsesOnChanges = {
    val __obj = js.Dynamic.literal(usesOnChanges = usesOnChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUsesOnChanges]
  }
  @scala.inline
  implicit class AnonUsesOnChangesOps[Self <: AnonUsesOnChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsesOnChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesOnChanges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

