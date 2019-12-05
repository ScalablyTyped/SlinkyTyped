package typingsSlinky.i18nextDashNodeDashFsDashBackend.i18nextDashNodeDashFsDashBackendMod

import typingsSlinky.i18next.i18nextMod.BackendModule
import typingsSlinky.i18next.i18nextMod.Services
import typingsSlinky.i18nextDashNodeDashFsDashBackend.i18nextDashNodeDashFsDashBackendStrings.backend
import typingsSlinky.i18nextDashNodeDashFsDashBackend.i18nextNodeFsBackEnd.i18nextNodeFsBackEndOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend extends BackendModule[i18nextNodeFsBackEndOptions] {
  @JSName("type")
  var type_Backend: backend = js.native
  def init(services: Services): Unit = js.native
  def init(services: Services, backendOptions: i18nextNodeFsBackEndOptions): Unit = js.native
}

