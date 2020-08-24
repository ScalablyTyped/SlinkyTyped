package typingsSlinky.i18nextNodeFsBackend.mod

import typingsSlinky.i18next.mod.BackendModule
import typingsSlinky.i18next.mod.InitOptions
import typingsSlinky.i18next.mod.Services
import typingsSlinky.i18nextNodeFsBackend.i18nextNodeFsBackEnd.i18nextNodeFsBackEndOptions
import typingsSlinky.i18nextNodeFsBackend.i18nextNodeFsBackendStrings.backend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend extends BackendModule[i18nextNodeFsBackEndOptions] {
  @JSName("type")
  var type_Backend: backend = js.native
  def init(services: Services): Unit = js.native
  def init(services: Services, backendOptions: js.UndefOr[scala.Nothing], i18nextOptions: InitOptions): Unit = js.native
  def init(services: Services, backendOptions: i18nextNodeFsBackEndOptions): Unit = js.native
}

