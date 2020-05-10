package typingsSlinky.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_css3.html
  *
  * This module provide some cross-browser support for CSS3 properties.
  *
  */
@js.native
trait css3 extends js.Object {
  /**
    * Prefixes all property names in "css3Styles" and adds the prefixed properties in "styles".
    * Used as a convenience when an object is passed to domStyle.set to set multiple styles.
    *
    * @param styles
    * @param css3Styles
    */
  def add(styles: js.Object, css3Styles: js.Object): js.Any = js.native
  /**
    * Returns the name of a CSS3 property with the correct prefix depending on the browser.
    *
    * @param p The (non-prefixed) property name. The property name is assumed to be consistent withthe hyphen argument, for example "transition-property" if hyphen is true, or "transitionProperty"if hyphen is false. If the browser supports the non-prefixed property, the property name will bereturned unchanged.
    * @param hyphen               OptionalOptional, true if hyphen notation should be used (for example "transition-property" or "-webkit-transition-property"),false for camel-case notation (for example "transitionProperty" or "webkitTransitionProperty").
    */
  def name(p: String, hyphen: Boolean): String = js.native
}

object css3 {
  @scala.inline
  def apply(add: (js.Object, js.Object) => js.Any, name: (String, Boolean) => String): css3 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), name = js.Any.fromFunction2(name))
    __obj.asInstanceOf[css3]
  }
  @scala.inline
  implicit class css3Ops[Self <: css3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (js.Object, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: (String, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

