package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Direction3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightSource extends js.Object {
  /** the direction into which the light-source points */
  var aDirection: Direction3D = js.native
  var bIsEnabled: Boolean = js.native
  /** When `TRUE` , the specularity of material is taken into account when lighting an object. */
  var bSpecular: Boolean = js.native
  /** the light source's color */
  var nDiffuseColor: Double = js.native
}

object LightSource {
  @scala.inline
  def apply(aDirection: Direction3D, bIsEnabled: Boolean, bSpecular: Boolean, nDiffuseColor: Double): LightSource = {
    val __obj = js.Dynamic.literal(aDirection = aDirection.asInstanceOf[js.Any], bIsEnabled = bIsEnabled.asInstanceOf[js.Any], bSpecular = bSpecular.asInstanceOf[js.Any], nDiffuseColor = nDiffuseColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSource]
  }
  @scala.inline
  implicit class LightSourceOps[Self <: LightSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADirection(value: Direction3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bIsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBSpecular(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bSpecular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNDiffuseColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nDiffuseColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

