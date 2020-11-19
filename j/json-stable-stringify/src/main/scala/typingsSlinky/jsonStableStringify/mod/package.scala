package typingsSlinky.jsonStableStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Comparator = js.Function2[
    /* a */ typingsSlinky.jsonStableStringify.mod.Element, 
    /* b */ typingsSlinky.jsonStableStringify.mod.Element, 
    scala.Double
  ]
  
  type Replacer = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
}
