package typingsSlinky.amapJsApiMap3d.AMap.Lights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmbientLight extends js.Object {
  def setColor(color: js.Tuple3[Double, Double, Double]): Unit = js.native
  def setIntensity(intensity: Double): Unit = js.native
}

object AmbientLight {
  @scala.inline
  def apply(setColor: js.Tuple3[Double, Double, Double] => Unit, setIntensity: Double => Unit): AmbientLight = {
    val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1(setColor), setIntensity = js.Any.fromFunction1(setIntensity))
    __obj.asInstanceOf[AmbientLight]
  }
  @scala.inline
  implicit class AmbientLightOps[Self <: AmbientLight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetColor(value: js.Tuple3[Double, Double, Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIntensity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIntensity")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

