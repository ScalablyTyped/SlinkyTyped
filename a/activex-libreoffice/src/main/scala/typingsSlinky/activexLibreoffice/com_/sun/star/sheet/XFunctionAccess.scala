package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows generic access to all spreadsheet functions.
  * @see com.sun.star.sheet.FunctionAccess
  */
@js.native
trait XFunctionAccess extends XInterface {
  
  /**
    * calls a function and returns the result of the call.
    * @param aName the (programmatic) name of the function.
    * @param aArguments the arguments for the function call. Each element must be of one of the following types:  **long or double**: for a numeric value.;
    * @returns the result of the function call.  Possible types for the result are:  **VOID**: if no result is available.;   **double**: for a numeric result.;
    * @throws com::sun::star::container::NoSuchElementException if the named function does not exist.
    * @throws com::sun::star::lang::IllegalArgumentException if the function can not be called with these arguments.
    */
  def callFunction(aName: String, aArguments: SeqEquiv[_]): js.Any = js.native
}
object XFunctionAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    callFunction: (String, SeqEquiv[_]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFunctionAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), callFunction = js.Any.fromFunction2(callFunction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFunctionAccess]
  }
  
  @scala.inline
  implicit class XFunctionAccessMutableBuilder[Self <: XFunctionAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFunction(value: (String, SeqEquiv[_]) => js.Any): Self = StObject.set(x, "callFunction", js.Any.fromFunction2(value))
  }
}
