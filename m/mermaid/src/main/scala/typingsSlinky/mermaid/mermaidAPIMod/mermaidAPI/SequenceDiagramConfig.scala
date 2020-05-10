package typingsSlinky.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceDiagramConfig extends js.Object {
  /**
    * **actorMargin** - Margin between actors
    * default: 10
    */
  var actorMargin: js.UndefOr[Double] = js.native
  /**
    * **bottomMarginAdj** - Depending on css styling this might need adjustment.
    * Prolongs the edge of the diagram downwards
    * default: 1
    */
  var bottomMarginAdj: js.UndefOr[Double] = js.native
  /**
    * **boxMargin** - Margin around loop boxes
    * default: 10
    */
  var boxMargin: js.UndefOr[Double] = js.native
  /**
    * **boxTextMargin** - margin around the text in loop/alt/opt boxes
    * default: 5
    */
  var boxTextMargin: js.UndefOr[Double] = js.native
  /**
    * **diagramMarginX** - margin to the right and left of the sequence diagram
    * default: 50
    */
  var diagramMarginX: js.UndefOr[Double] = js.native
  /**
    * **diagramMarginY** - margin to the over and under the sequence diagram
    * default: 10
    */
  var diagramMarginY: js.UndefOr[Double] = js.native
  /**
    * **height** - Height of actor boxes
    * default: 65
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * **messageMargin** - Space between messages
    * default: 35
    */
  var messageMargin: js.UndefOr[Double] = js.native
  /**
    * **mirrorActors** - mirror actors under diagram
    * default: true
    */
  var mirrorActors: js.UndefOr[Boolean] = js.native
  /**
    * **noteMargin** - margin around notes
    * default: 10
    */
  var noteMargin: js.UndefOr[Double] = js.native
  /**
    * **useMaxWidth** - when this flag is set the height and width is set to 100% and is then scaling with the
    * available space if not the absolute space required is used
    * default: true
    */
  var useMaxWidth: js.UndefOr[Boolean] = js.native
  /**
    * **width** - Width of actor boxes
    * default: 150
    */
  var width: js.UndefOr[Double] = js.native
}

object SequenceDiagramConfig {
  @scala.inline
  def apply(): SequenceDiagramConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceDiagramConfig]
  }
  @scala.inline
  implicit class SequenceDiagramConfigOps[Self <: SequenceDiagramConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActorMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActorMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomMarginAdj(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomMarginAdj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomMarginAdj: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomMarginAdj")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxTextMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxTextMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxTextMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxTextMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagramMarginX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramMarginX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagramMarginX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramMarginX")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagramMarginY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramMarginY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagramMarginY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramMarginY")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withMirrorActors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrorActors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirrorActors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrorActors")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMaxWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

