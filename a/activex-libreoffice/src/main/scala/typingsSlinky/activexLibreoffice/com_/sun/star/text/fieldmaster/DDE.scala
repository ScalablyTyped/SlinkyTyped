package typingsSlinky.activexLibreoffice.com_.sun.star.text.fieldmaster

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextFieldMaster
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XDependentTextField
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a {@link DDE} field master.
  * @see com.sun.star.text.TextField
  */
@js.native
trait DDE extends TextFieldMaster {
  /** contains the content. */
  var Content: String = js.native
  /** contains the element string of the {@link DDE} command. */
  var DDECommandElement: String = js.native
  /** contains the file string of the {@link DDE} command. */
  var DDECommandFile: String = js.native
  /** contains the type string of the {@link DDE} command. */
  var DDECommandType: String = js.native
  /** determines whether {@link DDE} link is updated automatically. */
  var IsAutomaticUpdate: Boolean = js.native
}

object DDE {
  @scala.inline
  def apply(
    Content: String,
    DDECommandElement: String,
    DDECommandFile: String,
    DDECommandType: String,
    DependentTextFields: SafeArray[XDependentTextField],
    InstanceName: String,
    IsAutomaticUpdate: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DDE = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], DDECommandElement = DDECommandElement.asInstanceOf[js.Any], DDECommandFile = DDECommandFile.asInstanceOf[js.Any], DDECommandType = DDECommandType.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], IsAutomaticUpdate = IsAutomaticUpdate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DDE]
  }
  @scala.inline
  implicit class DDEOps[Self <: DDE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDDECommandElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DDECommandElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDDECommandFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DDECommandFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDDECommandType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DDECommandType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAutomaticUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAutomaticUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

