package typingsSlinky.jsFixtures

import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fixtures extends js.Object {
  var containerId: String = js.native
  var path: String = js.native
  def appendLoad(urls: String*): Unit = js.native
  def appendSet(html: String): Unit = js.native
  def body(): String = js.native
  def cleanUp(): Unit = js.native
  def clearCache(): Unit = js.native
  def load(urls: String*): Unit = js.native
  def preload(urls: String*): Unit = js.native
  def read(urls: String*): String = js.native
  def set(html: String): Unit = js.native
  def window(): Window = js.native
}

object Fixtures {
  @scala.inline
  def apply(
    appendLoad: /* repeated */ String => Unit,
    appendSet: String => Unit,
    body: () => String,
    cleanUp: () => Unit,
    clearCache: () => Unit,
    containerId: String,
    load: /* repeated */ String => Unit,
    path: String,
    preload: /* repeated */ String => Unit,
    read: /* repeated */ String => String,
    set: String => Unit,
    window: () => Window
  ): Fixtures = {
    val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1(appendLoad), appendSet = js.Any.fromFunction1(appendSet), body = js.Any.fromFunction0(body), cleanUp = js.Any.fromFunction0(cleanUp), clearCache = js.Any.fromFunction0(clearCache), containerId = containerId.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), path = path.asInstanceOf[js.Any], preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read), set = js.Any.fromFunction1(set), window = js.Any.fromFunction0(window))
    __obj.asInstanceOf[Fixtures]
  }
  @scala.inline
  implicit class FixturesOps[Self <: Fixtures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendLoad(value: /* repeated */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendSet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBody(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCleanUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: /* repeated */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreload(value: /* repeated */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: /* repeated */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWindow(value: () => Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

