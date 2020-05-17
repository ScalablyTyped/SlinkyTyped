package typingsSlinky.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.azdata.mod.nb.IDisplayData
  - typingsSlinky.azdata.mod.nb.IUpdateDisplayData
  - typingsSlinky.azdata.mod.nb.IExecuteResult
  - typingsSlinky.azdata.mod.nb.IErrorResult
  - typingsSlinky.azdata.mod.nb.IStreamResult
*/
trait Output extends js.Object

object Output {
  @scala.inline
  implicit def apply(value: IDisplayData): Output = value.asInstanceOf[Output]
  @scala.inline
  implicit def apply(value: IErrorResult): Output = value.asInstanceOf[Output]
  @scala.inline
  implicit def apply(value: IExecuteResult): Output = value.asInstanceOf[Output]
  @scala.inline
  implicit def apply(value: IStreamResult): Output = value.asInstanceOf[Output]
  @scala.inline
  implicit def apply(value: IUpdateDisplayData): Output = value.asInstanceOf[Output]
}

