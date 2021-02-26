package typingsSlinky.postcssSelectorParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // TODO: Conditional types in TS 1.8 will really clean this up.
  @scala.inline
  def apply(): typingsSlinky.postcssSelectorParser.mod.Processor[scala.Nothing, typingsSlinky.postcssSelectorParser.mod.Selectors] = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.postcssSelectorParser.mod.Processor[scala.Nothing, typingsSlinky.postcssSelectorParser.mod.Selectors]]
  @scala.inline
  def apply(
    processor: typingsSlinky.postcssSelectorParser.mod.AsyncProcessor[scala.Unit] | typingsSlinky.postcssSelectorParser.mod.SyncProcessor[scala.Unit]
  ): typingsSlinky.postcssSelectorParser.mod.Processor[scala.Nothing, scala.Nothing] = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].apply(processor.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.Processor[scala.Nothing, scala.Nothing]]
  
  @scala.inline
  def ATTRIBUTE: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.attribute = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ATTRIBUTE").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.attribute]
  
  type AsyncProcessor[Transform] = typingsSlinky.postcssSelectorParser.mod.ProcessorFn[js.Thenable[Transform]]
  
  @scala.inline
  def CLASS: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.`class` = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CLASS").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.`class`]
  
  @scala.inline
  def COMBINATOR: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.combinator = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("COMBINATOR").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.combinator]
  
  @scala.inline
  def COMMENT: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.comment = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("COMMENT").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.comment]
  
  // A type that's T but not U.
  type Diff[T, U] = T
  
  @scala.inline
  def ID_ : typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.id = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ID").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.id]
  
  @scala.inline
  def NESTING: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.nesting = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NESTING").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.nesting]
  
  @scala.inline
  def PSEUDO: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.pseudo = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PSEUDO").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.pseudo]
  
  type ProcessorFn[ReturnType] = js.Function1[/* root */ typingsSlinky.postcssSelectorParser.mod.Root_, ReturnType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.Quotationmark
    - typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.Apostrophe
    - scala.Null
  */
  type QuoteMark = typingsSlinky.postcssSelectorParser.mod._QuoteMark | scala.Null
  
  @scala.inline
  def ROOT: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.root = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROOT").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.root]
  
  @scala.inline
  def SELECTOR: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.selector = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SELECTOR").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.selector]
  
  @scala.inline
  def STRING: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.string = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("STRING").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.string]
  
  type Selector_ = typingsSlinky.postcssSelectorParser.mod._Selector[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias postcss-selector-parser.postcss-selector-parser.Selector */ js.Object
  ]
  
  /** Accepts a string  */
  type Selectors = java.lang.String | typingsSlinky.postcssSelectorParser.mod.PostCSSRuleNode
  
  type SyncProcessor[Transform] = typingsSlinky.postcssSelectorParser.mod.ProcessorFn[Transform]
  
  @scala.inline
  def TAG: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.tag = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TAG").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.tag]
  
  @scala.inline
  def UNIVERSAL: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.universal = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("UNIVERSAL").asInstanceOf[typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.universal]
  
  @scala.inline
  def attribute(opts: typingsSlinky.postcssSelectorParser.mod.AttributeOptions): typingsSlinky.postcssSelectorParser.mod.Attribute_ = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attribute")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.Attribute_]
  
  @scala.inline
  def className(opts: typingsSlinky.postcssSelectorParser.mod.NamespaceOptions[java.lang.String]): typingsSlinky.postcssSelectorParser.mod.ClassName_ = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("className")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.ClassName_]
  
  @scala.inline
  def combinator(opts: typingsSlinky.postcssSelectorParser.mod.NodeOptions[java.lang.String]): typingsSlinky.postcssSelectorParser.mod.Combinator_ = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combinator")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.Combinator_]
  
  @scala.inline
  def comment(opts: typingsSlinky.postcssSelectorParser.mod.NodeOptions[java.lang.String]): typingsSlinky.postcssSelectorParser.mod.Comment_ = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("comment")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.Comment_]
  
  @scala.inline
  def id(opts: js.Any): js.Any = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("id")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isAttribute(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Attribute */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Attribute */ scala.Boolean]
  
  @scala.inline
  def isClassName(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.ClassName */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isClassName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.ClassName */ scala.Boolean]
  
  @scala.inline
  def isCombinator(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Combinator */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCombinator")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Combinator */ scala.Boolean]
  
  @scala.inline
  def isComment(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Comment */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isComment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Comment */ scala.Boolean]
  
  @scala.inline
  def isContainer(node: js.Any): scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isContainer")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isIdentifier(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Identifier */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Identifier */ scala.Boolean]
  
  @scala.inline
  def isNamespace(node: js.Any): scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNamespace")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNesting(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Nesting */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNesting")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Nesting */ scala.Boolean]
  
  @scala.inline
  def isNode(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Node */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Node */ scala.Boolean]
  
  /**
    * Checks wether the node is the Psuedo subtype of node.
    */
  @scala.inline
  def isPseudo(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPseudo")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean]
  
  /**
    * Checks wether the node is, specifically, a pseudo class instead of
    * pseudo element.
    */
  @scala.inline
  def isPseudoClass(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPseudoClass")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean]
  
  /**
    * Checks wether the node is, specifically, a pseudo element instead of
    * pseudo class.
    */
  @scala.inline
  def isPseudoElement(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPseudoElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean]
  
  @scala.inline
  def isRoot(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Root */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Root */ scala.Boolean]
  
  @scala.inline
  def isSelector(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Selector */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSelector")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Selector */ scala.Boolean]
  
  @scala.inline
  def isString(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.String */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isString")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.String */ scala.Boolean]
  
  @scala.inline
  def isTag(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Tag */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Tag */ scala.Boolean]
  
  @scala.inline
  def isUniversal(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Universal */ scala.Boolean = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isUniversal")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Universal */ scala.Boolean]
  
  @scala.inline
  def nesting(opts: js.Any): js.Any = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nesting")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def pseudo(opts: typingsSlinky.postcssSelectorParser.mod.ContainerOptions): typingsSlinky.postcssSelectorParser.mod.Pseudo_ = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pseudo")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.Pseudo_]
  
  @scala.inline
  def root(opts: typingsSlinky.postcssSelectorParser.mod.ContainerOptions): typingsSlinky.postcssSelectorParser.mod.Root_ = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("root")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.Root_]
  
  @scala.inline
  def selector(opts: typingsSlinky.postcssSelectorParser.mod.ContainerOptions): typingsSlinky.postcssSelectorParser.mod.Selector_ = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("selector")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.Selector_]
  
  @scala.inline
  def string(opts: typingsSlinky.postcssSelectorParser.mod.NodeOptions[java.lang.String]): typingsSlinky.postcssSelectorParser.mod.String_ = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("string")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.String_]
  
  @scala.inline
  def tag(opts: typingsSlinky.postcssSelectorParser.mod.NamespaceOptions[java.lang.String]): typingsSlinky.postcssSelectorParser.mod.Tag_ = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tag")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcssSelectorParser.mod.Tag_]
  
  @scala.inline
  def universal(): js.Any = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("universal")().asInstanceOf[js.Any]
  @scala.inline
  def universal(opts: typingsSlinky.postcssSelectorParser.mod.NamespaceOptions[java.lang.String]): js.Any = typingsSlinky.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("universal")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
