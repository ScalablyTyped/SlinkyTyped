package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.templatesMod.ResourceLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Labels", JSImport.Namespace)
@js.native
object labelsMod extends js.Object {
  
  @js.native
  class Labels protected () extends ResourceLabels {
    def this(options: BaseServiceOptions) = this()
  }
}
