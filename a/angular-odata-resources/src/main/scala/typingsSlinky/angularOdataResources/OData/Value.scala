package typingsSlinky.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var illegalChars: js.Any = js.native
  var `type`: js.Any = js.native
  var value: js.Any = js.native
  /* private */ def escapeIllegalChars(haystack: js.Any): js.Any = js.native
  def execute(): String = js.native
  def executeWithType(): js.Any = js.native
  def executeWithUndefinedType(): js.Any = js.native
  /* private */ def generateDate(date: js.Any): js.Any = js.native
}

object Value {
  @scala.inline
  def apply(
    escapeIllegalChars: js.Any => js.Any,
    execute: () => String,
    executeWithType: () => js.Any,
    executeWithUndefinedType: () => js.Any,
    generateDate: js.Any => js.Any,
    illegalChars: js.Any,
    `type`: js.Any,
    value: js.Any
  ): Value = {
    val __obj = js.Dynamic.literal(escapeIllegalChars = js.Any.fromFunction1(escapeIllegalChars), execute = js.Any.fromFunction0(execute), executeWithType = js.Any.fromFunction0(executeWithType), executeWithUndefinedType = js.Any.fromFunction0(executeWithUndefinedType), generateDate = js.Any.fromFunction1(generateDate), illegalChars = illegalChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscapeIllegalChars(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeIllegalChars")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExecute(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExecuteWithType(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeWithType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExecuteWithUndefinedType(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeWithUndefinedType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGenerateDate(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIllegalChars(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("illegalChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

