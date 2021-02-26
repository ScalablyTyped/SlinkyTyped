package typingsSlinky.mobx

import typingsSlinky.mobx.interceptUtilsMod.IInterceptable
import typingsSlinky.mobx.listenUtilsMod.IListenable
import typingsSlinky.mobx.mobxStrings.add
import typingsSlinky.mobx.mobxStrings.delete
import typingsSlinky.mobx.modifiersMod.IEnhancer
import typingsSlinky.mobx.utilsMod.Lambda
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablesetMod {
  
  @JSImport("mobx/lib/types/observableset", "ObservableSet")
  @js.native
  class ObservableSet[T] ()
    extends Set[T]
       with IInterceptable[ISetWillChange[js.Any]]
       with IListenable {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T]) = this()
    def this(
      initialData: js.UndefOr[IObservableSetInitialValues[T]],
      enhancer: js.UndefOr[scala.Nothing],
      name: String
    ) = this()
    def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T], name: String) = this()
    
    var _atom: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var dehanceValue: js.Any = js.native
    
    var dehancer: js.Any = js.native
    
    def delete(value: js.Any): Boolean = js.native
    
    def enhancer(newV: js.Any): js.Any = js.native
    def enhancer(newV: js.Any, oldV: js.Any): js.Any = js.native
    
    def has(value: js.Any): Boolean = js.native
    
    var name: String = js.native
    
    def observe(listener: js.Function1[/* changes */ ISetDidChange[T], Unit]): Lambda = js.native
    def observe(listener: js.Function1[/* changes */ ISetDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def replace(other: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
    def replace(other: ObservableSet[T]): ObservableSet[T] = js.native
    
    @JSName("size")
    def size_MObservableSet: Double = js.native
    
    def toJS(): Set[T] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_ObservableSet: typingsSlinky.mobx.mobxStrings.Set = js.native
  }
  
  @JSImport("mobx/lib/types/observableset", "isObservableSet")
  @js.native
  def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = js.native
  
  type IObservableSetInitialValues[T] = Set[T] | js.Array[T]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mobx.anon.NewValueObject[T]
    - typingsSlinky.mobx.anon.ObjectOldValue[T]
  */
  trait ISetDidChange[T] extends StObject
  object ISetDidChange {
    
    @scala.inline
    def NewValueObject[T](newValue: T, `object`: ObservableSet[T], `type`: add): typingsSlinky.mobx.anon.NewValueObject[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.mobx.anon.NewValueObject[T]]
    }
    
    @scala.inline
    def ObjectOldValue[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): typingsSlinky.mobx.anon.ObjectOldValue[T] = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.mobx.anon.ObjectOldValue[T]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mobx.anon.OldValueType[T]
    - typingsSlinky.mobx.anon.NewValueObjectType[T]
  */
  trait ISetWillChange[T] extends StObject
  object ISetWillChange {
    
    @scala.inline
    def NewValueObjectType[T](newValue: T, `object`: ObservableSet[T], `type`: add): typingsSlinky.mobx.anon.NewValueObjectType[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.mobx.anon.NewValueObjectType[T]]
    }
    
    @scala.inline
    def OldValueType[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): typingsSlinky.mobx.anon.OldValueType[T] = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.mobx.anon.OldValueType[T]]
    }
  }
}
