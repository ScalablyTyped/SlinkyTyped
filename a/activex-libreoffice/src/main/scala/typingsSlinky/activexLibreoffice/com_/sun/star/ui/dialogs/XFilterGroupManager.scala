package typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.StringPair
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies an interface which allows manipulation of groups of filters for the {@link FilePicker} service. */
@js.native
trait XFilterGroupManager extends XInterface {
  
  /**
    * Appends a group of filters to the current filter list.
    *
    * It is implementation dependent how the filter groups are presented to the user. ;  It is not even guaranteed that the groups are visualized:
    * implementations are free to simply append all the filters separately, with ignoring the group title.
    * @param sGroupTitle The title of the filter group. Usually, the caller should localize this title, as it is to be presented to the user.
    * @param aFilters The filters which form a group. Every filter consists of two strings, where the first one is a display name (as for sGroupTitle, it hold
    * @see com.sun.star.ui.dialogs.XFilterManager
    * @see com.sun.star.ui.dialogs.FilePicker
    * @throws com::sun::star::lang::IllegalArgumentException if one or more filters in the given filter list already exist.
    */
  def appendFilterGroup(sGroupTitle: String, aFilters: SeqEquiv[StringPair]): Unit = js.native
}
object XFilterGroupManager {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    appendFilterGroup: (String, SeqEquiv[StringPair]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFilterGroupManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), appendFilterGroup = js.Any.fromFunction2(appendFilterGroup), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFilterGroupManager]
  }
  
  @scala.inline
  implicit class XFilterGroupManagerOps[Self <: XFilterGroupManager] (val x: Self) extends AnyVal {
    
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
    def setAppendFilterGroup(value: (String, SeqEquiv[StringPair]) => Unit): Self = this.set("appendFilterGroup", js.Any.fromFunction2(value))
  }
}
