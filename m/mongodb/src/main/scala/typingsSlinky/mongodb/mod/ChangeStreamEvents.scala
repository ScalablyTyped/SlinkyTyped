package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeStreamEvents[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  def change(doc: ChangeEvent[TSchema]): Unit = js.native
  def close(): Unit = js.native
  def end(): Unit = js.native
  def error(err: MongoError): Unit = js.native
  def resumeTokenChanged(newToken: ResumeToken): Unit = js.native
}

object ChangeStreamEvents {
  @scala.inline
  def apply[TSchema](
    change: ChangeEvent[TSchema] => Unit,
    close: () => Unit,
    end: () => Unit,
    error: MongoError => Unit,
    resumeTokenChanged: ResumeToken => Unit
  ): ChangeStreamEvents[TSchema] = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), close = js.Any.fromFunction0(close), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), resumeTokenChanged = js.Any.fromFunction1(resumeTokenChanged))
    __obj.asInstanceOf[ChangeStreamEvents[TSchema]]
  }
  @scala.inline
  implicit class ChangeStreamEventsOps[Self[tschema] <: ChangeStreamEvents[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def withChange(value: ChangeEvent[TSchema] => Unit): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: MongoError => Unit): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResumeTokenChanged(value: ResumeToken => Unit): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeTokenChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

