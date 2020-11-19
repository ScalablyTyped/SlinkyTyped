package typingsSlinky.electronBuilder.builderMod

import typingsSlinky.appBuilderLib.packagerApiMod.PackagerOptions
import typingsSlinky.electronPublish.mod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildOptions
  extends PackagerOptions
     with PublishOptions
object BuildOptions {
  
  @scala.inline
  def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
}
