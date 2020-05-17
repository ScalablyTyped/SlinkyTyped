package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.strong
import typingsSlinky.grommet.grommetStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opacity extends js.Object {
  var color: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.native
}

object Opacity {
  @scala.inline
  def apply(): Opacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opacity]
  }
  @scala.inline
  implicit class OpacityOps[Self <: Opacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: weak | medium | strong | Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

