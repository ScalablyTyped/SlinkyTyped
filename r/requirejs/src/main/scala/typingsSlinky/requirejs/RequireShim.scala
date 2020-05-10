package typingsSlinky.requirejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireShim extends js.Object {
  /**
  	* List of dependencies.
  	**/
  var deps: js.UndefOr[js.Array[String]] = js.native
  /**
  	* Name the module will be exported as.
  	**/
  var exports: js.UndefOr[String] = js.native
  /**
  	* Initialize function with all dependcies passed in,
  	* if the function returns a value then that value is used
  	* as the module export value instead of the object
  	* found via the 'exports' string.
  	* @param dependencies
  	* @return
  	**/
  var init: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object RequireShim {
  @scala.inline
  def apply(): RequireShim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireShim]
  }
  @scala.inline
  implicit class RequireShimOps[Self <: RequireShim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(js.undefined)
        ret
    }
    @scala.inline
    def withExports(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
  }
  
}

