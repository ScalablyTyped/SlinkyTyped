package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.collapseCollapseMod.CollapseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod extends Shortcut {
  
  @JSImport("@material-ui/core/Collapse", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CollapseProps] = js.native
  
  type _To = ReactComponentClass[CollapseProps]
  
  /* This means you don't have to write `default`, but can instead just say `collapseMod.foo` */
  override def _to: ReactComponentClass[CollapseProps] = default
}
