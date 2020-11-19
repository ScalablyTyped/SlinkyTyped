package typingsSlinky.d3Require

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-require", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val requireFrom: typingsSlinky.d3Require.mod.requireFrom = js.native
  
  @js.native
  class RequireError () extends Error
  
  @js.native
  trait require extends js.Object {
    
    def apply(name: String, names: String*): js.Promise[_] = js.native
    
    /**
      * Returns a `require` with the specified *aliases*.
      * `require.alias({"react": React, "react-dom": ReactDOM})`
      */
    def alias(aliases: StringDictionary[js.Any]): require = js.native
    
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
  @js.native
  object require extends TopLevel[require]
  
  type requireFrom = js.Function1[/* resolver */ resolver, require]
  
  type resolver = js.Function2[/* name */ String, /* base */ js.UndefOr[String], js.Promise[String]]
}
