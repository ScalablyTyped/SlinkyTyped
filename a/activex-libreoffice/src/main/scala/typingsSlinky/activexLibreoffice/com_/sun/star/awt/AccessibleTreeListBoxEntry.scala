package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.TextSegment
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleAction
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventBroadcaster
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleKeyBinding
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleSelection
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleText
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies accessibility support for a treelistbox entry.
  * @see com.sun.star.accessibility.AccessibleContext
  * @see com.sun.star.accessibility.XAccessibleAction
  * @see com.sun.star.accessibility.XAccessibleSelection
  * @see com.sun.star.accessibility.XAccessibleText
  * @since OOo 1.1.2
  */
@js.native
trait AccessibleTreeListBoxEntry
  extends XAccessibleContext
     with XAccessibleEventBroadcaster
     with XAccessibleComponent
     with XAccessibleAction
     with XAccessibleSelection
     with XAccessibleText
object AccessibleTreeListBoxEntry {
  
  @scala.inline
  def apply(
    AccessibleActionCount: Double,
    AccessibleChildCount: Double,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Background: Color,
    Bounds: Rectangle,
    CaretPosition: Double,
    CharacterCount: Double,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    SelectedAccessibleChildCount: Double,
    SelectedText: String,
    SelectionEnd: Double,
    SelectionStart: Double,
    Size: Size,
    Text: String,
    acquire: () => Unit,
    addAccessibleEventListener: XAccessibleEventListener => Unit,
    clearAccessibleSelection: () => Unit,
    containsPoint: Point => Boolean,
    copyText: (Double, Double) => Boolean,
    deselectAccessibleChild: Double => Unit,
    doAccessibleAction: Double => Boolean,
    getAccessibleActionCount: () => Double,
    getAccessibleActionDescription: Double => String,
    getAccessibleActionKeyBinding: Double => XAccessibleKeyBinding,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: () => Double,
    getAccessibleDescription: () => String,
    getAccessibleIndexInParent: () => Double,
    getAccessibleName: () => String,
    getAccessibleParent: () => XAccessible,
    getAccessibleRelationSet: () => XAccessibleRelationSet,
    getAccessibleRole: () => Double,
    getAccessibleStateSet: () => XAccessibleStateSet,
    getBackground: () => Color,
    getBounds: () => Rectangle,
    getCaretPosition: () => Double,
    getCharacter: Double => String,
    getCharacterAttributes: (Double, SeqEquiv[String]) => SafeArray[PropertyValue],
    getCharacterBounds: Double => Rectangle,
    getCharacterCount: () => Double,
    getForeground: () => Color,
    getIndexAtPoint: Point => Double,
    getLocale: () => Locale,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getSelectedAccessibleChild: Double => XAccessible,
    getSelectedAccessibleChildCount: () => Double,
    getSelectedText: () => String,
    getSelectionEnd: () => Double,
    getSelectionStart: () => Double,
    getSize: () => Size,
    getText: () => String,
    getTextAtIndex: (Double, Double) => TextSegment,
    getTextBeforeIndex: (Double, Double) => TextSegment,
    getTextBehindIndex: (Double, Double) => TextSegment,
    getTextRange: (Double, Double) => String,
    grabFocus: () => Unit,
    isAccessibleChildSelected: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAccessibleEventListener: XAccessibleEventListener => Unit,
    selectAccessibleChild: Double => Unit,
    selectAllAccessibleChildren: () => Unit,
    setCaretPosition: Double => Boolean,
    setSelection: (Double, Double) => Boolean
  ): AccessibleTreeListBoxEntry = {
    val __obj = js.Dynamic.literal(AccessibleActionCount = AccessibleActionCount.asInstanceOf[js.Any], AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], CaretPosition = CaretPosition.asInstanceOf[js.Any], CharacterCount = CharacterCount.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], SelectedAccessibleChildCount = SelectedAccessibleChildCount.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], SelectionEnd = SelectionEnd.asInstanceOf[js.Any], SelectionStart = SelectionStart.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), clearAccessibleSelection = js.Any.fromFunction0(clearAccessibleSelection), containsPoint = js.Any.fromFunction1(containsPoint), copyText = js.Any.fromFunction2(copyText), deselectAccessibleChild = js.Any.fromFunction1(deselectAccessibleChild), doAccessibleAction = js.Any.fromFunction1(doAccessibleAction), getAccessibleActionCount = js.Any.fromFunction0(getAccessibleActionCount), getAccessibleActionDescription = js.Any.fromFunction1(getAccessibleActionDescription), getAccessibleActionKeyBinding = js.Any.fromFunction1(getAccessibleActionKeyBinding), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getCaretPosition = js.Any.fromFunction0(getCaretPosition), getCharacter = js.Any.fromFunction1(getCharacter), getCharacterAttributes = js.Any.fromFunction2(getCharacterAttributes), getCharacterBounds = js.Any.fromFunction1(getCharacterBounds), getCharacterCount = js.Any.fromFunction0(getCharacterCount), getForeground = js.Any.fromFunction0(getForeground), getIndexAtPoint = js.Any.fromFunction1(getIndexAtPoint), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = js.Any.fromFunction0(getSelectedAccessibleChildCount), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelectionEnd = js.Any.fromFunction0(getSelectionEnd), getSelectionStart = js.Any.fromFunction0(getSelectionStart), getSize = js.Any.fromFunction0(getSize), getText = js.Any.fromFunction0(getText), getTextAtIndex = js.Any.fromFunction2(getTextAtIndex), getTextBeforeIndex = js.Any.fromFunction2(getTextBeforeIndex), getTextBehindIndex = js.Any.fromFunction2(getTextBehindIndex), getTextRange = js.Any.fromFunction2(getTextRange), grabFocus = js.Any.fromFunction0(grabFocus), isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), selectAccessibleChild = js.Any.fromFunction1(selectAccessibleChild), selectAllAccessibleChildren = js.Any.fromFunction0(selectAllAccessibleChildren), setCaretPosition = js.Any.fromFunction1(setCaretPosition), setSelection = js.Any.fromFunction2(setSelection))
    __obj.asInstanceOf[AccessibleTreeListBoxEntry]
  }
}
