package typingsSlinky.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object astTypesMod {
  
  type Def = typingsSlinky.astTypes.astTypesMod.Plugin[scala.Unit]
  
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type Plugin[T] = js.Function1[/* fork */ typingsSlinky.astTypes.astTypesMod.Fork, T]
}
