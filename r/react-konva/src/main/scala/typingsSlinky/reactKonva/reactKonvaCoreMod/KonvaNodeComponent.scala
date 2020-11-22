package typingsSlinky.reactKonva.reactKonvaCoreMod

import typingsSlinky.konva.mod.Konva.Node
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KonvaNodeComponent[Node /* <: Node */, Props] extends FunctionComponent[Props with KonvaNodeEvents with ClassAttributes[Node]] {
  
  def getNativeNode(): Node = js.native
  
  def getPublicInstance(): Node = js.native
}
