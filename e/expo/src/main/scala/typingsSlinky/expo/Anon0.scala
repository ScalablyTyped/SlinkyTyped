package typingsSlinky.expo

import typingsSlinky.expo.expoStrings.downloadProgress
import typingsSlinky.expo.expoStrings.downloadStart
import typingsSlinky.expo.expoStrings.noUpdateAvailable
import typingsSlinky.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends UpdateEvent {
  var `type`: downloadStart | downloadProgress | noUpdateAvailable = js.native
}

object Anon0 {
  @scala.inline
  def apply(`type`: downloadStart | downloadProgress | noUpdateAvailable): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
  @scala.inline
  implicit class Anon0Ops[Self <: Anon0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: downloadStart | downloadProgress | noUpdateAvailable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

