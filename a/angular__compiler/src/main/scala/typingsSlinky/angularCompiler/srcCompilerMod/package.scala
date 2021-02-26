package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcCompilerMod {
  
  @scala.inline
  def CONTENT_ATTR: java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("CONTENT_ATTR").asInstanceOf[java.lang.String]
  
  @scala.inline
  def CUSTOM_ELEMENTS_SCHEMA: typingsSlinky.angularCompiler.coreMod.SchemaMetadata = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("CUSTOM_ELEMENTS_SCHEMA").asInstanceOf[typingsSlinky.angularCompiler.coreMod.SchemaMetadata]
  
  @scala.inline
  def DEFAULT_INTERPOLATION_CONFIG: typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_INTERPOLATION_CONFIG").asInstanceOf[typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig]
  
  @scala.inline
  def DYNAMIC_TYPE: typingsSlinky.angularCompiler.outputAstMod.BuiltinType = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("DYNAMIC_TYPE").asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def EOF: typingsSlinky.angularCompiler.lexerMod.Token = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("EOF").asInstanceOf[typingsSlinky.angularCompiler.lexerMod.Token]
  
  @scala.inline
  def ERROR_COMPONENT_TYPE: /* "ngComponentType" */ java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("ERROR_COMPONENT_TYPE").asInstanceOf[/* "ngComponentType" */ java.lang.String]
  
  @scala.inline
  def HOST_ATTR: java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("HOST_ATTR").asInstanceOf[java.lang.String]
  
  @scala.inline
  def NGSP_UNICODE: /* "\\uE500" */ java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("NGSP_UNICODE").asInstanceOf[/* "\\uE500" */ java.lang.String]
  
  @scala.inline
  def NONE_TYPE: typingsSlinky.angularCompiler.outputAstMod.BuiltinType = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("NONE_TYPE").asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def NO_ERRORS_SCHEMA: typingsSlinky.angularCompiler.coreMod.SchemaMetadata = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("NO_ERRORS_SCHEMA").asInstanceOf[typingsSlinky.angularCompiler.coreMod.SchemaMetadata]
  
  @scala.inline
  def STRING_TYPE: typingsSlinky.angularCompiler.outputAstMod.BuiltinType = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("STRING_TYPE").asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.BuiltinType]
  
  @scala.inline
  def UrlResolver: typingsSlinky.angularCompiler.urlResolverMod.UrlResolverCtor = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("UrlResolver").asInstanceOf[typingsSlinky.angularCompiler.urlResolverMod.UrlResolverCtor]
  
  @scala.inline
  def VERSION_ : typingsSlinky.angularCompiler.srcUtilMod.Version = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[typingsSlinky.angularCompiler.srcUtilMod.Version]
  
  @scala.inline
  def analyzeAndValidateNgModules(
    fileNames: js.Array[java.lang.String],
    host: typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ): typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedModules = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("analyzeAndValidateNgModules")(fileNames.asInstanceOf[js.Any], host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedModules]
  
  @scala.inline
  def analyzeFile(
    host: typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedFile = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("analyzeFile")(host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedFile]
  
  @scala.inline
  def analyzeFileForInjectables(
    host: typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: java.lang.String
  ): typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedFileWithInjectables = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("analyzeFileForInjectables")(host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedFileWithInjectables]
  
  @scala.inline
  def analyzeNgModules(
    fileNames: js.Array[java.lang.String],
    host: typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzeModulesHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ): typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedModules = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("analyzeNgModules")(fileNames.asInstanceOf[js.Any], host.asInstanceOf[js.Any], staticSymbolResolver.asInstanceOf[js.Any], metadataResolver.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedModules]
  
  @scala.inline
  def collectExternalReferences(stmts: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement]): js.Array[typingsSlinky.angularCompiler.outputAstMod.ExternalReference] = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("collectExternalReferences")(stmts.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.angularCompiler.outputAstMod.ExternalReference]]
  
  @scala.inline
  def compileComponentFromMetadata(
    meta: typingsSlinky.angularCompiler.apiMod.R3ComponentMetadata,
    constantPool: typingsSlinky.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: typingsSlinky.angularCompiler.bindingParserMod.BindingParser
  ): typingsSlinky.angularCompiler.apiMod.R3ComponentDef = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileComponentFromMetadata")(meta.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.apiMod.R3ComponentDef]
  
  @scala.inline
  def compileDirectiveFromMetadata(
    meta: typingsSlinky.angularCompiler.apiMod.R3DirectiveMetadata,
    constantPool: typingsSlinky.angularCompiler.constantPoolMod.ConstantPool,
    bindingParser: typingsSlinky.angularCompiler.bindingParserMod.BindingParser
  ): typingsSlinky.angularCompiler.apiMod.R3DirectiveDef = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileDirectiveFromMetadata")(meta.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.apiMod.R3DirectiveDef]
  
  @scala.inline
  def compileFactoryFunction(meta: typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryMetadata): typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryFn = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileFactoryFunction")(meta.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.r3FactoryMod.R3FactoryFn]
  
  @scala.inline
  def compileInjectable(meta: typingsSlinky.angularCompiler.injectableCompiler2Mod.R3InjectableMetadata): typingsSlinky.angularCompiler.injectableCompiler2Mod.InjectableDef = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileInjectable")(meta.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.injectableCompiler2Mod.InjectableDef]
  
  @scala.inline
  def compileInjector(meta: typingsSlinky.angularCompiler.r3ModuleCompilerMod.R3InjectorMetadata): typingsSlinky.angularCompiler.r3ModuleCompilerMod.R3InjectorDef = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileInjector")(meta.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.r3ModuleCompilerMod.R3InjectorDef]
  
  @scala.inline
  def compileNgModule(meta: typingsSlinky.angularCompiler.r3ModuleCompilerMod.R3NgModuleMetadata): typingsSlinky.angularCompiler.r3ModuleCompilerMod.R3NgModuleDef = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compileNgModule")(meta.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.r3ModuleCompilerMod.R3NgModuleDef]
  
  @scala.inline
  def compilePipeFromMetadata(metadata: typingsSlinky.angularCompiler.r3PipeCompilerMod.R3PipeMetadata): typingsSlinky.angularCompiler.anon.Expression = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("compilePipeFromMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.anon.Expression]
  
  @scala.inline
  def componentFactoryName(compType: js.Any): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("componentFactoryName")(compType.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def computeMsgId(msg: java.lang.String): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("computeMsgId")(msg.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def computeMsgId(msg: java.lang.String, meaning: java.lang.String): java.lang.String = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("computeMsgId")(msg.asInstanceOf[js.Any], meaning.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def createAotCompiler(
    compilerHost: typingsSlinky.angularCompiler.compilerHostMod.AotCompilerHost,
    options: typingsSlinky.angularCompiler.compilerOptionsMod.AotCompilerOptions
  ): typingsSlinky.angularCompiler.anon.Compiler = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createAotCompiler")(compilerHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.anon.Compiler]
  @scala.inline
  def createAotCompiler(
    compilerHost: typingsSlinky.angularCompiler.compilerHostMod.AotCompilerHost,
    options: typingsSlinky.angularCompiler.compilerOptionsMod.AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], scala.Unit]
  ): typingsSlinky.angularCompiler.anon.Compiler = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createAotCompiler")(compilerHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any], errorCollector.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.anon.Compiler]
  
  @scala.inline
  def createAotUrlResolver(host: typingsSlinky.angularCompiler.anon.ResourceNameToFileName): typingsSlinky.angularCompiler.urlResolverMod.UrlResolver = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createAotUrlResolver")(host.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.urlResolverMod.UrlResolver]
  
  @scala.inline
  def createElementCssSelector(elementName: java.lang.String, attributes: js.Array[js.Tuple2[java.lang.String, java.lang.String]]): typingsSlinky.angularCompiler.selectorMod.CssSelector = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createElementCssSelector")(elementName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.selectorMod.CssSelector]
  
  @scala.inline
  def createLoweredSymbol(id: scala.Double): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createLoweredSymbol")(id.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def createOfflineCompileUrlResolver(): typingsSlinky.angularCompiler.urlResolverMod.UrlResolver = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createOfflineCompileUrlResolver")().asInstanceOf[typingsSlinky.angularCompiler.urlResolverMod.UrlResolver]
  
  @scala.inline
  def createUrlResolverWithoutPackagePrefix(): typingsSlinky.angularCompiler.urlResolverMod.UrlResolver = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("createUrlResolverWithoutPackagePrefix")().asInstanceOf[typingsSlinky.angularCompiler.urlResolverMod.UrlResolver]
  
  @scala.inline
  def debugOutputAstAsTypeScript(ast: js.Array[_]): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def debugOutputAstAsTypeScript(ast: typingsSlinky.angularCompiler.outputAstMod.Expression): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def debugOutputAstAsTypeScript(ast: typingsSlinky.angularCompiler.outputAstMod.Statement): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def debugOutputAstAsTypeScript(ast: typingsSlinky.angularCompiler.outputAstMod.Type): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def findNode(nodes: js.Array[typingsSlinky.angularCompiler.mlParserAstMod.Node], position: scala.Double): typingsSlinky.angularCompiler.mlParserAstMod.HtmlAstPath = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(nodes.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.mlParserAstMod.HtmlAstPath]
  
  @scala.inline
  def flatten[T](list: js.Array[T | js.Array[T]]): js.Array[T] = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def formattedError(chain: typingsSlinky.angularCompiler.formattedErrorMod.FormattedMessageChain): typingsSlinky.angularCompiler.formattedErrorMod.FormattedError_ = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("formattedError")(chain.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.formattedErrorMod.FormattedError_]
  
  @scala.inline
  def getHtmlTagDefinition(tagName: java.lang.String): typingsSlinky.angularCompiler.htmlTagsMod.HtmlTagDefinition = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlTagDefinition")(tagName.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.htmlTagsMod.HtmlTagDefinition]
  
  @scala.inline
  def getNsPrefix(fullName: java.lang.String): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNsPrefix")(fullName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def getNsPrefix(fullName: scala.Null): scala.Null = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNsPrefix")(fullName.asInstanceOf[js.Any]).asInstanceOf[scala.Null]
  
  @scala.inline
  def getParseErrors(error: js.Error): js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError] = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getParseErrors")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError]]
  
  @scala.inline
  def getUrlScheme(url: java.lang.String): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("getUrlScheme")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def hostViewClassName(compType: js.Any): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("hostViewClassName")(compType.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def identifierModuleUrl(compileIdentifier: typingsSlinky.angularCompiler.compileMetadataMod.CompileIdentifierMetadata): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("identifierModuleUrl")(compileIdentifier.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def identifierName(): java.lang.String | scala.Null = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")().asInstanceOf[java.lang.String | scala.Null]
  @scala.inline
  def identifierName(compileIdentifier: typingsSlinky.angularCompiler.compileMetadataMod.CompileIdentifierMetadata): java.lang.String | scala.Null = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")(compileIdentifier.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def isEmptyExpression(ast: typingsSlinky.angularCompiler.astMod.AST): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyExpression")(ast.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isFormattedError(error: js.Error): /* is @angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedError */ scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFormattedError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedError */ scala.Boolean]
  
  @scala.inline
  def isIdentifier(input: java.lang.String): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(input.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isLoweredSymbol(name: java.lang.String): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isLoweredSymbol")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNgContainer(tagName: java.lang.String): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNgContainer")(tagName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNgContent(tagName: java.lang.String): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNgContent")(tagName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNgTemplate(tagName: java.lang.String): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNgTemplate")(tagName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isQuote(code: scala.Double): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isQuote")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isSyntaxError(error: js.Error): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSyntaxError")(error.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def jsDocComment(): typingsSlinky.angularCompiler.outputAstMod.JSDocComment_ = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("jsDocComment")().asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.JSDocComment_]
  @scala.inline
  def jsDocComment(tags: js.Array[typingsSlinky.angularCompiler.outputAstMod.JSDocTag]): typingsSlinky.angularCompiler.outputAstMod.JSDocComment_ = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("jsDocComment")(tags.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.JSDocComment_]
  
  @scala.inline
  def leadingComment(text: java.lang.String): typingsSlinky.angularCompiler.outputAstMod.LeadingComment_ = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.LeadingComment_]
  @scala.inline
  def leadingComment(text: java.lang.String, multiline: js.UndefOr[scala.Nothing], trailingNewline: scala.Boolean): typingsSlinky.angularCompiler.outputAstMod.LeadingComment_ = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any], trailingNewline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.LeadingComment_]
  @scala.inline
  def leadingComment(text: java.lang.String, multiline: scala.Boolean): typingsSlinky.angularCompiler.outputAstMod.LeadingComment_ = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.LeadingComment_]
  @scala.inline
  def leadingComment(text: java.lang.String, multiline: scala.Boolean, trailingNewline: scala.Boolean): typingsSlinky.angularCompiler.outputAstMod.LeadingComment_ = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any], trailingNewline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.LeadingComment_]
  
  @scala.inline
  def literalMap(values: js.Array[typingsSlinky.angularCompiler.anon.Key]): typingsSlinky.angularCompiler.outputAstMod.LiteralMapExpr = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalMap")(values.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.LiteralMapExpr]
  @scala.inline
  def literalMap(
    values: js.Array[typingsSlinky.angularCompiler.anon.Key],
    `type`: typingsSlinky.angularCompiler.outputAstMod.MapType
  ): typingsSlinky.angularCompiler.outputAstMod.LiteralMapExpr = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("literalMap")(values.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.outputAstMod.LiteralMapExpr]
  
  @scala.inline
  def makeBindingParser(): typingsSlinky.angularCompiler.bindingParserMod.BindingParser = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("makeBindingParser")().asInstanceOf[typingsSlinky.angularCompiler.bindingParserMod.BindingParser]
  @scala.inline
  def makeBindingParser(interpolationConfig: typingsSlinky.angularCompiler.interpolationConfigMod.InterpolationConfig): typingsSlinky.angularCompiler.bindingParserMod.BindingParser = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("makeBindingParser")(interpolationConfig.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.bindingParserMod.BindingParser]
  
  @scala.inline
  def mergeAnalyzedFiles(analyzedFiles: js.Array[typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedFile]): typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedModules = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("mergeAnalyzedFiles")(analyzedFiles.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedModules]
  
  @scala.inline
  def mergeNsAndName(prefix: java.lang.String, localName: java.lang.String): java.lang.String = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("mergeNsAndName")(prefix.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ngModuleJitUrl(moduleMeta: typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("ngModuleJitUrl")(moduleMeta.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def parseHostBindings(
    host: org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.angularCompiler.outputAstMod.Expression]
  ): typingsSlinky.angularCompiler.viewCompilerMod.ParsedHostBindings = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseHostBindings")(host.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCompiler.viewCompilerMod.ParsedHostBindings]
  
  @scala.inline
  def parseTemplate(template: java.lang.String, templateUrl: java.lang.String): typingsSlinky.angularCompiler.templateMod.ParsedTemplate = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")(template.asInstanceOf[js.Any], templateUrl.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.templateMod.ParsedTemplate]
  @scala.inline
  def parseTemplate(
    template: java.lang.String,
    templateUrl: java.lang.String,
    options: typingsSlinky.angularCompiler.templateMod.ParseTemplateOptions
  ): typingsSlinky.angularCompiler.templateMod.ParsedTemplate = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")(template.asInstanceOf[js.Any], templateUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.templateMod.ParsedTemplate]
  
  @scala.inline
  def preserveWhitespacesDefault(): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")().asInstanceOf[scala.Boolean]
  @scala.inline
  def preserveWhitespacesDefault(preserveWhitespacesOption: scala.Boolean): scala.Boolean = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")(preserveWhitespacesOption.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def preserveWhitespacesDefault(preserveWhitespacesOption: scala.Boolean, defaultSetting: scala.Boolean): scala.Boolean = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")(preserveWhitespacesOption.asInstanceOf[js.Any], defaultSetting.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def preserveWhitespacesDefault(preserveWhitespacesOption: scala.Null, defaultSetting: scala.Boolean): scala.Boolean = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")(preserveWhitespacesOption.asInstanceOf[js.Any], defaultSetting.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def publishFacade(global: js.Any): scala.Unit = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("publishFacade")(global.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def r3JitTypeSourceSpan(kind: java.lang.String, typeName: java.lang.String, sourceUrl: java.lang.String): typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("r3JitTypeSourceSpan")(kind.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any], sourceUrl.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan]
  
  @scala.inline
  def removeSummaryDuplicates[T /* <: typingsSlinky.angularCompiler.anon.TypeCompileTypeMetadata */](items: js.Array[T]): js.Array[T] = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("removeSummaryDuplicates")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def rendererTypeName(compType: js.Any): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("rendererTypeName")(compType.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def sanitizeIdentifier(name: java.lang.String): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def sharedStylesheetJitUrl(meta: typingsSlinky.angularCompiler.compileMetadataMod.CompileStylesheetMetadata, id: scala.Double): java.lang.String = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("sharedStylesheetJitUrl")(meta.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def splitClasses(classAttrValue: java.lang.String): js.Array[java.lang.String] = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("splitClasses")(classAttrValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def splitNsName(elementName: java.lang.String): js.Tuple2[java.lang.String | scala.Null, java.lang.String] = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("splitNsName")(elementName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[java.lang.String | scala.Null, java.lang.String]]
  
  @scala.inline
  def syntaxError(msg: java.lang.String): js.Error = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("syntaxError")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  @scala.inline
  def syntaxError(
    msg: java.lang.String,
    parseErrors: js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError]
  ): js.Error = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("syntaxError")(msg.asInstanceOf[js.Any], parseErrors.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  @scala.inline
  def templateJitUrl(
    ngModuleType: typingsSlinky.angularCompiler.compileMetadataMod.CompileIdentifierMetadata,
    compMeta: typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
  ): java.lang.String = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("templateJitUrl")(ngModuleType.asInstanceOf[js.Any], compMeta.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def templateSourceUrl(
    ngModuleType: typingsSlinky.angularCompiler.compileMetadataMod.CompileIdentifierMetadata,
    compMeta: typingsSlinky.angularCompiler.anon.Type,
    templateMeta: typingsSlinky.angularCompiler.anon.IsInline
  ): java.lang.String = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("templateSourceUrl")(ngModuleType.asInstanceOf[js.Any], compMeta.asInstanceOf[js.Any], templateMeta.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def templateVisitAll(
    visitor: typingsSlinky.angularCompiler.templateAstMod.TemplateAstVisitor,
    asts: js.Array[typingsSlinky.angularCompiler.templateAstMod.TemplateAst]
  ): js.Array[_] = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("templateVisitAll")(visitor.asInstanceOf[js.Any], asts.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  @scala.inline
  def templateVisitAll(
    visitor: typingsSlinky.angularCompiler.templateAstMod.TemplateAstVisitor,
    asts: js.Array[typingsSlinky.angularCompiler.templateAstMod.TemplateAst],
    context: js.Any
  ): js.Array[_] = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("templateVisitAll")(visitor.asInstanceOf[js.Any], asts.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def toTypeScript(file: typingsSlinky.angularCompiler.generatedFileMod.GeneratedFile): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("toTypeScript")(file.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toTypeScript(file: typingsSlinky.angularCompiler.generatedFileMod.GeneratedFile, preamble: java.lang.String): java.lang.String = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("toTypeScript")(file.asInstanceOf[js.Any], preamble.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def tokenName(token: typingsSlinky.angularCompiler.compileMetadataMod.CompileTokenMetadata): java.lang.String | scala.Null = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenName")(token.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def tokenReference(token: typingsSlinky.angularCompiler.compileMetadataMod.CompileTokenMetadata): js.Any = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("tokenReference")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def typeSourceSpan(
    kind: java.lang.String,
    `type`: typingsSlinky.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
  ): typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("typeSourceSpan")(kind.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan]
  
  @scala.inline
  def unescapeIdentifier(identifier: java.lang.String): java.lang.String = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("unescapeIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def unwrapResolvedMetadata(metadata: js.Any): js.Any = typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrapResolvedMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def verifyHostBindings(
    bindings: typingsSlinky.angularCompiler.viewCompilerMod.ParsedHostBindings,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ): js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError] = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("verifyHostBindings")(bindings.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError]]
  
  @scala.inline
  def viewClassName(compType: js.Any, embeddedTemplateIndex: scala.Double): java.lang.String = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("viewClassName")(compType.asInstanceOf[js.Any], embeddedTemplateIndex.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def visitAll(
    visitor: typingsSlinky.angularCompiler.mlParserAstMod.Visitor,
    nodes: js.Array[typingsSlinky.angularCompiler.mlParserAstMod.Node]
  ): js.Array[_] = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("visitAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  @scala.inline
  def visitAll(
    visitor: typingsSlinky.angularCompiler.mlParserAstMod.Visitor,
    nodes: js.Array[typingsSlinky.angularCompiler.mlParserAstMod.Node],
    context: js.Any
  ): js.Array[_] = (typingsSlinky.angularCompiler.srcCompilerMod.^.asInstanceOf[js.Dynamic].applyDynamic("visitAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
}
