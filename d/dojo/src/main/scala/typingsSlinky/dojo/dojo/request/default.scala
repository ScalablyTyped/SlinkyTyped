package typingsSlinky.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/default.html
  *
  *
  */
@js.native
trait default extends js.Object {
  /**
    *
    */
  def getPlatformDefaultId(): Unit = js.native
  /**
    *
    * @param id
    * @param parentRequire
    * @param loaded
    * @param config
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any, config: js.Any): Unit = js.native
}

object default {
  @scala.inline
  def apply(getPlatformDefaultId: () => Unit, load: (js.Any, js.Any, js.Any, js.Any) => Unit): default = {
    val __obj = js.Dynamic.literal(getPlatformDefaultId = js.Any.fromFunction0(getPlatformDefaultId), load = js.Any.fromFunction4(load))
    __obj.asInstanceOf[default]
  }
  @scala.inline
  implicit class defaultOps[Self <: default] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPlatformDefaultId(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlatformDefaultId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

