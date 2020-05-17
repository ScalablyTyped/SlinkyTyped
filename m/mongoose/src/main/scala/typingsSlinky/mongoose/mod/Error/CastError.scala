package typingsSlinky.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CastError
  extends typingsSlinky.mongoose.mod.Error {
  var kind: String = js.native
  var model: js.UndefOr[js.Any] = js.native
  @JSName("name")
  var name_CastError: typingsSlinky.mongoose.mongooseStrings.CastError = js.native
  var path: String = js.native
  var reason: js.UndefOr[js.Any] = js.native
  var stringValue: String = js.native
  var value: js.Any = js.native
  def setModel(model: js.Any): Unit = js.native
}

object CastError {
  @scala.inline
  def apply(
    kind: String,
    name: typingsSlinky.mongoose.mongooseStrings.CastError,
    path: String,
    setModel: js.Any => Unit,
    stringValue: String,
    value: js.Any
  ): CastError = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setModel = js.Any.fromFunction1(setModel), stringValue = stringValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastError]
  }
  @scala.inline
  implicit class CastErrorOps[Self <: CastError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: typingsSlinky.mongoose.mongooseStrings.CastError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetModel(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

