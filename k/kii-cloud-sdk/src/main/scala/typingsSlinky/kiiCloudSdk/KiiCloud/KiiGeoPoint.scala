package typingsSlinky.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents Geo Point.
  */
@js.native
trait KiiGeoPoint extends js.Object {
  /**
    * Return the latitide of this point.
    */
  def getLatitude(): Double = js.native
  /**
    * Return the longitude of this point.
    */
  def getLongitude(): Double = js.native
}

object KiiGeoPoint {
  @scala.inline
  def apply(getLatitude: () => Double, getLongitude: () => Double): KiiGeoPoint = {
    val __obj = js.Dynamic.literal(getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude))
    __obj.asInstanceOf[KiiGeoPoint]
  }
  @scala.inline
  implicit class KiiGeoPointOps[Self <: KiiGeoPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLatitude(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLatitude")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLongitude(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLongitude")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

