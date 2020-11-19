package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to be implemented by objects used to translate a {@link DataFlavor} to a system dependent data transfer type and vice versa.
  *
  * Different platforms use different types to describe data formats available during data exchange operations like clipboard or drag&drop. Windows for
  * instance uses integer values to describe an available clipboard or drag&drop format, Unix X11 uses so called Atoms etc.
  */
@js.native
trait XDataFormatTranslator extends XInterface {
  
  /**
    * Converts a system dependent data type to a {@link DataFlavor} .
    * @param aSysDataType A system dependent data type. If aSysDataType is empty so is the returned {@link DataFlavor} .
    * @returns A {@link DataFlavor} for the given system dependent data transfer type. If there is no appropriate mapping for a system dependent data type, the
    */
  def getDataFlavorFromSystemDataType(aSysDataType: js.Any): DataFlavor = js.native
  
  /**
    * Converts a {@link DataFlavor} to system dependent data type.
    * @param aDataFlavor Describes the format for which a system dependent data types is requested.
    * @returns A system dependent data transfer type for the given {@link DataFlavor} if there is one available. If the is no system dependent data type for a g
    */
  def getSystemDataTypeFromDataFlavor(aDataFlavor: DataFlavor): js.Any = js.native
}
object XDataFormatTranslator {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDataFlavorFromSystemDataType: js.Any => DataFlavor,
    getSystemDataTypeFromDataFlavor: DataFlavor => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataFormatTranslator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDataFlavorFromSystemDataType = js.Any.fromFunction1(getDataFlavorFromSystemDataType), getSystemDataTypeFromDataFlavor = js.Any.fromFunction1(getSystemDataTypeFromDataFlavor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataFormatTranslator]
  }
  
  @scala.inline
  implicit class XDataFormatTranslatorOps[Self <: XDataFormatTranslator] (val x: Self) extends AnyVal {
    
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
    def setGetDataFlavorFromSystemDataType(value: js.Any => DataFlavor): Self = this.set("getDataFlavorFromSystemDataType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSystemDataTypeFromDataFlavor(value: DataFlavor => js.Any): Self = this.set("getSystemDataTypeFromDataFlavor", js.Any.fromFunction1(value))
  }
}
