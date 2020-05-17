package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a string replace operation. */
@js.native
trait XReplaceDescriptor extends XSearchDescriptor {
  /** @returns the string which replaces the found occurrences. */
  var ReplaceString: String = js.native
  /** @returns the string which replaces the found occurrences. */
  def getReplaceString(): String = js.native
  /** sets the string which replaces the found occurrences. */
  def setReplaceString(aReplaceString: String): Unit = js.native
}

object XReplaceDescriptor {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    ReplaceString: String,
    SearchString: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getReplaceString: () => String,
    getSearchString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setReplaceString: String => Unit,
    setSearchString: String => Unit
  ): XReplaceDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReplaceString = ReplaceString.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReplaceString = js.Any.fromFunction0(getReplaceString), getSearchString = js.Any.fromFunction0(getSearchString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setReplaceString = js.Any.fromFunction1(setReplaceString), setSearchString = js.Any.fromFunction1(setSearchString))
    __obj.asInstanceOf[XReplaceDescriptor]
  }
  @scala.inline
  implicit class XReplaceDescriptorOps[Self <: XReplaceDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplaceString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReplaceString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReplaceString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetReplaceString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReplaceString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

