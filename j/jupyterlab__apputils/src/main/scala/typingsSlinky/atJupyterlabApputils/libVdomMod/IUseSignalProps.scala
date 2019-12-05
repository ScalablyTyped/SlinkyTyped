package typingsSlinky.atJupyterlabApputils.libVdomMod

import slinky.core.TagMod
import typingsSlinky.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUseSignalProps[SENDER, ARGS] extends js.Object {
  /**
    * Initial value to use for the args, used before the signal emits a value.
    * If not provided, initial args will be undefined.
    */
  var initialArgs: js.UndefOr[ARGS] = js.native
  /**
    * Initial value to use for the sender, used before the signal emits a value.
    * If not provided, initial sender will be undefined
    */
  var initialSender: js.UndefOr[SENDER] = js.native
  /**
    * Given the last signal value, should return whether to update the state or not.
    *
    * The default unconditionally returns `true`, so you only have to override if you want
    * to skip some updates.
    */
  var shouldUpdate: js.UndefOr[js.Function2[/* sender */ SENDER, /* args */ ARGS, Boolean]] = js.native
  /**
    * Phosphor signal to connect to.
    */
  var signal: ISignal[SENDER, ARGS] = js.native
  /**
    * Function mapping the last signal value or inital values to an element to render.
    *
    * Note: returns `React.ReactNode` as per
    * https://github.com/sw-yx/react-typescript-cheatsheet#higher-order-componentsrender-props
    */
  def children(): TagMod[Any] = js.native
  def children(sender: SENDER): TagMod[Any] = js.native
  def children(sender: SENDER, args: ARGS): TagMod[Any] = js.native
}

