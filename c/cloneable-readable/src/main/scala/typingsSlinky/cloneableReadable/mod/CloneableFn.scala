package typingsSlinky.cloneableReadable.mod

import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloneableFn extends js.Object {
  
  def apply[T /* <: Readable */](x: T): Cloneable[T] = js.native
  
  def isCloneable(x: Readable): /* is cloneable-readable.anon.CloneableReadable */ Boolean = js.native
}
