package typingsSlinky.credential

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HashCallback = js.Function2[/* err */ js.Error, /* hash */ java.lang.String, scala.Unit]
  
  type VerifyCallback = js.Function2[/* err */ js.Error, /* isValid */ scala.Boolean, scala.Unit]
}
