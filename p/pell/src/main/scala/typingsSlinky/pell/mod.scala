package typingsSlinky.pell

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pell", "exec")
  @js.native
  def exec(command: String): Unit = js.native
  @JSImport("pell", "exec")
  @js.native
  def exec(command: String, value: String): Unit = js.native
  
  @JSImport("pell", "init")
  @js.native
  def init[T /* <: HTMLElement */](c: pellConfig[T]): T with PellElement = js.native
  
  @js.native
  trait PellElement extends StObject {
    
    var content: HTMLDivElement = js.native
  }
  object PellElement {
    
    @scala.inline
    def apply(content: HTMLDivElement): PellElement = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PellElement]
    }
    
    @scala.inline
    implicit class PellElementMutableBuilder[Self <: PellElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: HTMLDivElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pell.mod.pellBuiltinAction
    - typingsSlinky.pell.mod.pellActionConfig
    - typingsSlinky.pell.mod.pellCustomActionConfig
  */
  trait pellAction extends StObject
  
  @js.native
  trait pellActionConfig extends pellAction {
    
    var icon: js.UndefOr[String] = js.native
    
    var name: pellAction = js.native
    
    def result(): Unit = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object pellActionConfig {
    
    @scala.inline
    def apply(name: pellAction, result: () => Unit): pellActionConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result = js.Any.fromFunction0(result))
      __obj.asInstanceOf[pellActionConfig]
    }
    
    @scala.inline
    implicit class pellActionConfigMutableBuilder[Self <: pellActionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setName(value: pellAction): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: () => Unit): Self = StObject.set(x, "result", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pell.pellStrings.bold
    - typingsSlinky.pell.pellStrings.italic
    - typingsSlinky.pell.pellStrings.underline
    - typingsSlinky.pell.pellStrings.strikethrough
    - typingsSlinky.pell.pellStrings.heading1
    - typingsSlinky.pell.pellStrings.heading2
    - typingsSlinky.pell.pellStrings.paragraph
    - typingsSlinky.pell.pellStrings.quote
    - typingsSlinky.pell.pellStrings.olist
    - typingsSlinky.pell.pellStrings.ulist
    - typingsSlinky.pell.pellStrings.code
    - typingsSlinky.pell.pellStrings.line
    - typingsSlinky.pell.pellStrings.link
    - typingsSlinky.pell.pellStrings.image
  */
  trait pellBuiltinAction extends pellAction
  object pellBuiltinAction {
    
    @scala.inline
    def bold: typingsSlinky.pell.pellStrings.bold = "bold".asInstanceOf[typingsSlinky.pell.pellStrings.bold]
    
    @scala.inline
    def code: typingsSlinky.pell.pellStrings.code = "code".asInstanceOf[typingsSlinky.pell.pellStrings.code]
    
    @scala.inline
    def heading1: typingsSlinky.pell.pellStrings.heading1 = "heading1".asInstanceOf[typingsSlinky.pell.pellStrings.heading1]
    
    @scala.inline
    def heading2: typingsSlinky.pell.pellStrings.heading2 = "heading2".asInstanceOf[typingsSlinky.pell.pellStrings.heading2]
    
    @scala.inline
    def image: typingsSlinky.pell.pellStrings.image = "image".asInstanceOf[typingsSlinky.pell.pellStrings.image]
    
    @scala.inline
    def italic: typingsSlinky.pell.pellStrings.italic = "italic".asInstanceOf[typingsSlinky.pell.pellStrings.italic]
    
    @scala.inline
    def line: typingsSlinky.pell.pellStrings.line = "line".asInstanceOf[typingsSlinky.pell.pellStrings.line]
    
    @scala.inline
    def link: typingsSlinky.pell.pellStrings.link = "link".asInstanceOf[typingsSlinky.pell.pellStrings.link]
    
    @scala.inline
    def olist: typingsSlinky.pell.pellStrings.olist = "olist".asInstanceOf[typingsSlinky.pell.pellStrings.olist]
    
    @scala.inline
    def paragraph: typingsSlinky.pell.pellStrings.paragraph = "paragraph".asInstanceOf[typingsSlinky.pell.pellStrings.paragraph]
    
    @scala.inline
    def quote: typingsSlinky.pell.pellStrings.quote = "quote".asInstanceOf[typingsSlinky.pell.pellStrings.quote]
    
    @scala.inline
    def strikethrough: typingsSlinky.pell.pellStrings.strikethrough = "strikethrough".asInstanceOf[typingsSlinky.pell.pellStrings.strikethrough]
    
    @scala.inline
    def ulist: typingsSlinky.pell.pellStrings.ulist = "ulist".asInstanceOf[typingsSlinky.pell.pellStrings.ulist]
    
    @scala.inline
    def underline: typingsSlinky.pell.pellStrings.underline = "underline".asInstanceOf[typingsSlinky.pell.pellStrings.underline]
  }
  
  @js.native
  trait pellClasses extends StObject {
    
    var actionbar: js.UndefOr[String] = js.native
    
    var button: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var selected: js.UndefOr[String] = js.native
  }
  object pellClasses {
    
    @scala.inline
    def apply(): pellClasses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pellClasses]
    }
    
    @scala.inline
    implicit class pellClassesMutableBuilder[Self <: pellClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionbar(value: String): Self = StObject.set(x, "actionbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionbarUndefined: Self = StObject.set(x, "actionbar", js.undefined)
      
      @scala.inline
      def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  @js.native
  trait pellConfig[T /* <: HTMLElement */] extends StObject {
    
    var actions: js.Array[pellAction] = js.native
    
    var classes: js.UndefOr[pellClasses] = js.native
    
    var defaultParagraphSeparator: js.UndefOr[String] = js.native
    
    var element: T = js.native
    
    def onChange(html: String): Unit = js.native
    
    var styleWithCSS: js.UndefOr[Boolean] = js.native
  }
  object pellConfig {
    
    @scala.inline
    def apply[T /* <: HTMLElement */](actions: js.Array[pellAction], element: T, onChange: String => Unit): pellConfig[T] = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[pellConfig[T]]
    }
    
    @scala.inline
    implicit class pellConfigMutableBuilder[Self <: pellConfig[_], T /* <: HTMLElement */] (val x: Self with pellConfig[T]) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[pellAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: pellAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setClasses(value: pellClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setDefaultParagraphSeparator(value: String): Self = StObject.set(x, "defaultParagraphSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultParagraphSeparatorUndefined: Self = StObject.set(x, "defaultParagraphSeparator", js.undefined)
      
      @scala.inline
      def setElement(value: T): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyleWithCSS(value: Boolean): Self = StObject.set(x, "styleWithCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleWithCSSUndefined: Self = StObject.set(x, "styleWithCSS", js.undefined)
    }
  }
  
  @js.native
  trait pellCustomActionConfig extends pellAction {
    
    var icon: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def result(): Unit = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object pellCustomActionConfig {
    
    @scala.inline
    def apply(icon: String, result: () => Unit): pellCustomActionConfig = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], result = js.Any.fromFunction0(result))
      __obj.asInstanceOf[pellCustomActionConfig]
    }
    
    @scala.inline
    implicit class pellCustomActionConfigMutableBuilder[Self <: pellCustomActionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResult(value: () => Unit): Self = StObject.set(x, "result", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
