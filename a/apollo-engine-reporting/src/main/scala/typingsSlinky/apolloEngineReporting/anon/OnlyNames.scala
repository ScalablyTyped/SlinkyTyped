package typingsSlinky.apolloEngineReporting.anon

import typingsSlinky.apolloEngineReporting.agentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlyNames extends SendValuesBaseOptions {
  var onlyNames: js.Array[String] = js.native
}

object OnlyNames {
  @scala.inline
  def apply(onlyNames: js.Array[String]): OnlyNames = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyNames]
  }
  @scala.inline
  implicit class OnlyNamesOps[Self <: OnlyNames] (val x: Self) extends AnyVal {
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

