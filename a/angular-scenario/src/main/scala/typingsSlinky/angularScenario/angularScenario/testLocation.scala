package typingsSlinky.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait testLocation extends js.Object {
  def hash(): Future = js.native
  def path(): Future = js.native
  def search(): Future = js.native
  def url(): Future = js.native
}

object testLocation {
  @scala.inline
  def apply(hash: () => Future, path: () => Future, search: () => Future, url: () => Future): testLocation = {
    val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[testLocation]
  }
  @scala.inline
  implicit class testLocationOps[Self <: testLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: () => Future): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: () => Future): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSearch(value: () => Future): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrl(value: () => Future): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

