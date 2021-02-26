package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IAttributes
import typingsSlinky.angular.mod.IAugmentedJQuery
import typingsSlinky.angular.mod.ICompileService
import typingsSlinky.angular.mod.IDocumentService
import typingsSlinky.angular.mod.ILogService
import typingsSlinky.angular.mod.IModule
import typingsSlinky.angular.mod.IParseService
import typingsSlinky.angular.mod.IQService
import typingsSlinky.angular.mod.IRootScopeService
import typingsSlinky.angular.mod.ITimeoutService
import typingsSlinky.angular.mod.auto.IInjectorService
import typingsSlinky.ngTable.ngTableColumnMod.NgTableColumn
import typingsSlinky.ngTable.ngTableControllerMod.ITableScope
import typingsSlinky.ngTable.ngTableDefaultsMod.IDefaults
import typingsSlinky.ngTable.ngTableParamsMod.IParamValues
import typingsSlinky.ngTable.ngTableSettingsMod.ISettings
import typingsSlinky.ngTable.ngTableSettingsMod.NgTableSettings
import typingsSlinky.ngTable.publicInterfacesMod.IColumnDef
import typingsSlinky.ngTable.publicInterfacesMod.IDynamicTableColDef
import typingsSlinky.ngTable.publicInterfacesMod.IFilterConfigValues
import typingsSlinky.ngTable.publicInterfacesMod.ITableInputAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ng-table", "NgTableController")
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typingsSlinky.ngTable.browserMod.NgTableController[TParams, TCol] {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes with ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: typingsSlinky.ngTable.coreMod.NgTableEventsChannel
    ) = this()
  }
  /* static members */
  object NgTableController {
    
    @JSImport("ng-table", "NgTableController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "NgTableDefaultGetDataProvider")
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typingsSlinky.ngTable.coreMod.NgTableDefaultGetDataProvider
  
  @JSImport("ng-table", "NgTableEventsChannel")
  @js.native
  class NgTableEventsChannel protected ()
    extends typingsSlinky.ngTable.coreMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  /* static members */
  object NgTableEventsChannel {
    
    @JSImport("ng-table", "NgTableEventsChannel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableEventsChannel.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "NgTableFilterConfig")
  @js.native
  class NgTableFilterConfig protected ()
    extends typingsSlinky.ngTable.browserMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  /* static members */
  object NgTableFilterConfig {
    
    @JSImport("ng-table", "NgTableFilterConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableFilterConfig.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "NgTableFilterConfigProvider")
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typingsSlinky.ngTable.browserMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  /* static members */
  object NgTableFilterConfigProvider {
    
    @JSImport("ng-table", "NgTableFilterConfigProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableFilterConfigProvider.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "NgTableParams")
  @js.native
  class NgTableParams[T] ()
    extends typingsSlinky.ngTable.coreMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: js.UndefOr[scala.Nothing], baseSettings: ISettings[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  /* static members */
  object NgTableParams {
    
    @JSImport("ng-table", "NgTableParams")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table", "NgTableParams.$log")
    @js.native
    def $log: js.Any = js.native
    @scala.inline
    def $log_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$log")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table", "NgTableParams.$q")
    @js.native
    def $q: js.Any = js.native
    @scala.inline
    def $q_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$q")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table", "NgTableParams.init")
    @js.native
    def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typingsSlinky.ngTable.ngTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = js.native
    
    @JSImport("ng-table", "NgTableParams.ngTableDefaults")
    @js.native
    def ngTableDefaults: js.Any = js.native
    @scala.inline
    def ngTableDefaults_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableDefaults")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table", "NgTableParams.ngTableEventsChannel")
    @js.native
    def ngTableEventsChannel: js.Any = js.native
    @scala.inline
    def ngTableEventsChannel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableEventsChannel")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table", "NgTableParams.ngTableSettings")
    @js.native
    def ngTableSettings: js.Any = js.native
    @scala.inline
    def ngTableSettings_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableSettings")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table", "ngTableBrowserModule")
  @js.native
  val ngTableBrowserModule: IModule = js.native
  
  @JSImport("ng-table", "ngTableCoreModule")
  @js.native
  val ngTableCoreModule: IModule = js.native
  
  @JSImport("ng-table", "ngTableModule")
  @js.native
  val ngTableModule: IModule = js.native
}
