package typingsSlinky.connectSequence.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-sequence", JSImport.Namespace)
@js.native
class ^ protected () extends ConnectSequence {
  def this(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction) = this()
  /* CompleteClass */
  override def append(middleware: (RequestHandler[ParamsDictionary, _, _, Query])*): this.type = js.native
  /* CompleteClass */
  override def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary, _, _, Query]): this.type = js.native
  /* CompleteClass */
  override def appendList(middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type = js.native
  /* CompleteClass */
  override def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type = js.native
  /* CompleteClass */
  override def run(): Unit = js.native
}

