package typingsSlinky.parquetjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowInterfaceMod {
  
  type ArrayType = js.Array[Boolean | js.Date | Double | String]
  
  @js.native
  trait RowInterface
    extends /* key */ StringDictionary[ScalarType | ArrayType | RowInterface | js.Array[RowInterface]]
  object RowInterface {
    
    @scala.inline
    def apply(): RowInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowInterface]
    }
  }
  
  type ScalarType = Boolean | Double | String | js.Date
}
