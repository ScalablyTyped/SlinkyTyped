package typingsSlinky.ngGrid

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ngGrid.ngGrid.IColumn
import typingsSlinky.ngGrid.ngGrid.IColumnStatic
import typingsSlinky.ngGrid.ngGrid.IGridInstance
import typingsSlinky.ngGrid.ngGrid.IGridOptions
import typingsSlinky.ngGrid.ngGrid.IGridScope
import typingsSlinky.ngGrid.ngGrid.service.IDomUtilityService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngColumn")
@js.native
class ngColumn protected () extends IColumn {
  def this(
    config: IGridOptions,
    $scope: IGridScope,
    grid: IGridInstance,
    domUtilityService: IDomUtilityService,
    $templateCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITemplateCacheService */ js.Any,
    $utils: js.Any
  ) = this()
}

@JSGlobal("ngColumn")
@js.native
object ngColumn extends TopLevel[IColumnStatic]

