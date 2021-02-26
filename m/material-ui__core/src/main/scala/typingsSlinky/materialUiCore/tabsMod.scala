package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.tabsTabsMod.TabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod extends Shortcut {
  
  @JSImport("@material-ui/core/Tabs", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TabsProps] = js.native
  
  type _To = ReactComponentClass[TabsProps]
  
  /* This means you don't have to write `default`, but can instead just say `tabsMod.foo` */
  override def _to: ReactComponentClass[TabsProps] = default
}
