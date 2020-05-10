package typingsSlinky.jestRunner.testWorkerMod

import typingsSlinky.jestHasteMap.mod.SerializableModuleMap
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializableResolver extends js.Object {
  var config: ProjectConfig = js.native
  var serializableModuleMap: SerializableModuleMap = js.native
}

object SerializableResolver {
  @scala.inline
  def apply(config: ProjectConfig, serializableModuleMap: SerializableModuleMap): SerializableResolver = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], serializableModuleMap = serializableModuleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableResolver]
  }
  @scala.inline
  implicit class SerializableResolverOps[Self <: SerializableResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ProjectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializableModuleMap(value: SerializableModuleMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializableModuleMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

