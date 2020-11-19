package typingsSlinky.atomically

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Callback = js.Function1[/* error */ typingsSlinky.atomically.typesMod.Exception | scala.Unit, js.Any]
  
  type Data = js.UndefOr[typingsSlinky.node.Buffer | java.lang.String]
  
  type Disposer = js.Function0[scala.Unit]
  
  type Exception = typingsSlinky.node.NodeJS.ErrnoException
  
  type FN[Arguments /* <: js.Array[_] */, Return] = js.Function1[/* args */ Arguments, Return]
  
  type Path = java.lang.String
}
