package typingsSlinky.cathoQuantum

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.anon.`7`
import typingsSlinky.cathoQuantum.contentMod.Content
import typingsSlinky.cathoQuantum.descriptionMod.Description
import typingsSlinky.cathoQuantum.footerMod.Footer
import typingsSlinky.cathoQuantum.headerMod.Header
import typingsSlinky.cathoQuantum.headerTextMod.HeaderText
import typingsSlinky.cathoQuantum.mediaMod.Media
import typingsSlinky.cathoQuantum.thumbnailMod.Thumbnail
import typingsSlinky.cathoQuantum.titleMod.Title
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@catho/quantum/Card", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Card", "default.Content")
    @js.native
    def Content: typingsSlinky.cathoQuantum.contentMod.Content = js.native
    @scala.inline
    def Content_=(x: Content): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Description")
    @js.native
    def Description: typingsSlinky.cathoQuantum.descriptionMod.Description = js.native
    @scala.inline
    def Description_=(x: Description): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Footer")
    @js.native
    def Footer: typingsSlinky.cathoQuantum.footerMod.Footer = js.native
    @scala.inline
    def Footer_=(x: Footer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Header")
    @js.native
    def Header: typingsSlinky.cathoQuantum.headerMod.Header = js.native
    
    @JSImport("@catho/quantum/Card", "default.HeaderText")
    @js.native
    def HeaderText: typingsSlinky.cathoQuantum.headerTextMod.HeaderText = js.native
    @scala.inline
    def HeaderText_=(x: HeaderText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderText")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Header_=(x: Header): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Media")
    @js.native
    def Media: typingsSlinky.cathoQuantum.mediaMod.Media = js.native
    @scala.inline
    def Media_=(x: Media): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Media")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Thumbnail")
    @js.native
    def Thumbnail: typingsSlinky.cathoQuantum.thumbnailMod.Thumbnail = js.native
    @scala.inline
    def Thumbnail_=(x: Thumbnail): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Thumbnail")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Title")
    @js.native
    def Title: typingsSlinky.cathoQuantum.titleMod.Title = js.native
    @scala.inline
    def Title_=(x: Title): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  }
  
  type Card = ReactComponentClass[Props]
  
  @js.native
  trait Props extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[Element], Unit]] = js.native
    
    var theme: js.UndefOr[`7`] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setTheme(value: `7`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
