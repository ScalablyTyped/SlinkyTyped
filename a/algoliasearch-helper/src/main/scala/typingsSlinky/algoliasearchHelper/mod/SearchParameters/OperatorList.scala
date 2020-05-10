package typingsSlinky.algoliasearchHelper.mod.SearchParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ k in algoliasearch-helper.algoliasearch-helper.SearchParameters.Operator ]:? std.Array<number | std.Array<number>>} */
@js.native
trait OperatorList extends js.Object {
  @JSName("=")
  var Equalssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName("!=")
  var ExclamationmarkEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName(">")
  var Greaterthansign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName(">=")
  var GreaterthansignEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName("<")
  var Lessthansign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  @JSName("<=")
  var LessthansignEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
}

object OperatorList {
  @scala.inline
  def apply(): OperatorList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatorList]
  }
  @scala.inline
  implicit class OperatorListOps[Self <: OperatorList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualssign(value: js.Array[Double | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("=")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualssign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("=")(js.undefined)
        ret
    }
    @scala.inline
    def withExclamationmarkEqualssign(value: js.Array[Double | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!=")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarkEqualssign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!=")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterthansign(value: js.Array[Double | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(">")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreaterthansign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(">")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterthansignEqualssign(value: js.Array[Double | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(">=")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreaterthansignEqualssign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(">=")(js.undefined)
        ret
    }
    @scala.inline
    def withLessthansign(value: js.Array[Double | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessthansign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<")(js.undefined)
        ret
    }
    @scala.inline
    def withLessthansignEqualssign(value: js.Array[Double | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<=")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessthansignEqualssign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<=")(js.undefined)
        ret
    }
  }
  
}

