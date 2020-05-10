package typingsSlinky.reactAddonsPerf.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Measurements extends js.Object {
  var counts: NumericPerfContext = js.native
  var displayNames: StringDictionary[ComponentPerfContext] = js.native
  var exclusive: NumericPerfContext = js.native
  var inclusive: NumericPerfContext = js.native
  var render: NumericPerfContext = js.native
  var totalTime: Double = js.native
  var writes: NumericPerfContext = js.native
}

object Measurements {
  @scala.inline
  def apply(
    counts: NumericPerfContext,
    displayNames: StringDictionary[ComponentPerfContext],
    exclusive: NumericPerfContext,
    inclusive: NumericPerfContext,
    render: NumericPerfContext,
    totalTime: Double,
    writes: NumericPerfContext
  ): Measurements = {
    val __obj = js.Dynamic.literal(counts = counts.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], writes = writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measurements]
  }
  @scala.inline
  implicit class MeasurementsOps[Self <: Measurements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounts(value: NumericPerfContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayNames(value: StringDictionary[ComponentPerfContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclusive(value: NumericPerfContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclusive(value: NumericPerfContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: NumericPerfContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrites(value: NumericPerfContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

