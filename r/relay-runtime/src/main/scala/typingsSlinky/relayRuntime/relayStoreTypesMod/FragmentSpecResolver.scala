package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentSpecResolver extends StObject {
  
  /**
    * Stop watching for changes to the results of the fragments.
    */
  def dispose(): Unit = js.native
  
  /**
    * Get the current results.
    */
  def resolve(): FragmentSpecResults = js.native
  
  /**
    * Subscribe to resolver updates.
    * Overrides existing callback (if one has been specified).
    */
  def setCallback(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Update the resolver with new inputs. Call `resolve()` to get the updated
    * results.
    */
  def setProps(props: Props): Unit = js.native
  
  /**
    * Override the variables used to read the results of the fragments. Call
    * `resolve()` to get the updated results.
    */
  def setVariables(variables: Variables, node: ConcreteRequest): Unit = js.native
}
object FragmentSpecResolver {
  
  @scala.inline
  def apply(
    dispose: () => Unit,
    resolve: () => FragmentSpecResults,
    setCallback: js.Function0[Unit] => Unit,
    setProps: Props => Unit,
    setVariables: (Variables, ConcreteRequest) => Unit
  ): FragmentSpecResolver = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), resolve = js.Any.fromFunction0(resolve), setCallback = js.Any.fromFunction1(setCallback), setProps = js.Any.fromFunction1(setProps), setVariables = js.Any.fromFunction2(setVariables))
    __obj.asInstanceOf[FragmentSpecResolver]
  }
  
  @scala.inline
  implicit class FragmentSpecResolverMutableBuilder[Self <: FragmentSpecResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolve(value: () => FragmentSpecResults): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCallback(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "setCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProps(value: Props => Unit): Self = StObject.set(x, "setProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVariables(value: (Variables, ConcreteRequest) => Unit): Self = StObject.set(x, "setVariables", js.Any.fromFunction2(value))
  }
}
