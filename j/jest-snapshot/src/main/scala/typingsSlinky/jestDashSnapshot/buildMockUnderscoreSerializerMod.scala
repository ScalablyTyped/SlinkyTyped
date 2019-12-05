package typingsSlinky.jestDashSnapshot

import typingsSlinky.prettyDashFormat.buildTypesMod.Config
import typingsSlinky.prettyDashFormat.buildTypesMod.Printer
import typingsSlinky.prettyDashFormat.buildTypesMod.Refs
import typingsSlinky.prettyDashFormat.buildTypesMod.Test
import typingsSlinky.prettyDashFormat.prettyDashFormatMod.NewPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot/build/mock_serializer", JSImport.Namespace)
@js.native
object buildMockUnderscoreSerializerMod extends js.Object {
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

