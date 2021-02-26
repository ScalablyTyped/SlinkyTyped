package typingsSlinky.postcss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * @param plugins Can also be included with the Processor#use method.
    * @returns A processor that will apply plugins as CSS processors.
    */
  @scala.inline
  def apply(): typingsSlinky.postcss.mod.Processor = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.postcss.mod.Processor]
  @scala.inline
  def apply(plugins: typingsSlinky.postcss.mod.AcceptedPlugin*): typingsSlinky.postcss.mod.Processor = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcss.mod.Processor]
  @scala.inline
  def apply(plugins: js.Array[typingsSlinky.postcss.mod.AcceptedPlugin]): typingsSlinky.postcss.mod.Processor = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcss.mod.Processor]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.postcss.mod.Plugin_[js.Any]
    - typingsSlinky.postcss.mod.Transformer
    - typingsSlinky.postcss.anon.Postcss
    - typingsSlinky.postcss.mod.Processor
  */
  type AcceptedPlugin = typingsSlinky.postcss.mod._AcceptedPlugin | typingsSlinky.postcss.mod.Plugin_[js.Any]
  
  type Builder = js.Function3[
    /* part */ java.lang.String, 
    /* node */ js.UndefOr[typingsSlinky.postcss.mod.Node], 
    /* type */ js.UndefOr[
      typingsSlinky.postcss.postcssStrings.start | typingsSlinky.postcss.postcssStrings.end
    ], 
    scala.Unit
  ]
  
  type JsonComment = typingsSlinky.postcss.mod.JsonNode
  
  type JsonRoot = typingsSlinky.postcss.mod.JsonContainer
  
  type Parser = js.Function2[
    /* css */ typingsSlinky.postcss.mod.ParserInput, 
    /* opts */ js.UndefOr[typingsSlinky.postcss.anon.PickProcessOptionsmapfrom], 
    typingsSlinky.postcss.mod.Root_
  ]
  
  type ParserInput = java.lang.String | typingsSlinky.postcss.anon.ToString
  
  type PluginInitializer[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], typingsSlinky.postcss.mod.Transformer]
  
  type RootNewProps = typingsSlinky.postcss.mod.ContainerNewProps
  
  type Stringifier = js.Function2[
    /* node */ typingsSlinky.postcss.mod.Node, 
    /* builder */ typingsSlinky.postcss.mod.Builder, 
    scala.Unit
  ]
  
  type TransformCallback = js.Function2[
    /* root */ typingsSlinky.postcss.mod.Root_, 
    /* result */ typingsSlinky.postcss.mod.Result, 
    js.Promise[js.Any] | js.Any
  ]
  
  /**
    * Creates a new AtRule node.
    * @param defaults Properties for the new AtRule node.
    * @returns The new node.
    */
  @scala.inline
  def atRule(): typingsSlinky.postcss.mod.AtRule_ = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("atRule")().asInstanceOf[typingsSlinky.postcss.mod.AtRule_]
  @scala.inline
  def atRule(defaults: typingsSlinky.postcss.mod.AtRuleNewProps): typingsSlinky.postcss.mod.AtRule_ = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("atRule")(defaults.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcss.mod.AtRule_]
  
  /**
    * Creates a new Comment node.
    * @param defaults Properties for the new Comment node.
    * @returns The new node.
    */
  @scala.inline
  def comment(): typingsSlinky.postcss.mod.Comment_ = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("comment")().asInstanceOf[typingsSlinky.postcss.mod.Comment_]
  @scala.inline
  def comment(defaults: typingsSlinky.postcss.mod.CommentNewProps): typingsSlinky.postcss.mod.Comment_ = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("comment")(defaults.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcss.mod.Comment_]
  
  /**
    * Creates a new Declaration node.
    * @param defaults Properties for the new Declaration node.
    * @returns The new node.
    */
  @scala.inline
  def decl(): typingsSlinky.postcss.mod.Declaration = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decl")().asInstanceOf[typingsSlinky.postcss.mod.Declaration]
  @scala.inline
  def decl(defaults: typingsSlinky.postcss.mod.DeclarationNewProps): typingsSlinky.postcss.mod.Declaration = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decl")(defaults.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcss.mod.Declaration]
  
  /**
    * Parses source CSS.
    * @param css The CSS to parse.
    * @param options
    * @returns {} A new Root node, which contains the source CSS nodes.
    */
  @scala.inline
  def parse: typingsSlinky.postcss.mod.Parser = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].selectDynamic("parse").asInstanceOf[typingsSlinky.postcss.mod.Parser]
  
  /**
    * Creates a PostCSS plugin with a standard API.
    * @param name Plugin name. Same as in name property in package.json. It will
    * be saved in plugin.postcssPlugin property.
    * @param initializer Will receive plugin options and should return functions
    * to modify nodes in input CSS.
    */
  @scala.inline
  def plugin[T](name: java.lang.String, initializer: typingsSlinky.postcss.mod.PluginInitializer[T]): typingsSlinky.postcss.mod.Plugin_[T] = (typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(name.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.postcss.mod.Plugin_[T]]
  
  /**
    * Creates a new Root node.
    * @param defaults Properties for the new Root node.
    * @returns The new node.
    */
  @scala.inline
  def root(): typingsSlinky.postcss.mod.Root_ = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("root")().asInstanceOf[typingsSlinky.postcss.mod.Root_]
  @scala.inline
  def root(defaults: js.Object): typingsSlinky.postcss.mod.Root_ = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("root")(defaults.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcss.mod.Root_]
  
  /**
    * Creates a new Rule node.
    * @param defaults Properties for the new Rule node.
    * @returns The new node.
    */
  @scala.inline
  def rule(): typingsSlinky.postcss.mod.Rule_ = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rule")().asInstanceOf[typingsSlinky.postcss.mod.Rule_]
  @scala.inline
  def rule(defaults: typingsSlinky.postcss.mod.RuleNewProps): typingsSlinky.postcss.mod.Rule_ = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rule")(defaults.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.postcss.mod.Rule_]
  
  /**
    * Default function to convert a node tree into a CSS string.
    */
  @scala.inline
  def stringify: typingsSlinky.postcss.mod.Stringifier = typingsSlinky.postcss.mod.^.asInstanceOf[js.Dynamic].selectDynamic("stringify").asInstanceOf[typingsSlinky.postcss.mod.Stringifier]
}
