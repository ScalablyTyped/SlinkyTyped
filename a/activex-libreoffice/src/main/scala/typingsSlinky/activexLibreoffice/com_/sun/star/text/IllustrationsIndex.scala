package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of illustration indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
@js.native
trait IllustrationsIndex extends BaseIndex {
  
  var CreateFromLabels: Boolean = js.native
  
  var LabelCategory: String = js.native
  
  var LabelDisplayType: Double = js.native
}
object IllustrationsIndex {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    ContentSection: XTextSection,
    CreateFromChapter: Boolean,
    CreateFromLabels: Boolean,
    HeaderSection: XTextSection,
    IsProtected: Boolean,
    LabelCategory: String,
    LabelDisplayType: Double,
    LevelFormat: XIndexReplace,
    ParaStyleHeading: String,
    ParaStyleLevel1: String,
    ParaStyleLevel10: String,
    ParaStyleLevel2: String,
    ParaStyleLevel3: String,
    ParaStyleLevel4: String,
    ParaStyleLevel5: String,
    ParaStyleLevel6: String,
    ParaStyleLevel7: String,
    ParaStyleLevel8: String,
    ParaStyleLevel9: String,
    ParaStyleSeparator: String,
    ServiceName: String,
    TextColumns: XTextColumns,
    Title: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addRefreshListener: XRefreshListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    update: () => Unit
  ): IllustrationsIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], ContentSection = ContentSection.asInstanceOf[js.Any], CreateFromChapter = CreateFromChapter.asInstanceOf[js.Any], CreateFromLabels = CreateFromLabels.asInstanceOf[js.Any], HeaderSection = HeaderSection.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], LabelCategory = LabelCategory.asInstanceOf[js.Any], LabelDisplayType = LabelDisplayType.asInstanceOf[js.Any], LevelFormat = LevelFormat.asInstanceOf[js.Any], ParaStyleHeading = ParaStyleHeading.asInstanceOf[js.Any], ParaStyleLevel1 = ParaStyleLevel1.asInstanceOf[js.Any], ParaStyleLevel10 = ParaStyleLevel10.asInstanceOf[js.Any], ParaStyleLevel2 = ParaStyleLevel2.asInstanceOf[js.Any], ParaStyleLevel3 = ParaStyleLevel3.asInstanceOf[js.Any], ParaStyleLevel4 = ParaStyleLevel4.asInstanceOf[js.Any], ParaStyleLevel5 = ParaStyleLevel5.asInstanceOf[js.Any], ParaStyleLevel6 = ParaStyleLevel6.asInstanceOf[js.Any], ParaStyleLevel7 = ParaStyleLevel7.asInstanceOf[js.Any], ParaStyleLevel8 = ParaStyleLevel8.asInstanceOf[js.Any], ParaStyleLevel9 = ParaStyleLevel9.asInstanceOf[js.Any], ParaStyleSeparator = ParaStyleSeparator.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[IllustrationsIndex]
  }
  
  @scala.inline
  implicit class IllustrationsIndexMutableBuilder[Self <: IllustrationsIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateFromLabels(value: Boolean): Self = StObject.set(x, "CreateFromLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCategory(value: String): Self = StObject.set(x, "LabelCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDisplayType(value: Double): Self = StObject.set(x, "LabelDisplayType", value.asInstanceOf[js.Any])
  }
}
