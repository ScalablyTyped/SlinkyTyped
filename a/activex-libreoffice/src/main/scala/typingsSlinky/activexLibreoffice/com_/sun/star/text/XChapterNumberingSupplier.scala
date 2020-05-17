package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the settings of the chapter numbering in a text document. */
@js.native
trait XChapterNumberingSupplier extends XInterface {
  /** @returns the collection of numbering rules for this document.  This interface allows access to the properties of the numbering level via a sequence of {@l */
  val ChapterNumberingRules: XIndexReplace = js.native
  /** @returns the collection of numbering rules for this document.  This interface allows access to the properties of the numbering level via a sequence of {@l */
  def getChapterNumberingRules(): XIndexReplace = js.native
}

object XChapterNumberingSupplier {
  @scala.inline
  def apply(
    ChapterNumberingRules: XIndexReplace,
    acquire: () => Unit,
    getChapterNumberingRules: () => XIndexReplace,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChapterNumberingSupplier = {
    val __obj = js.Dynamic.literal(ChapterNumberingRules = ChapterNumberingRules.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getChapterNumberingRules = js.Any.fromFunction0(getChapterNumberingRules), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XChapterNumberingSupplier]
  }
  @scala.inline
  implicit class XChapterNumberingSupplierOps[Self <: XChapterNumberingSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChapterNumberingRules(value: XIndexReplace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChapterNumberingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetChapterNumberingRules(value: () => XIndexReplace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChapterNumberingRules")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

