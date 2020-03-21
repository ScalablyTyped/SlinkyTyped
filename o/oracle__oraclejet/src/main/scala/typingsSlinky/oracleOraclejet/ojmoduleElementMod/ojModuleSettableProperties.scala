package typingsSlinky.oracleOraclejet.ojmoduleElementMod

import typingsSlinky.oracleOraclejet.AnonCleanupMode
import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojModuleSettableProperties extends JetSettableProperties {
  var animation: js.Object
  var config: AnonCleanupMode
}

object ojModuleSettableProperties {
  @scala.inline
  def apply(animation: js.Object, config: AnonCleanupMode): ojModuleSettableProperties = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojModuleSettableProperties]
  }
}

