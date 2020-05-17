package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Continent extends js.Object {
  var color: js.UndefOr[ColorType] = js.native
  var continent: js.UndefOr[Base] = js.native
  var hover: js.UndefOr[`0`] = js.native
  var place: js.UndefOr[Base] = js.native
}

object Continent {
  @scala.inline
  def apply(): Continent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Continent]
  }
  @scala.inline
  implicit class ContinentOps[Self <: Continent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: ColorType): Self = {
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
    def withContinent(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withPlace(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(js.undefined)
        ret
    }
  }
  
}

