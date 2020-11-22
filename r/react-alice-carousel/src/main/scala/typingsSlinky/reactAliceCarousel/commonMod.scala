package typingsSlinky.reactAliceCarousel

import typingsSlinky.reactAliceCarousel.anon.PartialProps
import typingsSlinky.reactAliceCarousel.anon.PartialState
import typingsSlinky.reactAliceCarousel.typesMod.Props
import typingsSlinky.reactAliceCarousel.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-alice-carousel/lib/utils/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  
  def calculateInitialState(props: PartialProps, el: js.Any): State = js.native
  
  def getIsStageContentPartial(): Boolean = js.native
  def getIsStageContentPartial(stageWidth: js.UndefOr[scala.Nothing], contentWidth: Double): Boolean = js.native
  def getIsStageContentPartial(stageWidth: Double): Boolean = js.native
  def getIsStageContentPartial(stageWidth: Double, contentWidth: Double): Boolean = js.native
  
  def getItemsInSlide(itemsCount: Double, props: Props): Double = js.native
  
  def getStageContentWidth(state: PartialState): Double = js.native
}
