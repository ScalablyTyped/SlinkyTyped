package typingsSlinky.apolloProtobufjs

import typingsSlinky.apolloProtobufjs.pbjsMod.pbjsCallback
import typingsSlinky.apolloProtobufjs.pbtsMod.pbtsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  
  @js.native
  object pbjs extends js.Object {
    
    def main(args: js.Array[String]): js.UndefOr[Double] = js.native
    def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = js.native
  }
  
  @js.native
  object pbts extends js.Object {
    
    def main(args: js.Array[String]): js.UndefOr[Double] = js.native
    def main(args: js.Array[String], callback: pbtsCallback): js.UndefOr[Double] = js.native
  }
}
