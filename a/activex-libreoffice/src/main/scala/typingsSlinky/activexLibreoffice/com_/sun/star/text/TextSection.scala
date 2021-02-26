package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyState
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link TextSection} is a range of complete paragraphs within a text.
  *
  * The content of the section may be the content of a link into another document, a link from the same document, or the result of a DDE operation.
  *
  * {@link TextSection} instances can be linked from and to other texts.
  */
@js.native
trait TextSection
  extends TextContent
     with UserDefinedAttributesSupplier
     with XTextSection
     with XNamed
     with XPropertySet
     with XPropertyState {
  
  /** contains the name of the file filter for the background graphic. */
  var BackGraphicFilter: String = js.native
  
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: GraphicLocation = js.native
  
  /** contains the URL for the background graphic. */
  var BackGraphicURL: String = js.native
  
  /**
    * This property contains a conditional expression.
    *
    * If the result of the conditional expression is `TRUE` and the property {@link TextSection.IsVisible} is `FALSE` , then the section is hidden.
    */
  var Condition: String = js.native
  
  /**
    * specifies the source element of the command string for a DDE operation.
    *
    * The element can be i.e. a name of a cell in a sheet or a bookmark.
    */
  var DDECommandElement: String = js.native
  
  /** specifies the source file name of the command string for a DDE operation. */
  var DDECommandFile: String = js.native
  
  /**
    * specifies the type of the command string for a DDE operation.
    *
    * The type can be the name of the application that provides a DDE source.
    */
  var DDECommandType: String = js.native
  
  /** determines whether endnotes inside the section are displayed at the end of the section text. */
  var EndnoteIsCollectAtTextEnd: Boolean = js.native
  
  /** determines whether the endnotes within the section use an own numbering format. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteIsOwnNumbering: Boolean = js.native
  
  /** determines whether the endnotes numbering restarts within the section. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteIsRestartNumbering: Boolean = js.native
  
  /** determines the prefix that is display before the endnote number. This is only valid if `EndnoteIsOwnNumbering` is set. */
  var EndnoteNumberingPrefix: String = js.native
  
  /** determines the suffix that is display after the endnote number. This is only valid if `EndnoteIsOwnNumbering` is set. */
  var EndnoteNumberingSuffix: String = js.native
  
  /**
    * determines the numbering type of the endnote numbering as a value of {@link com.sun.star.style.NumberingType} . This is only valid if
    * `EndoteIsOwnNumbering` is set.
    */
  var EndnoteNumberingType: Double = js.native
  
  /** determines at which number the endnote numbering inside of the section starts. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteRestartNumberingAt: Double = js.native
  
  /** If this property is set, then the content of the section is read from the specified document. */
  var FileLink: SectionFileLink = js.native
  
  /** determines whether footnotes inside the section are displayed at the end of the section text. */
  var FootnoteIsCollectAtTextEnd: Boolean = js.native
  
  /** determines whether the footnotes within the section use an own numbering format. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteIsOwnNumbering: Boolean = js.native
  
  /** determines whether the footnotes numbering restarts within the section. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteIsRestartNumbering: Boolean = js.native
  
  /** determines the prefix that is display before the footnote number. This is only valid if `FootnoteIsOwnNumbering` is set. */
  var FootnoteNumberingPrefix: String = js.native
  
  /** determines the suffix that is display after of the footnote number. This is only valid if `FootnoteIsOwnNumbering` is set. */
  var FootnoteNumberingSuffix: String = js.native
  
  /**
    * determines the numbering type of the footnote numbering as a value of {@link com.sun.star.style.NumberingType} . This is only valid if
    * `FootnoteIsOwnNumbering` is set.
    */
  var FootnoteNumberingType: Double = js.native
  
  /** determines at which number the footnote numbering inside of the section starts. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteRestartNumberingAt: Double = js.native
  
  /** determines if a DDE link is updated automatically. */
  var IsAutomaticUpdate: Boolean = js.native
  
  /** If this property is `TRUE` , the text section is protected and cannot be modified from the user interface. */
  var IsProtected: Boolean = js.native
  
  /** If this property is `FALSE` , the text section is hidden. */
  var IsVisible: Boolean = js.native
  
  /**
    * specifies the source of a file link in the document that is specified in {@link TextSection.FileLink} .
    *
    * The source may be a text section or a bookmark. If {@link TextSection.FileLink} is empty, then the current document is searched for the source. If
    * this property is empty and {@link TextSection.FileLink} is set, then the complete document content is linked into this section.
    */
  var LinkRegion: String = js.native
  
  /** determines the left margin of the section */
  var SectionLeftMargin: Double = js.native
  
  /** determines the left margin of the section */
  var SectionRightMargin: Double = js.native
  
  /** allows columns to be set into the text section */
  var TextColumns: XTextColumns = js.native
}
object TextSection {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    ChildSections: SafeArray[XTextSection],
    Condition: String,
    DDECommandElement: String,
    DDECommandFile: String,
    DDECommandType: String,
    EndnoteIsCollectAtTextEnd: Boolean,
    EndnoteIsOwnNumbering: Boolean,
    EndnoteIsRestartNumbering: Boolean,
    EndnoteNumberingPrefix: String,
    EndnoteNumberingSuffix: String,
    EndnoteNumberingType: Double,
    EndnoteRestartNumberingAt: Double,
    FileLink: SectionFileLink,
    FootnoteIsCollectAtTextEnd: Boolean,
    FootnoteIsOwnNumbering: Boolean,
    FootnoteIsRestartNumbering: Boolean,
    FootnoteNumberingPrefix: String,
    FootnoteNumberingSuffix: String,
    FootnoteNumberingType: Double,
    FootnoteRestartNumberingAt: Double,
    IsAutomaticUpdate: Boolean,
    IsProtected: Boolean,
    IsVisible: Boolean,
    LinkRegion: String,
    Name: String,
    ParentSection: XTextSection,
    PropertySetInfo: XPropertySetInfo,
    SectionLeftMargin: Double,
    SectionRightMargin: Double,
    TextColumns: XTextColumns,
    TextWrap: WrapTextMode,
    UserDefinedAttributes: XNameContainer,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getChildSections: () => SafeArray[XTextSection],
    getName: () => String,
    getParentSection: () => XTextSection,
    getPropertyDefault: String => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyToDefault: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TextSection = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], ChildSections = ChildSections.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], DDECommandElement = DDECommandElement.asInstanceOf[js.Any], DDECommandFile = DDECommandFile.asInstanceOf[js.Any], DDECommandType = DDECommandType.asInstanceOf[js.Any], EndnoteIsCollectAtTextEnd = EndnoteIsCollectAtTextEnd.asInstanceOf[js.Any], EndnoteIsOwnNumbering = EndnoteIsOwnNumbering.asInstanceOf[js.Any], EndnoteIsRestartNumbering = EndnoteIsRestartNumbering.asInstanceOf[js.Any], EndnoteNumberingPrefix = EndnoteNumberingPrefix.asInstanceOf[js.Any], EndnoteNumberingSuffix = EndnoteNumberingSuffix.asInstanceOf[js.Any], EndnoteNumberingType = EndnoteNumberingType.asInstanceOf[js.Any], EndnoteRestartNumberingAt = EndnoteRestartNumberingAt.asInstanceOf[js.Any], FileLink = FileLink.asInstanceOf[js.Any], FootnoteIsCollectAtTextEnd = FootnoteIsCollectAtTextEnd.asInstanceOf[js.Any], FootnoteIsOwnNumbering = FootnoteIsOwnNumbering.asInstanceOf[js.Any], FootnoteIsRestartNumbering = FootnoteIsRestartNumbering.asInstanceOf[js.Any], FootnoteNumberingPrefix = FootnoteNumberingPrefix.asInstanceOf[js.Any], FootnoteNumberingSuffix = FootnoteNumberingSuffix.asInstanceOf[js.Any], FootnoteNumberingType = FootnoteNumberingType.asInstanceOf[js.Any], FootnoteRestartNumberingAt = FootnoteRestartNumberingAt.asInstanceOf[js.Any], IsAutomaticUpdate = IsAutomaticUpdate.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], LinkRegion = LinkRegion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParentSection = ParentSection.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SectionLeftMargin = SectionLeftMargin.asInstanceOf[js.Any], SectionRightMargin = SectionRightMargin.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getChildSections = js.Any.fromFunction0(getChildSections), getName = js.Any.fromFunction0(getName), getParentSection = js.Any.fromFunction0(getParentSection), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TextSection]
  }
  
  @scala.inline
  implicit class TextSectionMutableBuilder[Self <: TextSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackGraphicFilter(value: String): Self = StObject.set(x, "BackGraphicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "BackGraphicLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackGraphicURL(value: String): Self = StObject.set(x, "BackGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDDECommandElement(value: String): Self = StObject.set(x, "DDECommandElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDDECommandFile(value: String): Self = StObject.set(x, "DDECommandFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDDECommandType(value: String): Self = StObject.set(x, "DDECommandType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndnoteIsCollectAtTextEnd(value: Boolean): Self = StObject.set(x, "EndnoteIsCollectAtTextEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndnoteIsOwnNumbering(value: Boolean): Self = StObject.set(x, "EndnoteIsOwnNumbering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndnoteIsRestartNumbering(value: Boolean): Self = StObject.set(x, "EndnoteIsRestartNumbering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndnoteNumberingPrefix(value: String): Self = StObject.set(x, "EndnoteNumberingPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndnoteNumberingSuffix(value: String): Self = StObject.set(x, "EndnoteNumberingSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndnoteNumberingType(value: Double): Self = StObject.set(x, "EndnoteNumberingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndnoteRestartNumberingAt(value: Double): Self = StObject.set(x, "EndnoteRestartNumberingAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileLink(value: SectionFileLink): Self = StObject.set(x, "FileLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteIsCollectAtTextEnd(value: Boolean): Self = StObject.set(x, "FootnoteIsCollectAtTextEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteIsOwnNumbering(value: Boolean): Self = StObject.set(x, "FootnoteIsOwnNumbering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteIsRestartNumbering(value: Boolean): Self = StObject.set(x, "FootnoteIsRestartNumbering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteNumberingPrefix(value: String): Self = StObject.set(x, "FootnoteNumberingPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteNumberingSuffix(value: String): Self = StObject.set(x, "FootnoteNumberingSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteNumberingType(value: Double): Self = StObject.set(x, "FootnoteNumberingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteRestartNumberingAt(value: Double): Self = StObject.set(x, "FootnoteRestartNumberingAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutomaticUpdate(value: Boolean): Self = StObject.set(x, "IsAutomaticUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsProtected(value: Boolean): Self = StObject.set(x, "IsProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkRegion(value: String): Self = StObject.set(x, "LinkRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionLeftMargin(value: Double): Self = StObject.set(x, "SectionLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionRightMargin(value: Double): Self = StObject.set(x, "SectionRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColumns(value: XTextColumns): Self = StObject.set(x, "TextColumns", value.asInstanceOf[js.Any])
  }
}
