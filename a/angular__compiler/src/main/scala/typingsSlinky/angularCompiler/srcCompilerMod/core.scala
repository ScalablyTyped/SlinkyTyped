package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.coreMod.Component
import typingsSlinky.angularCompiler.coreMod.Directive
import typingsSlinky.angularCompiler.coreMod.HostBinding
import typingsSlinky.angularCompiler.coreMod.HostListener
import typingsSlinky.angularCompiler.coreMod.Inject
import typingsSlinky.angularCompiler.coreMod.Injectable
import typingsSlinky.angularCompiler.coreMod.Input
import typingsSlinky.angularCompiler.coreMod.MetadataFactory
import typingsSlinky.angularCompiler.coreMod.NgModule
import typingsSlinky.angularCompiler.coreMod.Output
import typingsSlinky.angularCompiler.coreMod.Pipe
import typingsSlinky.angularCompiler.coreMod.Query
import typingsSlinky.angularCompiler.coreMod.R3CssSelectorList
import typingsSlinky.angularCompiler.coreMod.SchemaMetadata
import typingsSlinky.std.FunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSImport("@angular/compiler/src/compiler", "core.CUSTOM_ELEMENTS_SCHEMA")
  @js.native
  val CUSTOM_ELEMENTS_SCHEMA: SchemaMetadata = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.ChangeDetectionStrategy")
  @js.native
  object ChangeDetectionStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularCompiler.coreMod.ChangeDetectionStrategy with Double] = js.native
    
    /* 1 */ val Default: typingsSlinky.angularCompiler.coreMod.ChangeDetectionStrategy.Default with Double = js.native
    
    /* 0 */ val OnPush: typingsSlinky.angularCompiler.coreMod.ChangeDetectionStrategy.OnPush with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/compiler", "core.MissingTranslationStrategy")
  @js.native
  object MissingTranslationStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularCompiler.coreMod.MissingTranslationStrategy with Double] = js.native
    
    /* 0 */ val Error: typingsSlinky.angularCompiler.coreMod.MissingTranslationStrategy.Error with Double = js.native
    
    /* 2 */ val Ignore: typingsSlinky.angularCompiler.coreMod.MissingTranslationStrategy.Ignore with Double = js.native
    
    /* 1 */ val Warning: typingsSlinky.angularCompiler.coreMod.MissingTranslationStrategy.Warning with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/compiler", "core.NO_ERRORS_SCHEMA")
  @js.native
  val NO_ERRORS_SCHEMA: SchemaMetadata = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.SecurityContext")
  @js.native
  object SecurityContext extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularCompiler.coreMod.SecurityContext with Double] = js.native
    
    /* 1 */ val HTML: typingsSlinky.angularCompiler.coreMod.SecurityContext.HTML with Double = js.native
    
    /* 0 */ val NONE: typingsSlinky.angularCompiler.coreMod.SecurityContext.NONE with Double = js.native
    
    /* 5 */ val RESOURCE_URL: typingsSlinky.angularCompiler.coreMod.SecurityContext.RESOURCE_URL with Double = js.native
    
    /* 3 */ val SCRIPT: typingsSlinky.angularCompiler.coreMod.SecurityContext.SCRIPT with Double = js.native
    
    /* 2 */ val STYLE: typingsSlinky.angularCompiler.coreMod.SecurityContext.STYLE with Double = js.native
    
    /* 4 */ val URL: typingsSlinky.angularCompiler.coreMod.SecurityContext.URL with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/compiler", "core.Type")
  @js.native
  val Type: FunctionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/compiler/src/compiler", "core.Type")
  @js.native
  class TypeCls protected ()
    extends js.Function {
    /**
      * Creates a new function.
      * @param args A list of arguments the function accepts.
      */
    def this(args: String*) = this()
  }
  
  @JSImport("@angular/compiler/src/compiler", "core.ViewEncapsulation")
  @js.native
  object ViewEncapsulation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularCompiler.coreMod.ViewEncapsulation with Double] = js.native
    
    /* 0 */ val Emulated: typingsSlinky.angularCompiler.coreMod.ViewEncapsulation.Emulated with Double = js.native
    
    /* 2 */ val None: typingsSlinky.angularCompiler.coreMod.ViewEncapsulation.None with Double = js.native
    
    /* 3 */ val ShadowDom: typingsSlinky.angularCompiler.coreMod.ViewEncapsulation.ShadowDom with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/compiler", "core.createAttribute")
  @js.native
  val createAttribute: MetadataFactory[typingsSlinky.angularCompiler.coreMod.Attribute] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createComponent")
  @js.native
  val createComponent: MetadataFactory[Component] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createContentChild")
  @js.native
  val createContentChild: MetadataFactory[Query] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createContentChildren")
  @js.native
  val createContentChildren: MetadataFactory[Query] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createDirective")
  @js.native
  val createDirective: MetadataFactory[Directive] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createHost")
  @js.native
  val createHost: MetadataFactory[js.Any] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createHostBinding")
  @js.native
  val createHostBinding: MetadataFactory[HostBinding] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createHostListener")
  @js.native
  val createHostListener: MetadataFactory[HostListener] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createInject")
  @js.native
  val createInject: MetadataFactory[Inject] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createInjectable")
  @js.native
  val createInjectable: MetadataFactory[Injectable] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createInjectionToken")
  @js.native
  val createInjectionToken: MetadataFactory[js.Object] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createInput")
  @js.native
  val createInput: MetadataFactory[Input] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createNgModule")
  @js.native
  val createNgModule: MetadataFactory[NgModule] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createOptional")
  @js.native
  val createOptional: MetadataFactory[js.Any] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createOutput")
  @js.native
  val createOutput: MetadataFactory[Output] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createPipe")
  @js.native
  val createPipe: MetadataFactory[Pipe] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createSelf")
  @js.native
  val createSelf: MetadataFactory[js.Any] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createSkipSelf")
  @js.native
  val createSkipSelf: MetadataFactory[js.Any] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createViewChild")
  @js.native
  val createViewChild: MetadataFactory[Query] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.createViewChildren")
  @js.native
  val createViewChildren: MetadataFactory[Query] = js.native
  
  @JSImport("@angular/compiler/src/compiler", "core.parseSelectorToR3Selector")
  @js.native
  def parseSelectorToR3Selector(): R3CssSelectorList = js.native
  @JSImport("@angular/compiler/src/compiler", "core.parseSelectorToR3Selector")
  @js.native
  def parseSelectorToR3Selector(selector: String): R3CssSelectorList = js.native
}
