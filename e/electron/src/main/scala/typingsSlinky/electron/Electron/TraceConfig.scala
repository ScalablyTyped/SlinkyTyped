package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceConfig extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/trace-config
  var excluded_categories: js.UndefOr[js.Array[String]] = js.native
  var included_categories: js.UndefOr[js.Array[String]] = js.native
  var memory_dump_config: js.UndefOr[MemoryDumpConfig] = js.native
}

object TraceConfig {
  @scala.inline
  def apply(): TraceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceConfig]
  }
  @scala.inline
  implicit class TraceConfigOps[Self <: TraceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcluded_categories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded_categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcluded_categories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded_categories")(js.undefined)
        ret
    }
    @scala.inline
    def withIncluded_categories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included_categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncluded_categories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included_categories")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory_dump_config(value: MemoryDumpConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory_dump_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory_dump_config: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory_dump_config")(js.undefined)
        ret
    }
  }
  
}

