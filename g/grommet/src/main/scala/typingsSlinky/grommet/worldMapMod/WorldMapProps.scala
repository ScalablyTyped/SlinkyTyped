package typingsSlinky.grommet.worldMapMod

import typingsSlinky.grommet.AnonLight
import typingsSlinky.grommet.AnonLocation
import typingsSlinky.grommet.AnonName
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.FillType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldMapProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var continents: js.UndefOr[js.Array[AnonName]] = js.undefined
  var fill: js.UndefOr[FillType] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var hoverColor: js.UndefOr[String | AnonLight] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onSelectPlace: js.UndefOr[js.Function1[/* place */ js.Array[Double], Unit]] = js.undefined
  var places: js.UndefOr[js.Array[AnonLocation]] = js.undefined
}

object WorldMapProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    color: ColorType = null,
    continents: js.Array[AnonName] = null,
    fill: FillType = null,
    gridArea: GridAreaType = null,
    hoverColor: String | AnonLight = null,
    margin: MarginType = null,
    onSelectPlace: /* place */ js.Array[Double] => Unit = null,
    places: js.Array[AnonLocation] = null
  ): WorldMapProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (continents != null) __obj.updateDynamic("continents")(continents.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onSelectPlace != null) __obj.updateDynamic("onSelectPlace")(js.Any.fromFunction1(onSelectPlace))
    if (places != null) __obj.updateDynamic("places")(places.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldMapProps]
  }
}

