package typingsSlinky.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/node.html
  *
  * This AMD plugin module allows native Node.js modules to be loaded by AMD modules using the Dojo
  * loader. Note that this plugin will not work with AMD loaders other than the Dojo loader.
  *
  */
@js.native
trait node extends js.Object {
  /**
    * Standard AMD plugin interface. See https://github.com/amdjs/amdjs-api/wiki/Loader-Plugins
    * for information.
    *
    * @param id
    * @param require
    * @param load
    */
  def load(id: String, require: js.Function, load: js.Function): Unit = js.native
  /**
    * Produces a normalized id to be used by node.  Relative ids are resolved relative to the requesting
    * module's location in the file system and will return an id with path separators appropriate for the
    * local file system.
    *
    * @param id
    * @param normalize
    */
  def normalize(id: String, normalize: js.Function): js.Any = js.native
}

object node {
  @scala.inline
  def apply(load: (String, js.Function, js.Function) => Unit, normalize: (String, js.Function) => js.Any): node = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction3(load), normalize = js.Any.fromFunction2(normalize))
    __obj.asInstanceOf[node]
  }
  @scala.inline
  implicit class nodeOps[Self <: node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoad(value: (String, js.Function, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNormalize(value: (String, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

