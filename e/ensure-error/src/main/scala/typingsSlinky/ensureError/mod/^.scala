package typingsSlinky.ensureError.mod

import typingsSlinky.ensureError.anon.ErrorWithStackError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ensure-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Ensures a value is a valid error by making it one if not.
  If `input` is an `Error`, any missing `Error` properties will be added.
  If it's not an `Error`, `input` is converted to an `Error`.
  @example
  ```
  import ensureError = require('ensure-error');
  const error = new TypeError('🦄');
  error.name = '';
  console.log(error.name);
  //=> ''
  console.log(ensureError(error).name);
  //=> 'TypeError'
  console.log(ensureError(10));
  //=> [NonError: 10]
  ```
  */
  def apply[T](input: T): IfAny[T, ErrorWithStackError, NonError | ErrorWithStack[T]] = js.native
}
