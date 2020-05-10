package typingsSlinky.dojo.dojo.selector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/selector/_loader.html
  *
  * This module handles loading the appropriate selector engine for the given browser
  *
  */
@js.native
trait loader extends js.Object {
  /**
    *
    * @param id
    * @param parentRequire
    * @param loaded
    * @param config
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any, config: js.Any): js.Any = js.native
}

object loader {
  @scala.inline
  def apply(load: (js.Any, js.Any, js.Any, js.Any) => js.Any): loader = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction4(load))
    __obj.asInstanceOf[loader]
  }
  @scala.inline
  implicit class loaderOps[Self <: loader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoad(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

