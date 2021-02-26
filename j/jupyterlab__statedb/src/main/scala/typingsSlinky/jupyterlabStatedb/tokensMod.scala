package typingsSlinky.jupyterlabStatedb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabStatedb.interfacesMod.IDataConnector
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait IStateDB[T /* <: ReadonlyPartialJSONValue */] extends IDataConnector[T, T, String, String] {
    
    /**
      * Return a serialized copy of the state database's entire contents.
      *
      * @returns A promise that bears the database contents as JSON.
      */
    def toJSON(): js.Promise[StringDictionary[T]] = js.native
  }
  @JSImport("@jupyterlab/statedb/lib/tokens", "IStateDB")
  @js.native
  val IStateDB: Token[typingsSlinky.jupyterlabStatedb.tokensMod.IStateDB[ReadonlyPartialJSONValue]] = js.native
}
