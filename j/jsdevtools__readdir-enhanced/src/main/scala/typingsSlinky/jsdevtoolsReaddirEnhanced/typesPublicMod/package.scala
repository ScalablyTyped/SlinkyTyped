package typingsSlinky.jsdevtoolsReaddirEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesPublicMod {
  
  type Callback[T] = js.Function2[/* err */ js.Error | scala.Null, /* result */ T, scala.Unit]
  
  type FilterFunction = js.Function1[/* stat */ typingsSlinky.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats, js.Any]
}
