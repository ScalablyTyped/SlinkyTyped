package typingsSlinky.jsdevtoolsOno

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ErrorLike = js.Error | typingsSlinky.jsdevtoolsOno.typesMod.ErrorPOJO
  
  type MessageFormatter = js.Function2[/* message */ java.lang.String, /* repeated */ js.Any, java.lang.String]
}
