package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CustomBuildOptions
import typingsSlinky.ionic.libBuildMod.BuildRunner
import typingsSlinky.ionic.libBuildMod.BuildRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customBuildMod {
  
  @JSImport("ionic/lib/project/custom/build", "CustomBuildRunner")
  @js.native
  class CustomBuildRunner protected () extends BuildRunner[CustomBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
  }
}
