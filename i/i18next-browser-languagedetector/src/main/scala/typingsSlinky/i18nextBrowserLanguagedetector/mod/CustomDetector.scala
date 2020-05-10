package typingsSlinky.i18nextBrowserLanguagedetector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDetector extends js.Object {
  var cacheUserLanguage: js.UndefOr[js.Function2[/* lng */ String, /* options */ DetectorOptions, Unit]] = js.native
  var name: String = js.native
  def lookup(options: DetectorOptions): js.UndefOr[String] = js.native
}

object CustomDetector {
  @scala.inline
  def apply(lookup: DetectorOptions => js.UndefOr[String], name: String): CustomDetector = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDetector]
  }
  @scala.inline
  implicit class CustomDetectorOps[Self <: CustomDetector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLookup(value: DetectorOptions => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheUserLanguage(value: (/* lng */ String, /* options */ DetectorOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheUserLanguage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCacheUserLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheUserLanguage")(js.undefined)
        ret
    }
  }
  
}

