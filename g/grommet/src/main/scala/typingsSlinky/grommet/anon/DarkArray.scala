package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.GraphColorsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DarkArray extends GraphColorsType {
  var dark: js.UndefOr[js.Array[String]] = js.native
  var light: js.UndefOr[js.Array[String]] = js.native
}

object DarkArray {
  @scala.inline
  def apply(): DarkArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkArray]
  }
  @scala.inline
  implicit class DarkArrayOps[Self <: DarkArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDark(value: js.Array[String]): Self = {
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
    def withLight(value: js.Array[String]): Self = {
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

