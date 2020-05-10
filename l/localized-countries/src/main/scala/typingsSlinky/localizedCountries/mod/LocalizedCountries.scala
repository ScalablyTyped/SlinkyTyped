package typingsSlinky.localizedCountries.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.localizedCountries.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedCountries extends js.Object {
  def array(): js.Array[AnonCode] = js.native
  def get(code: String): String = js.native
  def `object`(): StringDictionary[String] = js.native
}

object LocalizedCountries {
  @scala.inline
  def apply(array: () => js.Array[AnonCode], get: String => String, `object`: () => StringDictionary[String]): LocalizedCountries = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), get = js.Any.fromFunction1(get))
    __obj.updateDynamic("object")(js.Any.fromFunction0(`object`))
    __obj.asInstanceOf[LocalizedCountries]
  }
  @scala.inline
  implicit class LocalizedCountriesOps[Self <: LocalizedCountries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: () => js.Array[AnonCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObject(value: () => StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

