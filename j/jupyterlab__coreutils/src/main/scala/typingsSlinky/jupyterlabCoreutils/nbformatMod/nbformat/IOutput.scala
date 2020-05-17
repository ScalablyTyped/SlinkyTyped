package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An output union type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedOutput
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IExecuteResult
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IDisplayData
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IStream
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IError
*/
trait IOutput extends js.Object

object IOutput {
  @scala.inline
  implicit def apply(value: IDisplayData): IOutput = value.asInstanceOf[IOutput]
  @scala.inline
  implicit def apply(value: IError): IOutput = value.asInstanceOf[IOutput]
  @scala.inline
  implicit def apply(value: IExecuteResult): IOutput = value.asInstanceOf[IOutput]
  @scala.inline
  implicit def apply(value: IStream): IOutput = value.asInstanceOf[IOutput]
  @scala.inline
  implicit def apply(value: IUnrecognizedOutput): IOutput = value.asInstanceOf[IOutput]
}

