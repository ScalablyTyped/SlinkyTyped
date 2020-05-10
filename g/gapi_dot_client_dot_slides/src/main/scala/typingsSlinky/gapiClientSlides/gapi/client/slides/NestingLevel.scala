package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestingLevel extends js.Object {
  /** The style of a bullet at this level of nesting. */
  var bulletStyle: js.UndefOr[TextStyle] = js.native
}

object NestingLevel {
  @scala.inline
  def apply(): NestingLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestingLevel]
  }
  @scala.inline
  implicit class NestingLevelOps[Self <: NestingLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletStyle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletStyle")(js.undefined)
        ret
    }
  }
  
}

