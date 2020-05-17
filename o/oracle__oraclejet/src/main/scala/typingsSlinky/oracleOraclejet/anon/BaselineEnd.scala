package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaselineEnd[K2, D2]
  extends /* key */ StringDictionary[js.Any] {
  var baselineEnd: String = js.native
  var baselineStart: String = js.native
  var end: String = js.native
  var rowContext: ComponentElement[K2] = js.native
  var start: String = js.native
  var taskContexts: js.Array[ItemData[K2, D2]] = js.native
  var value: String = js.native
}

object BaselineEnd {
  @scala.inline
  def apply[K2, D2](
    baselineEnd: String,
    baselineStart: String,
    end: String,
    rowContext: ComponentElement[K2],
    start: String,
    taskContexts: js.Array[ItemData[K2, D2]],
    value: String
  ): BaselineEnd[K2, D2] = {
    val __obj = js.Dynamic.literal(baselineEnd = baselineEnd.asInstanceOf[js.Any], baselineStart = baselineStart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taskContexts = taskContexts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaselineEnd[K2, D2]]
  }
  @scala.inline
  implicit class BaselineEndOps[Self[k2, d2] <: BaselineEnd[k2, d2], K2, D2] (val x: Self[K2, D2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K2, D2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K2, D2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K2, D2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K2, D2]) with Other]
    @scala.inline
    def withBaselineEnd(value: String): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaselineStart(value: String): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: String): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowContext(value: ComponentElement[K2]): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: String): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskContexts(value: js.Array[ItemData[K2, D2]]): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self[K2, D2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

