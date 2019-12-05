package typingsSlinky.ngDashTable

import typingsSlinky.angular.angularMod.ILogService
import typingsSlinky.angular.angularMod.IModule
import typingsSlinky.angular.angularMod.IQService
import typingsSlinky.angular.angularMod.IRootScopeService
import typingsSlinky.ngDashTable.srcCoreNgTableDefaultsMod.IDefaults
import typingsSlinky.ngDashTable.srcCoreNgTableParamsMod.IParamValues
import typingsSlinky.ngDashTable.srcCoreNgTableSettingsMod.ISettings
import typingsSlinky.ngDashTable.srcCoreNgTableSettingsMod.NgTableSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core", JSImport.Namespace)
@js.native
object srcCoreMod extends js.Object {
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typingsSlinky.ngDashTable.srcCoreDataMod.NgTableDefaultGetDataProvider
  
  @js.native
  class NgTableEventsChannel protected ()
    extends typingsSlinky.ngDashTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  
  @js.native
  class NgTableParams[T] ()
    extends typingsSlinky.ngDashTable.srcCoreNgTableParamsMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  
  val ngTableCoreModule: IModule = js.native
  /* static members */
  @js.native
  object NgTableEventsChannel extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableParams extends js.Object {
    @JSName("$log")
    var $log: js.Any = js.native
    @JSName("$q")
    var $q: js.Any = js.native
    var ngTableDefaults: js.Any = js.native
    var ngTableEventsChannel: js.Any = js.native
    var ngTableSettings: js.Any = js.native
    def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typingsSlinky.ngDashTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = js.native
  }
  
}

