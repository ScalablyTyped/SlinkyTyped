package typingsSlinky.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.rmcNukaCarousel.decoratorsMod.IDecoratorProps
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  var context: js.Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): Unit = js.native
  
  def getButtonStyles(disabled: js.Any): Background = js.native
  
  def handleClick(e: js.Any): Unit = js.native
  
  var props: Children with IDecoratorProps = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): ReactElement = js.native
  
  def setState[K /* <: String */](f: js.Function2[/* prevState */ js.Any, /* props */ IDecoratorProps, Pick[_, K]]): Unit = js.native
  def setState[K /* <: String */](
    f: js.Function2[/* prevState */ js.Any, /* props */ IDecoratorProps, Pick[_, K]],
    callback: js.Function0[_]
  ): Unit = js.native
  def setState[K /* <: String */](state: Pick[_, K]): Unit = js.native
  def setState[K /* <: String */](state: Pick[_, K], callback: js.Function0[_]): Unit = js.native
  
  var state: js.Any = js.native
}
