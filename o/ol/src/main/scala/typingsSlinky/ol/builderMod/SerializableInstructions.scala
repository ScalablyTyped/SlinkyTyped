package typingsSlinky.ol.builderMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.canvasMod.FillState
import typingsSlinky.ol.canvasMod.StrokeState
import typingsSlinky.ol.canvasMod.TextState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializableInstructions extends js.Object {
  var coordinates: js.Array[Double] = js.native
  var fillStates: js.UndefOr[StringDictionary[FillState]] = js.native
  var hitDetectionInstructions: js.Array[_] = js.native
  var instructions: js.Array[_] = js.native
  var strokeStates: js.UndefOr[StringDictionary[StrokeState]] = js.native
  var textStates: js.UndefOr[StringDictionary[TextState]] = js.native
}

object SerializableInstructions {
  @scala.inline
  def apply(coordinates: js.Array[Double], hitDetectionInstructions: js.Array[_], instructions: js.Array[_]): SerializableInstructions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], hitDetectionInstructions = hitDetectionInstructions.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableInstructions]
  }
  @scala.inline
  implicit class SerializableInstructionsOps[Self <: SerializableInstructions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitDetectionInstructions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitDetectionInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstructions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillStates(value: StringDictionary[FillState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStates")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeStates(value: StringDictionary[StrokeState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStates")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStates(value: StringDictionary[TextState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStates")(js.undefined)
        ret
    }
  }
  
}

