package typingsSlinky.enhancedResolve.fileKindPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileKindPlugin extends js.Object {
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit
}

object FileKindPlugin {
  @scala.inline
  def apply(apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit, source: String, target: String): FileKindPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileKindPlugin]
  }
}

