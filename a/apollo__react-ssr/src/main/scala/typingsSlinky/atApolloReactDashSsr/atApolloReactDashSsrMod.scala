package typingsSlinky.atApolloReactDashSsr

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.atApolloReactDashSsr.libGetDataFromTreeMod.GetMarkupFromTreeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-ssr", JSImport.Namespace)
@js.native
object atApolloReactDashSsrMod extends js.Object {
  def getDataFromTree(tree: TagMod[Any]): js.Promise[String] = js.native
  def getDataFromTree(tree: TagMod[Any], context: StringDictionary[js.Any]): js.Promise[String] = js.native
  def getMarkupFromTree(hasTreeContextRenderFunction: GetMarkupFromTreeOptions): js.Promise[String] = js.native
  def renderToStringWithData(component: ReactElement): js.Promise[String] = js.native
}

