package typingsSlinky.connectSequence.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectSequence extends js.Object {
  def append(middleware: (RequestHandler[ParamsDictionary, _, _, Query])*): this.type = js.native
  def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary, _, _, Query]): this.type = js.native
  def appendList(middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type = js.native
  def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type = js.native
  def run(): Unit = js.native
}

object ConnectSequence {
  @scala.inline
  def apply(
    append: /* repeated */ RequestHandler[ParamsDictionary, _, _, Query] => ConnectSequence,
    appendIf: (Boolean, RequestHandler[ParamsDictionary, _, _, Query]) => ConnectSequence,
    appendList: js.Array[RequestHandler[ParamsDictionary, _, _, Query]] => ConnectSequence,
    appendListIf: (Boolean, js.Array[RequestHandler[ParamsDictionary, _, _, Query]]) => ConnectSequence,
    run: () => Unit
  ): ConnectSequence = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendIf = js.Any.fromFunction2(appendIf), appendList = js.Any.fromFunction1(appendList), appendListIf = js.Any.fromFunction2(appendListIf), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[ConnectSequence]
  }
  @scala.inline
  implicit class ConnectSequenceOps[Self <: ConnectSequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: /* repeated */ RequestHandler[ParamsDictionary, _, _, Query] => ConnectSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendIf(value: (Boolean, RequestHandler[ParamsDictionary, _, _, Query]) => ConnectSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendIf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAppendList(value: js.Array[RequestHandler[ParamsDictionary, _, _, Query]] => ConnectSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendListIf(value: (Boolean, js.Array[RequestHandler[ParamsDictionary, _, _, Query]]) => ConnectSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendListIf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

