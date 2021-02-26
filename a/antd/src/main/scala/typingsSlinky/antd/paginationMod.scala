package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antd.paginationPaginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod extends Shortcut {
  
  @JSImport("antd/lib/pagination", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PaginationProps] = js.native
  
  type _To = ReactComponentClass[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `paginationMod.foo` */
  override def _to: ReactComponentClass[PaginationProps] = default
}
