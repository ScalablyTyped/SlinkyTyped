package typingsSlinky.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollbarSizeMod {
  
  @JSImport("@react-md/utils/types/layout/scrollbarSize", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("@react-md/utils/types/layout/scrollbarSize", "scrollbarSize")
  @js.native
  def scrollbarSize(): Double = js.native
  @JSImport("@react-md/utils/types/layout/scrollbarSize", "scrollbarSize")
  @js.native
  def scrollbarSize(`type`: js.UndefOr[scala.Nothing], forced: Boolean): Double = js.native
  @JSImport("@react-md/utils/types/layout/scrollbarSize", "scrollbarSize")
  @js.native
  def scrollbarSize(`type`: SizingType): Double = js.native
  @JSImport("@react-md/utils/types/layout/scrollbarSize", "scrollbarSize")
  @js.native
  def scrollbarSize(`type`: SizingType, forced: Boolean): Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdUtils.reactMdUtilsStrings.height
    - typingsSlinky.reactMdUtils.reactMdUtilsStrings.width
  */
  trait SizingType extends StObject
  object SizingType {
    
    @scala.inline
    def height: typingsSlinky.reactMdUtils.reactMdUtilsStrings.height = "height".asInstanceOf[typingsSlinky.reactMdUtils.reactMdUtilsStrings.height]
    
    @scala.inline
    def width: typingsSlinky.reactMdUtils.reactMdUtilsStrings.width = "width".asInstanceOf[typingsSlinky.reactMdUtils.reactMdUtilsStrings.width]
  }
}
