package typingsSlinky.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.minappEnv.ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Array")
@js.native
class Array[T] protected ()
  extends typingsSlinky.minappEnv.Array[T] {
  def this(arrayLength: Double) = this()
  def this(items: T*) = this()
}
@JSGlobal("Array")
@js.native
object Array extends TopLevel[ArrayConstructor]
