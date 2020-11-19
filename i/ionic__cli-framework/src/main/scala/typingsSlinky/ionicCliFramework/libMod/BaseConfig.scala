package typingsSlinky.ionicCliFramework.libMod

import typingsSlinky.ionicCliFramework.configMod.BaseConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib", "BaseConfig")
@js.native
abstract class BaseConfig[T /* <: js.Object */] protected ()
  extends typingsSlinky.ionicCliFramework.configMod.BaseConfig[T] {
  def this(p: String) = this()
  def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
}
