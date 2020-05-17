package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enables a sheet to refer to another sheet in a different document.
  *
  * To insert a sheet link, the sheet used as linked sheet has to exist already. The method {@link XSheetLinkable.link()} creates a {@link SheetLink}
  * object in the document's {@link SheetLinks} collection and links the sheet to the specified external sheet.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.SheetLinks
  * @see com.sun.star.sheet.SheetLink
  */
@js.native
trait XSheetLinkable extends XInterface {
  /**
    * returns the link mode of the spreadsheet.
    *
    * If the returned value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMode::VALUE, only results of formulas are used.
    */
  var LinkMode: SheetLinkMode = js.native
  /** returns the sheet name of the sheet in the source document. */
  var LinkSheetName: String = js.native
  /** returns the target URL of the link. */
  var LinkUrl: String = js.native
  /**
    * returns the link mode of the spreadsheet.
    *
    * If the returned value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMode::VALUE, only results of formulas are used.
    */
  def getLinkMode(): SheetLinkMode = js.native
  /** returns the sheet name of the sheet in the source document. */
  def getLinkSheetName(): String = js.native
  /** returns the target URL of the link. */
  def getLinkUrl(): String = js.native
  /**
    * links the sheet to another sheet in another document.
    *
    * A {@link SheetLink} object is created if it does not exist, and the link mode, the URL of the linked document and the linked sheet name are set.
    */
  def link(
    aUrl: String,
    aSheetName: String,
    aFilterName: String,
    aFilterOptions: String,
    nMode: SheetLinkMode
  ): Unit = js.native
  /**
    * enables the linking of the sheet and controls whether formulas are copied.
    * @param nLinkMode the value specifying the link mode for this spreadsheet.  If the value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMod
    */
  def setLinkMode(nLinkMode: SheetLinkMode): Unit = js.native
  /**
    * sets the name of the linked sheet in the source document.
    *
    * This method sets the sheet name in the {@link SheetLink} object, it does not modify the sheet name in the source document.
    */
  def setLinkSheetName(aLinkSheetName: String): Unit = js.native
  /**
    * sets the target URL of the link.
    *
    * A {@link SheetLink} object with the same file name must exist already or the link will not work.
    */
  def setLinkUrl(aLinkUrl: String): Unit = js.native
}

object XSheetLinkable {
  @scala.inline
  def apply(
    LinkMode: SheetLinkMode,
    LinkSheetName: String,
    LinkUrl: String,
    acquire: () => Unit,
    getLinkMode: () => SheetLinkMode,
    getLinkSheetName: () => String,
    getLinkUrl: () => String,
    link: (String, String, String, String, SheetLinkMode) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLinkMode: SheetLinkMode => Unit,
    setLinkSheetName: String => Unit,
    setLinkUrl: String => Unit
  ): XSheetLinkable = {
    val __obj = js.Dynamic.literal(LinkMode = LinkMode.asInstanceOf[js.Any], LinkSheetName = LinkSheetName.asInstanceOf[js.Any], LinkUrl = LinkUrl.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLinkMode = js.Any.fromFunction0(getLinkMode), getLinkSheetName = js.Any.fromFunction0(getLinkSheetName), getLinkUrl = js.Any.fromFunction0(getLinkUrl), link = js.Any.fromFunction5(link), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLinkMode = js.Any.fromFunction1(setLinkMode), setLinkSheetName = js.Any.fromFunction1(setLinkSheetName), setLinkUrl = js.Any.fromFunction1(setLinkUrl))
    __obj.asInstanceOf[XSheetLinkable]
  }
  @scala.inline
  implicit class XSheetLinkableOps[Self <: XSheetLinkable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkMode(value: SheetLinkMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkSheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLinkMode(value: () => SheetLinkMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinkMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLinkSheetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinkSheetName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLinkUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinkUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLink(value: (String, String, String, String, SheetLinkMode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetLinkMode(value: SheetLinkMode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLinkMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLinkSheetName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLinkSheetName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLinkUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLinkUrl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

