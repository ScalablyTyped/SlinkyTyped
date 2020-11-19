package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.subjectMod.Subject
import typingsSlinky.rxjs.subscriptionMod.Subscription
import typingsSlinky.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/ConnectableObservable", JSImport.Namespace)
@js.native
object connectableObservableMod extends js.Object {
  
  val connectableObservableDescriptor: PropertyDescriptorMap = js.native
  
  @js.native
  class ConnectableObservable[T] protected () extends Observable[T] {
    def this(source: Observable[T], subjectFactory: js.Function0[Subject[T]]) = this()
    
    var _connection: Subscription = js.native
    
    /** @internal */
    var _isComplete: Boolean = js.native
    
    var _refCount: Double = js.native
    
    var _subject: Subject[T] = js.native
    
    def connect(): Subscription = js.native
    
    /* protected */ def getSubject(): Subject[T] = js.native
    
    def refCount(): Observable[T] = js.native
    
    @JSName("source")
    var source_ConnectableObservable: Observable[T] = js.native
    
    /* protected */ def subjectFactory(): Subject[T] = js.native
  }
}
