package typingsSlinky.atJupyterlabCoreutils.libStatedbMod.StateDB

import typingsSlinky.atJupyterlabCoreutils.Anon_IdsValuesArray
import typingsSlinky.atJupyterlabCoreutils.libInterfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An in-memory string key/value data connector.
  */
@JSImport("@jupyterlab/coreutils/lib/statedb", "StateDB.Connector")
@js.native
class Connector () extends IDataConnector[String, String, String] {
  var _storage: js.Any = js.native
  def list(query: String): js.Promise[Anon_IdsValuesArray] = js.native
}

