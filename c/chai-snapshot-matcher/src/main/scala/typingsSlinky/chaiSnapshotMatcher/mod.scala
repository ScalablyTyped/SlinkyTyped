package typingsSlinky.chaiSnapshotMatcher

import typingsSlinky.chaiSnapshotMatcher.anon.Folder
import typingsSlinky.mocha.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        def matchSnapshot(that: Context): Unit = js.native
        def matchSnapshot(that: Context, hint: String): Unit = js.native
        
        def matchSpecificSnapshot(that: Context): Unit = js.native
        def matchSpecificSnapshot(that: Context, options: Folder): Unit = js.native
      }
    }
  }
}
