package typingsSlinky.ionic.libServeMod

import typingsSlinky.ionic.definitionsMod.NpmClient
import typingsSlinky.ionic.definitionsMod.ServeOptions
import typingsSlinky.ionic.ionicNumbers.`true`
import typingsSlinky.ionic.ionicStrings.`ionic:serve`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkgManagerServeCLI extends ServeCLI[ServeOptions] {
  @JSName("global")
  val global_PkgManagerServeCLI: `true` = js.native
  @JSName("program")
  val program_PkgManagerServeCLI: NpmClient = js.native
  @JSName("script")
  val script_PkgManagerServeCLI: `ionic:serve` = js.native
}

