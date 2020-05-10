package typingsSlinky.resourcejs.mod

import typingsSlinky.express.mod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestOptions extends HttpMethodOptions {
  var afterGet: js.UndefOr[HttpHandler] = js.native
  var afterIndex: js.UndefOr[HttpHandler] = js.native
  var afterPatch: js.UndefOr[HttpHandler] = js.native
  var afterPost: js.UndefOr[HttpHandler] = js.native
  var afterPut: js.UndefOr[HttpHandler] = js.native
  var beforeGet: js.UndefOr[HttpHandler] = js.native
  var beforeIndex: js.UndefOr[HttpHandler] = js.native
  var beforePatch: js.UndefOr[HttpHandler] = js.native
  var beforePost: js.UndefOr[HttpHandler] = js.native
  var beforePut: js.UndefOr[HttpHandler] = js.native
}

object RestOptions {
  @scala.inline
  def apply(): RestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestOptions]
  }
  @scala.inline
  implicit class RestOptionsOps[Self <: RestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterGet(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGet")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGet")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterIndex(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterIndex")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPatch(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPatch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPatch")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPost(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPost")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPost")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPut(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPut")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterPut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPut")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeGet(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGet")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGet")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeIndex(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeIndex")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePatch(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePatch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforePatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePatch")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePost(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePost")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforePost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePost")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePut(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePut")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforePut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePut")(js.undefined)
        ret
    }
  }
  
}

