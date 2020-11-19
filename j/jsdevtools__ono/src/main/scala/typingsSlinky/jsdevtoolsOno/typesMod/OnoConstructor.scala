package typingsSlinky.jsdevtoolsOno.typesMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnoConstructor
  extends Instantiable1[/* constructor */ ErrorLikeConstructor[ErrorLike], Ono[ErrorLike]]
     with Instantiable2[
      /* constructor */ ErrorLikeConstructor[ErrorLike], 
      /* options */ OnoOptions, 
      Ono[ErrorLike]
    ] {
  
  def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T]): Ono[T] = js.native
  def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T], options: OnoOptions): Ono[T] = js.native
  
  def extend(error: ErrorPOJO): ErrorPOJO with OnoError[ErrorPOJO] = js.native
  /**
    * Extends the given Error object with enhanced Ono functionality, such as improved support for
    * `JSON.stringify()`.
    *
    * @param error - The error object to extend. This object instance will be modified and returned.
    */
  def extend(error: js.Error): js.Error with OnoError[js.Error] = js.native
  def extend[E /* <: ErrorLike */](error: ErrorPOJO, originalError: E): ErrorPOJO with E with (OnoError[ErrorPOJO with E]) = js.native
  def extend[E /* <: ErrorLike */](error: js.Error, originalError: E): js.Error with E with (OnoError[js.Error with E]) = js.native
  def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E, props: P): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
  def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: js.UndefOr[scala.Nothing], props: P): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
  def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: E, props: P): js.Error with E with P with (OnoError[js.Error with E with P]) = js.native
  def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: js.UndefOr[scala.Nothing], props: P): js.Error with E with P with (OnoError[js.Error with E with P]) = js.native
  @JSName("extend")
  def extend_E_ErrorLike[E /* <: ErrorLike */](error: ErrorPOJO): ErrorPOJO with E with (OnoError[ErrorPOJO with E]) = js.native
  /**
    * Extends the given Error object with enhanced Ono functionality, such as nested stack traces
    * and improved support for `JSON.stringify()`.
    *
    * @param error - The error object to extend. This object instance will be modified and returned.
    * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
    */
  @JSName("extend")
  def extend_E_ErrorLike[E /* <: ErrorLike */](error: js.Error): js.Error with E with (OnoError[js.Error with E]) = js.native
  @JSName("extend")
  def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
  @JSName("extend")
  def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
  /**
    * Extends the given Error object with enhanced Ono functionality, such as nested stack traces,
    * additional properties, and improved support for `JSON.stringify()`.
    *
    * @param error - The error object to extend. This object instance will be modified and returned.
    * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
    * @param props - An object whose properties will be added to the error
    */
  @JSName("extend")
  def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error): js.Error with E with P with (OnoError[js.Error with E with P]) = js.native
  @JSName("extend")
  def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: E): js.Error with E with P with (OnoError[js.Error with E with P]) = js.native
  @JSName("extend")
  def extend_P_Object[P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO with P with (OnoError[ErrorPOJO with P]) = js.native
  @JSName("extend")
  def extend_P_Object[P /* <: js.Object */](error: ErrorPOJO, props: P): ErrorPOJO with P with (OnoError[ErrorPOJO with P]) = js.native
  /**
    * Extends the given Error object with enhanced Ono functionality, such as additional properties
    * and improved support for `JSON.stringify()`.
    *
    * @param error - The error object to extend. This object instance will be modified and returned.
    * @param props - An object whose properties will be added to the error
    */
  @JSName("extend")
  def extend_P_Object[P /* <: js.Object */](error: js.Error): js.Error with P with (OnoError[js.Error with P]) = js.native
  @JSName("extend")
  def extend_P_Object[P /* <: js.Object */](error: js.Error, props: P): js.Error with P with (OnoError[js.Error with P]) = js.native
  
  def toJSON(error: ErrorPOJO): ErrorPOJO = js.native
  /**
    * Returns an object containing all properties of the given Error object,
    * which can be used with `JSON.stringify()`.
    */
  def toJSON(error: js.Error): ErrorPOJO with js.Error = js.native
}
