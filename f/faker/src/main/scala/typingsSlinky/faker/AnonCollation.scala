package typingsSlinky.faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCollation extends js.Object {
  def collation(): String = js.native
  def column(): String = js.native
  def engine(): String = js.native
  def `type`(): String = js.native
}

object AnonCollation {
  @scala.inline
  def apply(collation: () => String, column: () => String, engine: () => String, `type`: () => String): AnonCollation = {
    val __obj = js.Dynamic.literal(collation = js.Any.fromFunction0(collation), column = js.Any.fromFunction0(column), engine = js.Any.fromFunction0(engine))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[AnonCollation]
  }
  @scala.inline
  implicit class AnonCollationOps[Self <: AnonCollation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColumn(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEngine(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

