package typingsSlinky.ckeditorCkeditor5Engine.mod.view

import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/view/attributeelement
@JSImport("@ckeditor/ckeditor5-engine", "view.AttributeElement")
@js.native
class AttributeElement protected () extends Element {
  protected def this(name: String) = this()
  protected def this(name: String, attrs: js.Object) = this()
  protected def this(name: String, attrs: js.Iterable[js.Tuple2[String, String]]) = this()
  protected def this(name: String, attrs: Map[String, String]) = this()
  protected def this(name: String, attrs: js.UndefOr[scala.Nothing], children: Node) = this()
  protected def this(name: String, attrs: js.UndefOr[scala.Nothing], children: js.Iterable[Node]) = this()
  protected def this(name: String, attrs: js.Object, children: Node) = this()
  protected def this(name: String, attrs: js.Object, children: js.Iterable[Node]) = this()
  protected def this(name: String, attrs: js.Iterable[js.Tuple2[String, String]], children: Node) = this()
  protected def this(name: String, attrs: js.Iterable[js.Tuple2[String, String]], children: js.Iterable[Node]) = this()
  protected def this(name: String, attrs: Map[String, String], children: Node) = this()
  protected def this(name: String, attrs: Map[String, String], children: js.Iterable[Node]) = this()
  
  var _clonesGroup: Set[AttributeElement] | Null = js.native
  
  var _id: String | Double = js.native
  
  var _priority: Double = js.native
  
  def getElementsWithSameId(): Set[AttributeElement] = js.native
  
  val id: String | Double = js.native
  
  val priority: Double = js.native
}
/* static members */
@JSImport("@ckeditor/ckeditor5-engine", "view.AttributeElement")
@js.native
object AttributeElement extends js.Object {
  
  var DEFAULT_PRIORITY: Double = js.native
}
