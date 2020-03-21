package typingsSlinky.jestCore

import typingsSlinky.jestHasteMap.typesMod.HasteMap
import typingsSlinky.jestRuntime.typesMod.Context
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/create_context", JSImport.Namespace)
@js.native
object createContextMod extends js.Object {
  def default(config: ProjectConfig, hasHasteFSModuleMap: HasteMap): Context = js.native
}

