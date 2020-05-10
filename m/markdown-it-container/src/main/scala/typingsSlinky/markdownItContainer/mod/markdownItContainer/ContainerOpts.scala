package typingsSlinky.markdownItContainer.mod.markdownItContainer

import typingsSlinky.markdownIt.tokenMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerOpts extends js.Object {
  var marker: js.UndefOr[String] = js.native
  var render: js.UndefOr[
    js.Function5[
      /* tokens */ js.Array[^], 
      /* index */ Double, 
      /* options */ js.Any, 
      /* env */ js.Any, 
      /* self */ typingsSlinky.markdownIt.rendererMod.^, 
      Unit
    ]
  ] = js.native
  var validate: js.UndefOr[js.Function1[/* params */ String, Boolean]] = js.native
}

object ContainerOpts {
  @scala.inline
  def apply(): ContainerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOpts]
  }
  @scala.inline
  implicit class ContainerOptsOps[Self <: ContainerOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* tokens */ js.Array[^], /* index */ Double, /* options */ js.Any, /* env */ js.Any, /* self */ typingsSlinky.markdownIt.rendererMod.^) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: /* params */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

