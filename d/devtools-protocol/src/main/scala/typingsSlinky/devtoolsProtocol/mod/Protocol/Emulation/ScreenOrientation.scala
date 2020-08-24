package typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.landscapePrimary
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.landscapeSecondary
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.portraitPrimary
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.portraitSecondary
import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenOrientation extends js.Object {
  /**
    * Orientation angle.
    */
  var angle: integer = js.native
  /**
    * Orientation type. (ScreenOrientationType enum)
    */
  var `type`: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary = js.native
}

object ScreenOrientation {
  @scala.inline
  def apply(
    angle: integer,
    `type`: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary
  ): ScreenOrientation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenOrientation]
  }
  @scala.inline
  implicit class ScreenOrientationOps[Self <: ScreenOrientation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngle(value: integer): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

