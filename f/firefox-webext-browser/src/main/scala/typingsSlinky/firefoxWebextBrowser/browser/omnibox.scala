package typingsSlinky.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The omnibox API allows you to register a keyword with Firefox's address bar.
  *
  * Manifest keys: `omnibox`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object omnibox {
  
  /** A suggest result. */
  @js.native
  trait DefaultSuggestResult extends StObject {
    
    /** The text that is displayed in the URL dropdown. */
    var description: String = js.native
    
    /**
      * An array of style ranges for the description, as provided by the extension.
      * @deprecated Unsupported on Firefox at this time.
      */
    var descriptionStyles: js.UndefOr[js.Array[DefaultSuggestResultDescriptionStyles]] = js.native
    
    /**
      * An array of style ranges for the description, as provided by ToValue().
      * @deprecated Unsupported on Firefox at this time.
      */
    var descriptionStylesRaw: js.UndefOr[js.Array[DefaultSuggestResultDescriptionStylesRaw]] = js.native
  }
  object DefaultSuggestResult {
    
    @scala.inline
    def apply(description: String): DefaultSuggestResult = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultSuggestResult]
    }
    
    @scala.inline
    implicit class DefaultSuggestResultMutableBuilder[Self <: DefaultSuggestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionStyles(value: js.Array[DefaultSuggestResultDescriptionStyles]): Self = StObject.set(x, "descriptionStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionStylesRaw(value: js.Array[DefaultSuggestResultDescriptionStylesRaw]): Self = StObject.set(x, "descriptionStylesRaw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionStylesRawUndefined: Self = StObject.set(x, "descriptionStylesRaw", js.undefined)
      
      @scala.inline
      def setDescriptionStylesRawVarargs(value: DefaultSuggestResultDescriptionStylesRaw*): Self = StObject.set(x, "descriptionStylesRaw", js.Array(value :_*))
      
      @scala.inline
      def setDescriptionStylesUndefined: Self = StObject.set(x, "descriptionStyles", js.undefined)
      
      @scala.inline
      def setDescriptionStylesVarargs(value: DefaultSuggestResultDescriptionStyles*): Self = StObject.set(x, "descriptionStyles", js.Array(value :_*))
    }
  }
  
  /** The style ranges for the description, as provided by the extension. */
  @js.native
  trait DefaultSuggestResultDescriptionStyles extends StObject {
    
    var length: js.UndefOr[Double] = js.native
    
    var offset: Double = js.native
    
    /** The style type */
    var `type`: DescriptionStyleType = js.native
  }
  object DefaultSuggestResultDescriptionStyles {
    
    @scala.inline
    def apply(offset: Double, `type`: DescriptionStyleType): DefaultSuggestResultDescriptionStyles = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultSuggestResultDescriptionStyles]
    }
    
    @scala.inline
    implicit class DefaultSuggestResultDescriptionStylesMutableBuilder[Self <: DefaultSuggestResultDescriptionStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DescriptionStyleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** The style ranges for the description, as provided by ToValue(). */
  @js.native
  trait DefaultSuggestResultDescriptionStylesRaw extends StObject {
    
    var offset: Double = js.native
    
    var `type`: Double = js.native
  }
  object DefaultSuggestResultDescriptionStylesRaw {
    
    @scala.inline
    def apply(offset: Double, `type`: Double): DefaultSuggestResultDescriptionStylesRaw = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultSuggestResultDescriptionStylesRaw]
    }
    
    @scala.inline
    implicit class DefaultSuggestResultDescriptionStylesRawMutableBuilder[Self <: DefaultSuggestResultDescriptionStylesRaw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* omnibox types */
  /** The style type. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match`
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim
  */
  trait DescriptionStyleType extends StObject
  object DescriptionStyleType {
    
    @scala.inline
    def dim: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim = "dim".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.dim]
    
    @scala.inline
    def `match`: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match` = "match".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`match`]
    
    @scala.inline
    def url: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = "url".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.url]
  }
  
  /**
    * The window disposition for the omnibox query. This is the recommended context to display results. For example, if the omnibox command is to navigate to a certain URL, a disposition of 'newForegroundTab' means the navigation should take place in a new selected tab.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab
  */
  trait OnInputEnteredDisposition extends StObject
  object OnInputEnteredDisposition {
    
    @scala.inline
    def currentTab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab = "currentTab".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab]
    
    @scala.inline
    def newBackgroundTab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab = "newBackgroundTab".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab]
    
    @scala.inline
    def newForegroundTab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab = "newForegroundTab".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab]
  }
  
  /** A suggest result. */
  @js.native
  trait SuggestResult extends StObject {
    
    /**
      * The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry.
      */
    var content: String = js.native
    
    /**
      * The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. <dim><match>dimmed match</match></dim>. You must escape the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484
      */
    var description: String = js.native
    
    /**
      * An array of style ranges for the description, as provided by the extension.
      * @deprecated Unsupported on Firefox at this time.
      */
    var descriptionStyles: js.UndefOr[js.Array[SuggestResultDescriptionStyles]] = js.native
    
    /**
      * An array of style ranges for the description, as provided by ToValue().
      * @deprecated Unsupported on Firefox at this time.
      */
    var descriptionStylesRaw: js.UndefOr[js.Array[SuggestResultDescriptionStylesRaw]] = js.native
  }
  object SuggestResult {
    
    @scala.inline
    def apply(content: String, description: String): SuggestResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestResult]
    }
    
    @scala.inline
    implicit class SuggestResultMutableBuilder[Self <: SuggestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionStyles(value: js.Array[SuggestResultDescriptionStyles]): Self = StObject.set(x, "descriptionStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionStylesRaw(value: js.Array[SuggestResultDescriptionStylesRaw]): Self = StObject.set(x, "descriptionStylesRaw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionStylesRawUndefined: Self = StObject.set(x, "descriptionStylesRaw", js.undefined)
      
      @scala.inline
      def setDescriptionStylesRawVarargs(value: SuggestResultDescriptionStylesRaw*): Self = StObject.set(x, "descriptionStylesRaw", js.Array(value :_*))
      
      @scala.inline
      def setDescriptionStylesUndefined: Self = StObject.set(x, "descriptionStyles", js.undefined)
      
      @scala.inline
      def setDescriptionStylesVarargs(value: SuggestResultDescriptionStyles*): Self = StObject.set(x, "descriptionStyles", js.Array(value :_*))
    }
  }
  
  /** The style ranges for the description, as provided by the extension. */
  @js.native
  trait SuggestResultDescriptionStyles extends StObject {
    
    var length: js.UndefOr[Double] = js.native
    
    var offset: Double = js.native
    
    /** The style type */
    var `type`: DescriptionStyleType = js.native
  }
  object SuggestResultDescriptionStyles {
    
    @scala.inline
    def apply(offset: Double, `type`: DescriptionStyleType): SuggestResultDescriptionStyles = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestResultDescriptionStyles]
    }
    
    @scala.inline
    implicit class SuggestResultDescriptionStylesMutableBuilder[Self <: SuggestResultDescriptionStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DescriptionStyleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** The style ranges for the description, as provided by ToValue(). */
  @js.native
  trait SuggestResultDescriptionStylesRaw extends StObject {
    
    var offset: Double = js.native
    
    var `type`: Double = js.native
  }
  object SuggestResultDescriptionStylesRaw {
    
    @scala.inline
    def apply(offset: Double, `type`: Double): SuggestResultDescriptionStylesRaw = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestResultDescriptionStylesRaw]
    }
    
    @scala.inline
    implicit class SuggestResultDescriptionStylesRawMutableBuilder[Self <: SuggestResultDescriptionStylesRaw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
