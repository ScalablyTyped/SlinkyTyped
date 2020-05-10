package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQuery extends js.Object {
  var current: String = js.native
  var queries: js.Array[String] = js.native
  def atLeast(size: String): Boolean = js.native
  def get(size: String): String = js.native
}

object MediaQuery {
  @scala.inline
  def apply(atLeast: String => Boolean, current: String, get: String => String, queries: js.Array[String]): MediaQuery = {
    val __obj = js.Dynamic.literal(atLeast = js.Any.fromFunction1(atLeast), current = current.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQuery]
  }
  @scala.inline
  implicit class MediaQueryOps[Self <: MediaQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtLeast(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atLeast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

