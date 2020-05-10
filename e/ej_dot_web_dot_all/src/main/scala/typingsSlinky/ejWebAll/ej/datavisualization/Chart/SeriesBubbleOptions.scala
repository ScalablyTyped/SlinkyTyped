package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesBubbleOptions extends js.Object {
  /** Used for setting the maximum radius of the bubble
    * @Default {3}
    */
  var maxRadius: js.UndefOr[Double] = js.native
  /** Used for the setting the minimum radius of the bubble
    * @Default {1}
    */
  var minRadius: js.UndefOr[Double] = js.native
  /** Used for the calculation of the bubble radius based on the mode selected
    * @Default {minMax .See RadiusMode}
    */
  var radiusMode: js.UndefOr[RadiusMode | String] = js.native
}

object SeriesBubbleOptions {
  @scala.inline
  def apply(): SeriesBubbleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesBubbleOptions]
  }
  @scala.inline
  implicit class SeriesBubbleOptionsOps[Self <: SeriesBubbleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusMode(value: RadiusMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusMode")(js.undefined)
        ret
    }
  }
  
}

