package typingsSlinky.jupyterlabCoreutils.nbformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nbformat {
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  type ExecutionCount = scala.Double | scala.Null
  /**
    * Media attachments (e.g. inline images).
    */
  type IAttachments = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle]
  /**
    * A cell union type.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IRawCell
    - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IMarkdownCell
    - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ICodeCell
    - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedCell
  */
  type ICell = typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat._ICell | typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedCell
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
  type IOutput = typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat._IOutput | typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedOutput
  /**
    * An unrecognized cell.
    */
  type IUnrecognizedCell = typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IBaseCell
  /**
    * Unrecognized output.
    */
  type IUnrecognizedOutput = typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IBaseOutput
  /**
    * A multiline string.
    */
  type MultilineString = java.lang.String | js.Array[java.lang.String]
  /**
    * Cell output metadata.
    */
  type OutputMetadata = typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
}
