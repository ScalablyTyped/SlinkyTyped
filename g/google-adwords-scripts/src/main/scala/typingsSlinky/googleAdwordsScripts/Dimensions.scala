package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimensions extends StObject {
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
}
object Dimensions {
  
  @scala.inline
  def apply(getHeight: () => Double, getWidth: () => Double): Dimensions = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth))
    __obj.asInstanceOf[Dimensions]
  }
  
  @scala.inline
  implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
  }
}
