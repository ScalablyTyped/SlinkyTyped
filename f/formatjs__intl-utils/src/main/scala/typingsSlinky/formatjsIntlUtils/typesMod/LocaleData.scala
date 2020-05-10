package typingsSlinky.formatjsIntlUtils.typesMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleData[T] extends js.Object {
  var aliases: Record[String, String] = js.native
  var availableLocales: js.Array[String] = js.native
  var data: Record[Locale, T] = js.native
  var parentLocales: Record[String, String] = js.native
}

object LocaleData {
  @scala.inline
  def apply[T](
    aliases: Record[String, String],
    availableLocales: js.Array[String],
    data: Record[Locale, T],
    parentLocales: Record[String, String]
  ): LocaleData[T] = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], availableLocales = availableLocales.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], parentLocales = parentLocales.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleData[T]]
  }
  @scala.inline
  implicit class LocaleDataOps[Self[t] <: LocaleData[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAliases(value: Record[String, String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailableLocales(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableLocales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: Record[Locale, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentLocales(value: Record[String, String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLocales")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

