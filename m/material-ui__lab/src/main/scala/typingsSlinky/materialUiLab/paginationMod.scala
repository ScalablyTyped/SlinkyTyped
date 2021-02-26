package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiLab.paginationPaginationMod.PaginationProps
import typingsSlinky.materialUiLab.usePaginationMod.UsePaginationProps
import typingsSlinky.materialUiLab.usePaginationMod.UsePaginationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("@material-ui/lab/Pagination", JSImport.Default)
  @js.native
  def default(props: PaginationProps): ReactElement = js.native
  
  @JSImport("@material-ui/lab/Pagination", "usePagination")
  @js.native
  def usePagination(props: UsePaginationProps): UsePaginationResult = js.native
}
