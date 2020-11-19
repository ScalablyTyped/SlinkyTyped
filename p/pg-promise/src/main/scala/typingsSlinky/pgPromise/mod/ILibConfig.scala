package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgSubsetMod.IClient
import typingsSlinky.pgPromise.pgSubsetMod.IConnectionParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// API: http://vitaly-t.github.io/pg-promise/Database.html#$config
@js.native
trait ILibConfig[Ext, C /* <: IClient */] extends js.Object {
  
  @JSName("$npm")
  var $npm: js.Any = js.native
  
  var options: IInitOptions[Ext, C] = js.native
  
  def pgp[T, C /* <: IClient */](cn: String): (IDatabase[T, C]) with T = js.native
  def pgp[T, C /* <: IClient */](cn: String, dc: js.Any): (IDatabase[T, C]) with T = js.native
  def pgp[T, C /* <: IClient */](cn: IConnectionParameters[C]): (IDatabase[T, C]) with T = js.native
  def pgp[T, C /* <: IClient */](cn: IConnectionParameters[C], dc: js.Any): (IDatabase[T, C]) with T = js.native
  @JSName("pgp")
  var pgp_Original: IMain[Ext, C] = js.native
  
  def promise(
    cb: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): XPromise[_] = js.native
  
  var promiseLib: js.Any = js.native
  
  @JSName("promise")
  var promise_Original: IGenericPromise = js.native
  
  var version: String = js.native
}
