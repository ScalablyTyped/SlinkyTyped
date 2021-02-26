package typingsSlinky.d3Box

import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.Selection_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("d3", "box")
  @js.native
  def box(): Box_ = js.native
  
  @js.native
  trait Box_ extends StObject {
    
    def apply(
      sel: Selection_[
          _, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
          BaseType, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
        ]
    ): Unit = js.native
    
    def domain(): js.Function0[js.Array[Double]] = js.native
    def domain(x: js.Array[Double]): Box_ = js.native
    
    def duration(): Double = js.native
    def duration(x: Double): Box_ = js.native
    
    def height(): Double = js.native
    def height(x: Double): Box_ = js.native
    
    def quantiles(x: js.Function1[/* d */ js.Array[_], js.Array[Double]]): Box_ = js.native
    
    def quartiles(): js.Function1[/* d */ js.Array[_], js.Array[Double]] = js.native
    
    def tickFormat(): js.Function1[/* n */ Double, String] = js.native
    def tickFormat(fun: js.Function1[/* n */ Double, String]): Box_ = js.native
    
    def value(): js.Function1[/* d */ js.Any, Double] = js.native
    def value(x: js.Function1[/* d */ js.Any, Double]): Box_ = js.native
    
    def whiskers(): js.Function2[/* d */ js.Array[_], /* i */ js.UndefOr[Double], js.Array[Double]] = js.native
    def whiskers(x: js.Function2[/* d */ js.Array[_], /* i */ js.UndefOr[Double], js.Array[Double]]): Box_ = js.native
    
    def width(): Double = js.native
    def width(x: Double): Box_ = js.native
  }
}
