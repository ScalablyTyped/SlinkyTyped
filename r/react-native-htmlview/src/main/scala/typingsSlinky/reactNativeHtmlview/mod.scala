package typingsSlinky.reactNativeHtmlview

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProperties
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-htmlview", JSImport.Default)
  @js.native
  class default ()
    extends Component[HTMLViewProps, js.Object, js.Any]
  
  type HTMLView = ReactComponentClass[HTMLViewProps]
  
  @js.native
  trait HTMLViewNode extends StObject {
    
    var attribs: StringDictionary[String] = js.native
    
    var data: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object HTMLViewNode {
    
    @scala.inline
    def apply(attribs: StringDictionary[String]): HTMLViewNode = {
      val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLViewNode]
    }
    
    @scala.inline
    implicit class HTMLViewNodeMutableBuilder[Self <: HTMLViewNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribs(value: StringDictionary[String]): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait HTMLViewProps extends StObject {
    
    /*
      * The component used for rendering HTML element nodes
      */
    var NodeComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
    
    /*
      * The root wrapper component
      */
    var RootComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
    
    /*
      * The component used for rendering text element nodes
      */
    var TextComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
    
    /**
      *  When explicitly false, effectively sets paragraphBreak and lineBreak to null
      */
    var addLineBreaks: js.UndefOr[Boolean] = js.native
    
    /**
      * Text which is rendered before every li inside a ul
      */
    var bullet: js.UndefOr[String] = js.native
    
    /**
      * Text which appears after text elements which create a new line (br, headings)
      */
    var lineBreak: js.UndefOr[String] = js.native
    
    /*
      * Properties for the NodeComponent, can be used independently from NodeComponent
      */
    var nodeComponentProps: js.UndefOr[TextProperties] = js.native
    
    var onLinkLongPress: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
    
    var onLinkPress: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
    
    /**
      * Text which appears after every p element
      */
    var paragraphBreak: js.UndefOr[String] = js.native
    
    /**
      *
      * A custom function to render HTML nodes however you see fit. If the function returns undefined (not null), the
      * default renderer will be used for that node. The function takes the following arguments:
      *
      *  - defaultRenderer the default rendering implementation, so you can use the normal rendering logic for some subtree. defaultRenderer takes the following arguments:
      *     - node the node to render with the default rendering logic
      *     - parent the parent of node of node
      *
      * @param node the html node as parsed by htmlparser2
      * @param index position of the node in parent node's children
      * @param siblings parent node's children (including current node)
      * @param parent parent node
      * @param defaultRenderer the default rendering implementation, so you can use the normal rendering logic for some subtree:
      */
    var renderNode: js.UndefOr[
        js.Function5[
          /* node */ HTMLViewNode, 
          /* index */ Double, 
          /* siblings */ HTMLViewNode, 
          /* parent */ HTMLViewNode, 
          /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, ReactElement], 
          ReactElement
        ]
      ] = js.native
    
    /*
      * Properties for the RootComponent, can be used independently from RootComponent
      */
    var rootComponentProps: js.UndefOr[ViewProperties] = js.native
    
    var stylesheet: js.UndefOr[StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]]] = js.native
    
    /*
      * Properties for the TextComponent, can be used independently from TextComponent
      */
    var textComponentProps: js.UndefOr[TextProperties] = js.native
    
    /**
      * a string of HTML content to render
      */
    var value: String = js.native
  }
  object HTMLViewProps {
    
    @scala.inline
    def apply(value: String): HTMLViewProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLViewProps]
    }
    
    @scala.inline
    implicit class HTMLViewPropsMutableBuilder[Self <: HTMLViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddLineBreaks(value: Boolean): Self = StObject.set(x, "addLineBreaks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddLineBreaksUndefined: Self = StObject.set(x, "addLineBreaks", js.undefined)
      
      @scala.inline
      def setBullet(value: String): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      @scala.inline
      def setLineBreak(value: String): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      @scala.inline
      def setNodeComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "NodeComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeComponentComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "NodeComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeComponentFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "NodeComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeComponentProps(value: TextProperties): Self = StObject.set(x, "nodeComponentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeComponentPropsUndefined: Self = StObject.set(x, "nodeComponentProps", js.undefined)
      
      @scala.inline
      def setNodeComponentUndefined: Self = StObject.set(x, "NodeComponent", js.undefined)
      
      @scala.inline
      def setOnLinkLongPress(value: /* url */ String => Unit): Self = StObject.set(x, "onLinkLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLinkLongPressUndefined: Self = StObject.set(x, "onLinkLongPress", js.undefined)
      
      @scala.inline
      def setOnLinkPress(value: /* url */ String => Unit): Self = StObject.set(x, "onLinkPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLinkPressUndefined: Self = StObject.set(x, "onLinkPress", js.undefined)
      
      @scala.inline
      def setParagraphBreak(value: String): Self = StObject.set(x, "paragraphBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphBreakUndefined: Self = StObject.set(x, "paragraphBreak", js.undefined)
      
      @scala.inline
      def setRenderNode(
        value: (/* node */ HTMLViewNode, /* index */ Double, /* siblings */ HTMLViewNode, /* parent */ HTMLViewNode, /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, ReactElement]) => ReactElement
      ): Self = StObject.set(x, "renderNode", js.Any.fromFunction5(value))
      
      @scala.inline
      def setRenderNodeUndefined: Self = StObject.set(x, "renderNode", js.undefined)
      
      @scala.inline
      def setRootComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "RootComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootComponentComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "RootComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootComponentFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "RootComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootComponentProps(value: ViewProperties): Self = StObject.set(x, "rootComponentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootComponentPropsUndefined: Self = StObject.set(x, "rootComponentProps", js.undefined)
      
      @scala.inline
      def setRootComponentUndefined: Self = StObject.set(x, "RootComponent", js.undefined)
      
      @scala.inline
      def setStylesheet(value: StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]]): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
      
      @scala.inline
      def setTextComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "TextComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextComponentComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "TextComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextComponentFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "TextComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextComponentProps(value: TextProperties): Self = StObject.set(x, "textComponentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextComponentPropsUndefined: Self = StObject.set(x, "textComponentProps", js.undefined)
      
      @scala.inline
      def setTextComponentUndefined: Self = StObject.set(x, "TextComponent", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
