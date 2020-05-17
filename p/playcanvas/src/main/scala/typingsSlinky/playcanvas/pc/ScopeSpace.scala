package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ScopeSpace
  * @classdesc The scope for variables and subspaces.
  * @param {string} name - The scope name.
  * @property {string} name The scope name.
  */
@js.native
trait ScopeSpace extends js.Object {
  /**
    * The scope name.
    */
  var name: String = js.native
  /**
    * @function
    * @name pc.ScopeSpace#getSubSpace
    * @description Get (or create, if it doesn't already exist) a subspace in the scope.
    * @param {string} name - The subspace name.
    * @returns {pc.ScopeSpace} The subspace instance.
    */
  def getSubSpace(name: String): ScopeSpace = js.native
  /**
    * @function
    * @name pc.ScopeSpace#resolve
    * @description Get (or create, if it doesn't already exist) a variable in the scope.
    * @param {string} name - The variable name.
    * @returns {pc.ScopeId} The variable instance.
    */
  def resolve(name: String): ScopeId = js.native
}

object ScopeSpace {
  @scala.inline
  def apply(getSubSpace: String => ScopeSpace, name: String, resolve: String => ScopeId): ScopeSpace = {
    val __obj = js.Dynamic.literal(getSubSpace = js.Any.fromFunction1(getSubSpace), name = name.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[ScopeSpace]
  }
  @scala.inline
  implicit class ScopeSpaceOps[Self <: ScopeSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetSubSpace(value: String => ScopeSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubSpace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolve(value: String => ScopeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

