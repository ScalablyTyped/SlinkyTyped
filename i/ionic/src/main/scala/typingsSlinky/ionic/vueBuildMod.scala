package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.VueBuildOptions
import typingsSlinky.ionic.libBuildMod.BuildRunner
import typingsSlinky.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/vue/build", JSImport.Namespace)
@js.native
object vueBuildMod extends js.Object {
  @js.native
  class VueBuildRunner protected () extends BuildRunner[VueBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
  }
  
}

