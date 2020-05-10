package typingsSlinky.meteor.serverRenderMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sink extends js.Object {
  var appendToBody: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.native
  var appendToElementById: js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]] = js.native
  var appendToHead: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.native
  var arch: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
  var head: js.UndefOr[String] = js.native
  var htmlById: js.UndefOr[StringDictionary[String]] = js.native
  var maybeMadeChanges: js.UndefOr[Boolean] = js.native
  var renderIntoElementById: js.UndefOr[
    (js.Function2[/* id */ String, /* html */ String, Unit]) with (js.Function2[/* id */ String, /* html */ ReadableStream, Unit])
  ] = js.native
  var request: js.UndefOr[IncomingMessage] = js.native
}

object Sink {
  @scala.inline
  def apply(): Sink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sink]
  }
  @scala.inline
  implicit class SinkOps[Self <: Sink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendToBody(value: /* html */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendToBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToBody")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendToElementById(value: (/* id */ String, /* html */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToElementById")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAppendToElementById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToElementById")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendToHead(value: /* html */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToHead")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendToHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToHead")(js.undefined)
        ret
    }
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withHead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlById(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlById")(js.undefined)
        ret
    }
    @scala.inline
    def withMaybeMadeChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybeMadeChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaybeMadeChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybeMadeChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderIntoElementById(
      value: (js.Function2[/* id */ String, /* html */ String, Unit]) with (js.Function2[/* id */ String, /* html */ ReadableStream, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIntoElementById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderIntoElementById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIntoElementById")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
  }
  
}

