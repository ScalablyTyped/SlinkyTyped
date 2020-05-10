package typingsSlinky.pino.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelMapping extends js.Object {
  /**
    * Returns the mappings of level internal level numbers to their string representations.
    */
  var labels: NumberDictionary[String] = js.native
  /**
    * Returns the mappings of level names to their respective internal number representation.
    */
  var values: StringDictionary[Double] = js.native
}

object LevelMapping {
  @scala.inline
  def apply(labels: NumberDictionary[String], values: StringDictionary[Double]): LevelMapping = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelMapping]
  }
  @scala.inline
  implicit class LevelMappingOps[Self <: LevelMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: NumberDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

