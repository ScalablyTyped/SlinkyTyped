package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CustomServeOptions
import typingsSlinky.ionic.libServeMod.ServeRunner
import typingsSlinky.ionic.libServeMod.ServeRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customServeMod {
  
  @JSImport("ionic/lib/project/custom/serve", "CustomServeRunner")
  @js.native
  class CustomServeRunner protected () extends ServeRunner[CustomServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
}
