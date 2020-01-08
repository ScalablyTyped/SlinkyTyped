package typingsSlinky.eslintDashPluginDashReact.libTypesMod._Global_

import typingsSlinky.eslintDashPluginDashReact.eslintDashPluginDashReactBooleans.`true`
import typingsSlinky.eslintDashPluginDashReact.eslintDashPluginDashReactStrings.shape
import typingsSlinky.eslintDashPluginDashReact.eslintDashPluginDashReactStrings.union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeDefinition extends js.Object {
  var children: UnionTypeDefinitionChildren | `true`
  var `type`: union | shape
}

object UnionTypeDefinition {
  @scala.inline
  def apply(children: UnionTypeDefinitionChildren | `true`, `type`: union | shape): UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeDefinition]
  }
}

