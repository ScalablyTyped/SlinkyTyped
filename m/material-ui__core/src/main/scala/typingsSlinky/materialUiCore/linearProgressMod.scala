package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.linearProgressLinearProgressMod.LinearProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressMod extends Shortcut {
  
  @JSImport("@material-ui/core/LinearProgress", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LinearProgressProps] = js.native
  
  type _To = ReactComponentClass[LinearProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `linearProgressMod.foo` */
  override def _to: ReactComponentClass[LinearProgressProps] = default
}
