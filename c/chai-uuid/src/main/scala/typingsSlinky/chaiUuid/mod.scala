package typingsSlinky.chaiUuid

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.chai.Chai.ChaiPlugin
import typingsSlinky.chai.Chai.LanguageChains
import typingsSlinky.chai.Chai.NumericComparison
import typingsSlinky.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-uuid", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def guid(guid: String): Unit = js.native
        def guid(guid: String, version: js.Any): Unit = js.native
        
        def uuid(uuid: String): Unit = js.native
        def uuid(uuid: String, version: UuidVersion): Unit = js.native
      }
      
      @js.native
      trait Assertion
        extends LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def guid(): Unit = js.native
        def guid(guid: js.Any): Unit = js.native
        
        def uuid(): Unit = js.native
        def uuid(uuid: UuidVersion): Unit = js.native
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsSlinky.chaiUuid.chaiUuidStrings.v1
        - typingsSlinky.chaiUuid.chaiUuidStrings.v2
        - typingsSlinky.chaiUuid.chaiUuidStrings.v3
        - typingsSlinky.chaiUuid.chaiUuidStrings.v4
        - typingsSlinky.chaiUuid.chaiUuidStrings.v5
        - typingsSlinky.chaiUuid.chaiUuidStrings._empty
      */
      trait UuidVersion extends StObject
      object UuidVersion {
        
        @scala.inline
        def _empty: typingsSlinky.chaiUuid.chaiUuidStrings._empty = "".asInstanceOf[typingsSlinky.chaiUuid.chaiUuidStrings._empty]
        
        @scala.inline
        def v1: typingsSlinky.chaiUuid.chaiUuidStrings.v1 = "v1".asInstanceOf[typingsSlinky.chaiUuid.chaiUuidStrings.v1]
        
        @scala.inline
        def v2: typingsSlinky.chaiUuid.chaiUuidStrings.v2 = "v2".asInstanceOf[typingsSlinky.chaiUuid.chaiUuidStrings.v2]
        
        @scala.inline
        def v3: typingsSlinky.chaiUuid.chaiUuidStrings.v3 = "v3".asInstanceOf[typingsSlinky.chaiUuid.chaiUuidStrings.v3]
        
        @scala.inline
        def v4: typingsSlinky.chaiUuid.chaiUuidStrings.v4 = "v4".asInstanceOf[typingsSlinky.chaiUuid.chaiUuidStrings.v4]
        
        @scala.inline
        def v5: typingsSlinky.chaiUuid.chaiUuidStrings.v5 = "v5".asInstanceOf[typingsSlinky.chaiUuid.chaiUuidStrings.v5]
      }
    }
  }
}
