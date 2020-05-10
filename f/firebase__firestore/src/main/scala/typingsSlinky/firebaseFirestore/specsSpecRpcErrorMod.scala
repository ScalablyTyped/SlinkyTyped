package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.utilErrorMod.Code
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_rpc_error", JSImport.Namespace)
@js.native
object specsSpecRpcErrorMod extends js.Object {
  @js.native
  class RpcError protected () extends Error {
    def this(code: Double, message: String) = this()
    def this(code: Code, message: String) = this()
    var code: Double = js.native
  }
  
}

