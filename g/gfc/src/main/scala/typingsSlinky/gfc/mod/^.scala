package typingsSlinky.gfc.mod

import typingsSlinky.gfc.anon.Stderr
import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.ExecException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gfc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): js.Promise[Stderr] = js.native
  def apply(cwd: String): js.Promise[Stderr] = js.native
  def apply(
    cwd: String,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): Unit = js.native
  def apply(cwd: String, options: Options[ExecOptionsWithEncoding]): js.Promise[Stderr] = js.native
  def apply(
    cwd: String,
    options: Options[ExecOptionsWithEncoding],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): Unit = js.native
  def apply(options: Options[ExecOptionsWithEncoding]): js.Promise[Stderr] = js.native
}
