package typingsSlinky.ionicCore.recognizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanRecognizer extends js.Object {
  def detect(x: Double, y: Double): Boolean = js.native
  def getDirection(): Double = js.native
  def isGesture(): Boolean = js.native
  def start(x: Double, y: Double): Unit = js.native
}

object PanRecognizer {
  @scala.inline
  def apply(
    detect: (Double, Double) => Boolean,
    getDirection: () => Double,
    isGesture: () => Boolean,
    start: (Double, Double) => Unit
  ): PanRecognizer = {
    val __obj = js.Dynamic.literal(detect = js.Any.fromFunction2(detect), getDirection = js.Any.fromFunction0(getDirection), isGesture = js.Any.fromFunction0(isGesture), start = js.Any.fromFunction2(start))
    __obj.asInstanceOf[PanRecognizer]
  }
  @scala.inline
  implicit class PanRecognizerOps[Self <: PanRecognizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetect(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDirection(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsGesture(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGesture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

