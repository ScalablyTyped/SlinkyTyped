package typingsSlinky.jestEnvironment.mod

import typingsSlinky.jestEnvironment.anon.EVALRESULTVARIABLE
import typingsSlinky.jestFakeTimers.mod.JestFakeTimers
import typingsSlinky.jestMock.mod.ModuleMocker
import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.State
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.jestTypes.globalMod.Global
import typingsSlinky.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/environment", "JestEnvironment")
@js.native
class JestEnvironment protected () extends js.Object {
  def this(config: ProjectConfig) = this()
  def this(config: ProjectConfig, context: EnvironmentContext) = this()
  var fakeTimers: JestFakeTimers[_] | Null = js.native
  var global: Global = js.native
  var handleTestEvent: js.UndefOr[js.Function2[/* event */ Event, /* state */ State, Unit]] = js.native
  var moduleMocker: ModuleMocker | Null = js.native
  def runScript(script: Script): EVALRESULTVARIABLE | Null = js.native
  def setup(): js.Promise[Unit] = js.native
  def teardown(): js.Promise[Unit] = js.native
}

