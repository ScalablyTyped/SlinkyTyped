package typingsSlinky.activexLibreoffice.com_.sun.star.image

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameReplace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this service describes a circular-shaped region inside a HTML image map.
  * @see ImageMap
  * @see ImageMapObject
  */
@js.native
trait ImageMapCircleObject extends ImageMapObject {
  
  /** This is the center point of the circle in pixels */
  var Center: Point = js.native
  
  /** This is the radius of the circle in pixels */
  var Radius: Double = js.native
}
object ImageMapCircleObject {
  
  @scala.inline
  def apply(
    Center: Point,
    Description: String,
    Events: XNameReplace,
    IsActive: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    Radius: Double,
    Target: String,
    URL: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getEvents: () => XNameReplace,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ImageMapCircleObject = {
    val __obj = js.Dynamic.literal(Center = Center.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getEvents = js.Any.fromFunction0(getEvents), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ImageMapCircleObject]
  }
  
  @scala.inline
  implicit class ImageMapCircleObjectOps[Self <: ImageMapCircleObject] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: Point): Self = this.set("Center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("Radius", value.asInstanceOf[js.Any])
  }
}
