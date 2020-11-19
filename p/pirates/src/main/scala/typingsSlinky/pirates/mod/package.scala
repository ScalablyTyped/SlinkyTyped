package typingsSlinky.pirates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Hook = js.Function2[/* code */ java.lang.String, /* filename */ java.lang.String, java.lang.String]
  
  type Matcher = js.Function1[/* code */ java.lang.String, scala.Boolean]
  
  type RevertFunction = js.Function0[scala.Unit]
}
