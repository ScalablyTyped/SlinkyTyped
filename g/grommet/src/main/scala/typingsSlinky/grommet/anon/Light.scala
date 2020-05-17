package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Light extends ColorType {
  var dark: js.UndefOr[String] = js.native
  var light: js.UndefOr[String] = js.native
}

object Light {
  @scala.inline
  def apply(): Light = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Light]
  }
  @scala.inline
  implicit class LightOps[Self <: Light] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(js.undefined)
        ret
    }
    @scala.inline
    def withLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(js.undefined)
        ret
    }
  }
  
}

