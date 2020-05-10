package typingsSlinky.apolloEngineReporting

import typingsSlinky.apolloEngineReporting.agentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnlyNames extends SendValuesBaseOptions {
  var onlyNames: js.Array[String] = js.native
}

object AnonOnlyNames {
  @scala.inline
  def apply(onlyNames: js.Array[String]): AnonOnlyNames = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnlyNames]
  }
  @scala.inline
  implicit class AnonOnlyNamesOps[Self <: AnonOnlyNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnlyNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

