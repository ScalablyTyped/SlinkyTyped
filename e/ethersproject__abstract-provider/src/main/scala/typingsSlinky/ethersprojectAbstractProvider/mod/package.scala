package typingsSlinky.ethersprojectAbstractProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlockTag = java.lang.String | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String | js.Array[java.lang.String]]
    - typingsSlinky.ethersprojectAbstractProvider.mod.EventFilter
    - typingsSlinky.ethersprojectAbstractProvider.mod.ForkEvent
  */
  type EventType = typingsSlinky.ethersprojectAbstractProvider.mod._EventType | (js.Array[java.lang.String | js.Array[java.lang.String]]) | java.lang.String
  
  type Listener = js.Function1[/* repeated */ js.Any, scala.Unit]
}
