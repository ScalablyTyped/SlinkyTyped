package typingsSlinky.cleaveJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object propsMod {
  
  type ChangeEventHandler[T] = typingsSlinky.react.mod.EventHandler[typingsSlinky.cleaveJs.propsMod.ChangeEvent[T]]
  
  type InitHandler = js.Function1[/* owner */ typingsSlinky.react.mod.ReactInstance, scala.Unit]
}
