package typingsSlinky.reactRouter

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactRouter.mod.`match`
import typingsSlinky.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait History[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.History with TopLevel[js.Any] */] extends StObject {
    
    var history: typingsSlinky.history.mod.History[LocationState] = js.native
    
    var route: Location[Params] = js.native
  }
  object History {
    
    @scala.inline
    def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reactRouter.reactRouterStrings.History with TopLevel[js.Any] */](history: typingsSlinky.history.mod.History[LocationState], route: Location[Params]): History[Params] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[History[Params]]
    }
    
    @scala.inline
    implicit class HistoryMutableBuilder[Self <: History[_], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reactRouter.reactRouterStrings.History with TopLevel[js.Any] */] (val x: Self with History[Params]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: typingsSlinky.history.mod.History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: Location[Params]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Location[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.Location with TopLevel[js.Any] */] extends StObject {
    
    var location: typingsSlinky.history.mod.Location[LocationState] = js.native
    
    var `match`: typingsSlinky.reactRouter.mod.`match`[Params] = js.native
  }
  object Location {
    
    @scala.inline
    def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reactRouter.reactRouterStrings.Location with TopLevel[js.Any] */](location: typingsSlinky.history.mod.Location[LocationState], `match`: `match`[Params]): Location[Params] = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location[Params]]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location[_], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reactRouter.reactRouterStrings.Location with TopLevel[js.Any] */] (val x: Self with Location[Params]) extends AnyVal {
      
      @scala.inline
      def setLocation(value: typingsSlinky.history.mod.Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: `match`[Params]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WrappedComponentRef[C /* <: ReactComponentClass[_] */] extends StObject {
    
    var wrappedComponentRef: js.UndefOr[Ref[InstanceType[C]]] = js.native
  }
  object WrappedComponentRef {
    
    @scala.inline
    def apply[C /* <: ReactComponentClass[_] */](): WrappedComponentRef[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrappedComponentRef[C]]
    }
    
    @scala.inline
    implicit class WrappedComponentRefMutableBuilder[Self <: WrappedComponentRef[_], C /* <: ReactComponentClass[_] */] (val x: Self with WrappedComponentRef[C]) extends AnyVal {
      
      @scala.inline
      def setWrappedComponentRef(value: Ref[InstanceType[C]]): Self = StObject.set(x, "wrappedComponentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappedComponentRefFunction1(value: /* instance */ InstanceType[C] | Null => Unit): Self = StObject.set(x, "wrappedComponentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrappedComponentRefNull: Self = StObject.set(x, "wrappedComponentRef", null)
      
      @scala.inline
      def setWrappedComponentRefRefObject(value: ReactRef[InstanceType[C]]): Self = StObject.set(x, "wrappedComponentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappedComponentRefUndefined: Self = StObject.set(x, "wrappedComponentRef", js.undefined)
    }
  }
}
