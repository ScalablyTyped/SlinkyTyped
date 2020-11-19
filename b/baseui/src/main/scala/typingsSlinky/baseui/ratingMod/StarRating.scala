package typingsSlinky.baseui.ratingMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/rating", "StarRating")
@js.native
class StarRating ()
  extends Component[StarRatingProps, RatingState, js.Any] {
  
  def renderRatingContents(): js.Array[ReactElement] = js.native
  
  def selectItem(value: Double): Unit = js.native
  
  def updatePreview(): Unit = js.native
  def updatePreview(previewIndex: Double): Unit = js.native
}
