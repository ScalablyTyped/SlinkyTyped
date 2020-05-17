package typingsSlinky.grommet.worldMapMod

import typingsSlinky.grommet.anon.Light
import typingsSlinky.grommet.anon.Location
import typingsSlinky.grommet.anon.Name
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.FillType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorldMapProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var color: js.UndefOr[ColorType] = js.native
  var continents: js.UndefOr[js.Array[Name]] = js.native
  var fill: js.UndefOr[FillType] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var hoverColor: js.UndefOr[String | Light] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var onSelectPlace: js.UndefOr[js.Function1[/* place */ js.Array[Double], Unit]] = js.native
  var places: js.UndefOr[js.Array[Location]] = js.native
}

object WorldMapProps {
  @scala.inline
  def apply(): WorldMapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldMapProps]
  }
  @scala.inline
  implicit class WorldMapPropsOps[Self <: WorldMapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA11yTitle(value: A11yTitleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11yTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA11yTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11yTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignSelf(value: AlignSelfType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(js.undefined)
        ret
    }
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
    def withContinents(value: js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continents")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: FillType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withGridArea(value: GridAreaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverColor(value: String | Light): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: MarginType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectPlace(value: /* place */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectPlace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectPlace")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaces(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(js.undefined)
        ret
    }
  }
  
}

