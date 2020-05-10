package typingsSlinky.pouchdbAdapterMemory.PouchDB.MemoryAdapter

import typingsSlinky.pouchdbAdapterMemory.pouchdbAdapterMemoryStrings.memory
import typingsSlinky.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryAdapterConfiguration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_MemoryAdapterConfiguration: memory = js.native
}

object MemoryAdapterConfiguration {
  @scala.inline
  def apply(adapter: memory): MemoryAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryAdapterConfiguration]
  }
  @scala.inline
  implicit class MemoryAdapterConfigurationOps[Self <: MemoryAdapterConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: memory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

