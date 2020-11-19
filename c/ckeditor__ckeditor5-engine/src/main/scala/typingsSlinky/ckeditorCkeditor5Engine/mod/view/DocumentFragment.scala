package typingsSlinky.ckeditorCkeditor5Engine.mod.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/view/documentfragment
@JSImport("@ckeditor/ckeditor5-engine", "view.DocumentFragment")
@js.native
class DocumentFragment protected () extends js.Object {
  protected def this(children: Node) = this()
  protected def this(children: js.Iterable[Node]) = this()
  
  def _appendChild(items: Item): Double = js.native
  def _appendChild(items: js.Iterable[Item]): Double = js.native
  
  var _children: js.Array[Element] = js.native
  
  def _insertChild(index: Double, items: Item): Double = js.native
  def _insertChild(index: Double, items: js.Iterable[Item]): Double = js.native
  
  def _removeChildren(index: Double): js.Array[Node] = js.native
  def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
  
  val childCount: Double = js.native
  
  def getChild(index: Double): Node = js.native
  
  def getChildIndex(node: Node): Double = js.native
  
  def getChildren(): js.Iterable[Node] = js.native
  
  def is(`type`: String): Boolean = js.native
  
  val isEmpty: Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[Node]] = js.native
  
  val parent: Null = js.native
  
  val root: DocumentFragment = js.native
}
