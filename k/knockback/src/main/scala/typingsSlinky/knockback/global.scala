package typingsSlinky.knockback

import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelBase
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.knockback.Knockback.FactoryOptions
import typingsSlinky.knockback.Knockback.Static
import typingsSlinky.knockback.Knockback.StoreOptions
import typingsSlinky.knockback.Knockback.ViewModelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Knockback {
    
    @JSGlobal("Knockback.DefaultObservable")
    @js.native
    class DefaultObservable protected ()
      extends typingsSlinky.knockback.Knockback.DefaultObservable {
      def this(
        targetObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
        defaultValue: js.Any
      ) = this()
    }
    
    @JSGlobal("Knockback.Destroyable")
    @js.native
    class Destroyable ()
      extends typingsSlinky.knockback.Knockback.Destroyable
    
    @JSGlobal("Knockback.EventWatcher")
    @js.native
    class EventWatcher ()
      extends typingsSlinky.knockback.Knockback.EventWatcher
    object EventWatcher {
      
      /* static member */
      @JSGlobal("Knockback.EventWatcher.useOptionsOrCreate")
      @js.native
      def useOptionsOrCreate(
        options: js.Any,
        emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
        obj: Model[_, ModelSetOptions, js.Object],
        callback_options: js.Any
      ): js.Any = js.native
    }
    
    @JSGlobal("Knockback.Factory")
    @js.native
    class Factory protected ()
      extends typingsSlinky.knockback.Knockback.Factory {
      def this(parent_factory: js.Any) = this()
    }
    object Factory {
      
      /* static member */
      @JSGlobal("Knockback.Factory.useOptionsOrCreate")
      @js.native
      def useOptionsOrCreate(options: FactoryOptions, obj: js.Any, owner_path: String): js.Any = js.native
    }
    
    @JSGlobal("Knockback.FormattedObservable")
    @js.native
    class FormattedObservable protected ()
      extends typingsSlinky.knockback.Knockback.Destroyable {
      def this(format: String, args: js.Array[_]) = this()
      def this(
        format: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
        args: js.Array[_]
      ) = this()
    }
    
    @JSGlobal("Knockback.LocalizedObservable")
    @js.native
    class LocalizedObservable protected ()
      extends typingsSlinky.knockback.Knockback.LocalizedObservable {
      def this(value: js.Any, options: js.Any, vm: js.Any) = this()
    }
    
    @JSGlobal("Knockback.Statistics")
    @js.native
    class Statistics ()
      extends typingsSlinky.knockback.Knockback.Statistics
    
    @JSGlobal("Knockback.Store")
    @js.native
    class Store protected ()
      extends typingsSlinky.knockback.Knockback.Store {
      def this(model: Model[_, ModelSetOptions, js.Object], options: StoreOptions) = this()
    }
    object Store {
      
      /* static member */
      @JSGlobal("Knockback.Store.useOptionsOrCreate")
      @js.native
      def useOptionsOrCreate(
        options: StoreOptions,
        obj: js.Any,
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
      ): js.Any = js.native
    }
    
    @JSGlobal("Knockback.TriggeredObservable")
    @js.native
    class TriggeredObservable protected ()
      extends typingsSlinky.knockback.Knockback.TriggeredObservable {
      def this(emitter: ModelBase, event: String) = this()
    }
    
    @JSGlobal("Knockback.ViewModel")
    @js.native
    class ViewModel ()
      extends typingsSlinky.knockback.Knockback.ViewModel {
      def this(model: Model[_, ModelSetOptions, js.Object]) = this()
      def this(model: js.UndefOr[scala.Nothing], options: ViewModelOptions) = this()
      def this(model: Model[_, ModelSetOptions, js.Object], options: ViewModelOptions) = this()
      def this(
        model: js.UndefOr[scala.Nothing],
        options: js.UndefOr[scala.Nothing],
        viewModel: typingsSlinky.knockback.Knockback.ViewModel
      ) = this()
      def this(
        model: js.UndefOr[scala.Nothing],
        options: ViewModelOptions,
        viewModel: typingsSlinky.knockback.Knockback.ViewModel
      ) = this()
      def this(
        model: Model[_, ModelSetOptions, js.Object],
        options: js.UndefOr[scala.Nothing],
        viewModel: typingsSlinky.knockback.Knockback.ViewModel
      ) = this()
      def this(
        model: Model[_, ModelSetOptions, js.Object],
        options: ViewModelOptions,
        viewModel: typingsSlinky.knockback.Knockback.ViewModel
      ) = this()
    }
  }
  
  @JSGlobal("kb")
  @js.native
  def kb: Static = js.native
  @scala.inline
  def kb_=(x: Static): Unit = js.Dynamic.global.updateDynamic("kb")(x.asInstanceOf[js.Any])
}
