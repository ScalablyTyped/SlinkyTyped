package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ScopeId
  * @classdesc The scope for a variable.
  * @param {string} name - The variable name.
  * @property {string} name The variable name.
  */
@js.native
trait ScopeId extends js.Object {
  /**
    * The variable name.
    */
  var name: String = js.native
  /**
    * @function
    * @name pc.ScopeId#getValue
    * @description Get variable value.
    * @returns {*} The value.
    */
  def getValue(): js.Any = js.native
  /**
    * @function
    * @name pc.ScopeId#setValue
    * @description Set variable value.
    * @param {*} value - The value.
    */
  def setValue(value: js.Any): Unit = js.native
}

object ScopeId {
  @scala.inline
  def apply(getValue: () => js.Any, name: String, setValue: js.Any => Unit): ScopeId = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), name = name.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ScopeId]
  }
  @scala.inline
  implicit class ScopeIdOps[Self <: ScopeId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

