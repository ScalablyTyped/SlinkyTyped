package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a page style for a text document.
  *
  * This service extends the service {@link com.sun.star.style.PageStyle} with specific properties for text documents.
  */
@js.native
trait TextPageStyle extends StObject {
  
  /**
    * contains the interface to the text of the footer.
    * @see com.sun.star.text.Text
    */
  var FooterText: XText = js.native
  
  /**
    * contains the interface to the text of the footer of a first page.
    * @see com.sun.star.text.Text
    * @since LibreOffice 4.0
    */
  var FooterTextFirst: XText = js.native
  
  /**
    * contains the interface to the text of the footer of a left page.
    * @see com.sun.star.text.Text
    */
  var FooterTextLeft: XText = js.native
  
  /**
    * contains the interface to the text of the footer of a right page.
    * @see com.sun.star.text.Text
    */
  var FooterTextRight: XText = js.native
  
  /**
    * contains the maximum height of the footnote area (in 1/100 mm).
    *
    * If set to zero, the height of the current page is used as limit.
    */
  var FootnoteHeight: Double = js.native
  
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    * @see com.sun.star.text.HorizontalAdjust
    */
  var FootnoteLineAdjust: Double = js.native
  
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: Color = js.native
  
  /** contains the distance between the footnote area and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineDistance: Double = js.native
  
  /** contains the relative width of the separator line between the text and the footnote area (in percent). */
  var FootnoteLineRelativeWidth: Double = js.native
  
  /** contains the distance between the text and the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineTextDistance: Double = js.native
  
  /** contains the weight of the separator line between the text and the footnote area (in 1/100 mm). */
  var FootnoteLineWeight: Double = js.native
  
  /**
    * contains the interface to the text of the header.
    * @see com.sun.star.text.Text
    */
  var HeaderText: XText = js.native
  
  /**
    * contains the interface to the text of the header of first pages.
    * @see com.sun.star.text.Text
    * @since LibreOffice 4.0
    */
  var HeaderTextFirst: XText = js.native
  
  /**
    * contains the interface to the text of the header of left pages.
    * @see com.sun.star.text.Text
    */
  var HeaderTextLeft: XText = js.native
  
  /**
    * contains the interface to the text of the header of right pages.
    * @see com.sun.star.text.Text
    */
  var HeaderTextRight: XText = js.native
  
  /** determines whether the register mode is active on that page. */
  var RegisterModeActive: Boolean = js.native
  
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: String = js.native
  
  /** contains the column settings of the page. */
  var TextColumns: XTextColumns = js.native
}
object TextPageStyle {
  
  @scala.inline
  def apply(
    FooterText: XText,
    FooterTextFirst: XText,
    FooterTextLeft: XText,
    FooterTextRight: XText,
    FootnoteHeight: Double,
    FootnoteLineAdjust: Double,
    FootnoteLineColor: Color,
    FootnoteLineDistance: Double,
    FootnoteLineRelativeWidth: Double,
    FootnoteLineTextDistance: Double,
    FootnoteLineWeight: Double,
    HeaderText: XText,
    HeaderTextFirst: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    TextColumns: XTextColumns
  ): TextPageStyle = {
    val __obj = js.Dynamic.literal(FooterText = FooterText.asInstanceOf[js.Any], FooterTextFirst = FooterTextFirst.asInstanceOf[js.Any], FooterTextLeft = FooterTextLeft.asInstanceOf[js.Any], FooterTextRight = FooterTextRight.asInstanceOf[js.Any], FootnoteHeight = FootnoteHeight.asInstanceOf[js.Any], FootnoteLineAdjust = FootnoteLineAdjust.asInstanceOf[js.Any], FootnoteLineColor = FootnoteLineColor.asInstanceOf[js.Any], FootnoteLineDistance = FootnoteLineDistance.asInstanceOf[js.Any], FootnoteLineRelativeWidth = FootnoteLineRelativeWidth.asInstanceOf[js.Any], FootnoteLineTextDistance = FootnoteLineTextDistance.asInstanceOf[js.Any], FootnoteLineWeight = FootnoteLineWeight.asInstanceOf[js.Any], HeaderText = HeaderText.asInstanceOf[js.Any], HeaderTextFirst = HeaderTextFirst.asInstanceOf[js.Any], HeaderTextLeft = HeaderTextLeft.asInstanceOf[js.Any], HeaderTextRight = HeaderTextRight.asInstanceOf[js.Any], RegisterModeActive = RegisterModeActive.asInstanceOf[js.Any], RegisterParagraphStyle = RegisterParagraphStyle.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPageStyle]
  }
  
  @scala.inline
  implicit class TextPageStyleMutableBuilder[Self <: TextPageStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFooterText(value: XText): Self = StObject.set(x, "FooterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTextFirst(value: XText): Self = StObject.set(x, "FooterTextFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTextLeft(value: XText): Self = StObject.set(x, "FooterTextLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTextRight(value: XText): Self = StObject.set(x, "FooterTextRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteHeight(value: Double): Self = StObject.set(x, "FootnoteHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineAdjust(value: Double): Self = StObject.set(x, "FootnoteLineAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineColor(value: Color): Self = StObject.set(x, "FootnoteLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineDistance(value: Double): Self = StObject.set(x, "FootnoteLineDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineRelativeWidth(value: Double): Self = StObject.set(x, "FootnoteLineRelativeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineTextDistance(value: Double): Self = StObject.set(x, "FootnoteLineTextDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteLineWeight(value: Double): Self = StObject.set(x, "FootnoteLineWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderText(value: XText): Self = StObject.set(x, "HeaderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextFirst(value: XText): Self = StObject.set(x, "HeaderTextFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextLeft(value: XText): Self = StObject.set(x, "HeaderTextLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextRight(value: XText): Self = StObject.set(x, "HeaderTextRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterModeActive(value: Boolean): Self = StObject.set(x, "RegisterModeActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterParagraphStyle(value: String): Self = StObject.set(x, "RegisterParagraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColumns(value: XTextColumns): Self = StObject.set(x, "TextColumns", value.asInstanceOf[js.Any])
  }
}
