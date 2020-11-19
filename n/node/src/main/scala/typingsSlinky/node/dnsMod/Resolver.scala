package typingsSlinky.node.dnsMod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.Typeofresolve
import typingsSlinky.node.anon.Typeofresolve4
import typingsSlinky.node.anon.Typeofresolve6
import typingsSlinky.node.anon.TypeofresolveAny
import typingsSlinky.node.anon.TypeofresolveCname
import typingsSlinky.node.anon.TypeofresolveMx
import typingsSlinky.node.anon.TypeofresolveNaptr
import typingsSlinky.node.anon.TypeofresolveNs
import typingsSlinky.node.anon.TypeofresolvePtr
import typingsSlinky.node.anon.TypeofresolveSoa
import typingsSlinky.node.anon.TypeofresolveSrv
import typingsSlinky.node.anon.TypeofresolveTxt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dns", "Resolver")
@js.native
class Resolver () extends js.Object {
  
  def cancel(): Unit = js.native
  
  def getServers(): js.Array[String] = js.native
  @JSName("getServers")
  var getServers_Original: js.Function0[js.Array[String]] = js.native
  
  var resolve: Typeofresolve = js.native
  
  var resolve4: Typeofresolve4 = js.native
  
  var resolve6: Typeofresolve6 = js.native
  
  var resolveAny: TypeofresolveAny = js.native
  
  var resolveCname: TypeofresolveCname = js.native
  
  var resolveMx: TypeofresolveMx = js.native
  
  var resolveNaptr: TypeofresolveNaptr = js.native
  
  var resolveNs: TypeofresolveNs = js.native
  
  var resolvePtr: TypeofresolvePtr = js.native
  
  var resolveSoa: TypeofresolveSoa = js.native
  
  var resolveSrv: TypeofresolveSrv = js.native
  
  var resolveTxt: TypeofresolveTxt = js.native
  
  def reverse(
    ip: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("reverse")
  var reverse_Original: js.Function2[
    /* ip */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit], 
    Unit
  ] = js.native
  
  def setServers(servers: js.Array[String]): Unit = js.native
  @JSName("setServers")
  var setServers_Original: js.Function1[/* servers */ js.Array[String], Unit] = js.native
}
