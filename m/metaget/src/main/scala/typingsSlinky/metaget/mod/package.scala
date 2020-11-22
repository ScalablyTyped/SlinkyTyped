package typingsSlinky.metaget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* error */ js.Error | scala.Null, /* data */ typingsSlinky.metaget.mod.Result, T]
  
  type Result = typingsSlinky.std.Record[java.lang.String, java.lang.String]
}
