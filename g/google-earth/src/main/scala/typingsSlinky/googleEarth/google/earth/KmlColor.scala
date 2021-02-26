package typingsSlinky.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlColor extends StObject {
  
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
  implicit class KmlColorMutableBuilder[Self <: KmlColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetA(value: () => Double): Self = StObject.set(x, "getA", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetB(value: () => Double): Self = StObject.set(x, "getB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetG(value: () => Double): Self = StObject.set(x, "getG", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetR(value: () => Double): Self = StObject.set(x, "getR", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
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
