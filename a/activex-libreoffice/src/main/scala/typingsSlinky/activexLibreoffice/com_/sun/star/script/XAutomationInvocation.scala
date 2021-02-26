package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAutomationInvocation extends XInvocation {
  
  def invokeGetProperty(
    aFunctionName: String,
    aParams: SeqEquiv[_],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[_]]
  ): js.Any = js.native
  
  def invokePutProperty(
    aFunctionName: String,
    aParams: SeqEquiv[_],
    aOutParamIndex: js.Array[SeqEquiv[Double]],
    aOutParam: js.Array[SeqEquiv[_]]
  ): js.Any = js.native
}
object XAutomationInvocation {
  
  @scala.inline
  def apply(
    Introspection: XIntrospectionAccess,
    acquire: () => Unit,
    getIntrospection: () => XIntrospectionAccess,
    getValue: String => js.Any,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    invokeGetProperty: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    invokePutProperty: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValue: (String, js.Any) => Unit
  ): XAutomationInvocation = {
    val __obj = js.Dynamic.literal(Introspection = Introspection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIntrospection = js.Any.fromFunction0(getIntrospection), getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), invokeGetProperty = js.Any.fromFunction4(invokeGetProperty), invokePutProperty = js.Any.fromFunction4(invokePutProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XAutomationInvocation]
  }
  
  @scala.inline
  implicit class XAutomationInvocationMutableBuilder[Self <: XAutomationInvocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvokeGetProperty(value: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any): Self = StObject.set(x, "invokeGetProperty", js.Any.fromFunction4(value))
    
    @scala.inline
    def setInvokePutProperty(value: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any): Self = StObject.set(x, "invokePutProperty", js.Any.fromFunction4(value))
  }
}
