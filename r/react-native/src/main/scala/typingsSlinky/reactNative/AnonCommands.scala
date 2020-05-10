package typingsSlinky.reactNative

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommands extends js.Object {
  var Commands: StringDictionary[Double] = js.native
}

object AnonCommands {
  @scala.inline
  def apply(Commands: StringDictionary[Double]): AnonCommands = {
    val __obj = js.Dynamic.literal(Commands = Commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommands]
  }
  @scala.inline
  implicit class AnonCommandsOps[Self <: AnonCommands] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Commands")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

