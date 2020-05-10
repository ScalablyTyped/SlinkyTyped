package typingsSlinky.jasmineJquery.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleFixtures extends js.Object {
  var fixturesPath: String = js.native
  def appendLoad(uls: String*): Unit = js.native
  def appendSet(html: String): Unit = js.native
  def cleanUp(): Unit = js.native
  def clearCache(): Unit = js.native
  def createStyle_(html: String): Unit = js.native
  def getFixtureHtml_(url: String): String = js.native
  def load(uls: String*): Unit = js.native
  def loadFixtureIntoCache_(relativeUrl: String): Unit = js.native
  def makeFixtureUrl_(relativeUrl: String): String = js.native
  def preload(uls: String*): Unit = js.native
  def proxyCallTo_(methodName: String, passedArguments: js.Any): js.Any = js.native
  def read_(uls: String*): String = js.native
  def set(html: String): String = js.native
}

object StyleFixtures {
  @scala.inline
  def apply(
    appendLoad: /* repeated */ String => Unit,
    appendSet: String => Unit,
    cleanUp: () => Unit,
    clearCache: () => Unit,
    createStyle_ : String => Unit,
    fixturesPath: String,
    getFixtureHtml_ : String => String,
    load: /* repeated */ String => Unit,
    loadFixtureIntoCache_ : String => Unit,
    makeFixtureUrl_ : String => String,
    preload: /* repeated */ String => Unit,
    proxyCallTo_ : (String, js.Any) => js.Any,
    read_ : /* repeated */ String => String,
    set: String => String
  ): StyleFixtures = {
    val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1(appendLoad), appendSet = js.Any.fromFunction1(appendSet), cleanUp = js.Any.fromFunction0(cleanUp), clearCache = js.Any.fromFunction0(clearCache), createStyle_ = js.Any.fromFunction1(createStyle_), fixturesPath = fixturesPath.asInstanceOf[js.Any], getFixtureHtml_ = js.Any.fromFunction1(getFixtureHtml_), load = js.Any.fromFunction1(load), loadFixtureIntoCache_ = js.Any.fromFunction1(loadFixtureIntoCache_), makeFixtureUrl_ = js.Any.fromFunction1(makeFixtureUrl_), preload = js.Any.fromFunction1(preload), proxyCallTo_ = js.Any.fromFunction2(proxyCallTo_), read_ = js.Any.fromFunction1(read_), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[StyleFixtures]
  }
  @scala.inline
  implicit class StyleFixturesOps[Self <: StyleFixtures] (val x: Self) extends AnyVal {
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
    def withCreateStyle_(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStyle_")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFixturesPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixturesPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFixtureHtml_(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFixtureHtml_")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoad(value: /* repeated */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadFixtureIntoCache_(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadFixtureIntoCache_")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMakeFixtureUrl_(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeFixtureUrl_")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreload(value: /* repeated */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProxyCallTo_(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyCallTo_")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRead_(value: /* repeated */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

