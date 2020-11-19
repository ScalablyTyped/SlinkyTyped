package typingsSlinky.flux.fluxMixinLegacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flux/lib/FluxMixinLegacy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * `FluxContainer` should be preferred over this mixin, but it requires using
    * react with classes. So this mixin is provided where it is not yet possible
    * to convert a container to be a class.
    *
    * This mixin should be used for React components that have state based purely
    * on stores. `this.props` will not be available inside of `calculateState()`.
    *
    * This mixin will only `setState` not replace it, so you should always return
    * every key in your state unless you know what you are doing.
    *
    * On the second calculateState when prevState is not null, the state will be
    * updated to contain the previous foo AND the bar that was just returned. Only
    * returning bar will not delete foo.
    */
  def apply(stores: js.Array[typingsSlinky.flux.fluxStoreMod.^[_]]): js.Any = js.native
  def apply(stores: js.Array[typingsSlinky.flux.fluxStoreMod.^[_]], options: Options): js.Any = js.native
}
