package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNodeMod {
  
  @JSImport("antd/lib/_util/reactNode", "cloneElement")
  @js.native
  def cloneElement(element: ReactElement): ReactElement = js.native
  @JSImport("antd/lib/_util/reactNode", "cloneElement")
  @js.native
  def cloneElement(element: ReactElement, props: RenderProps): ReactElement = js.native
  
  @JSImport("antd/lib/_util/reactNode", "isValidElement")
  @js.native
  def isValidElement[P](): /* is react.react.ReactElement */ Boolean = js.native
  @JSImport("antd/lib/_util/reactNode", "isValidElement")
  @js.native
  def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
  
  @JSImport("antd/lib/_util/reactNode", "replaceElement")
  @js.native
  def replaceElement(element: ReactElement, replacement: ReactElement, props: RenderProps): ReactElement = js.native
  
  type AnyObject = Record[js.Any, js.Any]
  
  type RenderProps = js.UndefOr[AnyObject | (js.Function1[/* originProps */ AnyObject, js.UndefOr[AnyObject]])]
}
