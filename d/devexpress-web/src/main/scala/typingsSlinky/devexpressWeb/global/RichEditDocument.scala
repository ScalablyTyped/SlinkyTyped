package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set properties providing the current information about certain document structural elements.
  */
@JSGlobal("RichEditDocument")
@js.native
class RichEditDocument ()
  extends typingsSlinky.devexpressWeb.RichEditDocument {
  /**
    * Provides information about numbered paragraphs in the document.
    */
  /* CompleteClass */
  override val abstractNumberingListsInfo: js.Array[typingsSlinky.devexpressWeb.AbstractNumberingList] = js.native
  /**
    * Provides the information about the active sub-document.
    */
  /* CompleteClass */
  override val activeSubDocument: typingsSlinky.devexpressWeb.SubDocument = js.native
  /**
    * Provides information about character styles in the current document.
    */
  /* CompleteClass */
  override val characterStylesInfo: js.Array[typingsSlinky.devexpressWeb.CharacterStyle] = js.native
  /**
    * Provides access to the document's main sub-document.
    */
  /* CompleteClass */
  override val mainSubDocument: typingsSlinky.devexpressWeb.SubDocument = js.native
  /**
    * Provides information about paragraph styles in the current document.
    */
  /* CompleteClass */
  override val paragraphStylesInfo: js.Array[typingsSlinky.devexpressWeb.ParagraphStyle] = js.native
  /**
    * Provides information about sections in the current document.
    */
  /* CompleteClass */
  override val sectionsInfo: js.Array[typingsSlinky.devexpressWeb.Section] = js.native
  /**
    * Provides information about spell checking in the current document.
    */
  /* CompleteClass */
  override val spellingInfo: typingsSlinky.devexpressWeb.SpellingInfo = js.native
  /**
    * Provides access to the document's sub-documents.
    */
  /* CompleteClass */
  override val subDocuments: js.Array[typingsSlinky.devexpressWeb.SubDocument] = js.native
  /**
    * Provides information about table styles in the current document.
    */
  /* CompleteClass */
  override val tableStylesInfo: js.Array[typingsSlinky.devexpressWeb.TableStyle] = js.native
  /**
    * Returns the sub-document with the specified identifier. A SubDocument value specifying the sub-document.
    * @param subDocumentId An integer value specifying the required sub-document.
    */
  /* CompleteClass */
  override def getSubDocumentById(subDocumentId: Double): typingsSlinky.devexpressWeb.SubDocument = js.native
}

