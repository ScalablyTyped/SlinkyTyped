package typingsSlinky.reactThreeFiber.hooksMod

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader[T]
  extends typingsSlinky.three.mod.Loader {
  
  def load(url: String): js.Any = js.native
  def load(
    url: String,
    onLoad: js.UndefOr[scala.Nothing],
    onProgress: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): js.Any = js.native
  def load(
    url: String,
    onLoad: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit]
  ): js.Any = js.native
  def load(
    url: String,
    onLoad: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): js.Any = js.native
  def load(url: String, onLoad: js.Function1[/* result */ T, Unit]): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* result */ T, Unit],
    onProgress: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* result */ T, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit]
  ): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* result */ T, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): js.Any = js.native
}
