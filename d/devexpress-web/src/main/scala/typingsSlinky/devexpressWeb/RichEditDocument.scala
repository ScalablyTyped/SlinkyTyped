package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set properties providing the current information about certain document structural elements.
  */
@js.native
trait RichEditDocument extends js.Object {
  /**
    * Provides information about numbered paragraphs in the document.
    */
  val abstractNumberingListsInfo: js.Array[AbstractNumberingList] = js.native
  /**
    * Provides the information about the active sub-document.
    */
  val activeSubDocument: SubDocument = js.native
  /**
    * Provides information about character styles in the current document.
    */
  val characterStylesInfo: js.Array[CharacterStyle] = js.native
  /**
    * Provides access to the document's main sub-document.
    */
  val mainSubDocument: SubDocument = js.native
  /**
    * Provides information about paragraph styles in the current document.
    */
  val paragraphStylesInfo: js.Array[ParagraphStyle] = js.native
  /**
    * Provides information about sections in the current document.
    */
  val sectionsInfo: js.Array[Section] = js.native
  /**
    * Provides information about spell checking in the current document.
    */
  val spellingInfo: SpellingInfo = js.native
  /**
    * Provides access to the document's sub-documents.
    */
  val subDocuments: js.Array[SubDocument] = js.native
  /**
    * Provides information about table styles in the current document.
    */
  val tableStylesInfo: js.Array[TableStyle] = js.native
  /**
    * Returns the sub-document with the specified identifier. A SubDocument value specifying the sub-document.
    * @param subDocumentId An integer value specifying the required sub-document.
    */
  def getSubDocumentById(subDocumentId: Double): SubDocument = js.native
}

object RichEditDocument {
  @scala.inline
  def apply(
    abstractNumberingListsInfo: js.Array[AbstractNumberingList],
    activeSubDocument: SubDocument,
    characterStylesInfo: js.Array[CharacterStyle],
    getSubDocumentById: Double => SubDocument,
    mainSubDocument: SubDocument,
    paragraphStylesInfo: js.Array[ParagraphStyle],
    sectionsInfo: js.Array[Section],
    spellingInfo: SpellingInfo,
    subDocuments: js.Array[SubDocument],
    tableStylesInfo: js.Array[TableStyle]
  ): RichEditDocument = {
    val __obj = js.Dynamic.literal(abstractNumberingListsInfo = abstractNumberingListsInfo.asInstanceOf[js.Any], activeSubDocument = activeSubDocument.asInstanceOf[js.Any], characterStylesInfo = characterStylesInfo.asInstanceOf[js.Any], getSubDocumentById = js.Any.fromFunction1(getSubDocumentById), mainSubDocument = mainSubDocument.asInstanceOf[js.Any], paragraphStylesInfo = paragraphStylesInfo.asInstanceOf[js.Any], sectionsInfo = sectionsInfo.asInstanceOf[js.Any], spellingInfo = spellingInfo.asInstanceOf[js.Any], subDocuments = subDocuments.asInstanceOf[js.Any], tableStylesInfo = tableStylesInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichEditDocument]
  }
  @scala.inline
  implicit class RichEditDocumentOps[Self <: RichEditDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbstractNumberingListsInfo(value: js.Array[AbstractNumberingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstractNumberingListsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveSubDocument(value: SubDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSubDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacterStylesInfo(value: js.Array[CharacterStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterStylesInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSubDocumentById(value: Double => SubDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubDocumentById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMainSubDocument(value: SubDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainSubDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphStylesInfo(value: js.Array[ParagraphStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStylesInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionsInfo(value: js.Array[Section]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpellingInfo(value: SpellingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubDocuments(value: js.Array[SubDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableStylesInfo(value: js.Array[TableStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStylesInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

