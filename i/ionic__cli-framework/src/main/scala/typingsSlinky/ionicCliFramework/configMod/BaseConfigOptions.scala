package typingsSlinky.ionicCliFramework.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConfigOptions extends js.Object {
  /**
    * If specified, the class will operate on a nested object within the config
    * file navigated to by this path prefix, an array of object path keys.
    *
    * For example, to operate on `c` object within `{ a: { b: { c: {} } } }`,
    * use `pathPrefix` of `['a', 'b', 'c']`.
    */
  var pathPrefix: js.UndefOr[js.Array[String]] = js.native
}

object BaseConfigOptions {
  @scala.inline
  def apply(): BaseConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfigOptions]
  }
  @scala.inline
  implicit class BaseConfigOptionsOps[Self <: BaseConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathPrefix(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(js.undefined)
        ret
    }
  }
  
}

