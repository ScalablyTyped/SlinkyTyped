package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.area
import typingsSlinky.devextreme.devextremeStrings.bar
import typingsSlinky.devextreme.devextremeStrings.bubble
import typingsSlinky.devextreme.devextremeStrings.candlestick
import typingsSlinky.devextreme.devextremeStrings.fullstackedarea
import typingsSlinky.devextreme.devextremeStrings.fullstackedbar
import typingsSlinky.devextreme.devextremeStrings.fullstackedline
import typingsSlinky.devextreme.devextremeStrings.fullstackedspline
import typingsSlinky.devextreme.devextremeStrings.fullstackedsplinearea
import typingsSlinky.devextreme.devextremeStrings.line
import typingsSlinky.devextreme.devextremeStrings.rangearea
import typingsSlinky.devextreme.devextremeStrings.rangebar_
import typingsSlinky.devextreme.devextremeStrings.scatter
import typingsSlinky.devextreme.devextremeStrings.spline
import typingsSlinky.devextreme.devextremeStrings.splinearea
import typingsSlinky.devextreme.devextremeStrings.stackedarea
import typingsSlinky.devextreme.devextremeStrings.stackedbar
import typingsSlinky.devextreme.devextremeStrings.stackedline
import typingsSlinky.devextreme.devextremeStrings.stackedspline
import typingsSlinky.devextreme.devextremeStrings.stackedsplinearea
import typingsSlinky.devextreme.devextremeStrings.steparea
import typingsSlinky.devextreme.devextremeStrings.stepline
import typingsSlinky.devextreme.devextremeStrings.stock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeries extends dxChartSeriesTypesCommonSeries {
  /** @name ChartSeries.name */
  var name: js.UndefOr[String] = js.native
  /** @name ChartSeries.tag */
  var tag: js.UndefOr[js.Any] = js.native
  /** @name ChartSeries.type */
  var `type`: js.UndefOr[
    area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock
  ] = js.native
}

object ChartSeries {
  @scala.inline
  def apply(): ChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeries]
  }
  @scala.inline
  implicit class ChartSeriesOps[Self <: ChartSeries] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setType(
      value: area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

