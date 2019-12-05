package typingsSlinky.atJestCore

import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/collectHandles", JSImport.Namespace)
@js.native
object buildCollectHandlesMod extends js.Object {
  def default(): js.Function0[js.Array[js.Error]] = js.native
  def formatHandleErrors(errors: js.Array[js.Error], config: ProjectConfig): js.Array[String] = js.native
}

