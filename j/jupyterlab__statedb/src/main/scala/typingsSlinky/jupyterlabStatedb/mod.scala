package typingsSlinky.jupyterlabStatedb

import typingsSlinky.jupyterlabStatedb.restorablepoolMod.RestorablePool.IOptions
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoDisposable.mod.IObservableDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/statedb", "DataConnector")
  @js.native
  abstract class DataConnector[T, U, V, W] ()
    extends typingsSlinky.jupyterlabStatedb.dataconnectorMod.DataConnector[T, U, V, W]
  
  @JSImport("@jupyterlab/statedb", "IStateDB")
  @js.native
  val IStateDB: Token[typingsSlinky.jupyterlabStatedb.tokensMod.IStateDB[ReadonlyPartialJSONValue]] = js.native
  
  @JSImport("@jupyterlab/statedb", "RestorablePool")
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
  
  @JSImport("@jupyterlab/statedb", "StateDB")
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
  object StateDB {
    
    /**
      * An in-memory string key/value data connector.
      */
    @JSImport("@jupyterlab/statedb", "StateDB.Connector")
    @js.native
    class Connector ()
      extends typingsSlinky.jupyterlabStatedb.statedbMod.StateDB.Connector
  }
}
