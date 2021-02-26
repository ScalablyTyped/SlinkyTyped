package typingsSlinky.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataKerning
  * @property {number} first
  * @property {number} second
  * @property {number} amount
  */
@js.native
trait IBitmapFontDataKerning extends StObject {
  
  var amount: Double = js.native
  
  var first: Double = js.native
  
  var second: Double = js.native
}
object IBitmapFontDataKerning {
  
  @scala.inline
  def apply(amount: Double, first: Double, second: Double): IBitmapFontDataKerning = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataKerning]
  }
  
  @scala.inline
  implicit class IBitmapFontDataKerningMutableBuilder[Self <: IBitmapFontDataKerning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
