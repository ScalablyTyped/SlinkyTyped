package typingsSlinky.aureliaPal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleNameOptions extends js.Object {
  /**
    * Add the module to a chunk by name
    */
  var chunk: js.UndefOr[String] = js.native
  /**
    * Optionally declare which exports are used. This enables tree-shaking when only few out of many exports are used.
    */
  var exports: js.UndefOr[js.Array[String]] = js.native
}

object ModuleNameOptions {
  @scala.inline
  def apply(): ModuleNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleNameOptions]
  }
  @scala.inline
  implicit class ModuleNameOptionsOps[Self <: ModuleNameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk")(js.undefined)
        ret
    }
    @scala.inline
    def withExports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(js.undefined)
        ret
    }
  }
  
}

