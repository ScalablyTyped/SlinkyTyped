package typingsSlinky.d3Require

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-require", "RequireError")
  @js.native
  class RequireError () extends Error
  
  @js.native
  trait require extends StObject {
    
    def apply(name: String, names: String*): js.Promise[_] = js.native
    
    /**
      * Returns a `require` with the specified *aliases*.
      * `require.alias({"react": React, "react-dom": ReactDOM})`
      */
    def alias(aliases: StringDictionary[js.Any]): typingsSlinky.d3Require.mod.require = js.native
    
    /**
      * The resolver passed to `requireFrom`
      */
    def resolve(name: String): js.Promise[String] = js.native
    def resolve(name: String, base: String): js.Promise[String] = js.native
    /**
      * The resolver passed to `requireFrom`
      */
    @JSName("resolve")
    var resolve_Original: resolver = js.native
  }
  @JSImport("d3-require", "require")
  @js.native
  val require: typingsSlinky.d3Require.mod.require = js.native
  
  @JSImport("d3-require", "requireFrom")
  @js.native
  val requireFrom: typingsSlinky.d3Require.mod.requireFrom = js.native
  type requireFrom = js.Function1[/* resolver */ resolver, typingsSlinky.d3Require.mod.require]
  
  type resolver = js.Function2[/* name */ String, /* base */ js.UndefOr[String], js.Promise[String]]
}
