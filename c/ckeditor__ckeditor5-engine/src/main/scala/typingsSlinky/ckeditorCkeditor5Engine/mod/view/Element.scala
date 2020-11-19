package typingsSlinky.ckeditorCkeditor5Engine.mod.view

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/view/element
@JSImport("@ckeditor/ckeditor5-engine", "view.Element")
@js.native
class Element protected () extends Node {
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
  
  /* protected */ def _addClass(className: String): Unit = js.native
  /* protected */ def _addClass(className: js.Array[String]): Unit = js.native
  
  /* protected */ def _appendChild(items: Item): Double = js.native
  /* protected */ def _appendChild(items: js.Iterable[Item]): Double = js.native
  
  var _attrs: Map[String, String] = js.native
  
  var _children: js.Array[Node] = js.native
  
  var _classes: Set[String] = js.native
  
  /* protected */ def _clone(deep: Boolean): Element = js.native
  
  var _customProperties: Map[String, _] = js.native
  
  /* protected */ def _insertChild(index: Double, items: Item): Double = js.native
  /* protected */ def _insertChild(index: Double, items: js.Iterable[Item]): Double = js.native
  
  /* protected */ def _removeAttribute(key: String): Boolean = js.native
  
  def _removeChildren(index: Double): js.Array[Node] = js.native
  def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
  
  def _removeClass(className: String): Unit = js.native
  def _removeClass(className: js.Array[String]): Unit = js.native
  
  /* protected */ def _removeCustomProperty(key: String): Boolean = js.native
  /* protected */ def _removeCustomProperty(key: js.Symbol): Boolean = js.native
  
  /* protected */ def _removeStyle(property: String): Unit = js.native
  /* protected */ def _removeStyle(property: js.Array[String]): Unit = js.native
  
  /* protected */ def _setAttribute(key: String, value: String): Unit = js.native
  
  /* protected */ def _setCustomProperty(key: String, value: js.Any): Unit = js.native
  /* protected */ def _setCustomProperty(key: js.Symbol, value: js.Any): Unit = js.native
  
  /* protected */ def _setStyle(property: String): Unit = js.native
  /* protected */ def _setStyle(property: String, value: String): Unit = js.native
  /* protected */ def _setStyle(property: StringDictionary[String]): Unit = js.native
  /* protected */ def _setStyle(property: StringDictionary[String], value: String): Unit = js.native
  
  var _styles: Map[String, String] = js.native
  
  val childCount: Double = js.native
  
  def findAncestor(patterns: String): Element | Null = js.native
  def findAncestor(patterns: js.Function): Element | Null = js.native
  def findAncestor(patterns: js.Object): Element | Null = js.native
  def findAncestor(patterns: js.RegExp): Element | Null = js.native
  
  def getAttribute(key: String): js.UndefOr[String] = js.native
  
  def getAttributeKeys(): js.Iterable[String] = js.native
  
  def getAttributes(): js.Iterable[_] = js.native
  
  def getChild(index: Double): Node = js.native
  
  def getChildIndex(node: Node): Double = js.native
  
  def getChildren(): js.Iterable[Node] = js.native
  
  def getClassNames(): js.Iterable[String] = js.native
  
  def getCustomProperties(): js.Iterable[_] = js.native
  
  def getCustomProperty(key: String): js.Any = js.native
  def getCustomProperty(key: js.Symbol): js.Any = js.native
  
  def getFillerOffset(): Unit = js.native
  
  def getIdentity(): String = js.native
  
  def getStyle(property: String): js.UndefOr[String] = js.native
  
  def getStyleNames(): js.Iterable[String] = js.native
  
  def hasAttribute(key: String): Boolean = js.native
  
  def hasClass(className: String): Unit = js.native
  
  def hasStyle(property: String): Unit = js.native
  
  def is(`type`: String): Boolean = js.native
  
  val isEmpty: Boolean = js.native
  
  def isSimilar(otherElement: Element): Boolean = js.native
  
  val name: String = js.native
}
