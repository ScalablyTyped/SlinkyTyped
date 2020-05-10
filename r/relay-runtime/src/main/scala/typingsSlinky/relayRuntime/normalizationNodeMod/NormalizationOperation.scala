package typingsSlinky.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizationOperation extends NormalizationSelectableNode {
  val argumentDefinitions: js.Array[NormalizationLocalArgument] = js.native
  val kind: String = js.native
   // 'Operation';
  val name: String = js.native
  val selections: js.Array[NormalizationSelection] = js.native
}

object NormalizationOperation {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[NormalizationLocalArgument],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationOperation]
  }
  @scala.inline
  implicit class NormalizationOperationOps[Self <: NormalizationOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentDefinitions(value: js.Array[NormalizationLocalArgument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelections(value: js.Array[NormalizationSelection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

