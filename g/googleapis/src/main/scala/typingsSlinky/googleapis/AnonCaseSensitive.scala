package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var extractA: js.UndefOr[String] = js.native
  var extractB: js.UndefOr[String] = js.native
  var fieldA: js.UndefOr[String] = js.native
  var fieldAIndex: js.UndefOr[Double] = js.native
  var fieldARequired: js.UndefOr[Boolean] = js.native
  var fieldB: js.UndefOr[String] = js.native
  var fieldBIndex: js.UndefOr[Double] = js.native
  var fieldBRequired: js.UndefOr[Boolean] = js.native
  var outputConstructor: js.UndefOr[String] = js.native
  var outputToField: js.UndefOr[String] = js.native
  var outputToFieldIndex: js.UndefOr[Double] = js.native
  var overrideOutputField: js.UndefOr[Boolean] = js.native
}

object AnonCaseSensitive {
  @scala.inline
  def apply(): AnonCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCaseSensitive]
  }
  @scala.inline
  implicit class AnonCaseSensitiveOps[Self <: AnonCaseSensitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractA")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractB")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldA")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldAIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldAIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldAIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldAIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldARequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldARequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldARequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldARequired")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldB")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldBIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldBIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldBIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldBIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldBRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldBRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldBRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldBRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputConstructor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConstructor")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputToField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputToField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputToField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputToField")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputToFieldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputToFieldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputToFieldIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputToFieldIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideOutputField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideOutputField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideOutputField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideOutputField")(js.undefined)
        ret
    }
  }
  
}

