package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the standard model of an {@link UnoControlImageControl} . */
@js.native
trait UnoControlImageControlModel extends UnoControlModel {
  
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: Color = js.native
  
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double = js.native
  
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double = js.native
  
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  
  /**
    * specifies a graphic to be displayed on the control
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.1
    */
  var Graphic: XGraphic = js.native
  
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  
  /**
    * specifies an URL to an image to use for the control.
    * @see Graphic
    */
  var ImageURL: String = js.native
  
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  
  /** specifies if the image is automatically scaled to the size of the control. */
  var ScaleImage: Boolean = js.native
  
  /**
    * defines how to scale the image
    *
    * If this property is present, it supersedes the {@link ScaleImage} property.
    *
    * The value of this property is one of the {@link ImageScaleMode} constants.
    * @since OOo 3.1
    */
  var ScaleMode: Double = js.native
  
  /**
    * specifies that the control can be reached with the TAB key.
    * @since OOo 1.1.2
    */
  var Tabstop: Boolean = js.native
}
object UnoControlImageControlModel {
  
  @scala.inline
  def apply(
    BackgroundColor: Color,
    Border: Double,
    BorderColor: Double,
    DefaultControl: String,
    Enabled: Boolean,
    Graphic: XGraphic,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    ImageURL: String,
    Name: String,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ScaleImage: Boolean,
    ScaleMode: Double,
    ServiceName: String,
    Step: Double,
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
    Width: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    read: XObjectInputStream => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit,
    write: XObjectOutputStream => Unit
  ): UnoControlImageControlModel = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], ImageURL = ImageURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ScaleImage = ScaleImage.asInstanceOf[js.Any], ScaleMode = ScaleMode.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tabstop = Tabstop.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[UnoControlImageControlModel]
  }
  
  @scala.inline
  implicit class UnoControlImageControlModelOps[Self <: UnoControlImageControlModel] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Color): Self = this.set("BackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Double): Self = this.set("Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: Double): Self = this.set("BorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphic(value: XGraphic): Self = this.set("Graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpText(value: String): Self = this.set("HelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpURL(value: String): Self = this.set("HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageURL(value: String): Self = this.set("ImageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintable(value: Boolean): Self = this.set("Printable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleImage(value: Boolean): Self = this.set("ScaleImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleMode(value: Double): Self = this.set("ScaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabstop(value: Boolean): Self = this.set("Tabstop", value.asInstanceOf[js.Any])
  }
}
