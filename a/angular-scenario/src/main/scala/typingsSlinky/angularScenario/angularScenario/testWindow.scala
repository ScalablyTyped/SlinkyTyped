package typingsSlinky.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait testWindow extends js.Object {
  def hash(): Future = js.native
  def href(): Future = js.native
  def path(): Future = js.native
  def search(): Future = js.native
}

object testWindow {
  @scala.inline
  def apply(hash: () => Future, href: () => Future, path: () => Future, search: () => Future): testWindow = {
    val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), href = js.Any.fromFunction0(href), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search))
    __obj.asInstanceOf[testWindow]
  }
  @scala.inline
  implicit class testWindowOps[Self <: testWindow] (val x: Self) extends AnyVal {
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
    def withHref(value: () => Future): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.Any.fromFunction0(value))
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
  }
  
}

