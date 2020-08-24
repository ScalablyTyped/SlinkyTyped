package typingsSlinky.cathoQuantum.components

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  @JSImport("@catho/quantum/Card", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def theme(value: `7`): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Content {
    @JSImport("@catho/quantum/Card", "default.Content")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def theme(value: BaseFontSizeSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: Theme): typingsSlinky.cathoQuantum.components.Card.Content.Builder = new typingsSlinky.cathoQuantum.components.Card.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Content.type): typingsSlinky.cathoQuantum.components.Card.Content.Builder = new typingsSlinky.cathoQuantum.components.Card.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Description {
    @JSImport("@catho/quantum/Card", "default.Description")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
      @scala.inline
      def theme(value: BaseFontSizeSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: Small): typingsSlinky.cathoQuantum.components.Card.Description.Builder = new typingsSlinky.cathoQuantum.components.Card.Description.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Description.type): typingsSlinky.cathoQuantum.components.Card.Description.Builder = new typingsSlinky.cathoQuantum.components.Card.Description.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Footer {
    @JSImport("@catho/quantum/Card", "default.Footer")
    @js.native
    object component extends js.Object
    
    def withProps(p: `2`): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Footer.type): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Header {
    @JSImport("@catho/quantum/Card", "default.Header")
    @js.native
    object component extends js.Object
    
    def withProps(p: `2`): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Header.type): SharedBuilder_2_2068818808 = new SharedBuilder_2_2068818808(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object HeaderText {
    @JSImport("@catho/quantum/Card", "default.HeaderText")
    @js.native
    object component extends js.Object
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: HeaderText.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Media {
    @JSImport("@catho/quantum/Card", "default.Media")
    @js.native
    object component extends js.Object
    
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
    
    def withProps(p: ClassName): typingsSlinky.cathoQuantum.components.Card.Media.Builder = new typingsSlinky.cathoQuantum.components.Card.Media.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Media.type): typingsSlinky.cathoQuantum.components.Card.Media.Builder = new typingsSlinky.cathoQuantum.components.Card.Media.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Thumbnail {
    @JSImport("@catho/quantum/Card", "default.Thumbnail")
    @js.native
    object component extends js.Object
    
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
    @scala.inline
    def apply(alt: String, src: String): typingsSlinky.cathoQuantum.components.Card.Thumbnail.Builder = {
        val __props = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
        new typingsSlinky.cathoQuantum.components.Card.Thumbnail.Builder(js.Array(this.component, __props.asInstanceOf[Alt]))
    }
  }
  
  object Title {
    @JSImport("@catho/quantum/Card", "default.Title")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
      @scala.inline
      def theme(value: `9`): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: SmallTheme): typingsSlinky.cathoQuantum.components.Card.Title.Builder = new typingsSlinky.cathoQuantum.components.Card.Title.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Title.type): typingsSlinky.cathoQuantum.components.Card.Title.Builder = new typingsSlinky.cathoQuantum.components.Card.Title.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

