package typingsSlinky.reactMergeRefs

import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.RefCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-merge-refs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[T](refs: js.Array[MutableRefObject[T] | LegacyRef[T]]): RefCallback[T] = js.native
}
