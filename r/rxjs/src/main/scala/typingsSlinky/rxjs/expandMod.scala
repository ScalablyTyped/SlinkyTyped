package typingsSlinky.rxjs

import typingsSlinky.rxjs.innerSubscribeMod.SimpleOuterSubscriber
import typingsSlinky.rxjs.operatorMod.Operator
import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.OperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandMod {
  
  @JSImport("rxjs/internal/operators/expand", "ExpandOperator")
  @js.native
  class ExpandOperator[T, R] protected () extends Operator[T, R] {
    def this(project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double) = this()
    def this(
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double,
      scheduler: SchedulerLike
    ) = this()
    
    var concurrent: js.Any = js.native
    
    var project: js.Any = js.native
    
    var scheduler: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/operators/expand", "ExpandSubscriber")
  @js.native
  class ExpandSubscriber[T, R] protected () extends SimpleOuterSubscriber[T, R] {
    def this(
      destination: Subscriber[R],
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double
    ) = this()
    def this(
      destination: Subscriber[R],
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double,
      scheduler: SchedulerLike
    ) = this()
    
    /* protected */ def _next(value: js.Any): Unit = js.native
    
    var active: js.Any = js.native
    
    var buffer: js.Any = js.native
    
    var concurrent: js.Any = js.native
    
    var hasCompleted: js.Any = js.native
    
    var index: js.Any = js.native
    
    var project: js.Any = js.native
    
    var scheduler: js.Any = js.native
    
    var subscribeToProjection: js.Any = js.native
  }
  /* static members */
  object ExpandSubscriber {
    
    @JSImport("rxjs/internal/operators/expand", "ExpandSubscriber")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/operators/expand", "ExpandSubscriber.dispatch")
    @js.native
    def dispatch: js.Any = js.native
    @scala.inline
    def dispatch_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal/operators/expand", "expand")
  @js.native
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/expand", "expand")
  @js.native
  def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/expand", "expand")
  @js.native
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/expand", "expand")
  @js.native
  def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/expand", "expand")
  @js.native
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators/expand", "expand")
  @js.native
  def expand_TR_OperatorFunction[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators/expand", "expand")
  @js.native
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators/expand", "expand")
  @js.native
  def expand_TR_OperatorFunction[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, R] = js.native
}
