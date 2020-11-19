package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides document-specific information such as the author, creation date, and user-defined fields.
  *
  * This service replaces the deprecated DocumentInfo and StandaloneDocumentInfo services.
  * @see XDocumentProperties
  * @see XDocumentPropertiesSupplier
  * @since OOo 3.0
  */
@js.native
trait DocumentProperties extends XDocumentProperties {
  
  /** constructs default-initialized instance */
  def create(): Unit = js.native
}
object DocumentProperties {
  
  @scala.inline
  def apply(
    Author: String,
    AutoloadSecs: Double,
    AutoloadURL: String,
    CreationDate: DateTime,
    DefaultTarget: String,
    Description: String,
    DocumentStatistics: SafeArray[NamedValue],
    EditingCycles: Double,
    EditingDuration: Double,
    Generator: String,
    Keywords: SafeArray[String],
    Language: Locale,
    ModificationDate: DateTime,
    ModifiedBy: String,
    PrintDate: DateTime,
    PrintedBy: String,
    Subject: String,
    TemplateDate: DateTime,
    TemplateName: String,
    TemplateURL: String,
    Title: String,
    UserDefinedProperties: XPropertyContainer,
    create: () => Unit,
    getUserDefinedProperties: () => XPropertyContainer,
    loadFromMedium: (String, SeqEquiv[PropertyValue]) => Unit,
    loadFromStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit,
    resetUserData: String => Unit,
    storeToMedium: (String, SeqEquiv[PropertyValue]) => Unit,
    storeToStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit
  ): DocumentProperties = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], AutoloadSecs = AutoloadSecs.asInstanceOf[js.Any], AutoloadURL = AutoloadURL.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DefaultTarget = DefaultTarget.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DocumentStatistics = DocumentStatistics.asInstanceOf[js.Any], EditingCycles = EditingCycles.asInstanceOf[js.Any], EditingDuration = EditingDuration.asInstanceOf[js.Any], Generator = Generator.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], ModificationDate = ModificationDate.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], PrintDate = PrintDate.asInstanceOf[js.Any], PrintedBy = PrintedBy.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TemplateDate = TemplateDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], UserDefinedProperties = UserDefinedProperties.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), getUserDefinedProperties = js.Any.fromFunction0(getUserDefinedProperties), loadFromMedium = js.Any.fromFunction2(loadFromMedium), loadFromStorage = js.Any.fromFunction2(loadFromStorage), resetUserData = js.Any.fromFunction1(resetUserData), storeToMedium = js.Any.fromFunction2(storeToMedium), storeToStorage = js.Any.fromFunction2(storeToStorage))
    __obj.asInstanceOf[DocumentProperties]
  }
  
  @scala.inline
  implicit class DocumentPropertiesOps[Self <: DocumentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
  }
}
