package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/useEnsuredRef", JSImport.Namespace)
@js.native
object useEnsuredRefMod extends js.Object {
  
  def useEnsuredRef[E /* <: HTMLElement */](): EnsuredRefs[E] = js.native
  def useEnsuredRef[E /* <: HTMLElement */](propRef: Ref[E | Null]): EnsuredRefs[E] = js.native
  
  type EnsuredRefs[E /* <: HTMLElement */] = js.Tuple2[MutableRefObject[E | Null], RefCallback[E | Null]]
}
