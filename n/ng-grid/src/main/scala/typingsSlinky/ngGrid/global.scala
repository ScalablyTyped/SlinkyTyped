package typingsSlinky.ngGrid

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ngGrid.ngGrid.IAggregate
import typingsSlinky.ngGrid.ngGrid.IAggregateStatic
import typingsSlinky.ngGrid.ngGrid.IColumn
import typingsSlinky.ngGrid.ngGrid.IColumnStatic
import typingsSlinky.ngGrid.ngGrid.IDimension
import typingsSlinky.ngGrid.ngGrid.IDimensionStatic
import typingsSlinky.ngGrid.ngGrid.IEventProvider
import typingsSlinky.ngGrid.ngGrid.IEventProviderStatic
import typingsSlinky.ngGrid.ngGrid.IFooter
import typingsSlinky.ngGrid.ngGrid.IFooterStatic
import typingsSlinky.ngGrid.ngGrid.IGridInstance
import typingsSlinky.ngGrid.ngGrid.IGridOptions
import typingsSlinky.ngGrid.ngGrid.IGridScope
import typingsSlinky.ngGrid.ngGrid.IRenderedRange
import typingsSlinky.ngGrid.ngGrid.IRenderedRangeStatic
import typingsSlinky.ngGrid.ngGrid.IRow
import typingsSlinky.ngGrid.ngGrid.IRowConfig
import typingsSlinky.ngGrid.ngGrid.IRowFactory
import typingsSlinky.ngGrid.ngGrid.IRowStatic
import typingsSlinky.ngGrid.ngGrid.ISearchProvider
import typingsSlinky.ngGrid.ngGrid.ISearchProviderStatic
import typingsSlinky.ngGrid.ngGrid.ISelectionProvider
import typingsSlinky.ngGrid.ngGrid.ISelectionProviderStatic
import typingsSlinky.ngGrid.ngGrid.IStyleProvider
import typingsSlinky.ngGrid.ngGrid.IStyleProviderStatic
import typingsSlinky.ngGrid.ngGrid.service.IDomUtilityService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class ngAggregate protected () extends IAggregate {
    def this(aggEntity: js.Any, rowFactory: IRowFactory, rowHeight: Double, groupInitState: Boolean) = this()
  }
  @js.native
  object ngAggregate extends TopLevel[IAggregateStatic]
  
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
  @js.native
  object ngColumn extends TopLevel[IColumnStatic]
  
  @js.native
  class ngDimension protected () extends IDimension {
    def this(options: js.Any) = this()
  }
  @js.native
  object ngDimension extends TopLevel[IDimensionStatic]
  
  @js.native
  class ngEventProvider protected () extends IEventProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      domUtilityService: IDomUtilityService,
      $timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ITimeoutService */ js.Any
    ) = this()
  }
  @js.native
  object ngEventProvider extends TopLevel[IEventProviderStatic]
  
  @js.native
  class ngFooter protected () extends IFooter {
    def this($scope: IGridScope, grid: IGridInstance) = this()
  }
  @js.native
  object ngFooter extends TopLevel[IFooterStatic]
  
  @js.native
  class ngGridReorderable ()
    extends typingsSlinky.ngGrid.ngGridReorderable
  
  @js.native
  class ngRenderedRange protected () extends IRenderedRange {
    def this(top: Double, bottom: Double) = this()
  }
  @js.native
  object ngRenderedRange extends TopLevel[IRenderedRangeStatic]
  
  @js.native
  class ngRow protected () extends IRow {
    def this(
      entity: js.Any,
      config: IRowConfig,
      selectionProvider: ISelectionProvider,
      rowIndex: Double,
      $utils: js.Any
    ) = this()
  }
  @js.native
  object ngRow extends TopLevel[IRowStatic]
  
  @js.native
  class ngSearchProvider protected () extends ISearchProvider {
    def this(
      $scope: IGridScope,
      grid: IGridInstance,
      $filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IFilterService */ js.Any
    ) = this()
  }
  @js.native
  object ngSearchProvider extends TopLevel[ISearchProviderStatic]
  
  @js.native
  class ngSelectionProvider protected () extends ISelectionProvider {
    def this(
      grid: IGridInstance,
      $scope: IGridScope,
      $parse: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IParseService */ js.Any
    ) = this()
  }
  @js.native
  object ngSelectionProvider extends TopLevel[ISelectionProviderStatic]
  
  @js.native
  class ngStyleProvider protected () extends IStyleProvider {
    def this($scope: IGridScope, grid: IGridInstance) = this()
  }
  @js.native
  object ngStyleProvider extends TopLevel[IStyleProviderStatic]
}
