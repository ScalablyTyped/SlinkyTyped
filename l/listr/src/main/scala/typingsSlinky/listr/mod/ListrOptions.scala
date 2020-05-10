package typingsSlinky.listr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrOptions[Ctx] extends js.Object {
  var concurrent: js.UndefOr[Boolean | Double] = js.native
  var exitOnError: js.UndefOr[Boolean] = js.native
  var nonTTYRenderer: js.UndefOr[ListrRendererValue[Ctx]] = js.native
  var renderer: js.UndefOr[ListrRendererValue[Ctx]] = js.native
}

object ListrOptions {
  @scala.inline
  def apply[Ctx](): ListrOptions[Ctx] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrOptions[Ctx]]
  }
  @scala.inline
  implicit class ListrOptionsOps[Self[ctx] <: ListrOptions[ctx], Ctx] (val x: Self[Ctx]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ctx] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ctx]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ctx] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ctx] with Other]
    @scala.inline
    def withConcurrent(value: Boolean | Double): Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrent: Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withExitOnError(value: Boolean): Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitOnError: Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withNonTTYRenderer(value: ListrRendererValue[Ctx]): Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonTTYRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonTTYRenderer: Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonTTYRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: ListrRendererValue[Ctx]): Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
  }
  
}

