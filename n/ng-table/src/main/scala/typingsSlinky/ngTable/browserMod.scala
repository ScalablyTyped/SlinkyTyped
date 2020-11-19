package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IAttributes
import typingsSlinky.angular.mod.IAugmentedJQuery
import typingsSlinky.angular.mod.ICompileService
import typingsSlinky.angular.mod.IDocumentService
import typingsSlinky.angular.mod.IModule
import typingsSlinky.angular.mod.IParseService
import typingsSlinky.angular.mod.ITimeoutService
import typingsSlinky.angular.mod.auto.IInjectorService
import typingsSlinky.ngTable.coreMod.NgTableEventsChannel
import typingsSlinky.ngTable.ngTableColumnMod.NgTableColumn
import typingsSlinky.ngTable.ngTableControllerMod.ITableScope
import typingsSlinky.ngTable.publicInterfacesMod.IColumnDef
import typingsSlinky.ngTable.publicInterfacesMod.IDynamicTableColDef
import typingsSlinky.ngTable.publicInterfacesMod.IFilterConfigValues
import typingsSlinky.ngTable.publicInterfacesMod.ITableInputAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  
  val ngTableBrowserModule: IModule = js.native
  
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typingsSlinky.ngTable.ngTableControllerMod.NgTableController[TParams, TCol] {
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
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typingsSlinky.ngTable.ngTableFilterConfigMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  /* static members */
  @js.native
  object NgTableFilterConfig extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typingsSlinky.ngTable.ngTableFilterConfigMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  /* static members */
  @js.native
  object NgTableFilterConfigProvider extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
}
