package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaUtilsMod {
  
  @JSImport("ionic/lib/integrations/cordova/utils", "filterArgumentsForCordova")
  @js.native
  def filterArgumentsForCordova(metadata: CommandMetadata, options: CommandLineOptions): js.Array[String] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/utils", "generateOptionsForCordovaBuild")
  @js.native
  def generateOptionsForCordovaBuild(metadata: CommandMetadata, inputs: CommandLineInputs, options: CommandLineOptions): CommandLineOptions = js.native
}
