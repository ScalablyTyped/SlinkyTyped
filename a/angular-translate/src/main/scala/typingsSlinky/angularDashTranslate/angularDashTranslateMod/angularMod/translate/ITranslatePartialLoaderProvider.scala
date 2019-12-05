package typingsSlinky.angularDashTranslate.angularDashTranslateMod.angularMod.translate

import typingsSlinky.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITranslatePartialLoaderProvider
  extends IServiceProvider
     with IPartialLoader[ITranslatePartialLoaderProvider] {
  def setPart(lang: String, part: String, table: ITranslationTable): ITranslatePartialLoaderProvider = js.native
}

