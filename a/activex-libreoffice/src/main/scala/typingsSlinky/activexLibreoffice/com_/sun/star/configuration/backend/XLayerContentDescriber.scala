package typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describe the contents of a layer to an {@link XLayerHandler} object. The contents of the layer is contained in the sequence of {@link PropertyInfo}
  * structures
  * @see PropertyInfo
  */
@js.native
trait XLayerContentDescriber extends XInterface {
  
  /**
    * describes the contents of the layer to an {@link XLayerHandler} .
    * @param aHandler Handler object that will receive calls describing the contents of the layer
    * @param aPropertyInfos sequence of {@link PropertyInfo} structs contained all required property information
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XLayerHandler} .
    */
  def describeLayer(aHandler: XLayerHandler, aPropertyInfos: SeqEquiv[PropertyInfo]): Unit = js.native
}
object XLayerContentDescriber {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    describeLayer: (XLayerHandler, SeqEquiv[PropertyInfo]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLayerContentDescriber = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), describeLayer = js.Any.fromFunction2(describeLayer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLayerContentDescriber]
  }
  
  @scala.inline
  implicit class XLayerContentDescriberOps[Self <: XLayerContentDescriber] (val x: Self) extends AnyVal {
    
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
    def setDescribeLayer(value: (XLayerHandler, SeqEquiv[PropertyInfo]) => Unit): Self = this.set("describeLayer", js.Any.fromFunction2(value))
  }
}
