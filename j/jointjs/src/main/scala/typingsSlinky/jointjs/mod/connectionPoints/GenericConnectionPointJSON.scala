package typingsSlinky.jointjs.mod.connectionPoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericConnectionPointJSON[K /* <: ConnectionPointType */] extends js.Object {
  var args: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
  ] = js.native
  var name: K = js.native
}

object GenericConnectionPointJSON {
  @scala.inline
  def apply[K](name: K): GenericConnectionPointJSON[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericConnectionPointJSON[K]]
  }
  @scala.inline
  implicit class GenericConnectionPointJSONOps[Self[k] <: GenericConnectionPointJSON[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withName(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
    ): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
  }
  
}

