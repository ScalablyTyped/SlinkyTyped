package typingsSlinky.reactSketchapp.gMod

import typingsSlinky.reactSketchapp.propsMod.ClipProps
import typingsSlinky.reactSketchapp.propsMod.DefinationProps
import typingsSlinky.reactSketchapp.propsMod.FillProps
import typingsSlinky.reactSketchapp.propsMod.FontProps
import typingsSlinky.reactSketchapp.propsMod.StrokeProps
import typingsSlinky.reactSketchapp.propsMod.TransformProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps
     with FontProps

object GProps {
  @scala.inline
  def apply(): GProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GProps]
  }
}

