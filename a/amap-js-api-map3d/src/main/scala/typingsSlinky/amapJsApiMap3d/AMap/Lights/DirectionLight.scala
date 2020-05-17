package typingsSlinky.amapJsApiMap3d.AMap.Lights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionLight extends js.Object {
  def setColor(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
  def setDirection(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
  def setIntensity(intensity: Double): Unit = js.native
  def update(): Unit = js.native
}

object DirectionLight {
  @scala.inline
  def apply(
    setColor: js.Tuple3[Double, Double, Double] => Unit,
    setDirection: js.Tuple3[Double, Double, Double] => Unit,
    setIntensity: Double => Unit,
    update: () => Unit
  ): DirectionLight = {
    val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1(setColor), setDirection = js.Any.fromFunction1(setDirection), setIntensity = js.Any.fromFunction1(setIntensity), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[DirectionLight]
  }
  @scala.inline
  implicit class DirectionLightOps[Self <: DirectionLight] (val x: Self) extends AnyVal {
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
    def withSetDirection(value: js.Tuple3[Double, Double, Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIntensity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIntensity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

