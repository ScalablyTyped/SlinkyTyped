package typingsSlinky.json5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JSONReplacer = js.Function2[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    js.Any | (js.Array[scala.Double | java.lang.String]) | scala.Null
  ]
}
