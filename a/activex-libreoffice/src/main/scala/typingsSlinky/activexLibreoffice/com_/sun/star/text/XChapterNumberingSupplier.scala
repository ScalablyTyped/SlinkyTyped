package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XChapterNumberingSupplierMutableBuilder[Self <: XChapterNumberingSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChapterNumberingRules(value: XIndexReplace): Self = StObject.set(x, "ChapterNumberingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChapterNumberingRules(value: () => XIndexReplace): Self = StObject.set(x, "getChapterNumberingRules", js.Any.fromFunction0(value))
  }
}
