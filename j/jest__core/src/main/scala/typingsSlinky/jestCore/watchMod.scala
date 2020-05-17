package typingsSlinky.jestCore

import typingsSlinky.jestCore.typesMod.Filter
import typingsSlinky.jestHasteMap.mod.^
import typingsSlinky.jestRuntime.mod.Context
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/watch", JSImport.Namespace)
@js.native
object watchMod extends js.Object {
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^]
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHook */ js.Any
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHook */ js.Any,
    filter: Filter
  ): js.Promise[Unit] = js.native
}

