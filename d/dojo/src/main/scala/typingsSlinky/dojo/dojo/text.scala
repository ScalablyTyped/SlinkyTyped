package typingsSlinky.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/text.html
  *
  * This module implements the dojo/text! plugin and the dojo.cache API.
  * We choose to include our own plugin to leverage functionality already contained in dojo
  * and thereby reduce the size of the plugin compared to various foreign loader implementations.
  * Also, this allows foreign AMD loaders to be used without their plugins.
  *
  * CAUTION: this module is designed to optionally function synchronously to support the dojo v1.x synchronous
  * loader. This feature is outside the scope of the CommonJS plugins specification.
  *
  */
@js.native
trait text extends js.Object {
  /**
    *
    */
  var dynamic: Boolean = js.native
  /**
    *
    * @param id Path to the resource.
    * @param require Object that include the function toUrl with given id returns a valid URL from which to load the text.
    * @param load Callback function which will be called, when the loading finished.
    */
  def load(id: String, require: js.Function, load: js.Function): Unit = js.native
  /**
    *
    * @param id
    * @param toAbsMid
    */
  def normalize(id: js.Any, toAbsMid: js.Any): String = js.native
}

object text {
  @scala.inline
  def apply(
    dynamic: Boolean,
    load: (String, js.Function, js.Function) => Unit,
    normalize: (js.Any, js.Any) => String
  ): text = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], load = js.Any.fromFunction3(load), normalize = js.Any.fromFunction2(normalize))
    __obj.asInstanceOf[text]
  }
  @scala.inline
  implicit class textOps[Self <: text] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: (String, js.Function, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNormalize(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

