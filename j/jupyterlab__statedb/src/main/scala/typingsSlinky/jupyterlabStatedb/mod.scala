package typingsSlinky.jupyterlabStatedb

import typingsSlinky.jupyterlabStatedb.restorablepoolMod.RestorablePool.IOptions
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statedb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class DataConnector[T, U, V, W] ()
    extends typingsSlinky.jupyterlabStatedb.dataconnectorMod.DataConnector[T, U, V, W]
  
  @js.native
  class RestorablePool[T /* <: IObservableDisposable */] protected ()
    extends typingsSlinky.jupyterlabStatedb.restorablepoolMod.RestorablePool[T] {
    /**
      * Create a new restorable pool.
      *
      * @param options - The instantiation options for a restorable pool.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Create a new state database.
    *
    * @param options - The instantiation options for a state database.
    */
  class StateDB[T /* <: ReadonlyPartialJSONValue */] ()
    extends typingsSlinky.jupyterlabStatedb.statedbMod.StateDB[T] {
    def this(options: typingsSlinky.jupyterlabStatedb.statedbMod.StateDB.IOptions[T]) = this()
  }
  
  val IStateDB: Token[typingsSlinky.jupyterlabStatedb.tokensMod.IStateDB[ReadonlyPartialJSONValue]] = js.native
  @js.native
  object StateDB extends js.Object {
    /**
      * An in-memory string key/value data connector.
      */
    @js.native
    class Connector ()
      extends typingsSlinky.jupyterlabStatedb.statedbMod.StateDB.Connector
    
  }
  
}

