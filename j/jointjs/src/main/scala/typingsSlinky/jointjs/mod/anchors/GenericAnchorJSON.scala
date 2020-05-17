package typingsSlinky.jointjs.mod.anchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericAnchorJSON[K /* <: AnchorType */] extends js.Object {
  var args: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
  ] = js.native
  var name: K = js.native
}

object GenericAnchorJSON {
  @scala.inline
  def apply[K](name: K): GenericAnchorJSON[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericAnchorJSON[K]]
  }
  @scala.inline
  implicit class GenericAnchorJSONOps[Self[k] <: GenericAnchorJSON[k], K] (val x: Self[K]) extends AnyVal {
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
      value: /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
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

