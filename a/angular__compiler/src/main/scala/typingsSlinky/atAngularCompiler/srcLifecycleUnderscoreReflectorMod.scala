package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/lifecycle_reflector", JSImport.Namespace)
@js.native
object srcLifecycleUnderscoreReflectorMod extends js.Object {
  @js.native
  sealed trait LifecycleHooks extends js.Object
  
  val LIFECYCLE_HOOKS_VALUES: js.Array[LifecycleHooks] = js.native
  def getAllLifecycleHooks(reflector: CompileReflector, token: js.Any): js.Array[LifecycleHooks] = js.native
  def hasLifecycleHook(reflector: CompileReflector, hook: LifecycleHooks, token: js.Any): Boolean = js.native
  @js.native
  object LifecycleHooks extends js.Object {
    @js.native
    sealed trait AfterContentChecked extends LifecycleHooks
    
    @js.native
    sealed trait AfterContentInit extends LifecycleHooks
    
    @js.native
    sealed trait AfterViewChecked extends LifecycleHooks
    
    @js.native
    sealed trait AfterViewInit extends LifecycleHooks
    
    @js.native
    sealed trait DoCheck extends LifecycleHooks
    
    @js.native
    sealed trait OnChanges extends LifecycleHooks
    
    @js.native
    sealed trait OnDestroy extends LifecycleHooks
    
    @js.native
    sealed trait OnInit extends LifecycleHooks
    
    /* 5 */ val AfterContentChecked: typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.AfterContentChecked with Double = js.native
    /* 4 */ val AfterContentInit: typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.AfterContentInit with Double = js.native
    /* 7 */ val AfterViewChecked: typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.AfterViewChecked with Double = js.native
    /* 6 */ val AfterViewInit: typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.AfterViewInit with Double = js.native
    /* 2 */ val DoCheck: typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.DoCheck with Double = js.native
    /* 3 */ val OnChanges: typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.OnChanges with Double = js.native
    /* 1 */ val OnDestroy: typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.OnDestroy with Double = js.native
    /* 0 */ val OnInit: typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.OnInit with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LifecycleHooks with Double] = js.native
  }
  
}

