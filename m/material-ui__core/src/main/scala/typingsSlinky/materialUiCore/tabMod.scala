package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.tabTabMod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod extends Shortcut {
  
  @JSImport("@material-ui/core/Tab", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TabProps] = js.native
  
  type _To = ReactComponentClass[TabProps]
  
  /* This means you don't have to write `default`, but can instead just say `tabMod.foo` */
  override def _to: ReactComponentClass[TabProps] = default
}
