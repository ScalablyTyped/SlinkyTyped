package typingsSlinky.rxAngular

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.angular.mod.IScope
import typingsSlinky.rx.Rx.IScheduler
import typingsSlinky.rx.Rx.Observable
import typingsSlinky.rx.Rx.SchedulerStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx_ {
  
  @js.native
  trait IObservable[T] extends StObject {
    
    def safeApply($scope: IScope, callback: js.Function1[/* data */ T, Unit]): Observable[T] = js.native
  }
  object IObservable {
    
    @scala.inline
    def apply[T](safeApply: (IScope, js.Function1[/* data */ T, Unit]) => Observable[T]): IObservable[T] = {
      val __obj = js.Dynamic.literal(safeApply = js.Any.fromFunction2(safeApply))
      __obj.asInstanceOf[IObservable[T]]
    }
    
    @scala.inline
    implicit class IObservableMutableBuilder[Self <: IObservable[_], T] (val x: Self with IObservable[T]) extends AnyVal {
      
      @scala.inline
      def setSafeApply(value: (IScope, js.Function1[/* data */ T, Unit]) => Observable[T]): Self = StObject.set(x, "safeApply", js.Any.fromFunction2(value))
    }
  }
  
  type ScopeScheduler = IScheduler
  
  @js.native
  trait ScopeSchedulerStatic
    extends SchedulerStatic
       with Instantiable1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ /* $scope */ js.Any, 
          ScopeScheduler
        ]
}
