package typingsSlinky.jupyterlabCoreutils.nbformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nbformat {
  /**
    * Media attachments (e.g. inline images).
    */
  type IAttachments = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle]
  /**
    * An unrecognized cell.
    */
  type IUnrecognizedCell = typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IBaseCell
  /**
    * Unrecognized output.
    */
  type IUnrecognizedOutput = typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IBaseOutput
  /**
    * Cell output metadata.
    */
  type OutputMetadata = typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
}
