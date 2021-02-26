package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.baseMod.ThemeType
import typingsSlinky.grommet.grommetStrings.dark
import typingsSlinky.grommet.grommetStrings.light
import typingsSlinky.grommet.grommetStrings.rtl
import typingsSlinky.grommet.utilsMod.BackgroundType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grommetMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Grommet", "Grommet")
  @js.native
  class Grommet protected ()
    extends Component[
          GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Grommet", "Grommet")
  @js.native
  val Grommet: ReactComponentClass[
    GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait GrommetProps extends StObject {
    
    var background: js.UndefOr[BackgroundType] = js.native
    
    var containerTarget: js.UndefOr[HTMLElement] = js.native
    
    var cssVars: js.UndefOr[Boolean] = js.native
    
    var dir: js.UndefOr[rtl] = js.native
    
    var full: js.UndefOr[Boolean] = js.native
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[ThemeType] = js.native
    
    var themeMode: js.UndefOr[dark | light] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object GrommetProps {
    
    @scala.inline
    def apply(): GrommetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrommetProps]
    }
    
    @scala.inline
    implicit class GrommetPropsMutableBuilder[Self <: GrommetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setContainerTarget(value: HTMLElement): Self = StObject.set(x, "containerTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerTargetUndefined: Self = StObject.set(x, "containerTarget", js.undefined)
      
      @scala.inline
      def setCssVars(value: Boolean): Self = StObject.set(x, "cssVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssVarsUndefined: Self = StObject.set(x, "cssVars", js.undefined)
      
      @scala.inline
      def setDir(value: rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeMode(value: dark | light): Self = StObject.set(x, "themeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeModeUndefined: Self = StObject.set(x, "themeMode", js.undefined)
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
