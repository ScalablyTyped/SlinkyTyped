package typingsSlinky.atom.linterMod

import typingsSlinky.atom.anon.File
import typingsSlinky.atom.anon.Position
import typingsSlinky.atom.atomStrings.error
import typingsSlinky.atom.atomStrings.info
import typingsSlinky.atom.atomStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    *  Markdown long description of the error. Accepts a callback so that you can
    *  do things like HTTP requests.
    */
  var description: js.UndefOr[String | (js.Function0[js.Promise[String] | String])] = js.native
  /** The text for the message. */
  var excerpt: String = js.native
  /** The name of the octicon to show in the gutter. */
  var icon: js.UndefOr[String] = js.native
  /** Optionally override the displayed linter name. Defaults to provider name. */
  var linterName: js.UndefOr[String] = js.native
  /** The location of the issue (aka where to highlight). */
  var location: File = js.native
  /** A reference to a different location in the editor. */
  var reference: js.UndefOr[Position] = js.native
  /** The severity level for the message. */
  var severity: error | warning | info = js.native
  /** Possible solutions (which the user can invoke at will). */
  var solutions: js.UndefOr[js.Array[ReplacementSolution | CallbackSolution]] = js.native
  /** An HTTP link to a resource explaining the issue. Default is a google search. */
  var url: js.UndefOr[String] = js.native
}

object Message {
  @scala.inline
  def apply(excerpt: String, location: File, severity: error | warning | info): Message = {
    val __obj = js.Dynamic.literal(excerpt = excerpt.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcerpt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excerpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverity(value: error | warning | info): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionFunction0(value: () => js.Promise[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDescription(value: String | (js.Function0[js.Promise[String] | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLinterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linterName")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutions(value: js.Array[ReplacementSolution | CallbackSolution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutions")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

