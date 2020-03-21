package typingsSlinky.ngGrid

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ngGrid.ngGrid.IGridInstance
import typingsSlinky.ngGrid.ngGrid.IGridScope
import typingsSlinky.ngGrid.ngGrid.ISearchProvider
import typingsSlinky.ngGrid.ngGrid.ISearchProviderStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngSearchProvider")
@js.native
class ngSearchProvider protected () extends ISearchProvider {
  def this(
    $scope: IGridScope,
    grid: IGridInstance,
    $filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IFilterService */ js.Any
  ) = this()
  /* CompleteClass */
  override var extFilter: Boolean = js.native
  /* CompleteClass */
  override var fieldMap: js.Any = js.native
  /* CompleteClass */
  override def evalFilter(): Unit = js.native
}

@JSGlobal("ngSearchProvider")
@js.native
object ngSearchProvider extends TopLevel[ISearchProviderStatic]

