package typingsSlinky.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import typingsSlinky.atJupyterlabCoreutils.libStatedbMod.StateDB.IOptions
import typingsSlinky.atPhosphorCoreutils.libJsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "StateDB")
@js.native
/**
  * Create a new state database.
  *
  * @param options - The instantiation options for a state database.
  */
class StateDB[T /* <: ReadonlyJSONValue */] ()
  extends typingsSlinky.atJupyterlabCoreutils.libStatedbMod.StateDB[T] {
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/coreutils", "StateDB")
@js.native
object StateDB extends js.Object {
  /**
    * An in-memory string key/value data connector.
    */
  @js.native
  class Connector ()
    extends typingsSlinky.atJupyterlabCoreutils.libStatedbMod.StateDB.Connector
  
}

