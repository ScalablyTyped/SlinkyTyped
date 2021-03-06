package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.cathoQuantum.anon.Alt
import typingsSlinky.cathoQuantum.anon.BaseFontSizeSpacing
import typingsSlinky.cathoQuantum.anon.ClassName
import typingsSlinky.cathoQuantum.anon.ColorsSpacing
import typingsSlinky.cathoQuantum.anon.Small
import typingsSlinky.cathoQuantum.anon.SmallTheme
import typingsSlinky.cathoQuantum.anon.Theme
import typingsSlinky.cathoQuantum.anon.`2`
import typingsSlinky.cathoQuantum.anon.`7`
import typingsSlinky.cathoQuantum.anon.`9`
import typingsSlinky.cathoQuantum.cardMod.Props
import typingsSlinky.cathoQuantum.cardMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  object Content {
    
    @JSImport("@catho/quantum/Card", "default.Content")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def theme(value: BaseFontSizeSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Content.type): typingsSlinky.cathoQuantum.components.Card.Content.Builder = new typingsSlinky.cathoQuantum.components.Card.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Theme): typingsSlinky.cathoQuantum.components.Card.Content.Builder = new typingsSlinky.cathoQuantum.components.Card.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Description {
    
    @JSImport("@catho/quantum/Card", "default.Description")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def theme(value: BaseFontSizeSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Description.type): typingsSlinky.cathoQuantum.components.Card.Description.Builder = new typingsSlinky.cathoQuantum.components.Card.Description.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Small): typingsSlinky.cathoQuantum.components.Card.Description.Builder = new typingsSlinky.cathoQuantum.components.Card.Description.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footer {
    
    @JSImport("@catho/quantum/Card", "default.Footer")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Footer.type): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: `2`): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("@catho/quantum/Card", "default.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: `2`): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object HeaderText {
    
    @JSImport("@catho/quantum/Card", "default.HeaderText")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: HeaderText.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Media {
    
    @JSImport("@catho/quantum/Card", "default.Media")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Media.type): typingsSlinky.cathoQuantum.components.Card.Media.Builder = new typingsSlinky.cathoQuantum.components.Card.Media.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ClassName): typingsSlinky.cathoQuantum.components.Card.Media.Builder = new typingsSlinky.cathoQuantum.components.Card.Media.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Thumbnail {
    
    @scala.inline
    def apply(alt: String, src: String): typingsSlinky.cathoQuantum.components.Card.Thumbnail.Builder = {
      val __props = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      new typingsSlinky.cathoQuantum.components.Card.Thumbnail.Builder(js.Array(this.component, __props.asInstanceOf[Alt]))
    }
    
    @JSImport("@catho/quantum/Card", "default.Thumbnail")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def theme(value: `7`): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: Alt): typingsSlinky.cathoQuantum.components.Card.Thumbnail.Builder = new typingsSlinky.cathoQuantum.components.Card.Thumbnail.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("@catho/quantum/Card", "default.Title")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def theme(value: `9`): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Title.type): typingsSlinky.cathoQuantum.components.Card.Title.Builder = new typingsSlinky.cathoQuantum.components.Card.Title.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SmallTheme): typingsSlinky.cathoQuantum.components.Card.Title.Builder = new typingsSlinky.cathoQuantum.components.Card.Title.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@catho/quantum/Card", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def onClick(value: /* e */ SyntheticMouseEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: `7`): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
