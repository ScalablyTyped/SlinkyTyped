package typingsSlinky.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheetOptions extends StyleSheetFactoryOptions {
  
  var Renderer: typingsSlinky.jss.mod.Renderer = js.native
  
  @JSName("generateId")
  def generateId_MStyleSheetOptions(rule: Rule): String = js.native
  @JSName("generateId")
  def generateId_MStyleSheetOptions(rule: Rule, sheet: StyleSheet[String]): String = js.native
  @JSName("generateId")
  var generateId_Original: GenerateId = js.native
  
  @JSName("index")
  var index_StyleSheetOptions: Double = js.native
  
  var insertionPoint: js.UndefOr[InsertionPoint] = js.native
  
  var jss: Jss = js.native
}
