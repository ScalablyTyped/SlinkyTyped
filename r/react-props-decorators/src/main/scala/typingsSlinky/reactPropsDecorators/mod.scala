package typingsSlinky.reactPropsDecorators

import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-props-decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-props-decorators", "defaultProps")
  @js.native
  def defaultProps: js.Function1[/* defaultProps */ js.Any, ClassDecorator] = js.native
  @scala.inline
  def defaultProps_=(x: js.Function1[/* defaultProps */ js.Any, ClassDecorator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-props-decorators", "propTypes")
  @js.native
  def propTypes: js.Function1[/* map */ ValidationMap[js.Any], ClassDecorator] = js.native
  @scala.inline
  def propTypes_=(x: js.Function1[/* map */ ValidationMap[js.Any], ClassDecorator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]
}
