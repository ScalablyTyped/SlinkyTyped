package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.boxMod.BoxProps
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod {
  
  @JSImport("grommet/components/Avatar", "Avatar")
  @js.native
  val Avatar: ReactComponentClass[
    BoxProps with AvatarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait AvatarProps extends StObject {
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
    
    var src: js.UndefOr[String] = js.native
  }
  object AvatarProps {
    
    @scala.inline
    def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    @scala.inline
    implicit class AvatarPropsMutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
