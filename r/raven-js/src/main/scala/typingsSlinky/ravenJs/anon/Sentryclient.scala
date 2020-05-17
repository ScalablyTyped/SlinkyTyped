package typingsSlinky.ravenJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sentryclient extends js.Object {
  var sentry_client: String = js.native
  var sentry_key: String = js.native
  var sentry_version: String = js.native
}

object Sentryclient {
  @scala.inline
  def apply(sentry_client: String, sentry_key: String, sentry_version: String): Sentryclient = {
    val __obj = js.Dynamic.literal(sentry_client = sentry_client.asInstanceOf[js.Any], sentry_key = sentry_key.asInstanceOf[js.Any], sentry_version = sentry_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sentryclient]
  }
  @scala.inline
  implicit class SentryclientOps[Self <: Sentryclient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSentry_client(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentry_client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSentry_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentry_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSentry_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentry_version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

