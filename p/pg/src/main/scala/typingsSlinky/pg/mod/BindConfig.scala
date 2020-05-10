package typingsSlinky.pg.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindConfig extends js.Object {
  var binary: js.UndefOr[String] = js.native
  var portal: js.UndefOr[String] = js.native
  var statement: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[js.UndefOr[Buffer | Null | String]]] = js.native
}

object BindConfig {
  @scala.inline
  def apply(): BindConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindConfig]
  }
  @scala.inline
  implicit class BindConfigOps[Self <: BindConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withPortal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portal")(js.undefined)
        ret
    }
    @scala.inline
    def withStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[js.UndefOr[Buffer | Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

