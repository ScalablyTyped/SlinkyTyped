package typingsSlinky.charsetDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CharsetMatcher = js.Function2[
    /* input */ typingsSlinky.std.ArrayLike[scala.Double], 
    /* stats */ typingsSlinky.charsetDetector.mod.InputStats, 
    typingsSlinky.charsetDetector.mod.CharsetMatch | scala.Null
  ]
}
