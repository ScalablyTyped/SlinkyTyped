package typingsSlinky.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apple-mapkit-js.mapkit.GeocoderConstructorOptions, 'language'> */
@js.native
trait PickGeocoderConstructorOp extends js.Object {
  var language: js.UndefOr[String] = js.native
}

object PickGeocoderConstructorOp {
  @scala.inline
  def apply(): PickGeocoderConstructorOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickGeocoderConstructorOp]
  }
  @scala.inline
  implicit class PickGeocoderConstructorOpOps[Self <: PickGeocoderConstructorOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

