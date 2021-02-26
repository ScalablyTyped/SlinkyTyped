package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XFormField extends XInterface {
  
  var FieldType: String = js.native
  
  val Parameters: XNameContainer = js.native
  
  def getFieldType(): String = js.native
  
  def getParameters(): XNameContainer = js.native
  
  def setFieldType(fieldType: String): Unit = js.native
}
object XFormField {
  
  @scala.inline
  def apply(
    FieldType: String,
    Parameters: XNameContainer,
    acquire: () => Unit,
    getFieldType: () => String,
    getParameters: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFieldType: String => Unit
  ): XFormField = {
    val __obj = js.Dynamic.literal(FieldType = FieldType.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFieldType = js.Any.fromFunction0(getFieldType), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFieldType = js.Any.fromFunction1(setFieldType))
    __obj.asInstanceOf[XFormField]
  }
  
  @scala.inline
  implicit class XFormFieldMutableBuilder[Self <: XFormField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldType(value: String): Self = StObject.set(x, "FieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFieldType(value: () => String): Self = StObject.set(x, "getFieldType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => XNameContainer): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParameters(value: XNameContainer): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFieldType(value: String => Unit): Self = StObject.set(x, "setFieldType", js.Any.fromFunction1(value))
  }
}
