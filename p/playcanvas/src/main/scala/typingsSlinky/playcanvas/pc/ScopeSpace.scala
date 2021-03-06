package typingsSlinky.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The scope for variables and subspaces.
  * @property name - The scope name.
  * @param name - The scope name.
  */
@js.native
trait ScopeSpace extends StObject {
  
  /**
    * Get (or create, if it doesn't already exist) a subspace in the scope.
    * @param name - The subspace name.
    * @returns The subspace instance.
    */
  def getSubSpace(name: String): ScopeSpace = js.native
  
  /**
    * The scope name.
    */
  var name: String = js.native
  
  /**
    * Get (or create, if it doesn't already exist) a variable in the scope.
    * @param name - The variable name.
    * @returns The variable instance.
    */
  def resolve(name: String): ScopeId = js.native
}
object ScopeSpace {
  
  @scala.inline
  def apply(getSubSpace: String => ScopeSpace, name: String, resolve: String => ScopeId): ScopeSpace = {
    val __obj = js.Dynamic.literal(getSubSpace = js.Any.fromFunction1(getSubSpace), name = name.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[ScopeSpace]
  }
  
  @scala.inline
  implicit class ScopeSpaceMutableBuilder[Self <: ScopeSpace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSubSpace(value: String => ScopeSpace): Self = StObject.set(x, "getSubSpace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: String => ScopeId): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
