package typingsSlinky.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMath extends js.Object {
  val DEG2RAD: Double = js.native
  val RAD2DEG: Double = js.native
  def ceilPowerOfTwo(value: Double): Double = js.native
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  def degToRad(degrees: Double): Double = js.native
  def euclideanModulo(n: Double, m: Double): Double = js.native
  def floorPowerOfTwo(value: Double): Double = js.native
  def generateUUID(): String = js.native
  def isPowerOfTwo(value: Double): Boolean = js.native
  def lerp(x: Double, y: Double, t: Double): Double = js.native
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = js.native
  def nearestPowerOfTwo(value: Double): Double = js.native
  def nextPowerOfTwo(value: Double): Double = js.native
  def radToDeg(radians: Double): Double = js.native
  def randFloat(low: Double, high: Double): Double = js.native
  def randFloatSpread(range: Double): Double = js.native
  def randInt(low: Double, high: Double): Double = js.native
  def random16(): Double = js.native
  def smootherstep(x: Double, min: Double, max: Double): Double = js.native
  def smoothstep(x: Double, min: Double, max: Double): Double = js.native
}

object TypeofMath {
  @scala.inline
  def apply(
    DEG2RAD: Double,
    RAD2DEG: Double,
    ceilPowerOfTwo: Double => Double,
    clamp: (Double, Double, Double) => Double,
    degToRad: Double => Double,
    euclideanModulo: (Double, Double) => Double,
    floorPowerOfTwo: Double => Double,
    generateUUID: () => String,
    isPowerOfTwo: Double => Boolean,
    lerp: (Double, Double, Double) => Double,
    mapLinear: (Double, Double, Double, Double, Double) => Double,
    nearestPowerOfTwo: Double => Double,
    nextPowerOfTwo: Double => Double,
    radToDeg: Double => Double,
    randFloat: (Double, Double) => Double,
    randFloatSpread: Double => Double,
    randInt: (Double, Double) => Double,
    random16: () => Double,
    smootherstep: (Double, Double, Double) => Double,
    smoothstep: (Double, Double, Double) => Double
  ): TypeofMath = {
    val __obj = js.Dynamic.literal(DEG2RAD = DEG2RAD.asInstanceOf[js.Any], RAD2DEG = RAD2DEG.asInstanceOf[js.Any], ceilPowerOfTwo = js.Any.fromFunction1(ceilPowerOfTwo), clamp = js.Any.fromFunction3(clamp), degToRad = js.Any.fromFunction1(degToRad), euclideanModulo = js.Any.fromFunction2(euclideanModulo), floorPowerOfTwo = js.Any.fromFunction1(floorPowerOfTwo), generateUUID = js.Any.fromFunction0(generateUUID), isPowerOfTwo = js.Any.fromFunction1(isPowerOfTwo), lerp = js.Any.fromFunction3(lerp), mapLinear = js.Any.fromFunction5(mapLinear), nearestPowerOfTwo = js.Any.fromFunction1(nearestPowerOfTwo), nextPowerOfTwo = js.Any.fromFunction1(nextPowerOfTwo), radToDeg = js.Any.fromFunction1(radToDeg), randFloat = js.Any.fromFunction2(randFloat), randFloatSpread = js.Any.fromFunction1(randFloatSpread), randInt = js.Any.fromFunction2(randInt), random16 = js.Any.fromFunction0(random16), smootherstep = js.Any.fromFunction3(smootherstep), smoothstep = js.Any.fromFunction3(smoothstep))
    __obj.asInstanceOf[TypeofMath]
  }
  @scala.inline
  implicit class TypeofMathOps[Self <: TypeofMath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEG2RAD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEG2RAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRAD2DEG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RAD2DEG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCeilPowerOfTwo(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceilPowerOfTwo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClamp(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDegToRad(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degToRad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEuclideanModulo(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("euclideanModulo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFloorPowerOfTwo(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorPowerOfTwo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateUUID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateUUID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPowerOfTwo(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPowerOfTwo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLerp(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lerp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMapLinear(value: (Double, Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapLinear")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withNearestPowerOfTwo(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearestPowerOfTwo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNextPowerOfTwo(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPowerOfTwo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRadToDeg(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radToDeg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRandFloat(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randFloat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRandFloatSpread(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randFloatSpread")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRandInt(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randInt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRandom16(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random16")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSmootherstep(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smootherstep")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSmoothstep(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothstep")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

