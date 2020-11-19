package typingsSlinky.reactList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ItemRenderer = js.Function2[
    /* index */ scala.Double, 
    /* key */ scala.Double | java.lang.String, 
    slinky.core.facade.ReactElement
  ]
  
  type ItemSizeEstimator = js.Function2[/* index */ scala.Double, /* cache */ js.Object, scala.Double]
  
  type ItemSizeGetter = js.Function1[/* index */ scala.Double, scala.Double]
  
  type ItemsRenderer = js.Function2[
    /* items */ js.Array[slinky.core.facade.ReactElement], 
    /* ref */ java.lang.String, 
    slinky.core.facade.ReactElement
  ]
  
  type ScrollParentGetter = js.Function0[slinky.core.facade.ReactElement]
}
