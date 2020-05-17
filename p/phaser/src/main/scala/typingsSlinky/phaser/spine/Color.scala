package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var g: Double = js.native
  var r: Double = js.native
  def add(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  def clamp(): this.type = js.native
  def set(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  def setFromColor(c: Color): this.type = js.native
  def setFromString(hex: String): this.type = js.native
}

object Color {
  @scala.inline
  def apply(
    a: Double,
    add: (Double, Double, Double, Double) => Color,
    b: Double,
    clamp: () => Color,
    g: Double,
    r: Double,
    set: (Double, Double, Double, Double) => Color,
    setFromColor: Color => Color,
    setFromString: String => Color
  ): Color = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], add = js.Any.fromFunction4(add), b = b.asInstanceOf[js.Any], clamp = js.Any.fromFunction0(clamp), g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], set = js.Any.fromFunction4(set), setFromColor = js.Any.fromFunction1(setFromColor), setFromString = js.Any.fromFunction1(setFromString))
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd(value: (Double, Double, Double, Double) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClamp(value: () => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (Double, Double, Double, Double) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetFromColor(value: Color => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFromColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFromString(value: String => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFromString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

