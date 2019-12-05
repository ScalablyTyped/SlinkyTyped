package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.AngularBuildOptions
import typingsSlinky.ionic.ionicStrings.`@angular/cli`
import typingsSlinky.ionic.ionicStrings.`Angular CLI`
import typingsSlinky.ionic.ionicStrings.`ionic:build`
import typingsSlinky.ionic.ionicStrings.ng
import typingsSlinky.ionic.libBuildMod.BuildCLI
import typingsSlinky.ionic.libBuildMod.BuildRunner
import typingsSlinky.ionic.libBuildMod.BuildRunnerDeps
import typingsSlinky.ionic.libProjectAngularBuildMod.AngularBuildRunnerDeps
import typingsSlinky.ionic.libProjectAngularMod.AngularProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/angular/build", JSImport.Namespace)
@js.native
object libProjectAngularBuildMod extends js.Object {
  @js.native
  class AngularBuildCLI () extends BuildCLI[AngularBuildOptions] {
    @JSName("name")
    val name_AngularBuildCLI: `Angular CLI` = js.native
    @JSName("pkg")
    val pkg_AngularBuildCLI: `@angular/cli` = js.native
    val prefix: ng = js.native
    @JSName("program")
    val program_AngularBuildCLI: ng = js.native
    @JSName("script")
    val script_AngularBuildCLI: `ionic:build` = js.native
    /* protected */ def buildArchitectCommand(options: AngularBuildOptions): js.Array[String] = js.native
    /* protected */ def buildOptionsToNgArgs(options: AngularBuildOptions): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  class AngularBuildRunner protected () extends BuildRunner[AngularBuildOptions] {
    def this(e: AngularBuildRunnerDeps) = this()
    @JSName("e")
    val e_AngularBuildRunner: AngularBuildRunnerDeps = js.native
  }
  
  @js.native
  trait AngularBuildRunnerDeps extends BuildRunnerDeps {
    @JSName("project")
    val project_AngularBuildRunnerDeps: AngularProject = js.native
  }
  
}

