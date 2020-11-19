package typingsSlinky.jupyterlabStatedb.statedbMod.StateDB

import typingsSlinky.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An in-memory string key/value data connector.
  */
@JSImport("@jupyterlab/statedb/lib/statedb", "StateDB.Connector")
@js.native
class Connector () extends IDataConnector[String, String, String, String] {
  
  var _storage: js.Any = js.native
}
