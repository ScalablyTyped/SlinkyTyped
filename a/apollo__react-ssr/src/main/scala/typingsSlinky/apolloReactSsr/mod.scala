package typingsSlinky.apolloReactSsr

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.apolloReactSsr.getDataFromTreeMod.GetMarkupFromTreeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-ssr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getDataFromTree(tree: ReactElement): js.Promise[String] = js.native
  def getDataFromTree(tree: ReactElement, context: StringDictionary[js.Any]): js.Promise[String] = js.native
  
  def getMarkupFromTree(hasTreeContextRenderFunction: GetMarkupFromTreeOptions): js.Promise[String] = js.native
  
  def renderToStringWithData(component: ReactElement): js.Promise[String] = js.native
}
