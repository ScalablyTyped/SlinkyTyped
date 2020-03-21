package typingsSlinky.maquette

import typingsSlinky.maquette.interfacesMod.Projector
import typingsSlinky.maquette.interfacesMod.ProjectorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/projector", JSImport.Namespace)
@js.native
object projectorMod extends js.Object {
  var createProjector: js.Function1[/* projectorOptions */ js.UndefOr[ProjectorOptions], Projector] = js.native
}

