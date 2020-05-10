package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentSpecResolver extends js.Object {
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
  implicit class FragmentSpecResolverOps[Self <: FragmentSpecResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolve(value: () => FragmentSpecResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCallback(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetProps(value: Props => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVariables(value: (Variables, ConcreteRequest) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVariables")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

