package typingsSlinky.nodegit

import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.transferProgressMod.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/indexer", JSImport.Namespace)
@js.native
object indexerMod extends js.Object {
  @js.native
  class Indexer () extends js.Object {
    def commit(stats: TransferProgress): Double = js.native
    def free(): Unit = js.native
    def hash(): Oid = js.native
  }
  
}

