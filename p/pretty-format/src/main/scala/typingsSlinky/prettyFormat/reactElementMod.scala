package typingsSlinky.prettyFormat

import typingsSlinky.prettyFormat.typesMod.Config
import typingsSlinky.prettyFormat.typesMod.NewPlugin
import typingsSlinky.prettyFormat.typesMod.Printer
import typingsSlinky.prettyFormat.typesMod.Refs
import typingsSlinky.prettyFormat.typesMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pretty-format/build/plugins/ReactElement", JSImport.Namespace)
@js.native
object reactElementMod extends js.Object {
  
  val default: NewPlugin = js.native
  
  val serialize: js.Function6[
    /* val */ js.Any, 
    /* config */ Config, 
    /* indentation */ String, 
    /* depth */ Double, 
    /* refs */ Refs, 
    /* printer */ Printer, 
    String
  ] = js.native
  
  val test: Test = js.native
}
