package typingsSlinky.pify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PifyOptions extends js.Object {
  var errorFirst: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  var excludeMain: js.UndefOr[Boolean] = js.native
  var include: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  var multiArgs: js.UndefOr[Boolean] = js.native
  var promiseModule: js.UndefOr[PromiseModule] = js.native
}

object PifyOptions {
  @scala.inline
  def apply(): PifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PifyOptions]
  }
  @scala.inline
  implicit class PifyOptionsOps[Self <: PifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeMain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeMain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeMain")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiArgs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseModule(value: PromiseModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseModule")(js.undefined)
        ret
    }
  }
  
}

