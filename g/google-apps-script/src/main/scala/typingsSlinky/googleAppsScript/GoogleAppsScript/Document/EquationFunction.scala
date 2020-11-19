package typingsSlinky.googleAppsScript.GoogleAppsScript.Document

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element representing a function in a mathematical Equation. An EquationFunction may contain EquationFunction, EquationFunctionArgumentSeparator, EquationSymbol, and Text elements. For more
  * information on document structure, see the guide to extending Google Docs.
  */
@js.native
trait EquationFunction extends Element {
  
  def clear(): EquationFunction = js.native
  
  def editAsText(): Text = js.native
  
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  
  def getChild(childIndex: Integer): Element = js.native
  
  def getChildIndex(child: Element): Integer = js.native
  
  def getCode(): String = js.native
  
  def getLinkUrl(): String = js.native
  
  def getNumChildren(): Integer = js.native
  
  def getText(): String = js.native
  
  def getTextAlignment(): TextAlignment = js.native
  
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  
  def setLinkUrl(url: String): EquationFunction = js.native
  
  def setTextAlignment(textAlignment: TextAlignment): EquationFunction = js.native
}
