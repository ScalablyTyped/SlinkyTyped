package typingsSlinky.ejDotWebDotAll.ej

import typingsSlinky.ejDotWebDotAll.ej.slider.sliderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.slider")
@js.native
object slider extends js.Object {
  @js.native
  sealed trait sliderType extends js.Object
  
  @js.native
  object sliderType extends js.Object {
    //Shows default slider
    @js.native
    sealed trait Default extends sliderType
    
    //Shows minRange slider
    @js.native
    sealed trait MinRange extends sliderType
    
    //Shows Range slider
    @js.native
    sealed trait Range extends sliderType
    
    /* 0 */ val Default: typingsSlinky.ejDotWebDotAll.ej.slider.sliderType.Default with Double = js.native
    /* 1 */ val MinRange: typingsSlinky.ejDotWebDotAll.ej.slider.sliderType.MinRange with Double = js.native
    /* 2 */ val Range: typingsSlinky.ejDotWebDotAll.ej.slider.sliderType.Range with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[sliderType with Double] = js.native
  }
  
}

