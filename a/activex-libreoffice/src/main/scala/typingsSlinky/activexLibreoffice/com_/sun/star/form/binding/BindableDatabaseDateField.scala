package typingsSlinky.activexLibreoffice.com_.sun.star.form.binding

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseDateField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a date input field which is data-aware and thus can be bound to a database field, and additionally supports binding to
  * arbitrary external values.
  *
  * If an {@link com.sun.star.form.binding.ValueBinding} instance is set at the field, it will exchange it's content with the binding as {@link
  * com.sun.star.util.Date} .
  * @see com.sun.star.form.binding.XValueBinding.supportsType
  * @see com.sun.star.awt.UnoControlDateFieldModel.Date
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
- typingsSlinky.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
trait BindableDatabaseDateField
  extends DatabaseDateField
     with XBindableValue {
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

