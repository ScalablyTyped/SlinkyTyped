package typingsSlinky.ngGrid

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ngGrid.ngGrid.IEventProvider
import typingsSlinky.ngGrid.ngGrid.IEventProviderStatic
import typingsSlinky.ngGrid.ngGrid.IGridInstance
import typingsSlinky.ngGrid.ngGrid.IGridScope
import typingsSlinky.ngGrid.ngGrid.service.IDomUtilityService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngEventProvider")
@js.native
class ngEventProvider protected () extends IEventProvider {
  def this(
    grid: IGridInstance,
    $scope: IGridScope,
    domUtilityService: IDomUtilityService,
    $timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITimeoutService */ js.Any
  ) = this()
}

@JSGlobal("ngEventProvider")
@js.native
object ngEventProvider extends TopLevel[IEventProviderStatic]

