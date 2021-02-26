package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows inserting and appending text content. */
@js.native
trait XTextContentAppend extends XInterface {
  
  /**
    * appends a text content at the end of the text. <p> The sequence can contain all the properties defined by the service
    *
    * Paragraph.
    * @param TextContent contains the object to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @returns the anchor text range of the inserted text content.
    */
  def appendTextContent(TextContent: XTextContent, CharacterAndParagraphProperties: PropertyValues): XTextRange = js.native
  
  /**
    * inserts a text content at the given position.
    * @param TextContent contains the object to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange insert position
    * @returns the anchor text range of the inserted text content.
    * @since LibreOffice 4.0
    */
  def insertTextContentWithProperties(TextContent: XTextContent, CharacterAndParagraphProperties: PropertyValues, TextRange: XTextRange): XTextRange = js.native
}
object XTextContentAppend {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    appendTextContent: (XTextContent, PropertyValues) => XTextRange,
    insertTextContentWithProperties: (XTextContent, PropertyValues, XTextRange) => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextContentAppend = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), appendTextContent = js.Any.fromFunction2(appendTextContent), insertTextContentWithProperties = js.Any.fromFunction3(insertTextContentWithProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextContentAppend]
  }
  
  @scala.inline
  implicit class XTextContentAppendMutableBuilder[Self <: XTextContentAppend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTextContent(value: (XTextContent, PropertyValues) => XTextRange): Self = StObject.set(x, "appendTextContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertTextContentWithProperties(value: (XTextContent, PropertyValues, XTextRange) => XTextRange): Self = StObject.set(x, "insertTextContentWithProperties", js.Any.fromFunction3(value))
  }
}
