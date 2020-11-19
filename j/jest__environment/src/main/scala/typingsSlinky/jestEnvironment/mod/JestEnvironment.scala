package typingsSlinky.jestEnvironment.mod

import typingsSlinky.jestMock.mod.ModuleMocker
import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.State
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.jestTypes.globalMod.Global
import typingsSlinky.node.vmMod.Context
import typingsSlinky.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/environment", "JestEnvironment")
@js.native
class JestEnvironment protected () extends js.Object {
  def this(config: ProjectConfig) = this()
  def this(config: ProjectConfig, context: EnvironmentContext) = this()
  
  var fakeTimers: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyFakeTimers<unknown> */ js.Any) | Null = js.native
  
  var fakeTimersModern: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ModernFakeTimers */ js.Any) | Null = js.native
  
  var getVmContext: js.UndefOr[js.Function0[Context | Null]] = js.native
  
  var global: Global = js.native
  
  var handleTestEvent: js.UndefOr[js.Function2[/* event */ Event, /* state */ State, Unit | js.Promise[Unit]]] = js.native
  
  var moduleMocker: ModuleMocker | Null = js.native
  
  /**
    * @deprecated implement getVmContext instead
    */
  def runScript[T](script: Script): T | Null = js.native
  
  def setup(): js.Promise[Unit] = js.native
  
  def teardown(): js.Promise[Unit] = js.native
}
