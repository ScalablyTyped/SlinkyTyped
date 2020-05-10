package typingsSlinky.htmlparser2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.domhandler.mod.DomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<domhandler.domhandler.DomHandler> */
@js.native
trait PartialDomHandler extends js.Object {
  var constructor: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _], 
      js.Any
    ]
  ] = js.native
  var oncdatastart: js.UndefOr[js.Function0[Unit]] = js.native
  var onclosetag: js.UndefOr[js.Function0[Unit]] = js.native
  var oncomment: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
  var oncommentend: js.UndefOr[js.Function0[Unit]] = js.native
  var onend: js.UndefOr[js.Function0[Unit]] = js.native
  var onerror: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var onopentag: js.UndefOr[js.Function2[/* name */ String, /* attribs */ StringDictionary[String], Unit]] = js.native
  var onparserinit: js.UndefOr[js.Function1[/* parser */ js.Any, Unit]] = js.native
  var onprocessinginstruction: js.UndefOr[js.Function2[/* name */ String, /* data */ String, Unit]] = js.native
  var onreset: js.UndefOr[js.Function0[Unit]] = js.native
  var ontext: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
}

object PartialDomHandler {
  @scala.inline
  def apply(): PartialDomHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDomHandler]
  }
  @scala.inline
  implicit class PartialDomHandlerOps[Self <: PartialDomHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstructor(
      value: /* callback */ js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _] => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.undefined)
        ret
    }
    @scala.inline
    def withOncdatastart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncdatastart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOncdatastart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncdatastart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclosetag(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclosetag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnclosetag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclosetag")(js.undefined)
        ret
    }
    @scala.inline
    def withOncomment(value: /* data */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncomment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOncomment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncomment")(js.undefined)
        ret
    }
    @scala.inline
    def withOncommentend(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncommentend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOncommentend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncommentend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnend(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnopentag(value: (/* name */ String, /* attribs */ StringDictionary[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopentag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnopentag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopentag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnparserinit(value: /* parser */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onparserinit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnparserinit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onparserinit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprocessinginstruction(value: (/* name */ String, /* data */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessinginstruction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnprocessinginstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprocessinginstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnreset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreset")(js.undefined)
        ret
    }
    @scala.inline
    def withOntext(value: /* data */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontext")(js.undefined)
        ret
    }
  }
  
}

