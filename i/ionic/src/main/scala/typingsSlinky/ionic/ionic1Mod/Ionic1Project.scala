package typingsSlinky.ionic.ionic1Mod

import typingsSlinky.ionic.ionicStrings.ionic1
import typingsSlinky.ionic.libProjectMod.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/ionic1", "Ionic1Project")
@js.native
class Ionic1Project () extends Project {
  
  var bowerJsonFile: js.UndefOr[BowerJson] = js.native
  
  def getFrameworkVersion(): js.Promise[js.UndefOr[String]] = js.native
  
  def loadBowerJson(): js.Promise[BowerJson] = js.native
  
  @JSName("type")
  val type_Ionic1Project: ionic1 = js.native
}
