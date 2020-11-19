package typingsSlinky.jestCore

import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/collectHandles", JSImport.Namespace)
@js.native
object collectHandlesMod extends js.Object {
  
  def default(): js.Function0[js.Array[js.Error]] = js.native
  
  def formatHandleErrors(errors: js.Array[js.Error], config: ProjectConfig): js.Array[String] = js.native
}
