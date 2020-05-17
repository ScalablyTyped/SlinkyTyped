package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromStep
  extends /* key */ StringDictionary[js.Any] {
  var fromStep: String = js.native
  var toStep: String = js.native
}

object FromStep {
  @scala.inline
  def apply(fromStep: String, toStep: String): FromStep = {
    val __obj = js.Dynamic.literal(fromStep = fromStep.asInstanceOf[js.Any], toStep = toStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromStep]
  }
  @scala.inline
  implicit class FromStepOps[Self <: FromStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStep")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

