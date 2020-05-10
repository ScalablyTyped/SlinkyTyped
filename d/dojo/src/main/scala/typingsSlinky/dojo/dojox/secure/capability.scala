package typingsSlinky.dojo.dojox.secure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/secure/capability.html
  *
  *
  */
@js.native
trait capability extends js.Object {
  /**
    *
    */
  var keywords: js.Array[_] = js.native
  /**
    * pass in the text of a script. If it passes and it can be eval'ed, it should be safe.
    * Note that this does not do full syntax checking, it relies on eval to reject invalid scripts.
    * There are also known false rejections:
    *
    * Nesting vars inside blocks will not declare the variable for the outer block
    * Named functions are not treated as declaration so they are generally not allowed unless the name is declared with a var.
    * Var declaration that involve multiple comma delimited variable assignments are not accepted
    *
    * @param script the script to execute
    * @param safeLibraries The safe libraries that can be called (the functions can not be access/modified by the untrusted code, only called)
    * @param safeGlobals These globals can be freely interacted with by the untrusted code
    */
  def validate(script: String, safeLibraries: js.Array[_], safeGlobals: js.Object): Unit = js.native
}

object capability {
  @scala.inline
  def apply(keywords: js.Array[_], validate: (String, js.Array[_], js.Object) => Unit): capability = {
    val __obj = js.Dynamic.literal(keywords = keywords.asInstanceOf[js.Any], validate = js.Any.fromFunction3(validate))
    __obj.asInstanceOf[capability]
  }
  @scala.inline
  implicit class capabilityOps[Self <: capability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeywords(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: (String, js.Array[_], js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

