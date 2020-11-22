package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorMatrixHelpers extends js.Object {
  
  /**
    * Returns a new SkColorMatrix that is the result of multiplying outer*inner
    * @param outer
    * @param inner
    */
  def concat(outer: js.typedarray.Float32Array, inner: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Returns an identity SkColorMatrix.
    */
  def identity(): js.typedarray.Float32Array = js.native
  
  /**
    * Sets the 4 "special" params that will translate the colors after they are multiplied
    * by the 4x4 matrix.
    * @param m
    * @param dr - delta red
    * @param dg - delta green
    * @param db - delta blue
    * @param da - delta alpha
    */
  def postTranslate(m: js.typedarray.Float32Array, dr: Double, dg: Double, db: Double, da: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Returns a new SkColorMatrix that is rotated around a given axis.
    * @param axis - 0 for red, 1 for green, 2 for blue
    * @param sine - sin(angle)
    * @param cosine - cos(angle)
    */
  def rotated(axis: Double, sine: Double, cosine: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Returns a new SkColorMatrix that scales the colors as specified.
    * @param redScale
    * @param greenScale
    * @param blueScale
    * @param alphaScale
    */
  def scaled(redScale: Double, greenScale: Double, blueScale: Double, alphaScale: Double): js.typedarray.Float32Array = js.native
}
object ColorMatrixHelpers {
  
  @scala.inline
  def apply(
    concat: (js.typedarray.Float32Array, js.typedarray.Float32Array) => js.typedarray.Float32Array,
    identity: () => js.typedarray.Float32Array,
    postTranslate: (js.typedarray.Float32Array, Double, Double, Double, Double) => js.typedarray.Float32Array,
    rotated: (Double, Double, Double) => js.typedarray.Float32Array,
    scaled: (Double, Double, Double, Double) => js.typedarray.Float32Array
  ): ColorMatrixHelpers = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat), identity = js.Any.fromFunction0(identity), postTranslate = js.Any.fromFunction5(postTranslate), rotated = js.Any.fromFunction3(rotated), scaled = js.Any.fromFunction4(scaled))
    __obj.asInstanceOf[ColorMatrixHelpers]
  }
  
  @scala.inline
  implicit class ColorMatrixHelpersOps[Self <: ColorMatrixHelpers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConcat(value: (js.typedarray.Float32Array, js.typedarray.Float32Array) => js.typedarray.Float32Array): Self = this.set("concat", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIdentity(value: () => js.typedarray.Float32Array): Self = this.set("identity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostTranslate(value: (js.typedarray.Float32Array, Double, Double, Double, Double) => js.typedarray.Float32Array): Self = this.set("postTranslate", js.Any.fromFunction5(value))
    
    @scala.inline
    def setRotated(value: (Double, Double, Double) => js.typedarray.Float32Array): Self = this.set("rotated", js.Any.fromFunction3(value))
    
    @scala.inline
    def setScaled(value: (Double, Double, Double, Double) => js.typedarray.Float32Array): Self = this.set("scaled", js.Any.fromFunction4(value))
  }
}
