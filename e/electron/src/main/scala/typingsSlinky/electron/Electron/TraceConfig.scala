package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceConfig extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/trace-config
  var excluded_categories: js.UndefOr[js.Array[String]] = js.undefined
  var included_categories: js.UndefOr[js.Array[String]] = js.undefined
  var memory_dump_config: js.UndefOr[MemoryDumpConfig] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExcluded_categories(value: js.Array[String]): Self = this.set("excluded_categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcluded_categories: Self = this.set("excluded_categories", js.undefined)
    @scala.inline
    def setIncluded_categories(value: js.Array[String]): Self = this.set("included_categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncluded_categories: Self = this.set("included_categories", js.undefined)
    @scala.inline
    def setMemory_dump_config(value: MemoryDumpConfig): Self = this.set("memory_dump_config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory_dump_config: Self = this.set("memory_dump_config", js.undefined)
  }
  
}

