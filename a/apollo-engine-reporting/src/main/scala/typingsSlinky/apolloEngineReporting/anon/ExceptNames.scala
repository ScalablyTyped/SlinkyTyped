package typingsSlinky.apolloEngineReporting.anon

import typingsSlinky.apolloEngineReporting.agentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptNames extends SendValuesBaseOptions {
  var exceptNames: js.Array[String] = js.native
}

object ExceptNames {
  @scala.inline
  def apply(exceptNames: js.Array[String]): ExceptNames = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptNames]
  }
  @scala.inline
  implicit class ExceptNamesOps[Self <: ExceptNames] (val x: Self) extends AnyVal {
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

