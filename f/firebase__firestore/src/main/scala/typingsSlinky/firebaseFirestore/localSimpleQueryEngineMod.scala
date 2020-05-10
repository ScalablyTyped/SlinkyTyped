package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.localQueryEngineMod.QueryEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/simple_query_engine", JSImport.Namespace)
@js.native
object localSimpleQueryEngineMod extends js.Object {
  @js.native
  class SimpleQueryEngine () extends QueryEngine {
    var localDocumentsView: js.Any = js.native
  }
  
}

