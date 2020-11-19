package typingsSlinky.graphqlToolsLoad

import typingsSlinky.graphqlToolsLoad.anon.PartialSource
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/load/load-typedefs/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  
  def parseSource(hasPartialSourceOptionsGlobOptionsPointerOptionMapAddValidSource: ParseOptions): Unit = js.native
  
  @js.native
  trait ParseOptions extends js.Object {
    
    def addValidSource(source: Source): Unit = js.native
    @JSName("addValidSource")
    var addValidSource_Original: AddValidSource = js.native
    
    var globOptions: js.Any = js.native
    
    var options: js.Any = js.native
    
    var partialSource: PartialSource = js.native
    
    var pointerOptionMap: js.Any = js.native
  }
  
  type AddValidSource = js.Function1[/* source */ Source, Unit]
}
