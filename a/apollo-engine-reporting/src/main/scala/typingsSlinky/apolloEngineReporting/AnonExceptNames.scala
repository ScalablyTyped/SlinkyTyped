package typingsSlinky.apolloEngineReporting

import typingsSlinky.apolloEngineReporting.agentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExceptNames extends SendValuesBaseOptions {
  var exceptNames: js.Array[String] = js.native
}

object AnonExceptNames {
  @scala.inline
  def apply(exceptNames: js.Array[String]): AnonExceptNames = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExceptNames]
  }
  @scala.inline
  implicit class AnonExceptNamesOps[Self <: AnonExceptNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExceptNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

