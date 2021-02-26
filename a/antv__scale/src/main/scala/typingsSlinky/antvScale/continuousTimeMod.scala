package typingsSlinky.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object continuousTimeMod {
  
  /**
    * 时间度量
    * @class
    */
  @JSImport("@antv/scale/lib/continuous/time", JSImport.Default)
  @js.native
  class default () extends Time
  
  /**
    * 时间度量
    * @class
    */
  @js.native
  trait Time
    extends typingsSlinky.antvScale.linearMod.default {
    
    /**
      * @override
      */
    def getText(value: String): js.Any = js.native
    def getText(value: String, index: Double): js.Any = js.native
    def getText(value: js.Date): js.Any = js.native
    def getText(value: js.Date, index: Double): js.Any = js.native
    def getText(value: Double): js.Any = js.native
    def getText(value: Double, index: Double): js.Any = js.native
    
    var mask: String = js.native
  }
}
