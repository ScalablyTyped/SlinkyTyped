package typingsSlinky.history

import typingsSlinky.history.mod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHashHistoryMod {
  
  @JSImport("history/createHashHistory", JSImport.Default)
  @js.native
  def default[S](): History[S] = js.native
  @JSImport("history/createHashHistory", JSImport.Default)
  @js.native
  def default[S](options: HashHistoryBuildOptions): History[S] = js.native
  
  @js.native
  trait HashHistoryBuildOptions extends StObject {
    
    var basename: js.UndefOr[String] = js.native
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
      ] = js.native
    
    var hashType: js.UndefOr[HashType] = js.native
  }
  object HashHistoryBuildOptions {
    
    @scala.inline
    def apply(): HashHistoryBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashHistoryBuildOptions]
    }
    
    @scala.inline
    implicit class HashHistoryBuildOptionsMutableBuilder[Self <: HashHistoryBuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setHashType(value: HashType): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.history.historyStrings.hashbang
    - typingsSlinky.history.historyStrings.noslash
    - typingsSlinky.history.historyStrings.slash
  */
  trait HashType extends StObject
  object HashType {
    
    @scala.inline
    def hashbang: typingsSlinky.history.historyStrings.hashbang = "hashbang".asInstanceOf[typingsSlinky.history.historyStrings.hashbang]
    
    @scala.inline
    def noslash: typingsSlinky.history.historyStrings.noslash = "noslash".asInstanceOf[typingsSlinky.history.historyStrings.noslash]
    
    @scala.inline
    def slash: typingsSlinky.history.historyStrings.slash = "slash".asInstanceOf[typingsSlinky.history.historyStrings.slash]
  }
}
