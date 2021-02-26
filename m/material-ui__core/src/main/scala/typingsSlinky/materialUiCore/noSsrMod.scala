package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.noSsrNoSsrMod.NoSsrProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noSsrMod extends Shortcut {
  
  @JSImport("@material-ui/core/NoSsr", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NoSsrProps] = js.native
  
  type _To = ReactComponentClass[NoSsrProps]
  
  /* This means you don't have to write `default`, but can instead just say `noSsrMod.foo` */
  override def _to: ReactComponentClass[NoSsrProps] = default
}
