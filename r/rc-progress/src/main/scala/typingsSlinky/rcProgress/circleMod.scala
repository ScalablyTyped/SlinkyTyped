package typingsSlinky.rcProgress

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.rcProgress.interfaceMod.ProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod extends Shortcut {
  
  @JSImport("rc-progress/es/Circle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ProgressProps] = js.native
  
  type _To = ReactComponentClass[ProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleMod.foo` */
  override def _to: ReactComponentClass[ProgressProps] = default
}
