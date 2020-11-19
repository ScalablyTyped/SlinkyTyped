package typingsSlinky.activexLibreoffice.com_.sun.star.graphic

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `XGraphicObject` objects represent in-memory image and graphic objects.
  *
  * Such objects are accessible using {@link GraphicObject} scheme URLs like vnd.sun.star.GraphicObject:10000000000001940000012FB99807BD The numeric
  * portion of the url is formed from {@link UniqueID} . As long as at least one instance of `XGraphicObject` with a particular UniqueID exists, the
  * associated image/graphic is available.
  * @see XGraphicObject
  * @see GraphicProvider
  * @see MediaProperties
  */
@js.native
trait XGraphicObject extends XInterface {
  
  /** is the associated image/graphic for this object. */
  var Graphic: XGraphic = js.native
  
  /** is the id that can be used to form the `vnd.sun.star.GraphicObject` url to address this object. */
  var UniqueID: String = js.native
}
object XGraphicObject {
  
  @scala.inline
  def apply(
    Graphic: XGraphic,
    UniqueID: String,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGraphicObject = {
    val __obj = js.Dynamic.literal(Graphic = Graphic.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGraphicObject]
  }
  
  @scala.inline
  implicit class XGraphicObjectOps[Self <: XGraphicObject] (val x: Self) extends AnyVal {
    
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
    def setGraphic(value: XGraphic): Self = this.set("Graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueID(value: String): Self = this.set("UniqueID", value.asInstanceOf[js.Any])
  }
}
