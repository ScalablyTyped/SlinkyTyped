package typingsSlinky.accedoAccedoOne.anon

import typingsSlinky.accedoAccedoOne.mod.AccedoLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locales extends js.Object {
  var locales: js.Array[AccedoLocale]
}

object Locales {
  @scala.inline
  def apply(locales: js.Array[AccedoLocale]): Locales = {
    val __obj = js.Dynamic.literal(locales = locales.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locales]
  }
}

