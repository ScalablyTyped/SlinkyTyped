package typingsSlinky.dojo.dojox.gfx3d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/lighting.html
  *
  *
  */
@js.native
trait lighting_ extends js.Object {
  /**
    *
    */
  var finish: js.Object = js.native
  /**
    *
    */
  def Model(): Unit = js.native
  /**
    *
    * @param a
    * @param b
    */
  def add(a: js.Any, b: js.Any): js.Object = js.native
  /**
    *
    * @param a
    * @param b
    */
  def addColor(a: js.Any, b: js.Any): js.Object = js.native
  /**
    *
    */
  def black(): js.Object = js.native
  /**
    *
    * @param c1
    * @param c2
    */
  def diff2Color(c1: js.Any, c2: js.Any): Double = js.native
  /**
    *
    * @param normal
    * @param lights
    */
  def diffuse(normal: js.Any, lights: js.Any): js.Any = js.native
  /**
    *
    * @param a
    * @param b
    */
  def dot(a: js.Any, b: js.Any): Double = js.native
  /**
    *
    * @param n
    * @param i
    */
  def faceforward(n: js.Any, i: js.Any): js.Any = js.native
  /**
    *
    * @param c
    */
  def fromStdColor(c: js.Any): js.Any = js.native
  /**
    *
    * @param v
    */
  def length(v: js.Any): js.Any = js.native
  /**
    *
    * @param c
    */
  def length2Color(c: js.Any): Double = js.native
  /**
    *
    * @param c1
    * @param c2
    * @param s
    */
  def mixColor(c1: js.Any, c2: js.Any, s: js.Any): js.Any = js.native
  /**
    *
    * @param a
    * @param b
    */
  def multiplyColor(a: js.Any, b: js.Any): js.Object = js.native
  /**
    *
    * @param v
    */
  def normalize(v: js.Any): js.Any = js.native
  /**
    *
    * @param normal
    * @param v
    * @param size
    * @param lights
    */
  def phong(normal: js.Any, v: js.Any, size: js.Any, lights: js.Any): js.Any = js.native
  /**
    *
    * @param i
    * @param n
    */
  def reflect(i: js.Any, n: js.Any): js.Any = js.native
  /**
    *
    * @param v
    */
  def saturate(v: js.Any): js.Any = js.native
  /**
    *
    * @param c
    */
  def saturateColor(c: js.Any): js.Object = js.native
  /**
    *
    * @param s
    * @param v
    */
  def scale(s: js.Any, v: js.Any): js.Object = js.native
  /**
    *
    * @param s
    * @param c
    */
  def scaleColor(s: js.Any, c: js.Any): js.Object = js.native
  /**
    *
    * @param normal
    * @param v
    * @param roughness
    * @param lights
    */
  def specular(normal: js.Any, v: js.Any, roughness: js.Any, lights: js.Any): js.Any = js.native
  /**
    *
    * @param c
    */
  def toStdColor(c: js.Any): js.Object = js.native
  /**
    *
    */
  def white(): js.Object = js.native
}

object lighting_ {
  @scala.inline
  def apply(
    Model: () => Unit,
    add: (js.Any, js.Any) => js.Object,
    addColor: (js.Any, js.Any) => js.Object,
    black: () => js.Object,
    diff2Color: (js.Any, js.Any) => Double,
    diffuse: (js.Any, js.Any) => js.Any,
    dot: (js.Any, js.Any) => Double,
    faceforward: (js.Any, js.Any) => js.Any,
    finish: js.Object,
    fromStdColor: js.Any => js.Any,
    length: js.Any => js.Any,
    length2Color: js.Any => Double,
    mixColor: (js.Any, js.Any, js.Any) => js.Any,
    multiplyColor: (js.Any, js.Any) => js.Object,
    normalize: js.Any => js.Any,
    phong: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    reflect: (js.Any, js.Any) => js.Any,
    saturate: js.Any => js.Any,
    saturateColor: js.Any => js.Object,
    scale: (js.Any, js.Any) => js.Object,
    scaleColor: (js.Any, js.Any) => js.Object,
    specular: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    toStdColor: js.Any => js.Object,
    white: () => js.Object
  ): lighting_ = {
    val __obj = js.Dynamic.literal(Model = js.Any.fromFunction0(Model), add = js.Any.fromFunction2(add), addColor = js.Any.fromFunction2(addColor), black = js.Any.fromFunction0(black), diff2Color = js.Any.fromFunction2(diff2Color), diffuse = js.Any.fromFunction2(diffuse), dot = js.Any.fromFunction2(dot), faceforward = js.Any.fromFunction2(faceforward), finish = finish.asInstanceOf[js.Any], fromStdColor = js.Any.fromFunction1(fromStdColor), length = js.Any.fromFunction1(length), length2Color = js.Any.fromFunction1(length2Color), mixColor = js.Any.fromFunction3(mixColor), multiplyColor = js.Any.fromFunction2(multiplyColor), normalize = js.Any.fromFunction1(normalize), phong = js.Any.fromFunction4(phong), reflect = js.Any.fromFunction2(reflect), saturate = js.Any.fromFunction1(saturate), saturateColor = js.Any.fromFunction1(saturateColor), scale = js.Any.fromFunction2(scale), scaleColor = js.Any.fromFunction2(scaleColor), specular = js.Any.fromFunction4(specular), toStdColor = js.Any.fromFunction1(toStdColor), white = js.Any.fromFunction0(white))
    __obj.asInstanceOf[lighting_]
  }
  @scala.inline
  implicit class lighting_Ops[Self <: lighting_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAdd(value: (js.Any, js.Any) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddColor(value: (js.Any, js.Any) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBlack(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDiff2Color(value: (js.Any, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff2Color")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDiffuse(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffuse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDot(value: (js.Any, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFaceforward(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceforward")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFinish(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromStdColor(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromStdColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength2Color(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length2Color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMixColor(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixColor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMultiplyColor(value: (js.Any, js.Any) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplyColor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNormalize(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPhong(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phong")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withReflect(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSaturate(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSaturateColor(value: js.Any => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturateColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScale(value: (js.Any, js.Any) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScaleColor(value: (js.Any, js.Any) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleColor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSpecular(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specular")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withToStdColor(value: js.Any => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStdColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhite(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

