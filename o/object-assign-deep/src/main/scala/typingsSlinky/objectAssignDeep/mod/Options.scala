package typingsSlinky.objectAssignDeep.mod

import typingsSlinky.objectAssignDeep.objectAssignDeepStrings.merge
import typingsSlinky.objectAssignDeep.objectAssignDeepStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var arrayBehaviour: replace | merge = js.native
}

object Options {
  @scala.inline
  def apply(arrayBehaviour: replace | merge): Options = {
    val __obj = js.Dynamic.literal(arrayBehaviour = arrayBehaviour.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayBehaviour(value: replace | merge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBehaviour")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

