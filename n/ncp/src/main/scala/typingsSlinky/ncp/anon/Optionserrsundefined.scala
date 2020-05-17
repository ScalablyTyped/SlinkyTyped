package typingsSlinky.ncp.anon

import typingsSlinky.ncp.mod.File
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ncp.ncp.Options & {  errs ? :undefined} */
@js.native
trait Optionserrsundefined extends js.Object {
  var clobber: js.UndefOr[Boolean] = js.native
  var dereference: js.UndefOr[Boolean] = js.native
  var errs: js.UndefOr[PathLike with js.UndefOr[scala.Nothing]] = js.native
  var filter: js.UndefOr[js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.native
  var limit: js.UndefOr[Double] = js.native
  var stopOnErr: js.UndefOr[Boolean] = js.native
  var transform: js.UndefOr[
    js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
  ] = js.native
}

object Optionserrsundefined {
  @scala.inline
  def apply(): Optionserrsundefined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionserrsundefined]
  }
  @scala.inline
  implicit class OptionserrsundefinedOps[Self <: Optionserrsundefined] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClobber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clobber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClobber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clobber")(js.undefined)
        ret
    }
    @scala.inline
    def withDereference(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dereference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDereference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dereference")(js.undefined)
        ret
    }
    @scala.inline
    def withErrs(value: PathLike with js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errs")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction1(value: /* filename */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: js.RegExp | (js.Function1[/* filename */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnErr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnErr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnErr")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

