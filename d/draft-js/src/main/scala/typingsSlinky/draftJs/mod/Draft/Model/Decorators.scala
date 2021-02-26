package typingsSlinky.draftJs.mod.Draft.Model

import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState
import typingsSlinky.immutable.Immutable.List
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Decorators {
  
  /**
    * A CompositeDraftDecorator traverses through a list of DraftDecorator
    * instances to identify sections of a ContentBlock that should be rendered
    * in a "decorated" manner. For example, hashtags, mentions, and links may
    * be intended to stand out visually, be rendered as anchors, etc.
    *
    * The list of decorators supplied to the constructor will be used in the
    * order they are provided. This allows the caller to specify a priority for
    * string matching, in case of match collisions among decorators.
    *
    * For instance, I may have a link with a `#` in its text. Though this section
    * of text may match our hashtag decorator, it should not be treated as a
    * hashtag. I should therefore list my link DraftDecorator
    * before my hashtag DraftDecorator when constructing this composite
    * decorator instance.
    *
    * Thus, when a collision like this is encountered, the earlier match is
    * preserved and the new match is discarded.
    */
  @js.native
  trait CompositeDraftDecorator extends StObject {
    
    def getComponentForKey(key: String): js.Function = js.native
    
    def getDecorations(block: ContentBlock, contentState: ContentState): List[String] = js.native
    
    def getPropsForKey(key: String): js.Object = js.native
  }
  object CompositeDraftDecorator {
    
    @scala.inline
    def apply(
      getComponentForKey: String => js.Function,
      getDecorations: (ContentBlock, ContentState) => List[String],
      getPropsForKey: String => js.Object
    ): CompositeDraftDecorator = {
      val __obj = js.Dynamic.literal(getComponentForKey = js.Any.fromFunction1(getComponentForKey), getDecorations = js.Any.fromFunction2(getDecorations), getPropsForKey = js.Any.fromFunction1(getPropsForKey))
      __obj.asInstanceOf[CompositeDraftDecorator]
    }
    
    @scala.inline
    implicit class CompositeDraftDecoratorMutableBuilder[Self <: CompositeDraftDecorator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetComponentForKey(value: String => js.Function): Self = StObject.set(x, "getComponentForKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDecorations(value: (ContentBlock, ContentState) => List[String]): Self = StObject.set(x, "getDecorations", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetPropsForKey(value: String => js.Object): Self = StObject.set(x, "getPropsForKey", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A DraftDecorator is a strategy-component pair intended for use when
    * rendering content.
    *
    *   - A "strategy": A function that accepts a ContentBlock object and
    *     continuously executes a callback with start/end values corresponding to
    *     relevant matches in the document text. For example, getHashtagMatches
    *     uses a hashtag regex to find hashtag strings in the block, and
    *     for each hashtag match, executes the callback with start/end pairs.
    *
    *   - A "component": A React component that will be used to render the
    *     "decorated" section of text.
    *
    *   - "props": Props to be passed into the React component that will be used.
    */
  @js.native
  trait DraftDecorator extends StObject {
    
    var component: js.Function = js.native
    
    var props: js.UndefOr[js.Object] = js.native
    
    def strategy(
      block: ContentBlock,
      callback: js.Function2[/* start */ Double, /* end */ Double, Unit],
      contentState: ContentState
    ): Unit = js.native
  }
  object DraftDecorator {
    
    @scala.inline
    def apply(
      component: js.Function,
      strategy: (ContentBlock, js.Function2[/* start */ Double, /* end */ Double, Unit], ContentState) => Unit
    ): DraftDecorator = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], strategy = js.Any.fromFunction3(strategy))
      __obj.asInstanceOf[DraftDecorator]
    }
    
    @scala.inline
    implicit class DraftDecoratorMutableBuilder[Self <: DraftDecorator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: js.Function): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setStrategy(
        value: (ContentBlock, js.Function2[/* start */ Double, /* end */ Double, Unit], ContentState) => Unit
      ): Self = StObject.set(x, "strategy", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * An interface for document decorator classes, allowing the creation of
    * custom decorator classes.
    *
    * See `CompositeDraftDecorator` for the most common use case.
    */
  @js.native
  trait DraftDecoratorType extends StObject {
    
    /**
      * Given a decorator key, return the component to use when rendering
      * this decorated range.
      */
    def getComponentForKey(key: String): js.Function = js.native
    
    /**
      * Given a `ContentBlock`, return an immutable List of decorator keys.
      */
    def getDecorations(block: ContentBlock, contentState: ContentState): List[String] = js.native
    
    /**
      * Given a decorator key, optionally return the props to use when rendering
      * this decorated range.
      */
    def getPropsForKey(key: String): js.Any = js.native
  }
  object DraftDecoratorType {
    
    @scala.inline
    def apply(
      getComponentForKey: String => js.Function,
      getDecorations: (ContentBlock, ContentState) => List[String],
      getPropsForKey: String => js.Any
    ): DraftDecoratorType = {
      val __obj = js.Dynamic.literal(getComponentForKey = js.Any.fromFunction1(getComponentForKey), getDecorations = js.Any.fromFunction2(getDecorations), getPropsForKey = js.Any.fromFunction1(getPropsForKey))
      __obj.asInstanceOf[DraftDecoratorType]
    }
    
    @scala.inline
    implicit class DraftDecoratorTypeMutableBuilder[Self <: DraftDecoratorType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetComponentForKey(value: String => js.Function): Self = StObject.set(x, "getComponentForKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDecorations(value: (ContentBlock, ContentState) => List[String]): Self = StObject.set(x, "getDecorations", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetPropsForKey(value: String => js.Any): Self = StObject.set(x, "getPropsForKey", js.Any.fromFunction1(value))
    }
  }
}
