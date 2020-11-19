package typingsSlinky.ckeditor.CKEDITOR.dom

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ckeditor.CKEDITOR.dtdDefinition
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.ckeditorBooleans.`false`
import typingsSlinky.ckeditor.ckeditorNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait element extends node {
  
  @JSName("$")
  val $_element: HTMLElement = js.native
  
  def addClass(className: String): Unit = js.native
  
  def append(node: String): node = js.native
  def append(node: String, toStart: Boolean): node = js.native
  def append(node: node): node = js.native
  def append(node: node, toStart: Boolean): node = js.native
  
  def appendBogus(force: Boolean): Unit = js.native
  
  def appendHtml(html: String): Unit = js.native
  
  def appendText(text: String): node = js.native
  
  def breakParent(parent: element): Unit = js.native
  
  def contains(node: node): Boolean = js.native
  
  def copyAttributes(dest: element, skipAttributes: StringDictionary[String]): Unit = js.native
  
  def data(name: String): String = js.native
  def data(name: String, value: String): String = js.native
  @JSName("data")
  def data_false(name: String, value: `false`): String = js.native
  
  def disableContextMenu(): Unit = js.native
  
  def find(selector: String): nodeList = js.native
  
  def findOne(selector: String): element = js.native
  
  def focus(): Unit = js.native
  def focus(defer: Boolean): Unit = js.native
  
  def focusNext(): Unit = js.native
  def focusNext(ignoreChildren: js.UndefOr[scala.Nothing], indexToUse: Double): Unit = js.native
  def focusNext(ignoreChildren: Boolean): Unit = js.native
  def focusNext(ignoreChildren: Boolean, indexToUse: Double): Unit = js.native
  
  def focusPrevious(): Unit = js.native
  def focusPrevious(ignoreChildren: js.UndefOr[scala.Nothing], indexToUse: Double): Unit = js.native
  def focusPrevious(ignoreChildren: Boolean): Unit = js.native
  def focusPrevious(ignoreChildren: Boolean, indexToUse: Double): Unit = js.native
  
  def forEach(callback: js.Function1[/* node */ node, Unit]): Unit = js.native
  def forEach(
    callback: js.Function1[/* node */ node, Unit],
    `type`: js.UndefOr[scala.Nothing],
    skipRoot: Boolean
  ): Unit = js.native
  def forEach(callback: js.Function1[/* node */ node, Unit], `type`: Double): Unit = js.native
  def forEach(callback: js.Function1[/* node */ node, Unit], `type`: Double, skipRoot: Boolean): Unit = js.native
  
  def getAttribute(name: String): String = js.native
  
  def getBogus(): node | Boolean = js.native
  
  def getChild(indices: js.Array[Double]): node = js.native
  def getChild(indices: Double): node = js.native
  
  def getChildCount(): Double = js.native
  
  def getChildren(): nodeList = js.native
  
  def getClientRect(): ClientRect = js.native
  
  def getComputedStyle(propertyName: String): String = js.native
  
  def getDirection(useComputed: Boolean): String = js.native
  
  def getDocumentPosition(refDocument: document): position = js.native
  
  def getDtd(): dtdDefinition = js.native
  
  def getEditor(): editor = js.native
  
  def getElementsByTag(tagName: String): nodeList = js.native
  
  def getFirst(): node = js.native
  def getFirst(evaluator: js.Function1[/* node */ node, Boolean]): node = js.native
  
  def getFrameDocument(): document = js.native
  
  def getHtml(): String = js.native
  
  def getId(): String = js.native
  
  def getLast(): node = js.native
  def getLast(evaluator: js.Function1[/* node */ node, Boolean]): node = js.native
  
  def getName(): String = js.native
  
  def getNameAtt(): String = js.native
  
  def getOuterHtml(): String = js.native
  
  def getPositionedAncestor(): element = js.native
  
  def getSize(`type`: String, isBorderBox: Boolean): Unit = js.native
  
  def getStyle(name: String): String = js.native
  
  def getTabIndex(): Double = js.native
  
  def getText(): String = js.native
  
  def getValue(): String = js.native
  
  def getWindow(): window = js.native
  
  def hasAttribute(name: String): Boolean = js.native
  
  def hasAttributes(): Boolean = js.native
  
  def hasClass(className: String): Boolean = js.native
  
  def hide(): Unit = js.native
  
  def is(name: String*): Boolean = js.native
  def is(name: js.Any): Boolean = js.native
  
  @JSName("isBlockBoundary")
  def isBlockBoundary_1(customNodeNames: StringDictionary[`1`]): Boolean = js.native
  
  def isEditable(): Boolean = js.native
  def isEditable(textCursor: Boolean): Boolean = js.native
  
  def isEmptyInlineRemoveable(): Boolean = js.native
  
  def isIdentical(otherElement: element): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def mergeSiblings(): Unit = js.native
  def mergeSiblings(inlineOnly: Boolean): Unit = js.native
  
  def moveChildren(target: element): Unit = js.native
  def moveChildren(target: element, toStart: Boolean): Unit = js.native
  
  def removeAttribute(name: String): Unit = js.native
  
  def removeAttributes(): Unit = js.native
  def removeAttributes(attributes: js.Array[String]): Unit = js.native
  
  def removeClass(className: String): Unit = js.native
  
  def removeStyle(name: String): Unit = js.native
  
  def renameNode(newTag: String): Unit = js.native
  
  def scrollIntoParent(parent: element, alignToTop: Boolean, hscroll: Boolean): Unit = js.native
  def scrollIntoParent(parent: window, alignToTop: Boolean, hscroll: Boolean): Unit = js.native
  
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(alignToTop: Boolean): Unit = js.native
  
  def setAttribute(name: String, value: String): element = js.native
  
  def setAttributes(attributesPairs: StringDictionary[String]): element = js.native
  
  def setHtml(html: String): String = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
  
  def setSize(`type`: String, size: Double, isBorderBox: Boolean): Unit = js.native
  
  def setState(state: Double): Unit = js.native
  def setState(state: Double, base: js.UndefOr[scala.Nothing], useAria: Boolean): Unit = js.native
  def setState(state: Double, base: String): Unit = js.native
  def setState(state: Double, base: String, useAria: Boolean): Unit = js.native
  
  def setStyle(name: String, value: String): element = js.native
  
  def setStyles(stylesPair: StringDictionary[String]): element = js.native
  
  def setText(text: String): String = js.native
  
  def setValue(value: String): element = js.native
  
  def show(): Unit = js.native
  
  def unselectable(): Unit = js.native
}
