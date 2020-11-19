package typingsSlinky.ngTable

import typingsSlinky.angular.mod.ILogService
import typingsSlinky.angular.mod.IModule
import typingsSlinky.angular.mod.IQService
import typingsSlinky.angular.mod.IRootScopeService
import typingsSlinky.ngTable.ngTableDefaultsMod.IDefaults
import typingsSlinky.ngTable.ngTableParamsMod.IParamValues
import typingsSlinky.ngTable.ngTableSettingsMod.ISettings
import typingsSlinky.ngTable.ngTableSettingsMod.NgTableSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  
  val ngTableCoreModule: IModule = js.native
  
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typingsSlinky.ngTable.dataMod.NgTableDefaultGetDataProvider
  
  @js.native
  class NgTableEventsChannel protected ()
    extends typingsSlinky.ngTable.ngTableEventsChannelMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  /* static members */
  @js.native
  object NgTableEventsChannel extends js.Object {
    
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  @js.native
  class NgTableParams[T] ()
    extends typingsSlinky.ngTable.ngTableParamsMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: js.UndefOr[scala.Nothing], baseSettings: ISettings[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  /* static members */
  @js.native
  object NgTableParams extends js.Object {
    
    @JSName("$log")
    var $log: js.Any = js.native
    
    @JSName("$q")
    var $q: js.Any = js.native
    
    def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typingsSlinky.ngTable.ngTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = js.native
    
    var ngTableDefaults: js.Any = js.native
    
    var ngTableEventsChannel: js.Any = js.native
    
    var ngTableSettings: js.Any = js.native
  }
}
