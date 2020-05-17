package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minappEnv.IAPISuccessParam
  - typingsSlinky.minappEnv.IAPIError
*/
trait IAPICompleteParam extends js.Object

object IAPICompleteParam {
  @scala.inline
  implicit def apply(value: IAPIError): IAPICompleteParam = value.asInstanceOf[IAPICompleteParam]
  @scala.inline
  implicit def apply(value: IAPISuccessParam): IAPICompleteParam = value.asInstanceOf[IAPICompleteParam]
}

