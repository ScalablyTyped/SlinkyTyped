package typingsSlinky.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformCaller extends js.Object {
  // the only required property
  var name: String = js.native
  var supportsDynamicImport: js.UndefOr[Boolean] = js.native
  // e.g. set to true by `babel-loader` and false by `babel-jest`
  var supportsStaticESM: js.UndefOr[Boolean] = js.native
}

object TransformCaller {
  @scala.inline
  def apply(name: String): TransformCaller = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformCaller]
  }
  @scala.inline
  implicit class TransformCallerOps[Self <: TransformCaller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsDynamicImport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsDynamicImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsDynamicImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsDynamicImport")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsStaticESM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsStaticESM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsStaticESM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsStaticESM")(js.undefined)
        ret
    }
  }
  
}

