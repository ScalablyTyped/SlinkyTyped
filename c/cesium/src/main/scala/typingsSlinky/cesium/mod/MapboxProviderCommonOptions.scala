package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapboxProviderCommonOptions extends js.Object {
  /**
    * A credit for the data source, which is displayed on the canvas
    */
  var credit: js.UndefOr[Credit | String] = js.native
  /**
    * The ellipsoid.
    * If not specified, the WGS84 ellipsoid is used
    */
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  /**
    * The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit
    * @default undefined
    */
  var maximumLevel: js.UndefOr[Double] = js.native
  /**
    * The minimum level-of-detail supported by the imagery provider.
    * Take care when specifying this that the number of tiles at the minimum level is small, such as four or less.
    * A larger number is likely to result in rendering problems
    * @default 0
    */
  var minimumLevel: js.UndefOr[Double] = js.native
  /**
    * The rectangle, in radians, covered by the image
    * @defualt Rectangle.MAX_VALUE
    */
  var rectangle: js.UndefOr[Rectangle] = js.native
}

object MapboxProviderCommonOptions {
  @scala.inline
  def apply(): MapboxProviderCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapboxProviderCommonOptions]
  }
  @scala.inline
  implicit class MapboxProviderCommonOptionsOps[Self <: MapboxProviderCommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredit(value: Credit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
  }
  
}

