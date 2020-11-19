package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XControlAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XViewSettingsSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the view of a {@link TextDocument} . */
@js.native
trait TextDocumentView
  extends XSelectionSupplier
     with XViewSettingsSupplier
     with XControlAccess
     with XTextViewCursorSupplier
     with XPropertySet {
  
  /**
    * specifies if spell checking should be done while typing.
    * @since OOo 2.0
    */
  var IsConstantSpellcheck: Boolean = js.native
  
  /**
    * specifies if the marks for misspelled text should be displayed.
    * @since OOo 2.0
    */
  var IsHideSpellMarks: Boolean = js.native
  
  /**
    * returns the number of lines in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    *
    * Empty paragraphs are not counted.
    * @since OOo 2.0
    */
  var LineCount: Double = js.native
  
  /**
    * returns the number of pages in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    * @since OOo 2.0
    */
  var PageCount: Double = js.native
}
object TextDocumentView {
  
  @scala.inline
  def apply(
    IsConstantSpellcheck: Boolean,
    IsHideSpellMarks: Boolean,
    LineCount: Double,
    PageCount: Double,
    PropertySetInfo: XPropertySetInfo,
    Selection: js.Any,
    ViewCursor: XTextViewCursor,
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getControl: XControlModel => XControl,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSelection: () => js.Any,
    getViewCursor: () => XTextViewCursor,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    select: js.Any => Boolean,
    setPropertyValue: (String, js.Any) => Unit
  ): TextDocumentView = {
    val __obj = js.Dynamic.literal(IsConstantSpellcheck = IsConstantSpellcheck.asInstanceOf[js.Any], IsHideSpellMarks = IsHideSpellMarks.asInstanceOf[js.Any], LineCount = LineCount.asInstanceOf[js.Any], PageCount = PageCount.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], ViewCursor = ViewCursor.asInstanceOf[js.Any], ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getControl = js.Any.fromFunction1(getControl), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSelection = js.Any.fromFunction0(getSelection), getViewCursor = js.Any.fromFunction0(getViewCursor), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), select = js.Any.fromFunction1(select), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TextDocumentView]
  }
  
  @scala.inline
  implicit class TextDocumentViewOps[Self <: TextDocumentView] (val x: Self) extends AnyVal {
    
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
    def setIsConstantSpellcheck(value: Boolean): Self = this.set("IsConstantSpellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHideSpellMarks(value: Boolean): Self = this.set("IsHideSpellMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCount(value: Double): Self = this.set("LineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCount(value: Double): Self = this.set("PageCount", value.asInstanceOf[js.Any])
  }
}
