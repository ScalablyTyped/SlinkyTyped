package typingsSlinky.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cadesplugin.CADESCommon.PromisifiedFunction
import typingsSlinky.cadesplugin.CADESCommon.Unpacked
import typingsSlinky.cadesplugin.CADESCommon.ValuesOf
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPAttribute> */
@js.native
trait CPAttributeAsync extends StObject {
  
  val Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_ATTRIBUTE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_ATTRIBUTE]] = js.native
  
  val Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[_]]) | PromisifiedFunction[_] = js.native
  
  val ValueEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CAPICOM_ENCODING_TYPE]] = js.native
  
  def propset_Name(name: ValuesOf[CADESCOM_ATTRIBUTE]): js.Promise[Unit] = js.native
  
  def propset_Value(value: js.Any): js.Promise[Unit] = js.native
  
  def propset_ValueEncoding(valueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE]): js.Promise[Unit] = js.native
}
object CPAttributeAsync {
  
  @scala.inline
  def apply(
    Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_ATTRIBUTE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_ATTRIBUTE]],
    Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[_]]) | PromisifiedFunction[_],
    ValueEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CAPICOM_ENCODING_TYPE]],
    propset_Name: ValuesOf[CADESCOM_ATTRIBUTE] => js.Promise[Unit],
    propset_Value: js.Any => js.Promise[Unit],
    propset_ValueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE] => js.Promise[Unit]
  ): CPAttributeAsync = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueEncoding = ValueEncoding.asInstanceOf[js.Any], propset_Name = js.Any.fromFunction1(propset_Name), propset_Value = js.Any.fromFunction1(propset_Value), propset_ValueEncoding = js.Any.fromFunction1(propset_ValueEncoding))
    __obj.asInstanceOf[CPAttributeAsync]
  }
  
  @scala.inline
  implicit class CPAttributeAsyncMutableBuilder[Self <: CPAttributeAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_ATTRIBUTE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_ATTRIBUTE]]
    ): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_Name(value: ValuesOf[CADESCOM_ATTRIBUTE] => js.Promise[Unit]): Self = StObject.set(x, "propset_Name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_Value(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "propset_Value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_ValueEncoding(value: ValuesOf[CAPICOM_ENCODING_TYPE] => js.Promise[Unit]): Self = StObject.set(x, "propset_ValueEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[_]]) | PromisifiedFunction[_]): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueEncoding(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CAPICOM_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CAPICOM_ENCODING_TYPE]]
    ): Self = StObject.set(x, "ValueEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueEncodingFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "ValueEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Value", js.Any.fromFunction1(value))
  }
}
