package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Mode is, in the simplest case, a lexer (tokenizer) for your language — a function that takes a character stream as input,
  * advances it past a token, and returns a style for that token. More advanced modes can also handle indentation for the language.
  */
@js.native
trait Mode[T] extends js.Object {
  /**
    * For languages that have significant blank lines, you can define a blankLine(state) method on your mode that will get called
    * whenever a blank line is passed over, so that it can update the parser state.
    */
  var blankLine: js.UndefOr[js.Function1[/* state */ T, Unit]] = js.native
  /**
    * String that ends a block comment.
    */
  var blockCommentEnd: js.UndefOr[String] = js.native
  /**
    * String to put at the start of continued lines in a block comment.
    */
  var blockCommentLead: js.UndefOr[String] = js.native
  /**
    * String that starts a block comment.
    */
  var blockCommentStart: js.UndefOr[String] = js.native
  /**
    * Given a state returns a safe copy of that state.
    */
  var copyState: js.UndefOr[js.Function1[/* state */ T, T]] = js.native
  /**
    * Trigger a reindent whenever one of the characters in the string is typed.
    */
  var electricChars: js.UndefOr[String] = js.native
  /**
    * Trigger a reindent whenever the regex matches the part of the line before the cursor.
    */
  var electricinput: js.UndefOr[js.RegExp] = js.native
  /**
    * The indentation method should inspect the given state object, and optionally the textAfter string, which contains the text on
    * the line that is being indented, and return an integer, the amount of spaces to indent.
    */
  var indent: js.UndefOr[js.Function2[/* state */ T, /* textAfter */ String, Double]] = js.native
  /** The four below strings are used for working with the commenting addon. */
  /**
    * String that starts a line comment.
    */
  var lineComment: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  /**
    * A function that produces a state object to be used at the start of a document.
    */
  var startState: js.UndefOr[js.Function0[T]] = js.native
  /**
    * This function should read one token from the stream it is given as an argument, optionally update its state,
    * and return a style string, or null for tokens that do not have to be styled. Multiple styles can be returned, separated by spaces.
    */
  var token: js.UndefOr[js.Function2[/* stream */ StringStream, /* state */ T, String | Null]] = js.native
}

object Mode {
  @scala.inline
  def apply[T](): Mode[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode[T]]
  }
  @scala.inline
  implicit class ModeOps[Self[t] <: Mode[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBlankLine(value: /* state */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlankLine: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankLine")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockCommentEnd(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockCommentEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockCommentLead(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentLead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockCommentLead: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentLead")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockCommentStart(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockCommentStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockCommentStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyState(value: /* state */ T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCopyState: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyState")(js.undefined)
        ret
    }
    @scala.inline
    def withElectricChars(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electricChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectricChars: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electricChars")(js.undefined)
        ret
    }
    @scala.inline
    def withElectricinput(value: js.RegExp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electricinput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectricinput: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electricinput")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: (/* state */ T, /* textAfter */ String) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIndent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withLineComment(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineComment: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineComment")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStartState(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStartState: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startState")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: (/* stream */ StringStream, /* state */ T) => String | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToken: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

