package typingsSlinky.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondCallbackProps extends js.Object {
  /** If no error, file has been successfully loaded */
  var onaddfile: js.UndefOr[js.Function2[/* error */ FilePondErrorDescription, /* file */ File, Unit]] = js.native
  /** Made progress loading a file */
  var onaddfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ Double, Unit]] = js.native
  /** Started file load */
  var onaddfilestart: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /**
    * FilePond instance throws an error. Optionally receives
    * file if error is related to a file object.
    */
  var onerror: js.UndefOr[
    js.Function3[
      /* error */ FilePondErrorDescription, 
      /* file */ js.UndefOr[File], 
      /* status */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** FilePond instance has been created and is ready. */
  var oninit: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * File has been transformed by the transform plugin or
    * another plugin subscribing to the prepare_output filter.
    * It receives the file item and the output data.
    */
  var onpreparefile: js.UndefOr[js.Function2[/* file */ File, /* output */ js.Any, Unit]] = js.native
  /** If no error, Processing of a file has been completed */
  var onprocessfile: js.UndefOr[js.Function2[/* error */ FilePondErrorDescription, /* file */ File, Unit]] = js.native
  /** Aborted processing of a file */
  var onprocessfileabort: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /** Made progress processing a file */
  var onprocessfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ Double, Unit]] = js.native
  /** Started processing a file */
  var onprocessfilestart: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /** Processing of a file has been undone */
  var onprocessfileundo: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /** File has been removed. */
  var onremovefile: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  /** A file has been added or removed, receives a list of file items */
  var onupdatefiles: js.UndefOr[js.Function1[/* fileItems */ js.Array[File], Unit]] = js.native
  /**
    * FilePond instance throws a warning. For instance
    * when the maximum amount of files has been reached.
    * Optionally receives file if error is related to a
    * file object
    */
  var onwarning: js.UndefOr[
    js.Function3[/* error */ js.Any, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object FilePondCallbackProps {
  @scala.inline
  def apply(): FilePondCallbackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondCallbackProps]
  }
  @scala.inline
  implicit class FilePondCallbackPropsOps[Self <: FilePondCallbackProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnaddfile(value: (/* error */ FilePondErrorDescription, /* file */ File) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaddfile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnaddfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaddfile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnaddfileprogress(value: (/* file */ File, /* progress */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaddfileprogress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnaddfileprogress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaddfileprogress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnaddfilestart(value: /* file */ File => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaddfilestart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnaddfilestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaddfilestart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(
      value: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOninit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOninit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnpreparefile(value: (/* file */ File, /* output */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpreparefile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnpreparefile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpreparefile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprocessfile(value: (/* error */ FilePondErrorDescription, /* file */ File) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnprocessfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprocessfileabort(value: /* file */ File => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfileabort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnprocessfileabort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfileabort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprocessfileprogress(value: (/* file */ File, /* progress */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfileprogress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnprocessfileprogress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfileprogress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprocessfilestart(value: /* file */ File => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfilestart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnprocessfilestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfilestart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprocessfileundo(value: /* file */ File => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfileundo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnprocessfileundo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessfileundo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnremovefile(value: /* file */ File => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremovefile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnremovefile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremovefile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnupdatefiles(value: /* fileItems */ js.Array[File] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdatefiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnupdatefiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdatefiles")(js.undefined)
        ret
    }
    @scala.inline
    def withOnwarning(value: (/* error */ js.Any, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwarning")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnwarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwarning")(js.undefined)
        ret
    }
  }
  
}

