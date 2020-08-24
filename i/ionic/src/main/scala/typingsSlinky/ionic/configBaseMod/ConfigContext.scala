package typingsSlinky.ionic.configBaseMod

import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.IProjectConfig
import typingsSlinky.ionic.ionicBooleans.`false`
import typingsSlinky.ionic.ionicBooleans.`true`
import typingsSlinky.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.configBaseMod.GlobalConfigContext
  - typingsSlinky.ionic.configBaseMod.ProjectConfigContext
*/
trait ConfigContext extends js.Object

object ConfigContext {
  @scala.inline
  def GlobalConfigContext(config: IConfig, force: Boolean, global: `true`, json: Boolean, root: Boolean): ConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigContext]
  }
  @scala.inline
  def ProjectConfigContext(config: BaseConfig[IProjectConfig], force: Boolean, global: `false`, json: Boolean, root: Boolean): ConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigContext]
  }
}

