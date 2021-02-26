package typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`catch`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`wasm-expression-stack`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`with`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.block
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.closure
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.eval
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.global
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.local
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.module
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.script_
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scope extends StObject {
  
  /**
    * Location in the source code where scope ends
    */
  var endLocation: js.UndefOr[Location] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * Object representing the scope. For `global` and `with` scopes it represents the actual
    * object; for the rest of the scopes, it is artificial transient object enumerating scope
    * variables as its properties.
    */
  var `object`: RemoteObject = js.native
  
  /**
    * Location in the source code where scope starts
    */
  var startLocation: js.UndefOr[Location] = js.native
  
  /**
    * Scope type. (ScopeType enum)
    */
  var `type`: global | local | `with` | closure | `catch` | block | script_ | eval | module | `wasm-expression-stack` = js.native
}
object Scope {
  
  @scala.inline
  def apply(
    `object`: RemoteObject,
    `type`: global | local | `with` | closure | `catch` | block | script_ | eval | module | `wasm-expression-stack`
  ): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndLocation(value: Location): Self = StObject.set(x, "endLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLocationUndefined: Self = StObject.set(x, "endLocation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObject(value: RemoteObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLocation(value: Location): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLocationUndefined: Self = StObject.set(x, "startLocation", js.undefined)
    
    @scala.inline
    def setType(
      value: global | local | `with` | closure | `catch` | block | script_ | eval | module | `wasm-expression-stack`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
