package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LengthShow extends StObject {
  
  /**
    * The length of pointer which could be absolute value and also
    * the percentage relative to
    * [radius](https://echarts.apache.org/en/option.html#series-gauge.radius)
    * .
    *
    *
    * @default
    * '80%'
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer.length
    */
  var length: js.UndefOr[Double | String] = js.native
  
  /**
    * Whether to show the pointer.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer.show
    */
  var show: js.UndefOr[Boolean] = js.native
  
  /**
    * The width of pointer.
    *
    *
    * @default
    * 8
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer.width
    */
  var width: js.UndefOr[Double] = js.native
}
object LengthShow {
  
  @scala.inline
  def apply(): LengthShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthShow]
  }
  
  @scala.inline
  implicit class LengthShowMutableBuilder[Self <: LengthShow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
