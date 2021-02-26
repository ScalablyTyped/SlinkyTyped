package typingsSlinky.ionic

import typingsSlinky.ionic.ionicStrings.custom
import typingsSlinky.ionic.libProjectMod.Project
import typingsSlinky.ionic.libProjectMod.ProjectDeps
import typingsSlinky.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customMod {
  
  @JSImport("ionic/lib/project/custom", "CustomProject")
  @js.native
  class CustomProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_CustomProject: custom = js.native
  }
}
