package typingsSlinky.reactFileReaderInput.mod

import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * what format the `FileReader` should read the file as
    * (i.e., `'buffer'`, `'binary'`, `'url'`, `'text'`).
    *
    * Defaults to `'url'`.
    */
  var as: js.UndefOr[Format] = js.native
  /**
    * Callback function called when the files are choosen by the user.
    *
    * Results will be an array of arrays, the size of which depending
    * on how many files were selected.
    *
    * Each result will be an array of two items:
    *
    * `progressEvent`: `result[0]` is a `ProgressEvent` object.
    * You can retrieve the raw results at `progressEvent.target.result`
    * among other things.
    *
    * `file`: `result[1]` is a `File` object. You can retrieve the file name
    * at file.name among other things.
    *
    * @param event The event that triggered file changes
    * @param results The array of files
    */
  def onChange(event: SyntheticEvent[Event_, _], results: js.Array[Result]): Unit = js.native
}

object Props {
  @scala.inline
  def apply(onChange: (SyntheticEvent[Event_, _], js.Array[Result]) => Unit): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChange(value: (SyntheticEvent[Event_, _], js.Array[Result]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAs(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
  }
  
}

