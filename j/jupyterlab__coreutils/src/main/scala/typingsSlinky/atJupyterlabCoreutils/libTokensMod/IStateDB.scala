package typingsSlinky.atJupyterlabCoreutils.libTokensMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atJupyterlabCoreutils.libInterfacesMod.IDataConnector
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typingsSlinky.atPhosphorCoreutils.libJsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateDB[T /* <: ReadonlyJSONValue */] extends IDataConnector[T, T, String] {
  /**
    * Return a serialized copy of the state database's entire contents.
    *
    * @returns A promise that bears the database contents as JSON.
    */
  def toJSON(): js.Promise[StringDictionary[T]] = js.native
}

@JSImport("@jupyterlab/coreutils/lib/tokens", "IStateDB")
@js.native
object IStateDB extends TopLevel[Token[IStateDB[ReadonlyJSONValue]]]

