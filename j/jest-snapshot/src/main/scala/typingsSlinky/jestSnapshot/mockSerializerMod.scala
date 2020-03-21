package typingsSlinky.jestSnapshot

import typingsSlinky.prettyFormat.mod.NewPlugin
import typingsSlinky.prettyFormat.typesMod.Config
import typingsSlinky.prettyFormat.typesMod.Printer
import typingsSlinky.prettyFormat.typesMod.Refs
import typingsSlinky.prettyFormat.typesMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot/build/mock_serializer", JSImport.Namespace)
@js.native
object mockSerializerMod extends js.Object {
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

