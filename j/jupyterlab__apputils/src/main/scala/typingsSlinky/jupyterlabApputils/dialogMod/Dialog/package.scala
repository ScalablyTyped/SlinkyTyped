package typingsSlinky.jupyterlabApputils.dialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Dialog {
  
  /**
    * The body input types.
    */
  type Body[T] = typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IBodyWidget[T] | slinky.core.facade.ReactElement | java.lang.String
  
  /**
    * The header input types.
    */
  type Header = slinky.core.facade.ReactElement | java.lang.String
}
