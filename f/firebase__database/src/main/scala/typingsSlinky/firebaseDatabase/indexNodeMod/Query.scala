package typingsSlinky.firebaseDatabase.indexNodeMod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.firebaseDatabase.pathMod.Path
import typingsSlinky.firebaseDatabase.queryParamsMod.QueryParams
import typingsSlinky.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/index.node", "Query")
@js.native
class Query protected ()
  extends typingsSlinky.firebaseDatabase.queryMod.Query {
  def this(repo: Repo, path: Path, queryParams_ : QueryParams, orderByCalled_ : Boolean) = this()
}
/* static members */
@JSImport("@firebase/database/dist/index.node", "Query")
@js.native
object Query extends js.Object {
  
  def __referenceConstructor: Instantiable2[/* repo */ Repo, /* path */ Path, typingsSlinky.firebaseDatabase.queryMod.Query] = js.native
  def __referenceConstructor_=(
    `val`: Instantiable2[/* repo */ Repo, /* path */ Path, typingsSlinky.firebaseDatabase.queryMod.Query]
  ): Unit = js.native
  
  /**
    * Helper used by .on and .once to extract the context and or cancel arguments.
    * @param {!string} fnName The function name (on or once)
    * @param {(function(Error)|Object)=} cancelOrContext
    * @param {Object=} context
    * @return {{cancel: ?function(Error), context: ?Object}}
    * @private
    */
  var getCancelAndContextArgs_ : js.Any = js.native
  
  /**
    * Validates that limit* has been called with the correct combination of parameters
    * @param {!QueryParams} params
    * @private
    */
  var validateLimit_ : js.Any = js.native
  
  /**
    * Validates start/end values for queries.
    * @param {!QueryParams} params
    * @private
    */
  var validateQueryEndpoints_ : js.Any = js.native
}
