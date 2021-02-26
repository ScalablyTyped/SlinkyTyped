package typingsSlinky.bbcodeToReact

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.bbcodeToReact.anon.Linkify
import typingsSlinky.bbcodeToReact.anon.PartialOmitTagTypechildre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * A defualt parser instance to be exported in this library
    */
  @JSImport("bbcode-to-react", JSImport.Default)
  @js.native
  val default: Parser[Linkify] = js.native
  
  /**
    * A class designed for parsing bbcode.
    * The class exposes some public function
    * to make the conversion between bbcode and html/ReactNode possible.
    * The class is exported from the library,
    * and a class instance with pre-defined tags collections is exported as default.
    */
  @JSImport("bbcode-to-react", "Parser")
  @js.native
  /**
    * Initializing the class members
    * @param allowedTags
    * An object to be combined with a set of default tags
    * for forming the class member "tag"
    */
  class Parser[T] () extends StObject {
    def this(allowedTags: js.Object) = this()
    
    /**
      * Method for parsing an input string into a tag instance
      * @param input A string to be parsed
      * @returns a tag instance
      */
    /* protected */ def parse(input: String): Tag[Linkify] = js.native
    
    /**
      * Method for adding an user-defined tag instance into the parser
      * @param name A tag name to be provided
      * @param tag A tag instance to be provided
      */
    def registerTag(
      name: String,
      tag: Instantiable2[
          /* renderer */ Renderer[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* settings */ js.UndefOr[PartialOmitTagTypechildre], 
          Tag[js.Object]
        ]
    ): Unit = js.native
    
    /**
      * A renderer member for a parser instance
      */
    var renderer: Renderer[T] = js.native
    
    /**
      * A tags collection for a parser instance
      */
    var tags: StringDictionary[Tag[Linkify]] = js.native
    
    /**
      * Method for converting a bbcode to HTML
      * @param input a bbcode string
      * @returns a HTML in string form
      */
    def toHTML(input: String): String = js.native
    
    /**
      * Method for converting a bbcode to react component
      * @param input a bbcode string
      * @returns a react component
      */
    def toReact(input: String): ReactElement = js.native
  }
  
  /**
    * A class designed for handling bbcode.
    * The Tag class mostly is extended into another customized class,
    * and seldom an instance would be needed for bbcode parsing.
    * The class is exported from the library.
    */
  @JSImport("bbcode-to-react", "Tag")
  @js.native
  class Tag[T] protected () extends StObject {
    /**
      * Initializing the class members
      * @param renderer A Renderer instance to be injected
      * @param settings
      * A "TagType" object (without children attribute)
      * for initializing the class member "params"
      */
    def this(renderer: Renderer[T]) = this()
    def this(renderer: Renderer[T], settings: PartialOmitTagTypechildre) = this()
    
    /**
      * The children of a tag object, with type ReactNode array
      */
    var children: js.Array[ReactElement] = js.native
    
    /**
      * Getter method of the "children" member of the Tag instance
      * @returns A ReactNode array representing the "children" member of the Tag instance
      */
    /* protected */ def getComponents(): js.Array[ReactElement] = js.native
    
    /**
      * Getter method for inner text of the Tag instance
      * @param raw If true, also convert a plain url to an "a" tag in text form
      * @returns Inner text of the Tag instance
      */
    /* protected */ def getContent(): String = js.native
    /* protected */ def getContent(raw: Boolean): String = js.native
    
    /**
      * Tag name, with type string
      */
    var name: String = js.native
    
    /**
      * A "params" object for inner processing
      */
    var params: /* import warning: importer.ImportType#apply Failed type conversion: bbcode-to-react.bbcode-to-react.TagType['params'] */ js.Any = js.native
    
    /**
      * The parent of a tag object, with type ReactNode
      */
    var parent: ReactElement = js.native
    
    /**
      * The inner text of a tag object, with type string
      */
    var text: String = js.native
    
    /**
      * Method for converting a tag instance to HTML
      * @returns a HTML in string form
      */
    /* protected */ def toHTML(): String = js.native
    
    /**
      * Method for converting a tag instance to react component
      * @returns a react component
      */
    /* protected */ def toReact(): ReactElement = js.native
  }
  
  /**
    * A generic building block for Tag class and Parser class.
    * An optional interface can be provided for constructing the class
    * The class is NOT exported from the library.
    */
  @js.native
  trait Renderer[optionType] extends StObject {
    
    /**
      * Injecting incoming context to class and return the input function
      * @param context An array storing objects with type "optionType"
      * @param func: A function to be returned
      * @returns A function returning a string array
      */
    def context(context: optionType, func: js.Function0[js.Array[String]]): js.Function0[js.Array[String]] = js.native
    
    /**
      * An array storing objects with type "optionType"
      */
    var contexts: js.Array[optionType] = js.native
    
    /**
      * Process incoming value by regexp and return the output
      * @param value Input to be processed
      * @returns A processed string
      */
    def cosmeticReplace(value: String): String = js.native
    
    /**
      * Process incoming value by regexp and return the output
      * @param value Input to be processed
      * @returns A processed string
      */
    def escape(value: String): String = js.native
    
    /**
      * Process incoming value by regexp and return the output
      * @param value Input to be processed
      * @returns A processed string
      */
    def linkify(value: String): String = js.native
    
    /**
      * An object storing some essential flags and params,
      * with default value { linkify: false }
      */
    var options: optionType = js.native
    
    /**
      * Process incoming value by regexp and return the output
      * @param value Input to be processed
      * @returns A processed string
      */
    def strip(value: String): String = js.native
  }
  object Renderer {
    
    @scala.inline
    def apply[optionType](
      context: (optionType, js.Function0[js.Array[String]]) => js.Function0[js.Array[String]],
      contexts: js.Array[optionType],
      cosmeticReplace: String => String,
      escape: String => String,
      linkify: String => String,
      options: optionType,
      strip: String => String
    ): Renderer[optionType] = {
      val __obj = js.Dynamic.literal(context = js.Any.fromFunction2(context), contexts = contexts.asInstanceOf[js.Any], cosmeticReplace = js.Any.fromFunction1(cosmeticReplace), escape = js.Any.fromFunction1(escape), linkify = js.Any.fromFunction1(linkify), options = options.asInstanceOf[js.Any], strip = js.Any.fromFunction1(strip))
      __obj.asInstanceOf[Renderer[optionType]]
    }
    
    @scala.inline
    implicit class RendererMutableBuilder[Self <: Renderer[_], optionType] (val x: Self with Renderer[optionType]) extends AnyVal {
      
      @scala.inline
      def setContext(value: (optionType, js.Function0[js.Array[String]]) => js.Function0[js.Array[String]]): Self = StObject.set(x, "context", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContexts(value: js.Array[optionType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsVarargs(value: optionType*): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setCosmeticReplace(value: String => String): Self = StObject.set(x, "cosmeticReplace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscape(value: String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinkify(value: String => String): Self = StObject.set(x, "linkify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: optionType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrip(value: String => String): Self = StObject.set(x, "strip", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An interface for class member in "Tag"
    */
  @js.native
  trait TagType extends StObject {
    
    /**
      * The children of a tag object, with type ReactNode array
      */
    var children: js.Array[ReactElement] = js.native
    
    /**
      * Tag name, with type string
      */
    var name: String = js.native
    
    /**
      * A "params" object for inner processing
      */
    var params: js.Object = js.native
    
    /**
      * The parent of a tag object, with type ReactNode
      */
    var parent: ReactElement = js.native
    
    /**
      * The inner text of a tag object, with type string
      */
    var text: String = js.native
  }
  object TagType {
    
    @scala.inline
    def apply(children: js.Array[ReactElement], name: String, params: js.Object, text: String): TagType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagType]
    }
    
    @scala.inline
    implicit class TagTypeMutableBuilder[Self <: TagType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: ReactElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Parser[Linkify]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Parser[Linkify] = default
}
