package typingsSlinky.nodeStatic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function1[/* e */ js.Error, scala.Unit]
  
  type Finish = js.Function2[
    /* status */ scala.Double, 
    /* headers */ js.UndefOr[typingsSlinky.nodeStatic.mod.Headers], 
    scala.Unit
  ]
  
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
}
