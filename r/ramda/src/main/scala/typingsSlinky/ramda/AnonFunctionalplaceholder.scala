package typingsSlinky.ramda

import typingsSlinky.ramda.ramdaBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFunctionalplaceholder extends js.Object {
  @JSName("@@functional/placeholder")
  var `@@functionalSlashplaceholder`: `true` = js.native
}

object AnonFunctionalplaceholder {
  @scala.inline
  def apply(`@@functionalSlashplaceholder`: `true`): AnonFunctionalplaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@functional/placeholder")(`@@functionalSlashplaceholder`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFunctionalplaceholder]
  }
  @scala.inline
  implicit class AnonFunctionalplaceholderOps[Self <: AnonFunctionalplaceholder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with@@functionalSlashplaceholder`(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@functional/placeholder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

