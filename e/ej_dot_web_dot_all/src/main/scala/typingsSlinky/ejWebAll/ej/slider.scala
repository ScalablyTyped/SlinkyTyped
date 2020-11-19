package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  }
}
