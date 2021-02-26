package typingsSlinky.history

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMemoryHistoryMod {
  
  @JSImport("history/createMemoryHistory", JSImport.Default)
  @js.native
  def default[S](): MemoryHistory[S] = js.native
  @JSImport("history/createMemoryHistory", JSImport.Default)
  @js.native
  def default[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
  
  @js.native
  trait MemoryHistory[HistoryLocationState] extends History[HistoryLocationState] {
    
    def canGo(n: Double): Boolean = js.native
    
    var entries: js.Array[Location[HistoryLocationState]] = js.native
    
    var index: Double = js.native
  }
  
  @js.native
  trait MemoryHistoryBuildOptions extends StObject {
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
      ] = js.native
    
    var initialEntries: js.UndefOr[js.Array[String]] = js.native
    
    var initialIndex: js.UndefOr[Double] = js.native
    
    var keyLength: js.UndefOr[Double] = js.native
  }
  object MemoryHistoryBuildOptions {
    
    @scala.inline
    def apply(): MemoryHistoryBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryHistoryBuildOptions]
    }
    
    @scala.inline
    implicit class MemoryHistoryBuildOptionsMutableBuilder[Self <: MemoryHistoryBuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setInitialEntries(value: js.Array[String]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      @scala.inline
      def setInitialEntriesVarargs(value: String*): Self = StObject.set(x, "initialEntries", js.Array(value :_*))
      
      @scala.inline
      def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
}
