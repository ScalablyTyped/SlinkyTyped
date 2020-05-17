package typingsSlinky.grasp.anon

import org.scalajs.dom.raw.Console
import typingsSlinky.cliColor.mod.Color
import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.Array[String] | (Record[String, _]) | String = js.native
  var callback: js.UndefOr[js.Function1[/* result */ String, Unit]] = js.native
  var console: js.UndefOr[Console] = js.native
  var error: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var exit: js.UndefOr[js.Function1[/* code */ Double, Unit]] = js.native
  // The following are "overrides" for defaults, such as console, cli-color,
  // process.stdin, or fs. In most cases grasp only makes use of a small
  // surface area of the types, but I think if someone really wants to pass a
  // fake fs that only implements the subset of methods they think grasp uses,
  // it should be up to them to use a cast rather than the typedef to be
  // overly lenient. We never know if grasp might change their internal use of
  // fs, after all.
  var fs: js.UndefOr[Typeoffs] = js.native
  var input: js.UndefOr[String] = js.native
  var stdin: js.UndefOr[ReadStream] = js.native
  var textFormat: js.UndefOr[Color] = js.native
}

object Args {
  @scala.inline
  def apply(args: js.Array[String] | (Record[String, _]) | String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String] | (Record[String, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: /* result */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withConsole(value: Console): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: /* code */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
    @scala.inline
    def withFs(value: Typeoffs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withStdin(value: ReadStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormat(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(js.undefined)
        ret
    }
  }
  
}

