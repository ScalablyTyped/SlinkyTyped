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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("ng-table/src/browser", "NgTableController")
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
  object NgTableController {
    
    @JSImport("ng-table/src/browser", "NgTableController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser", "NgTableController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "NgTableFilterConfig")
  @js.native
  class NgTableFilterConfig protected ()
    extends typingsSlinky.ngTable.ngTableFilterConfigMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  /* static members */
  object NgTableFilterConfig {
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfig.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider")
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typingsSlinky.ngTable.ngTableFilterConfigMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  /* static members */
  object NgTableFilterConfigProvider {
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser", "NgTableFilterConfigProvider.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser", "ngTableBrowserModule")
  @js.native
  val ngTableBrowserModule: IModule = js.native
}
