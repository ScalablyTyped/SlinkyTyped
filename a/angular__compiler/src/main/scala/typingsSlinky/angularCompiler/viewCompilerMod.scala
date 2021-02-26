package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.anon.ClassAttr
import typingsSlinky.angularCompiler.apiMod.R3ComponentDef
import typingsSlinky.angularCompiler.apiMod.R3ComponentMetadata
import typingsSlinky.angularCompiler.apiMod.R3DirectiveDef
import typingsSlinky.angularCompiler.apiMod.R3DirectiveMetadata
import typingsSlinky.angularCompiler.bindingParserMod.BindingParser
import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.constantPoolMod.ConstantPool
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.r3TemplateTransformMod.Render3ParseResult
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewCompilerMod {
  
  @JSImport("@angular/compiler/src/render3/view/compiler", "compileComponentFromMetadata")
  @js.native
  def compileComponentFromMetadata(meta: R3ComponentMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3ComponentDef = js.native
  
  @JSImport("@angular/compiler/src/render3/view/compiler", "compileComponentFromRender2")
  @js.native
  def compileComponentFromRender2(
    outputCtx: OutputContext,
    component: CompileDirectiveMetadata,
    render3Ast: Render3ParseResult,
    reflector: CompileReflector,
    bindingParser: BindingParser,
    directiveTypeBySel: Map[String, _],
    pipeTypeByName: Map[String, _]
  ): Unit = js.native
  
  @JSImport("@angular/compiler/src/render3/view/compiler", "compileDirectiveFromMetadata")
  @js.native
  def compileDirectiveFromMetadata(meta: R3DirectiveMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3DirectiveDef = js.native
  
  @JSImport("@angular/compiler/src/render3/view/compiler", "compileDirectiveFromRender2")
  @js.native
  def compileDirectiveFromRender2(
    outputCtx: OutputContext,
    directive: CompileDirectiveMetadata,
    reflector: CompileReflector,
    bindingParser: BindingParser
  ): Unit = js.native
  
  @JSImport("@angular/compiler/src/render3/view/compiler", "parseHostBindings")
  @js.native
  def parseHostBindings(host: StringDictionary[String | Expression]): ParsedHostBindings = js.native
  
  @JSImport("@angular/compiler/src/render3/view/compiler", "verifyHostBindings")
  @js.native
  def verifyHostBindings(bindings: ParsedHostBindings, sourceSpan: ParseSourceSpan): js.Array[ParseError] = js.native
  
  @js.native
  trait ParsedHostBindings extends StObject {
    
    var attributes: StringDictionary[Expression] = js.native
    
    var listeners: StringDictionary[String] = js.native
    
    var properties: StringDictionary[String] = js.native
    
    var specialAttributes: ClassAttr = js.native
  }
  object ParsedHostBindings {
    
    @scala.inline
    def apply(
      attributes: StringDictionary[Expression],
      listeners: StringDictionary[String],
      properties: StringDictionary[String],
      specialAttributes: ClassAttr
    ): ParsedHostBindings = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedHostBindings]
    }
    
    @scala.inline
    implicit class ParsedHostBindingsMutableBuilder[Self <: ParsedHostBindings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[Expression]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListeners(value: StringDictionary[String]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecialAttributes(value: ClassAttr): Self = StObject.set(x, "specialAttributes", value.asInstanceOf[js.Any])
    }
  }
}
