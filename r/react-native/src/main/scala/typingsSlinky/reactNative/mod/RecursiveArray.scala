package typingsSlinky.reactNative.mod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecursiveArray[T]
  extends Array[T | js.Array[T] | RecursiveArray[T]]
