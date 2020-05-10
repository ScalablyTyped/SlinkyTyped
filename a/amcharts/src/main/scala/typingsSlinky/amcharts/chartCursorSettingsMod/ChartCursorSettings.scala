package typingsSlinky.amcharts.chartCursorSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartCursorSettings extends js.Object {
  /**
    * Size of bullets, following the cursor.
    */
  var bulletSize: Double = js.native
  /**
    * Specifies if bullet for each graph will follow the cursor.
    */
  var bulletsEnabled: Boolean = js.native
  /**
    * Opacity of the category balloon.
    */
  var categoryBalloonAlpha: Double = js.native
  /**
    * Color of the category balloon.
    */
  var categoryBalloonColor: String = js.native
  /**
    * Array of date format objects. Date format object must have "period" and "format" items.
    * Available periods are:
    * fff - millisecond,
    * ss - second,
    * mm - minute,
    * hh - hour,
    * DD - date,
    * WW - week,
    * MM - month,
    * YYYY - year
    * [
    *     {period:"YYYY", format:"YYYY"},
    *     {period:"MM", format:"MMM, YYYY"},
    *     {period:"WW", format:"MMM DD, YYYY"},
    *     {period:"DD", format:"MMM DD, YYYY"},
    *     {period:"hh", format:"JJ:NN"},
    *     {period:"mm", format:"JJ:NN"},
    *     {period:"ss", format:"JJ:NN:SS"},
    *     {period:"fff", format:"JJ:NN:SS"}
    * ]
    */
  var categoryBalloonDateFormats: js.Array[_] = js.native
  /**
    * Specifies whether category balloon is enabled.
    */
  var categoryBalloonEnabled: Boolean = js.native
  /**
    * Opacity of the cursor line.
    */
  var cursorAlpha: Double = js.native
  /**
    * Color of the cursor line.
    */
  var cursorColor: String = js.native
  /**
    * Possible values: "start", "middle" and "mouse".
    */
  var cursorPosition: String = js.native
  /**
    * Set this to "false" if you don't want chart cursor to appear in your charts.
    * @default true
    */
  var enabled: Boolean = js.native
  /**
    * If this is set to true, the user will be able to pan the chart instead of zooming.
    */
  var pan: Boolean = js.native
  /**
    * Specifies whether value balloons are enabled.
    * In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet.
    */
  var valueBalloonsEnabled: Boolean = js.native
  /**
    * Specifies if the user can zoom-in the chart.
    * If pan is set to true, zoomable is switched to false automatically.
    */
  var zoomable: Boolean = js.native
}

object ChartCursorSettings {
  @scala.inline
  def apply(
    bulletSize: Double,
    bulletsEnabled: Boolean,
    categoryBalloonAlpha: Double,
    categoryBalloonColor: String,
    categoryBalloonDateFormats: js.Array[_],
    categoryBalloonEnabled: Boolean,
    cursorAlpha: Double,
    cursorColor: String,
    cursorPosition: String,
    enabled: Boolean,
    pan: Boolean,
    valueBalloonsEnabled: Boolean,
    zoomable: Boolean
  ): ChartCursorSettings = {
    val __obj = js.Dynamic.literal(bulletSize = bulletSize.asInstanceOf[js.Any], bulletsEnabled = bulletsEnabled.asInstanceOf[js.Any], categoryBalloonAlpha = categoryBalloonAlpha.asInstanceOf[js.Any], categoryBalloonColor = categoryBalloonColor.asInstanceOf[js.Any], categoryBalloonDateFormats = categoryBalloonDateFormats.asInstanceOf[js.Any], categoryBalloonEnabled = categoryBalloonEnabled.asInstanceOf[js.Any], cursorAlpha = cursorAlpha.asInstanceOf[js.Any], cursorColor = cursorColor.asInstanceOf[js.Any], cursorPosition = cursorPosition.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], valueBalloonsEnabled = valueBalloonsEnabled.asInstanceOf[js.Any], zoomable = zoomable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCursorSettings]
  }
  @scala.inline
  implicit class ChartCursorSettingsOps[Self <: ChartCursorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulletsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryBalloonAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryBalloonAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryBalloonColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryBalloonColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryBalloonDateFormats(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryBalloonDateFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryBalloonEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryBalloonEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueBalloonsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBalloonsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

