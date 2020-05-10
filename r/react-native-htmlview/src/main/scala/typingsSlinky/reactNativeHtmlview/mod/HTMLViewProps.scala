package typingsSlinky.reactNativeHtmlview.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProperties
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLViewProps extends js.Object {
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
      /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, TagMod[Any]], 
      TagMod[Any]
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
  implicit class HTMLViewPropsOps[Self <: HTMLViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeComponentFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeComponentComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withRootComponentFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootComponentComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withTextComponentFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextComponentComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withAddLineBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLineBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddLineBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLineBreaks")(js.undefined)
        ret
    }
    @scala.inline
    def withBullet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBullet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullet")(js.undefined)
        ret
    }
    @scala.inline
    def withLineBreak(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeComponentProps(value: TextProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeComponentProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeComponentProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeComponentProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLinkLongPress(value: /* url */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLinkLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLinkPress(value: /* url */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLinkPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkPress")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphBreak(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderNode(
      value: (/* node */ HTMLViewNode, /* index */ Double, /* siblings */ HTMLViewNode, /* parent */ HTMLViewNode, /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, TagMod[Any]]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNode")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutRenderNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNode")(js.undefined)
        ret
    }
    @scala.inline
    def withRootComponentProps(value: ViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootComponentProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootComponentProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootComponentProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheet(value: StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet")(js.undefined)
        ret
    }
    @scala.inline
    def withTextComponentProps(value: TextProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComponentProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextComponentProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComponentProps")(js.undefined)
        ret
    }
  }
  
}

