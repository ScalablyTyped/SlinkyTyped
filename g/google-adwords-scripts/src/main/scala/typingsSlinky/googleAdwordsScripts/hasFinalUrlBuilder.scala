package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasFinalUrlBuilder[B] extends js.Object {
  def withFinalUrl(url: String): B = js.native
  def withMobileFinalUrl(url: String): B = js.native
}

object hasFinalUrlBuilder {
  @scala.inline
  def apply[B](withFinalUrl: String => B, withMobileFinalUrl: String => B): hasFinalUrlBuilder[B] = {
    val __obj = js.Dynamic.literal(withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl))
    __obj.asInstanceOf[hasFinalUrlBuilder[B]]
  }
  @scala.inline
  implicit class hasFinalUrlBuilderOps[Self[b] <: hasFinalUrlBuilder[b], B] (val x: Self[B]) extends AnyVal {
    @scala.inline
    def duplicate: Self[B] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[B]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[B] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[B] with Other]
    @scala.inline
    def withWithFinalUrl(value: String => B): Self[B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withFinalUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithMobileFinalUrl(value: String => B): Self[B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMobileFinalUrl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

