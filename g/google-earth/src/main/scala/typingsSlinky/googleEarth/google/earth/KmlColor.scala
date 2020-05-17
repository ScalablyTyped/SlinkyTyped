package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlColor extends js.Object {
  /**
    * Returns the color of an object.
    */
  def get(): String = js.native
  /**
    * opacity value
    */
  def getA(): Double = js.native
  /**
    * blue numerical value
    */
  def getB(): Double = js.native
  /**
    * green numerical value
    */
  def getG(): Double = js.native
  /**
    * red numerical value
    */
  def getR(): Double = js.native
  /**
    * Set the color of an object.
    */
  def set(color: String): Unit = js.native
  /**
    * opacity value
    */
  def setA(a: Double): Unit = js.native
  /**
    * blue numerical value
    */
  def setB(b: Double): Unit = js.native
  /**
    * green numerical value
    */
  def setG(g: Double): Unit = js.native
  /**
    * red numerical value
    */
  def setR(r: Double): Unit = js.native
}

object KmlColor {
  @scala.inline
  def apply(
    get: () => String,
    getA: () => Double,
    getB: () => Double,
    getG: () => Double,
    getR: () => Double,
    set: String => Unit,
    setA: Double => Unit,
    setB: Double => Unit,
    setG: Double => Unit,
    setR: Double => Unit
  ): KmlColor = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getA = js.Any.fromFunction0(getA), getB = js.Any.fromFunction0(getB), getG = js.Any.fromFunction0(getG), getR = js.Any.fromFunction0(getR), set = js.Any.fromFunction1(set), setA = js.Any.fromFunction1(setA), setB = js.Any.fromFunction1(setB), setG = js.Any.fromFunction1(setG), setR = js.Any.fromFunction1(setR))
    __obj.asInstanceOf[KmlColor]
  }
  @scala.inline
  implicit class KmlColorOps[Self <: KmlColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetA(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetB(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetG(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getG")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetR(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getR")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetA(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setA")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetB(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setB")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetG(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setG")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetR(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setR")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

