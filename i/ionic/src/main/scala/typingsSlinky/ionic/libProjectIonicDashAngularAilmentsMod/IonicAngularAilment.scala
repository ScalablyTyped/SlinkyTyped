package typingsSlinky.ionic.libProjectIonicDashAngularAilmentsMod

import typingsSlinky.ionic.definitionsMod.ProjectType
import typingsSlinky.ionic.libDoctorMod.Ailment
import typingsSlinky.ionic.libProjectIonicDashAngularMod.IonicAngularProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularAilment")
@js.native
abstract class IonicAngularAilment protected () extends Ailment {
  def this(deps: IonicAngularAilmentDeps) = this()
  @JSName("project")
  val project_IonicAngularAilment: IonicAngularProject = js.native
  @JSName("projects")
  val projects_IonicAngularAilment: js.Array[ProjectType] = js.native
}

