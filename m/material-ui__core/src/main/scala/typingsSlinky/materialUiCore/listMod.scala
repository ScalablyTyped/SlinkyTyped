package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.listListMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod extends Shortcut {
  
  @JSImport("@material-ui/core/List", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ListProps] = js.native
  
  type _To = ReactComponentClass[ListProps]
  
  /* This means you don't have to write `default`, but can instead just say `listMod.foo` */
  override def _to: ReactComponentClass[ListProps] = default
}
