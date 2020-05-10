package typingsSlinky.graphqlBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingWithoutSchemaOptions extends js.Object {
  var before: js.UndefOr[js.Function0[Unit]] = js.native
  var fragmentReplacements: js.UndefOr[js.Array[FragmentReplacement]] = js.native
}

object BindingWithoutSchemaOptions {
  @scala.inline
  def apply(): BindingWithoutSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingWithoutSchemaOptions]
  }
  @scala.inline
  implicit class BindingWithoutSchemaOptionsOps[Self <: BindingWithoutSchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBefore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentReplacements(value: js.Array[FragmentReplacement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentReplacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentReplacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentReplacements")(js.undefined)
        ret
    }
  }
  
}

