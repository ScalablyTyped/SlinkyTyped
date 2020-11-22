package typingsSlinky.aframe.anon

import typingsSlinky.tweenjsTweenJs.anon.Bernstein
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bezier extends js.Object {
  
  def Bezier(v: js.Array[Double], k: Double): Double = js.native
  
  def CatmullRom(v: js.Array[Double], k: Double): Double = js.native
  
  def Linear(v: js.Array[Double], k: Double): Double = js.native
  
  var Utils: Bernstein = js.native
}
object Bezier {
  
  @scala.inline
  def apply(
    Bezier: (js.Array[Double], Double) => Double,
    CatmullRom: (js.Array[Double], Double) => Double,
    Linear: (js.Array[Double], Double) => Double,
    Utils: Bernstein
  ): Bezier = {
    val __obj = js.Dynamic.literal(Bezier = js.Any.fromFunction2(Bezier), CatmullRom = js.Any.fromFunction2(CatmullRom), Linear = js.Any.fromFunction2(Linear), Utils = Utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bezier]
  }
  
  @scala.inline
  implicit class BezierOps[Self <: Bezier] (val x: Self) extends AnyVal {
    
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
    def setBezier(value: (js.Array[Double], Double) => Double): Self = this.set("Bezier", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCatmullRom(value: (js.Array[Double], Double) => Double): Self = this.set("CatmullRom", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLinear(value: (js.Array[Double], Double) => Double): Self = this.set("Linear", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUtils(value: Bernstein): Self = this.set("Utils", value.asInstanceOf[js.Any])
  }
}
