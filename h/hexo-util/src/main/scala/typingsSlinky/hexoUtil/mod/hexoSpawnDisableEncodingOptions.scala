package typingsSlinky.hexoUtil.mod

import typingsSlinky.hexoUtil.hexoUtilBooleans.`false`
import typingsSlinky.hexoUtil.hexoUtilStrings._empty
import typingsSlinky.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hexoSpawnDisableEncodingOptions extends SpawnOptions {
  var encoding: _empty | `false` | Null = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object hexoSpawnDisableEncodingOptions {
  @scala.inline
  def apply(): hexoSpawnDisableEncodingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hexoSpawnDisableEncodingOptions]
  }
  @scala.inline
  implicit class hexoSpawnDisableEncodingOptionsOps[Self <: hexoSpawnDisableEncodingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: _empty | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(null)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

