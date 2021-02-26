package typingsSlinky.reactMarkdown

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.facade.ReactElement
import typingsSlinky.mdast.mod.Content
import typingsSlinky.unified.mod.Pluggable
import typingsSlinky.unified.mod.PluggableList
import typingsSlinky.unified.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-markdown", JSImport.Namespace)
  @js.native
  def apply(props: ReactMarkdownProps): ReactElement = js.native
  
  @JSImport("react-markdown", "renderers")
  @js.native
  val renderers: Renderers_ = js.native
  
  @JSImport("react-markdown", "types")
  @js.native
  val types: js.Array[NodeType] = js.native
  
  @JSImport("react-markdown", "uriTransformer")
  @js.native
  def uriTransformer(uri: String): String = js.native
  
  type AlignType = typingsSlinky.mdast.mod.AlignType
  
  @js.native
  trait AllowDangerousHtmlProp extends StObject {
    
    val allowDangerousHtml: js.UndefOr[Boolean] = js.native
  }
  object AllowDangerousHtmlProp {
    
    @scala.inline
    def apply(): AllowDangerousHtmlProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowDangerousHtmlProp]
    }
    
    @scala.inline
    implicit class AllowDangerousHtmlPropMutableBuilder[Self <: AllowDangerousHtmlProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDangerousHtml(value: Boolean): Self = StObject.set(x, "allowDangerousHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDangerousHtmlUndefined: Self = StObject.set(x, "allowDangerousHtml", js.undefined)
    }
  }
  
  @js.native
  trait AllowedTypesProp extends StObject {
    
    val allowedTypes: js.UndefOr[js.Array[NodeType]] = js.native
  }
  object AllowedTypesProp {
    
    @scala.inline
    def apply(): AllowedTypesProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowedTypesProp]
    }
    
    @scala.inline
    implicit class AllowedTypesPropMutableBuilder[Self <: AllowedTypesProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedTypes(value: js.Array[NodeType]): Self = StObject.set(x, "allowedTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedTypesUndefined: Self = StObject.set(x, "allowedTypes", js.undefined)
      
      @scala.inline
      def setAllowedTypesVarargs(value: NodeType*): Self = StObject.set(x, "allowedTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ChildrenProp extends StObject {
    
    val children: String = js.native
  }
  object ChildrenProp {
    
    @scala.inline
    def apply(children: String): ChildrenProp = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildrenProp]
    }
    
    @scala.inline
    implicit class ChildrenPropMutableBuilder[Self <: ChildrenProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DisallowedTypesProp extends StObject {
    
    val disallowedTypes: js.Array[NodeType] = js.native
  }
  object DisallowedTypesProp {
    
    @scala.inline
    def apply(disallowedTypes: js.Array[NodeType]): DisallowedTypesProp = {
      val __obj = js.Dynamic.literal(disallowedTypes = disallowedTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisallowedTypesProp]
    }
    
    @scala.inline
    implicit class DisallowedTypesPropMutableBuilder[Self <: DisallowedTypesProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisallowedTypes(value: js.Array[NodeType]): Self = StObject.set(x, "disallowedTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowedTypesVarargs(value: NodeType*): Self = StObject.set(x, "disallowedTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait EscapeHtmlProp extends StObject {
    
    /** @deprecated use allowDangerousHtml */
    val escapeHtml: js.UndefOr[Boolean] = js.native
  }
  object EscapeHtmlProp {
    
    @scala.inline
    def apply(): EscapeHtmlProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EscapeHtmlProp]
    }
    
    @scala.inline
    implicit class EscapeHtmlPropMutableBuilder[Self <: EscapeHtmlProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscapeHtml(value: Boolean): Self = StObject.set(x, "escapeHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeHtmlUndefined: Self = StObject.set(x, "escapeHtml", js.undefined)
    }
  }
  
  type LinkTargetResolver = js.Function3[/* uri */ String, /* text */ String, /* title */ js.UndefOr[String], String]
  
  type MutuallyExclusive[T, U] = (T with Not[U]) | (U with Not[T])
  
  /* Inlined mdast.mdast.Content['type'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.html
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.heading
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.break
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.delete
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.linkReference
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.footnoteReference
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.definition
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.image
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.tableCell
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.paragraph
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.text
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.strong
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.imageReference
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.footnote
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.thematicBreak
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.footnoteDefinition
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.inlineCode
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.code
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.listItem
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.table
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.list
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.emphasis
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.tableRow
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.blockquote
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.yaml
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.link
  */
  trait NodeType extends StObject
  object NodeType {
    
    @scala.inline
    def blockquote: typingsSlinky.reactMarkdown.reactMarkdownStrings.blockquote = "blockquote".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.blockquote]
    
    @scala.inline
    def break: typingsSlinky.reactMarkdown.reactMarkdownStrings.break = "break".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.break]
    
    @scala.inline
    def code: typingsSlinky.reactMarkdown.reactMarkdownStrings.code = "code".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.code]
    
    @scala.inline
    def definition: typingsSlinky.reactMarkdown.reactMarkdownStrings.definition = "definition".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.definition]
    
    @scala.inline
    def delete: typingsSlinky.reactMarkdown.reactMarkdownStrings.delete = "delete".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.delete]
    
    @scala.inline
    def emphasis: typingsSlinky.reactMarkdown.reactMarkdownStrings.emphasis = "emphasis".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.emphasis]
    
    @scala.inline
    def footnote: typingsSlinky.reactMarkdown.reactMarkdownStrings.footnote = "footnote".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.footnote]
    
    @scala.inline
    def footnoteDefinition: typingsSlinky.reactMarkdown.reactMarkdownStrings.footnoteDefinition = "footnoteDefinition".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.footnoteDefinition]
    
    @scala.inline
    def footnoteReference: typingsSlinky.reactMarkdown.reactMarkdownStrings.footnoteReference = "footnoteReference".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.footnoteReference]
    
    @scala.inline
    def heading: typingsSlinky.reactMarkdown.reactMarkdownStrings.heading = "heading".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.heading]
    
    @scala.inline
    def html: typingsSlinky.reactMarkdown.reactMarkdownStrings.html = "html".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.html]
    
    @scala.inline
    def image: typingsSlinky.reactMarkdown.reactMarkdownStrings.image = "image".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.image]
    
    @scala.inline
    def imageReference: typingsSlinky.reactMarkdown.reactMarkdownStrings.imageReference = "imageReference".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.imageReference]
    
    @scala.inline
    def inlineCode: typingsSlinky.reactMarkdown.reactMarkdownStrings.inlineCode = "inlineCode".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.inlineCode]
    
    @scala.inline
    def link: typingsSlinky.reactMarkdown.reactMarkdownStrings.link = "link".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.link]
    
    @scala.inline
    def linkReference: typingsSlinky.reactMarkdown.reactMarkdownStrings.linkReference = "linkReference".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.linkReference]
    
    @scala.inline
    def list: typingsSlinky.reactMarkdown.reactMarkdownStrings.list = "list".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.list]
    
    @scala.inline
    def listItem: typingsSlinky.reactMarkdown.reactMarkdownStrings.listItem = "listItem".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.listItem]
    
    @scala.inline
    def paragraph: typingsSlinky.reactMarkdown.reactMarkdownStrings.paragraph = "paragraph".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.paragraph]
    
    @scala.inline
    def strong: typingsSlinky.reactMarkdown.reactMarkdownStrings.strong = "strong".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.strong]
    
    @scala.inline
    def table: typingsSlinky.reactMarkdown.reactMarkdownStrings.table = "table".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.table]
    
    @scala.inline
    def tableCell: typingsSlinky.reactMarkdown.reactMarkdownStrings.tableCell = "tableCell".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.tableCell]
    
    @scala.inline
    def tableRow: typingsSlinky.reactMarkdown.reactMarkdownStrings.tableRow = "tableRow".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.tableRow]
    
    @scala.inline
    def text: typingsSlinky.reactMarkdown.reactMarkdownStrings.text = "text".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.text]
    
    @scala.inline
    def thematicBreak: typingsSlinky.reactMarkdown.reactMarkdownStrings.thematicBreak = "thematicBreak".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.thematicBreak]
    
    @scala.inline
    def yaml: typingsSlinky.reactMarkdown.reactMarkdownStrings.yaml = "yaml".asInstanceOf[typingsSlinky.reactMarkdown.reactMarkdownStrings.yaml]
  }
  
  type Not[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? never}
    */ typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with TopLevel[js.Any]
  
  type Point = typingsSlinky.unist.mod.Point
  
  type Position = typingsSlinky.unist.mod.Position
  
  type ReactMarkdownProps = ReactMarkdownPropsBase with (MutuallyExclusive[ChildrenProp, SourceProp]) with (MutuallyExclusive[AllowedTypesProp, DisallowedTypesProp]) with (MutuallyExclusive[EscapeHtmlProp, MutuallyExclusive[SkipHtmlProp, AllowDangerousHtmlProp]])
  
  @js.native
  trait ReactMarkdownPropsBase extends StObject {
    
    val allowNode: js.UndefOr[
        js.Function3[/* node */ Content, /* index */ Double, /* parent */ NodeType, Boolean]
      ] = js.native
    
    val astPlugins: js.UndefOr[PluggableList[Settings]] = js.native
    
    val className: js.UndefOr[String] = js.native
    
    val includeNodeIndex: js.UndefOr[Boolean] = js.native
    
    val linkTarget: js.UndefOr[String | LinkTargetResolver] = js.native
    
    val plugins: js.UndefOr[PluggableList[Settings]] = js.native
    
    val rawSourcePos: js.UndefOr[Boolean] = js.native
    
    val renderers: js.UndefOr[StringDictionary[ReactElement]] = js.native
    
    val sourcePos: js.UndefOr[Boolean] = js.native
    
    val transformImageUri: js.UndefOr[
        (js.Function4[
          /* uri */ String, 
          /* children */ js.UndefOr[ReactElement], 
          /* title */ js.UndefOr[String], 
          /* alt */ js.UndefOr[String], 
          String
        ]) | Null
      ] = js.native
    
    val transformLinkUri: js.UndefOr[
        (js.Function3[
          /* uri */ String, 
          /* children */ js.UndefOr[ReactElement], 
          /* title */ js.UndefOr[String], 
          String
        ]) | Null
      ] = js.native
    
    val unwrapDisallowed: js.UndefOr[Boolean] = js.native
  }
  object ReactMarkdownPropsBase {
    
    @scala.inline
    def apply(): ReactMarkdownPropsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactMarkdownPropsBase]
    }
    
    @scala.inline
    implicit class ReactMarkdownPropsBaseMutableBuilder[Self <: ReactMarkdownPropsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNode(value: (/* node */ Content, /* index */ Double, /* parent */ NodeType) => Boolean): Self = StObject.set(x, "allowNode", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAllowNodeUndefined: Self = StObject.set(x, "allowNode", js.undefined)
      
      @scala.inline
      def setAstPlugins(value: PluggableList[Settings]): Self = StObject.set(x, "astPlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstPluginsUndefined: Self = StObject.set(x, "astPlugins", js.undefined)
      
      @scala.inline
      def setAstPluginsVarargs(value: (Pluggable[js.Array[js.UndefOr[js.Any]], Settings])*): Self = StObject.set(x, "astPlugins", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIncludeNodeIndex(value: Boolean): Self = StObject.set(x, "includeNodeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNodeIndexUndefined: Self = StObject.set(x, "includeNodeIndex", js.undefined)
      
      @scala.inline
      def setLinkTarget(value: String | LinkTargetResolver): Self = StObject.set(x, "linkTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTargetFunction3(value: (/* uri */ String, /* text */ String, /* title */ js.UndefOr[String]) => String): Self = StObject.set(x, "linkTarget", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLinkTargetUndefined: Self = StObject.set(x, "linkTarget", js.undefined)
      
      @scala.inline
      def setPlugins(value: PluggableList[Settings]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: (Pluggable[js.Array[js.UndefOr[js.Any]], Settings])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRawSourcePos(value: Boolean): Self = StObject.set(x, "rawSourcePos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawSourcePosUndefined: Self = StObject.set(x, "rawSourcePos", js.undefined)
      
      @scala.inline
      def setRenderers(value: StringDictionary[ReactElement]): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
      
      @scala.inline
      def setSourcePos(value: Boolean): Self = StObject.set(x, "sourcePos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePosUndefined: Self = StObject.set(x, "sourcePos", js.undefined)
      
      @scala.inline
      def setTransformImageUri(
        value: (/* uri */ String, /* children */ js.UndefOr[ReactElement], /* title */ js.UndefOr[String], /* alt */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "transformImageUri", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTransformImageUriNull: Self = StObject.set(x, "transformImageUri", null)
      
      @scala.inline
      def setTransformImageUriUndefined: Self = StObject.set(x, "transformImageUri", js.undefined)
      
      @scala.inline
      def setTransformLinkUri(
        value: (/* uri */ String, /* children */ js.UndefOr[ReactElement], /* title */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "transformLinkUri", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformLinkUriNull: Self = StObject.set(x, "transformLinkUri", null)
      
      @scala.inline
      def setTransformLinkUriUndefined: Self = StObject.set(x, "transformLinkUri", js.undefined)
      
      @scala.inline
      def setUnwrapDisallowed(value: Boolean): Self = StObject.set(x, "unwrapDisallowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnwrapDisallowedUndefined: Self = StObject.set(x, "unwrapDisallowed", js.undefined)
    }
  }
  
  type ReferenceType = typingsSlinky.mdast.mod.ReferenceType
  
  type Renderer[T] = js.Function1[/* props */ T, ReactElement]
  
  type Renderers_ = StringDictionary[String | Renderer[js.Any]]
  
  @js.native
  trait SkipHtmlProp extends StObject {
    
    val skipHtml: js.UndefOr[Boolean] = js.native
  }
  object SkipHtmlProp {
    
    @scala.inline
    def apply(): SkipHtmlProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipHtmlProp]
    }
    
    @scala.inline
    implicit class SkipHtmlPropMutableBuilder[Self <: SkipHtmlProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipHtml(value: Boolean): Self = StObject.set(x, "skipHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipHtmlUndefined: Self = StObject.set(x, "skipHtml", js.undefined)
    }
  }
  
  @js.native
  trait SourceProp extends StObject {
    
    /** @deprecated use children */
    val source: String = js.native
  }
  object SourceProp {
    
    @scala.inline
    def apply(source: String): SourceProp = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceProp]
    }
    
    @scala.inline
    implicit class SourcePropMutableBuilder[Self <: SourceProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
