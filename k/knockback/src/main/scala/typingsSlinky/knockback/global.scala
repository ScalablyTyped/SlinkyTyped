package typingsSlinky.knockback

import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelBase
import typingsSlinky.knockback.Knockback.FactoryOptions
import typingsSlinky.knockback.Knockback.Static
import typingsSlinky.knockback.Knockback.StoreOptions
import typingsSlinky.knockback.Knockback.ViewModelOptions
import typingsSlinky.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var kb: Static = js.native
  @js.native
  object Knockback extends js.Object {
    @js.native
    class DefaultObservable protected ()
      extends typingsSlinky.knockback.Knockback.DefaultObservable {
      def this(targetObservable: KnockoutObservable[_], defaultValue: js.Any) = this()
    }
    
    @js.native
    class Destroyable ()
      extends typingsSlinky.knockback.Knockback.Destroyable
    
    @js.native
    class EventWatcher ()
      extends typingsSlinky.knockback.Knockback.EventWatcher
    
    @js.native
    class Factory protected ()
      extends typingsSlinky.knockback.Knockback.Factory {
      def this(parent_factory: js.Any) = this()
    }
    
    @js.native
    class FormattedObservable protected ()
      extends typingsSlinky.knockback.Knockback.Destroyable {
      def this(format: String, args: js.Array[_]) = this()
      def this(format: KnockoutObservable[_], args: js.Array[_]) = this()
    }
    
    @js.native
    class LocalizedObservable protected ()
      extends typingsSlinky.knockback.Knockback.LocalizedObservable {
      def this(value: js.Any, options: js.Any, vm: js.Any) = this()
    }
    
    @js.native
    class Statistics ()
      extends typingsSlinky.knockback.Knockback.Statistics
    
    @js.native
    class Store protected ()
      extends typingsSlinky.knockback.Knockback.Store {
      def this(model: Model, options: StoreOptions) = this()
    }
    
    @js.native
    class TriggeredObservable protected ()
      extends typingsSlinky.knockback.Knockback.TriggeredObservable {
      def this(emitter: ModelBase, event: String) = this()
    }
    
    @js.native
    class ViewModel ()
      extends typingsSlinky.knockback.Knockback.ViewModel {
      def this(model: Model) = this()
      def this(model: Model, options: ViewModelOptions) = this()
      def this(model: Model, options: ViewModelOptions, viewModel: typingsSlinky.knockback.Knockback.ViewModel) = this()
    }
    
    /* static members */
    @js.native
    object EventWatcher extends js.Object {
      def useOptionsOrCreate(options: js.Any, emitter: KnockoutObservable[_], obj: Model, callback_options: js.Any): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object Factory extends js.Object {
      def useOptionsOrCreate(options: FactoryOptions, obj: js.Any, owner_path: String): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object Store extends js.Object {
      def useOptionsOrCreate(options: StoreOptions, obj: js.Any, observable: KnockoutObservable[_]): js.Any = js.native
    }
    
  }
  
}

