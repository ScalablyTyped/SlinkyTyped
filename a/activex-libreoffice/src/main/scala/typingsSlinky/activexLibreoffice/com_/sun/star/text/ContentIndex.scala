package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of content indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
@js.native
trait ContentIndex extends BaseIndex {
  /** contains `TRUE` if the document index marks are included in this index. */
  var CreateFromMarks: Boolean = js.native
  /** determines if the document index is created from outlines. */
  var CreateFromOutline: Boolean = js.native
  /** determines the depth of outline levels that are included into the content index. */
  var Level: Double = js.native
  /**
    * contains the interface to access the paragraph style names that are included in this index.
    * @see DocumentIndexParagraphStyles
    */
  var LevelParagraphStyles: XIndexReplace = js.native
}

object ContentIndex {
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
    CreateFromMarks: Boolean,
    CreateFromOutline: Boolean,
    HeaderSection: XTextSection,
    IsProtected: Boolean,
    Level: Double,
    LevelFormat: XIndexReplace,
    LevelParagraphStyles: XIndexReplace,
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
  ): ContentIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], ContentSection = ContentSection.asInstanceOf[js.Any], CreateFromChapter = CreateFromChapter.asInstanceOf[js.Any], CreateFromMarks = CreateFromMarks.asInstanceOf[js.Any], CreateFromOutline = CreateFromOutline.asInstanceOf[js.Any], HeaderSection = HeaderSection.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], LevelFormat = LevelFormat.asInstanceOf[js.Any], LevelParagraphStyles = LevelParagraphStyles.asInstanceOf[js.Any], ParaStyleHeading = ParaStyleHeading.asInstanceOf[js.Any], ParaStyleLevel1 = ParaStyleLevel1.asInstanceOf[js.Any], ParaStyleLevel10 = ParaStyleLevel10.asInstanceOf[js.Any], ParaStyleLevel2 = ParaStyleLevel2.asInstanceOf[js.Any], ParaStyleLevel3 = ParaStyleLevel3.asInstanceOf[js.Any], ParaStyleLevel4 = ParaStyleLevel4.asInstanceOf[js.Any], ParaStyleLevel5 = ParaStyleLevel5.asInstanceOf[js.Any], ParaStyleLevel6 = ParaStyleLevel6.asInstanceOf[js.Any], ParaStyleLevel7 = ParaStyleLevel7.asInstanceOf[js.Any], ParaStyleLevel8 = ParaStyleLevel8.asInstanceOf[js.Any], ParaStyleLevel9 = ParaStyleLevel9.asInstanceOf[js.Any], ParaStyleSeparator = ParaStyleSeparator.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[ContentIndex]
  }
  @scala.inline
  implicit class ContentIndexOps[Self <: ContentIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFromMarks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateFromMarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFromOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateFromOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelParagraphStyles(value: XIndexReplace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelParagraphStyles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

