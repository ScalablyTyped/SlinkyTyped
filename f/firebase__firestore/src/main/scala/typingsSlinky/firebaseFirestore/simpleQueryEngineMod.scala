package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.queryEngineMod.QueryEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/simple_query_engine", JSImport.Namespace)
@js.native
object simpleQueryEngineMod extends js.Object {
  @js.native
  class SimpleQueryEngine () extends QueryEngine {
    var localDocumentsView: js.Any = js.native
  }
  
}

