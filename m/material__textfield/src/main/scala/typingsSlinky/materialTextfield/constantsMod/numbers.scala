package typingsSlinky.materialTextfield.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialTextfield.materialTextfieldNumbers.`0.75`
import typingsSlinky.materialTextfield.materialTextfieldNumbers.`0.923`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait numbers extends MDCNumbers {
  var DENSE_LABEL_SCALE: `0.923` = js.native
  var LABEL_SCALE: `0.75` = js.native
}

object numbers {
  @scala.inline
  def apply(DENSE_LABEL_SCALE: `0.923`, LABEL_SCALE: `0.75`): numbers = {
    val __obj = js.Dynamic.literal(DENSE_LABEL_SCALE = DENSE_LABEL_SCALE.asInstanceOf[js.Any], LABEL_SCALE = LABEL_SCALE.asInstanceOf[js.Any])
    __obj.asInstanceOf[numbers]
  }
  @scala.inline
  implicit class numbersOps[Self <: numbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDENSE_LABEL_SCALE(value: `0.923`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DENSE_LABEL_SCALE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLABEL_SCALE(value: `0.75`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SCALE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

