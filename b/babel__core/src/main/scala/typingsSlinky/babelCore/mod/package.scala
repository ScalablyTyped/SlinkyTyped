package typingsSlinky.babelCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConfigFunction = js.Function1[
    /* api */ typingsSlinky.babelCore.mod.ConfigAPI, 
    typingsSlinky.babelCore.mod.TransformOptions
  ]
  
  @scala.inline
  def DEFAULT_EXTENSIONS: js.Tuple5[
    typingsSlinky.babelCore.babelCoreStrings.Dotjs, 
    typingsSlinky.babelCore.babelCoreStrings.Dotjsx, 
    typingsSlinky.babelCore.babelCoreStrings.Dotes6, 
    typingsSlinky.babelCore.babelCoreStrings.Dotes, 
    typingsSlinky.babelCore.babelCoreStrings.Dotmjs
  ] = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_EXTENSIONS").asInstanceOf[js.Tuple5[
    typingsSlinky.babelCore.babelCoreStrings.Dotjs, 
    typingsSlinky.babelCore.babelCoreStrings.Dotjsx, 
    typingsSlinky.babelCore.babelCoreStrings.Dotes6, 
    typingsSlinky.babelCore.babelCoreStrings.Dotes, 
    typingsSlinky.babelCore.babelCoreStrings.Dotmjs
  ]]
  
  type FileParseCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ typingsSlinky.babelCore.mod.ParseResult | scala.Null, 
    js.Any
  ]
  
  type FileResultCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ typingsSlinky.babelCore.mod.BabelFileResult | scala.Null, 
    js.Any
  ]
  
  type MatchPattern = java.lang.String | js.RegExp | (js.Function2[
    /* filename */ js.UndefOr[java.lang.String], 
    /* context */ typingsSlinky.babelCore.mod.MatchPatternContext, 
    scala.Boolean
  ])
  
  type Node = typingsSlinky.babelTypes.mod.Node
  
  type ParseResult = typingsSlinky.babelTypes.mod.File_ | typingsSlinky.babelTypes.mod.Program_
  
  type PluginItem = typingsSlinky.babelCore.mod.ConfigItem | typingsSlinky.babelCore.mod.PluginObj[js.Any] | typingsSlinky.babelCore.mod.PluginTarget | (js.Tuple2[
    typingsSlinky.babelCore.mod.PluginTarget, 
    typingsSlinky.babelCore.mod.PluginOptions
  ]) | (js.Tuple3[
    typingsSlinky.babelCore.mod.PluginTarget, 
    typingsSlinky.babelCore.mod.PluginOptions, 
    js.UndefOr[java.lang.String]
  ])
  
  type PluginOptions = js.UndefOr[js.Object | typingsSlinky.babelCore.babelCoreBooleans.`false`]
  
  type PluginTarget = java.lang.String | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])
  
  type SimpleCacheCallback[T /* <: typingsSlinky.babelCore.mod.SimpleCacheKey */] = js.Function0[T]
  
  type SimpleCacheKey = js.UndefOr[java.lang.String | scala.Boolean | scala.Double | scala.Null]
  
  @scala.inline
  def createConfigItem(
    value: js.Tuple2[
      typingsSlinky.babelCore.mod.PluginTarget, 
      typingsSlinky.babelCore.mod.PluginOptions
    ]
  ): typingsSlinky.babelCore.mod.ConfigItem = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.mod.ConfigItem]
  @scala.inline
  def createConfigItem(
    value: js.Tuple2[
      typingsSlinky.babelCore.mod.PluginTarget, 
      typingsSlinky.babelCore.mod.PluginOptions
    ],
    options: typingsSlinky.babelCore.mod.CreateConfigItemOptions
  ): typingsSlinky.babelCore.mod.ConfigItem = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.ConfigItem]
  @scala.inline
  def createConfigItem(
    value: js.Tuple3[
      typingsSlinky.babelCore.mod.PluginTarget, 
      typingsSlinky.babelCore.mod.PluginOptions, 
      js.UndefOr[java.lang.String]
    ]
  ): typingsSlinky.babelCore.mod.ConfigItem = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.mod.ConfigItem]
  @scala.inline
  def createConfigItem(
    value: js.Tuple3[
      typingsSlinky.babelCore.mod.PluginTarget, 
      typingsSlinky.babelCore.mod.PluginOptions, 
      js.UndefOr[java.lang.String]
    ],
    options: typingsSlinky.babelCore.mod.CreateConfigItemOptions
  ): typingsSlinky.babelCore.mod.ConfigItem = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.ConfigItem]
  @scala.inline
  def createConfigItem(value: typingsSlinky.babelCore.mod.PluginTarget): typingsSlinky.babelCore.mod.ConfigItem = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.mod.ConfigItem]
  @scala.inline
  def createConfigItem(
    value: typingsSlinky.babelCore.mod.PluginTarget,
    options: typingsSlinky.babelCore.mod.CreateConfigItemOptions
  ): typingsSlinky.babelCore.mod.ConfigItem = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.ConfigItem]
  
  @scala.inline
  def loadOptions(): js.Object | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadOptions")().asInstanceOf[js.Object | scala.Null]
  @scala.inline
  def loadOptions(options: typingsSlinky.babelCore.mod.TransformOptions): js.Object | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object | scala.Null]
  
  @scala.inline
  def loadPartialConfig(): typingsSlinky.babelCore.anon.ReadonlyPartialConfig | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadPartialConfig")().asInstanceOf[typingsSlinky.babelCore.anon.ReadonlyPartialConfig | scala.Null]
  @scala.inline
  def loadPartialConfig(options: typingsSlinky.babelCore.mod.TransformOptions): typingsSlinky.babelCore.anon.ReadonlyPartialConfig | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadPartialConfig")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.anon.ReadonlyPartialConfig | scala.Null]
  
  @scala.inline
  def parse(code: java.lang.String): typingsSlinky.babelCore.mod.ParseResult | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.mod.ParseResult | scala.Null]
  @scala.inline
  def parse(code: java.lang.String, callback: typingsSlinky.babelCore.mod.FileParseCallback): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def parse(
    code: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: typingsSlinky.babelCore.mod.FileParseCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def parse(code: java.lang.String, options: typingsSlinky.babelCore.mod.TransformOptions): typingsSlinky.babelCore.mod.ParseResult | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.ParseResult | scala.Null]
  @scala.inline
  def parse(
    code: java.lang.String,
    options: typingsSlinky.babelCore.mod.TransformOptions,
    callback: typingsSlinky.babelCore.mod.FileParseCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def parseAsync(code: java.lang.String): js.Promise[typingsSlinky.babelCore.mod.ParseResult | scala.Null] = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.ParseResult | scala.Null]]
  @scala.inline
  def parseAsync(code: java.lang.String, options: typingsSlinky.babelCore.mod.TransformOptions): js.Promise[typingsSlinky.babelCore.mod.ParseResult | scala.Null] = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.ParseResult | scala.Null]]
  
  @scala.inline
  def parseSync(code: java.lang.String): typingsSlinky.babelCore.mod.ParseResult | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.mod.ParseResult | scala.Null]
  @scala.inline
  def parseSync(code: java.lang.String, options: typingsSlinky.babelCore.mod.TransformOptions): typingsSlinky.babelCore.mod.ParseResult | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.ParseResult | scala.Null]
  
  @scala.inline
  def resolvePlugin(name: java.lang.String, dirname: java.lang.String): java.lang.String | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolvePlugin")(name.asInstanceOf[js.Any], dirname.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def resolvePreset(name: java.lang.String, dirname: java.lang.String): java.lang.String | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolvePreset")(name.asInstanceOf[js.Any], dirname.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def template: typingsSlinky.babelTemplate.mod.DefaultTemplateBuilder = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("template").asInstanceOf[typingsSlinky.babelTemplate.mod.DefaultTemplateBuilder]
  
  @scala.inline
  def transform(code: java.lang.String): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  @scala.inline
  def transform(code: java.lang.String, callback: typingsSlinky.babelCore.mod.FileResultCallback): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def transform(
    code: java.lang.String,
    opts: js.UndefOr[scala.Nothing],
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def transform(code: java.lang.String, opts: typingsSlinky.babelCore.mod.TransformOptions): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  @scala.inline
  def transform(
    code: java.lang.String,
    opts: typingsSlinky.babelCore.mod.TransformOptions,
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def transformAsync(code: java.lang.String): js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null] = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformAsync")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]]
  @scala.inline
  def transformAsync(code: java.lang.String, opts: typingsSlinky.babelCore.mod.TransformOptions): js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null] = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformAsync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]]
  
  @scala.inline
  def transformFile(filename: java.lang.String, callback: typingsSlinky.babelCore.mod.FileResultCallback): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def transformFile(
    filename: java.lang.String,
    opts: js.UndefOr[scala.Nothing],
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def transformFile(
    filename: java.lang.String,
    opts: typingsSlinky.babelCore.mod.TransformOptions,
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def transformFileAsync(filename: java.lang.String): js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null] = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFileAsync")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]]
  @scala.inline
  def transformFileAsync(filename: java.lang.String, opts: typingsSlinky.babelCore.mod.TransformOptions): js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null] = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFileAsync")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]]
  
  @scala.inline
  def transformFileSync(filename: java.lang.String): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFileSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  @scala.inline
  def transformFileSync(filename: java.lang.String, opts: typingsSlinky.babelCore.mod.TransformOptions): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFileSync")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  
  @scala.inline
  def transformFromAst(
    ast: typingsSlinky.babelCore.mod.Node,
    code: js.UndefOr[scala.Nothing],
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def transformFromAst(
    ast: typingsSlinky.babelCore.mod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def transformFromAst(
    ast: typingsSlinky.babelCore.mod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: typingsSlinky.babelCore.mod.TransformOptions,
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def transformFromAst(
    ast: typingsSlinky.babelCore.mod.Node,
    code: java.lang.String,
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def transformFromAst(
    ast: typingsSlinky.babelCore.mod.Node,
    code: java.lang.String,
    opts: js.UndefOr[scala.Nothing],
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def transformFromAst(
    ast: typingsSlinky.babelCore.mod.Node,
    code: java.lang.String,
    opts: typingsSlinky.babelCore.mod.TransformOptions,
    callback: typingsSlinky.babelCore.mod.FileResultCallback
  ): scala.Unit = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def transformFromAstAsync(ast: typingsSlinky.babelCore.mod.Node): js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null] = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]]
  @scala.inline
  def transformFromAstAsync(
    ast: typingsSlinky.babelCore.mod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: typingsSlinky.babelCore.mod.TransformOptions
  ): js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null] = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]]
  @scala.inline
  def transformFromAstAsync(ast: typingsSlinky.babelCore.mod.Node, code: java.lang.String): js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null] = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]]
  @scala.inline
  def transformFromAstAsync(
    ast: typingsSlinky.babelCore.mod.Node,
    code: java.lang.String,
    opts: typingsSlinky.babelCore.mod.TransformOptions
  ): js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null] = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]]
  
  @scala.inline
  def transformFromAstSync(ast: typingsSlinky.babelCore.mod.Node): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  @scala.inline
  def transformFromAstSync(
    ast: typingsSlinky.babelCore.mod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: typingsSlinky.babelCore.mod.TransformOptions
  ): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  @scala.inline
  def transformFromAstSync(ast: typingsSlinky.babelCore.mod.Node, code: java.lang.String): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  @scala.inline
  def transformFromAstSync(
    ast: typingsSlinky.babelCore.mod.Node,
    code: java.lang.String,
    opts: typingsSlinky.babelCore.mod.TransformOptions
  ): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  
  @scala.inline
  def transformSync(code: java.lang.String): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  @scala.inline
  def transformSync(code: java.lang.String, opts: typingsSlinky.babelCore.mod.TransformOptions): typingsSlinky.babelCore.mod.BabelFileResult | scala.Null = (typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelCore.mod.BabelFileResult | scala.Null]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.babelCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
