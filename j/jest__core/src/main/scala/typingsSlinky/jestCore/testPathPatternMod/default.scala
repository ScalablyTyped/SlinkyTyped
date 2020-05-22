package typingsSlinky.jestCore.testPathPatternMod

import typingsSlinky.jestCore.anon.Key
import typingsSlinky.jestCore.anon.Stdin
import typingsSlinky.jestCore.jestCoreBooleans.`true`
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/test_path_pattern", JSImport.Default)
@js.native
class default protected () extends TestPathPatternPlugin {
  def this(options: Stdin) = this()
  /* CompleteClass */
  override var _prompt: js.Any = js.native
  /* CompleteClass */
  override var isInternal: `true` = js.native
  /* CompleteClass */
  override def getUsageInfo(): Key = js.native
  /* CompleteClass */
  override def onKey(key: String): Unit = js.native
  /* CompleteClass */
  override def run(
    globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Unit] = js.native
}

