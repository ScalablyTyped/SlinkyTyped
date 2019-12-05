package typingsSlinky.ngDashTable

import typingsSlinky.angular.angularMod.IAttributes
import typingsSlinky.angular.angularMod.IAugmentedJQuery
import typingsSlinky.angular.angularMod.ICompileService
import typingsSlinky.angular.angularMod.IDocumentService
import typingsSlinky.angular.angularMod.IModule
import typingsSlinky.angular.angularMod.IParseService
import typingsSlinky.angular.angularMod.ITimeoutService
import typingsSlinky.angular.angularMod.auto.IInjectorService
import typingsSlinky.ngDashTable.srcBrowserNgTableColumnMod.NgTableColumn
import typingsSlinky.ngDashTable.srcBrowserNgTableControllerMod.ITableScope
import typingsSlinky.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import typingsSlinky.ngDashTable.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef
import typingsSlinky.ngDashTable.srcBrowserPublicDashInterfacesMod.IFilterConfigValues
import typingsSlinky.ngDashTable.srcBrowserPublicDashInterfacesMod.ITableInputAttributes
import typingsSlinky.ngDashTable.srcCoreMod.NgTableEventsChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser", JSImport.Namespace)
@js.native
object srcBrowserMod extends js.Object {
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typingsSlinky.ngDashTable.srcBrowserNgTableControllerMod.NgTableController[TParams, TCol] {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes with ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: NgTableEventsChannel
    ) = this()
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typingsSlinky.ngDashTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typingsSlinky.ngDashTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  
  val ngTableBrowserModule: IModule = js.native
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableFilterConfig extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableFilterConfigProvider extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
}

