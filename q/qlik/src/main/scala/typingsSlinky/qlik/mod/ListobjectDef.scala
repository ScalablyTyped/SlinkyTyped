package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.NX_FREQUENCY_NONE
import typingsSlinky.qlik.qlikStrings.NX_FREQUENCY_PERCENT
import typingsSlinky.qlik.qlikStrings.NX_FREQUENCY_RELATIVE
import typingsSlinky.qlik.qlikStrings.NX_FREQUENCY_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListobjectDef extends js.Object {
  var qAutoSortByState: NxAutoSortByStateDef = js.native
  var qDef: NxInlineDimensionDef = js.native
  var qExpressions: js.Array[NxListobjectExpressionDef] = js.native
  var qFrequencyMode: NX_FREQUENCY_NONE | NX_FREQUENCY_VALUE | NX_FREQUENCY_PERCENT | NX_FREQUENCY_RELATIVE = js.native
  var qInitialDataFetch: js.Array[NxPage] = js.native
  var qLibraryId: String = js.native
  var qShowAlternatives: Boolean = js.native
  var qStateName: String = js.native
}

object ListobjectDef {
  @scala.inline
  def apply(
    qAutoSortByState: NxAutoSortByStateDef,
    qDef: NxInlineDimensionDef,
    qExpressions: js.Array[NxListobjectExpressionDef],
    qFrequencyMode: NX_FREQUENCY_NONE | NX_FREQUENCY_VALUE | NX_FREQUENCY_PERCENT | NX_FREQUENCY_RELATIVE,
    qInitialDataFetch: js.Array[NxPage],
    qLibraryId: String,
    qShowAlternatives: Boolean,
    qStateName: String
  ): ListobjectDef = {
    val __obj = js.Dynamic.literal(qAutoSortByState = qAutoSortByState.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qExpressions = qExpressions.asInstanceOf[js.Any], qFrequencyMode = qFrequencyMode.asInstanceOf[js.Any], qInitialDataFetch = qInitialDataFetch.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qShowAlternatives = qShowAlternatives.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListobjectDef]
  }
  @scala.inline
  implicit class ListobjectDefOps[Self <: ListobjectDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAutoSortByState(value: NxAutoSortByStateDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAutoSortByState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDef(value: NxInlineDimensionDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQExpressions(value: js.Array[NxListobjectExpressionDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFrequencyMode(value: NX_FREQUENCY_NONE | NX_FREQUENCY_VALUE | NX_FREQUENCY_PERCENT | NX_FREQUENCY_RELATIVE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFrequencyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQInitialDataFetch(value: js.Array[NxPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInitialDataFetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLibraryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLibraryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQShowAlternatives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowAlternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

