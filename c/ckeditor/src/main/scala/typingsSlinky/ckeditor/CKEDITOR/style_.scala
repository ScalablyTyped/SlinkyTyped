package typingsSlinky.ckeditor.CKEDITOR

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.elementPath
import typingsSlinky.ckeditor.CKEDITOR.dom.range
import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRules
import typingsSlinky.ckeditor.CKEDITOR.style.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait style_ extends js.Object {
  var alwaysRemoveElement: Boolean = js.native
  var includeReadonly: Boolean = js.native
  @JSName("apply")
  def apply(editor: editor): Unit = js.native
  def applyToObject(element: element, editor: editor): Unit = js.native
  def applyToRange(range: range, editor: editor): Unit = js.native
  def buildPreview(): String = js.native
  def buildPreview(label: String): String = js.native
  def checkActive(elementPath: elementPath, editor: editor): Boolean = js.native
  def checkApplicable(elementPath: elementPath, editor: editor): Boolean = js.native
  def checkApplicable(elementPath: elementPath, editor: editor, filter: filter): Boolean = js.native
  def checkElementMatch(element: element, fullMatch: Boolean, editor: editor): Boolean = js.native
  def checkElementRemovable(element: element, fullMatch: Boolean, editor: editor): Boolean = js.native
  def getDefintion(): definition = js.native
  def remove(editor: editor): Unit = js.native
  def removeFromRange(range: range, editor: editor): Unit = js.native
  def toAllowedContentRules(): allowedContentRules = js.native
  def toAllowedContentRules(editor: editor): allowedContentRules = js.native
}

