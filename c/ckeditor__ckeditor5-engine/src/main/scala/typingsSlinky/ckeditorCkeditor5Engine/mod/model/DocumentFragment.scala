package typingsSlinky.ckeditorCkeditor5Engine.mod.model

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/documentfragment
@JSImport("@ckeditor/ckeditor5-engine", "model.DocumentFragment")
@js.native
class DocumentFragment protected () extends _NodeSet {
  protected def this(children: Node) = this()
  protected def this(children: js.Iterable[Node]) = this()
  
  /* protected */ def _appendChild(items: Item): Unit = js.native
  /* protected */ def _appendChild(items: js.Iterable[Item]): Unit = js.native
  
  /* protected */ def _insertChild(index: Double, items: Item): Unit = js.native
  /* protected */ def _insertChild(index: Double, items: js.Iterable[Item]): Unit = js.native
  
  /* protected */ def _removeChildren(index: Double): js.Array[Node] = js.native
  /* protected */ def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
  
  val childCount: Double = js.native
  
  def getChild(index: Double): Node | Null = js.native
  
  def getChildIndex(node: Node): Double | Null = js.native
  
  def getChildStartOffset(node: Node): Double | Null = js.native
  
  def getChildren(): js.Iterable[Node] = js.native
  
  def getNodeByPath(relativePath: js.Array[Double]): Node | DocumentFragment = js.native
  
  def getPath(): js.Array[Double] = js.native
  
   /*TS3.0: []*/ def is(`type`: String): Boolean = js.native
  
  val isEmpty: Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[Node]] = js.native
  
  val markers: Map[String, Range] = js.native
  
  val maxOffset: Double = js.native
  
  def offsetToIndex(offset: Double): Double = js.native
  
  val parent: Null = js.native
  
  val root: DocumentFragment = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
@JSImport("@ckeditor/ckeditor5-engine", "model.DocumentFragment")
@js.native
object DocumentFragment extends js.Object {
  
  def fromJSON(json: js.Object): DocumentFragment = js.native
}
