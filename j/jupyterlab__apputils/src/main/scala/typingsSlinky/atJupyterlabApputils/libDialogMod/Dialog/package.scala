package typingsSlinky.atJupyterlabApputils.libDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Dialog {
  import slinky.core.facade.ReactElement

  /**
    * The body input types.
    */
  type Body[T] = IBodyWidget[T] | ReactElement | String
  /**
    * The header input types.
    */
  type Header = ReactElement | String
}
