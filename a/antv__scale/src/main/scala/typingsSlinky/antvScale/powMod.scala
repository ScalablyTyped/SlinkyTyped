package typingsSlinky.antvScale

import typingsSlinky.antvScale.continuousBaseMod.Continuous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/continuous/pow", JSImport.Namespace)
@js.native
object powMod extends js.Object {
  
  /**
    * Pow 度量，处理非均匀分布
    */
  @js.native
  trait Pow extends Continuous {
    
    /**
      * 指数
      */
    var exponent: Double = js.native
    
    /* protected */ def getScalePercent(value: Double): Double = js.native
  }
  
  /**
    * Pow 度量，处理非均匀分布
    */
  @js.native
  class default () extends Pow
}
