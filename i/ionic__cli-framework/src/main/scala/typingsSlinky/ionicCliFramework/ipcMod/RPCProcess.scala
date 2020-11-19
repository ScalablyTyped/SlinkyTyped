package typingsSlinky.ionicCliFramework.ipcMod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.processMod.global.NodeJS.Process
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/utils/ipc", "RPCProcess")
@js.native
class RPCProcess () extends js.Object {
  def this(hasNameTimeout: RPCProcessOptions) = this()
  
  def call[R /* <: RPCResponse[_, js.Object] */](
    procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
    args: /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
  ] = js.native
  
  def end(): Unit = js.native
  
  val name: String = js.native
  
  var proc: js.UndefOr[ChildProcess] = js.native
  
  def register[R /* <: RPCResponse[_, js.Object] */](
    procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
    fn: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ /* args */ js.Any, 
      js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
      ]
    ]
  ): Unit = js.native
  
  var responseProcedures: Map[String, js.Function1[/* args */ js.Array[_], js.Promise[_]]] = js.native
  
  def start(proc: ChildProcess): Unit = js.native
  def start(proc: Process): Unit = js.native
  
  val timeout: Double = js.native
}
