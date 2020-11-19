package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgSubsetMod.IClient
import typingsSlinky.pgPromise.pgSubsetMod.IConnectionParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Database full protocol;
// API: http://vitaly-t.github.io/pg-promise/Database.html
//
// We export this interface only to be able to help IntelliSense cast extension types correctly,
// which doesn't always work, depending on the version of IntelliSense being used.
@js.native
trait IDatabase[Ext, C /* <: IClient */] extends IBaseProtocol[Ext] {
  
  @JSName("$cn")
  val $cn: String | IConnectionParameters[C] = js.native
  
  /////////////////////////////////////////////////////////////////////////////
  // Hidden, read-only properties, for integrating with third-party libraries:
  @JSName("$config")
  val $config: ILibConfig[Ext, C] = js.native
  
  @JSName("$dc")
  val $dc: js.Any = js.native
  
  @JSName("$pool")
  val $pool: js.Any = js.native
  
  def connect(): XPromise[IConnected[Ext, C]] = js.native
  def connect(options: IConnectionOptions[C]): XPromise[IConnected[Ext, C]] = js.native
}
