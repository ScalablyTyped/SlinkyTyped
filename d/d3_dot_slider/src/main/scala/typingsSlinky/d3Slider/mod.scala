package typingsSlinky.d3Slider

import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.d3Slider.d3SliderStrings.slide
import typingsSlinky.d3Slider.d3SliderStrings.slideend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("d3", "slider")
  @js.native
  def slider(): Slider_ = js.native
  
  @js.native
  trait Slider_ extends StObject {
    
    def apply(
      sel: Selection_[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
        ]
    ): Unit = js.native
    
    def animate(): Boolean | Double = js.native
    def animate(`val`: Boolean): Slider_ = js.native
    def animate(`val`: Double): Slider_ = js.native
    
    def axis(): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any) = js.native
    def axis(
      `val`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any
    ): Slider_ = js.native
    def axis(`val`: Boolean): Slider_ = js.native
    
    def margin(): Double = js.native
    def margin(`val`: Double): Slider_ = js.native
    
    def max(): Double = js.native
    def max(`val`: Double): Slider_ = js.native
    
    def min(): Double = js.native
    def min(`val`: Double): Slider_ = js.native
    
    @JSName("on")
    def on_slide(evt: slide, callback: js.Function2[/* evt */ js.Any, /* val */ js.Any, Unit]): Slider_ = js.native
    @JSName("on")
    def on_slideend(evt: slideend, callback: js.Function2[/* evt */ js.Any, /* val */ js.Any, Unit]): Slider_ = js.native
    
    def orientation(): String = js.native
    def orientation(`val`: String): Slider_ = js.native
    
    def scale(): js.Any = js.native
    def scale(`val`: js.Any): Slider_ = js.native
    
    def snap(): Boolean = js.native
    def snap(`val`: Boolean): Slider_ = js.native
    
    def step(): Double = js.native
    def step(`val`: Double): Slider_ = js.native
    
    def value(): js.Any = js.native
    def value(`val`: js.Any): Slider_ = js.native
  }
}
