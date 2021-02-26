package typingsSlinky.overlayscrollbars.mod

import typingsSlinky.overlayscrollbars.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayScrollbars extends StObject {
  
  def addExt(extensionName: String, options: js.Object): Extension = js.native
  
  def destroy(): Unit = js.native
  
  def ext(): js.Object = js.native
  def ext(extensionName: String): Extension = js.native
  
  def getElements(): Elements = js.native
  def getElements(elementName: String): js.Any = js.native
  
  def getState(): State = js.native
  def getState(stateProperty: String): js.Any = js.native
  
  def options(): Options = js.native
  def options(optionName: String): js.Any = js.native
  def options(optionName: String, optionValue: js.Object): Unit = js.native
  def options(options: Options): Unit = js.native
  @JSName("options")
  def options_Unit(optionName: String): Unit = js.native
  
  def removeExt(extensionName: String): Boolean = js.native
  
  def scroll(): ScrollInfo = js.native
  def scroll(coordinates: Coordinates): Unit = js.native
  def scroll(
    coordinates: Coordinates,
    duration: js.UndefOr[scala.Nothing],
    easing: js.UndefOr[Easing],
    complete: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def scroll(coordinates: Coordinates, duration: js.UndefOr[scala.Nothing], easing: js.Tuple2[Easing, Easing]): Unit = js.native
  def scroll(
    coordinates: Coordinates,
    duration: js.UndefOr[scala.Nothing],
    easing: js.Tuple2[Easing, Easing],
    complete: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def scroll(coordinates: Coordinates, duration: js.UndefOr[scala.Nothing], easing: `1`): Unit = js.native
  def scroll(
    coordinates: Coordinates,
    duration: js.UndefOr[scala.Nothing],
    easing: `1`,
    complete: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def scroll(coordinates: Coordinates, duration: js.UndefOr[scala.Nothing], easing: Easing): Unit = js.native
  def scroll(coordinates: Coordinates, duration: Double): Unit = js.native
  def scroll(
    coordinates: Coordinates,
    duration: Double,
    easing: js.UndefOr[Easing],
    complete: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def scroll(coordinates: Coordinates, duration: Double, easing: js.Tuple2[Easing, Easing]): Unit = js.native
  def scroll(
    coordinates: Coordinates,
    duration: Double,
    easing: js.Tuple2[Easing, Easing],
    complete: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def scroll(coordinates: Coordinates, duration: Double, easing: `1`): Unit = js.native
  def scroll(
    coordinates: Coordinates,
    duration: Double,
    easing: `1`,
    complete: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def scroll(coordinates: Coordinates, duration: Double, easing: Easing): Unit = js.native
  def scroll(coordinates: Coordinates, options: js.Object): Unit = js.native
  
  def scrollStop(): OverlayScrollbars = js.native
  
  def sleep(): Unit = js.native
  
  def update(): Unit = js.native
  def update(force: Boolean): Unit = js.native
}
