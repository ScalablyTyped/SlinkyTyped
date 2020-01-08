package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.ReactServeOptions
import typingsSlinky.ionic.ionicStrings.`React Scripts`
import typingsSlinky.ionic.ionicStrings.`react-scripts`
import typingsSlinky.ionic.ionicStrings.ionicColonserve
import typingsSlinky.ionic.libServeMod.ServeCLI
import typingsSlinky.ionic.libServeMod.ServeRunner
import typingsSlinky.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/react/serve", JSImport.Namespace)
@js.native
object libProjectReactServeMod extends js.Object {
  @js.native
  class ReactServeCLI () extends ServeCLI[ReactServeOptions] {
    var chunks: Double = js.native
    @JSName("name")
    val name_ReactServeCLI: `React Scripts` = js.native
    @JSName("pkg")
    val pkg_ReactServeCLI: `react-scripts` = js.native
    @JSName("prefix")
    val prefix_ReactServeCLI: `react-scripts` = js.native
    @JSName("program")
    val program_ReactServeCLI: `react-scripts` = js.native
    @JSName("script")
    val script_ReactServeCLI: ionicColonserve = js.native
  }
  
  @js.native
  class ReactServeRunner protected () extends ServeRunner[ReactServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

