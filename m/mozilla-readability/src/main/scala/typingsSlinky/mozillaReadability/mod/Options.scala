package typingsSlinky.mozillaReadability.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var classesToPreserve: js.UndefOr[js.Array[String]] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var maxElemsToParse: js.UndefOr[Double] = js.native
  var nbTopCandidates: js.UndefOr[Double] = js.native
  var wordThreshold: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassesToPreserve(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classesToPreserve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassesToPreserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classesToPreserve")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxElemsToParse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxElemsToParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxElemsToParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxElemsToParse")(js.undefined)
        ret
    }
    @scala.inline
    def withNbTopCandidates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbTopCandidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNbTopCandidates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbTopCandidates")(js.undefined)
        ret
    }
    @scala.inline
    def withWordThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordThreshold")(js.undefined)
        ret
    }
  }
  
}

