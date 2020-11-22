package typingsSlinky.reactAliceCarousel

import slinky.core.facade.ReactElement
import typingsSlinky.reactAliceCarousel.anon.ClassName
import typingsSlinky.reactAliceCarousel.anon.SlidesLength
import typingsSlinky.reactAliceCarousel.dotsNavigationMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-alice-carousel/lib/views", JSImport.Namespace)
@js.native
object viewsMod extends js.Object {
  
  def DotsNavigation(hasStateOnClickOnMouseEnterOnMouseLeave: Props): ReactElement = js.native
  
  def PlayPauseButton(hasIsPlayingOnClick: typingsSlinky.reactAliceCarousel.playPauseButtonMod.Props): ReactElement = js.native
  
  def PrevNextButton(hasNameDisabledOnClick: typingsSlinky.reactAliceCarousel.prevNextButtonMod.Props): ReactElement = js.native
  
  def SlideInfo(hasActiveIndexSlidesLength: SlidesLength): ReactElement = js.native
  
  def StageItem(hasItemClassNameStyles: ClassName): ReactElement = js.native
}
