package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.FullScreen
import typingsSlinky.grommet.grommetStrings.`false`
import typingsSlinky.grommet.grommetStrings.below
import typingsSlinky.grommet.grommetStrings.contain
import typingsSlinky.grommet.grommetStrings.controls
import typingsSlinky.grommet.grommetStrings.cover
import typingsSlinky.grommet.grommetStrings.over
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.VideoHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Video", "Video")
  @js.native
  class Video protected ()
    extends Component[
          VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
            DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
            controls
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
            DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
            controls
          ])) = this()
    def this(
      props: VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
            DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
            controls
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Video", "Video")
  @js.native
  val Video: ReactComponentClass[
    VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
      DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
      controls
    ])
  ] = js.native
  
  @js.native
  trait VideoProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var autoPlay: js.UndefOr[Boolean] = js.native
    
    var controls: js.UndefOr[`false` | over | below] = js.native
    
    var fit: js.UndefOr[cover | contain] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var messages: js.UndefOr[FullScreen] = js.native
    
    var mute: js.UndefOr[Boolean] = js.native
  }
  object VideoProps {
    
    @scala.inline
    def apply(): VideoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoProps]
    }
    
    @scala.inline
    implicit class VideoPropsMutableBuilder[Self <: VideoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setControls(value: `false` | over | below): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setFit(value: cover | contain): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMessages(value: FullScreen): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    }
  }
}
