package typingsSlinky.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends Value {
  
  /**
    * Get the alpha transparency component of the color.
    * @returns number between 0 and 1 inclusive;
    */
  def getA(): Double = js.native
  
  /**
    * Get the blue component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getB(): Double = js.native
  
  /**
    * Get the green component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getG(): Double = js.native
  
  /**
    * Get the red component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def getR(): Double = js.native
  
  /**
    * Set the alpha component of the color.
    * @param a number between 0 and 1 inclusive;
    */
  def setA(a: Double): Unit = js.native
  
  /**
    * Set the blue component of the color.
    * @param b integer between 0 and 255 inclusive;
    */
  def setB(b: Double): Unit = js.native
  
  /**
    * Set the green component of the color.
    * @param g integer between 0 and 255 inclusive;
    */
  def setG(g: Double): Unit = js.native
  
  /**
    * Set the red component of the color.
    * @returns integer between 0 and 255 inclusive;
    */
  def setR(r: Double): Unit = js.native
}
object Color {
  
  @JSImport("node-sass", "types.Color")
  @js.native
  val ^ : ColorConstructor = js.native
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetA(value: () => Double): Self = StObject.set(x, "getA", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetB(value: () => Double): Self = StObject.set(x, "getB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetG(value: () => Double): Self = StObject.set(x, "getG", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetR(value: () => Double): Self = StObject.set(x, "getR", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetA(value: Double => Unit): Self = StObject.set(x, "setA", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetB(value: Double => Unit): Self = StObject.set(x, "setB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetG(value: Double => Unit): Self = StObject.set(x, "setG", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetR(value: Double => Unit): Self = StObject.set(x, "setR", js.Any.fromFunction1(value))
  }
}
