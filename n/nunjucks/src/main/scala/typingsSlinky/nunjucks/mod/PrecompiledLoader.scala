package typingsSlinky.nunjucks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.nunjucks.mod.ILoader because var conflicts: extend. Inlined async, getSource, getSource */ @JSImport("nunjucks", "PrecompiledLoader")
@js.native
class PrecompiledLoader () extends Loader {
  var async: js.UndefOr[Boolean] = js.native
  def getSource(name: String): LoaderSource = js.native
  def getSource(name: String, callback: Callback[js.Error, LoaderSource]): Unit = js.native
  def init(searchPaths: js.Array[String], opts: js.Any): Unit = js.native
}

