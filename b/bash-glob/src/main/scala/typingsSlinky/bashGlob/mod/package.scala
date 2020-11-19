package typingsSlinky.bashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[/* err */ js.Error, /* files */ js.Array[java.lang.String], scala.Unit]
  
  type Patterns = java.lang.String | js.Array[java.lang.String]
}
