package typingsSlinky.activexLibreoffice.com_.sun.star.graphic

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface acts as the main interface to handle graphic content. It is used to load graphics, store graphics and to get information about unloaded
  * graphics
  */
@js.native
trait XGraphicProvider extends XInterface {
  
  /**
    * Calling this method returns a {@link XGraphic} interface that holds the graphic content after loading the graphic
    * @param MediaProperties A sequence of property values to describe the location of the graphic from which the graphic is to be loaded
    * @returns The {@link XGraphic} interface
    * @see MediaProperties
    * @see XGraphic
    * @see com.sun.star.beans.PropertyValues
    */
  def queryGraphic(MediaProperties: PropertyValues): XGraphic = js.native
  
  /**
    * Calling this method returns a {@link com.sun.star.beans.XPropertySet} interface that gives access to the properties of the unloaded graphic
    *
    * In most cases, this method will be used to query the mime type of the graphic and, in the case of pixel graphics, the resulting size after loading
    * @param MediaProperties A sequence of property values to describe the location of the graphic, for which the attributes should be returned
    * @returns A {@link com.sun.star.beans.XPropertySet} interface to get access to the different graphic properties
    * @see MediaProperties
    * @see GraphicDescriptor
    * @see com.sun.star.beans.PropertyValues
    */
  def queryGraphicDescriptor(MediaProperties: PropertyValues): XPropertySet = js.native
  
  /**
    * Store the graphic content, represented through the {@link XGraphic} interface at the specified location
    * @param Graphic The graphic that should be stored
    * @param MediaProperties A sequence of property values to describe the destination location of the graphic
    * @see XGraphic
    * @see MediaProperties
    * @see com.sun.star.beans.PropertyValues
    */
  def storeGraphic(Graphic: XGraphic, MediaProperties: PropertyValues): Unit = js.native
}
object XGraphicProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryGraphic: PropertyValues => XGraphic,
    queryGraphicDescriptor: PropertyValues => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    storeGraphic: (XGraphic, PropertyValues) => Unit
  ): XGraphicProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryGraphic = js.Any.fromFunction1(queryGraphic), queryGraphicDescriptor = js.Any.fromFunction1(queryGraphicDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), storeGraphic = js.Any.fromFunction2(storeGraphic))
    __obj.asInstanceOf[XGraphicProvider]
  }
  
  @scala.inline
  implicit class XGraphicProviderOps[Self <: XGraphicProvider] (val x: Self) extends AnyVal {
    
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
    def setQueryGraphic(value: PropertyValues => XGraphic): Self = this.set("queryGraphic", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryGraphicDescriptor(value: PropertyValues => XPropertySet): Self = this.set("queryGraphicDescriptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoreGraphic(value: (XGraphic, PropertyValues) => Unit): Self = this.set("storeGraphic", js.Any.fromFunction2(value))
  }
}
